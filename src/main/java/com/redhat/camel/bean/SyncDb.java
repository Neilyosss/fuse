package com.redhat.camel.bean;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redhat.camel.dmzDao.PtsSerialNumbersIf2Dao;
import com.redhat.camel.dmzEntity.PtsSerialNumbersIf2;
import com.redhat.camel.prodDao.PtsSerialNumbersIfDao;
import com.redhat.camel.prodEntity.PtsSerialNumbersIf;


@Service
public class SyncDb implements Processor{
	private static final Logger log = LoggerFactory.getLogger(SyncDb.class);
	@Autowired
	PtsSerialNumbersIfDao ptsSerialNumbersIfDao;
	
	@Autowired
	PtsSerialNumbersIf2Dao ptsSerialNumbersIf2Dao;

	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("进入数据同步类");
		int second = new Date().getSeconds();
		ptsSerialNumbersIfDao.updateStatusToReady("F1"+second);
		log.info("修改待同步数据状态完成");
		List<PtsSerialNumbersIf> findAllBySyncStatus = ptsSerialNumbersIfDao.findAllBySyncStatus("F1"+second);
		log.info("查询到"+findAllBySyncStatus.size()+"条数据");
		if(findAllBySyncStatus.size() == 0) {
			log.info("查询待同步数据为空，结束同步");
		}else {
			List<PtsSerialNumbersIf2> insertList = new ArrayList<PtsSerialNumbersIf2>();
			for (PtsSerialNumbersIf ptsSerialNumbersIf : findAllBySyncStatus) {
				PtsSerialNumbersIf2 pts = new PtsSerialNumbersIf2();
				BeanUtils.copyProperties(ptsSerialNumbersIf, pts);
				ptsSerialNumbersIf.setSyncStatus("CHANGED");
				pts.setSyncStatus(null);
				insertList.add(pts);
			}
			ptsSerialNumbersIf2Dao.saveAll(insertList);
			log.info("数据插入完成");
			ptsSerialNumbersIfDao.saveAll(findAllBySyncStatus);
			log.info("数据状态更新完成");
		}
	}

}
