package com.redhat.camel.prodDao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.redhat.camel.prodEntity.PtsSerialNumbersIf;

/**
 * 创建JPA
 */
@Repository
public interface PtsSerialNumbersIfDao extends JpaRepository<PtsSerialNumbersIf, BigDecimal>, JpaSpecificationExecutor<PtsSerialNumbersIf> {
	@Transactional
	@Modifying
	@Query("UPDATE PtsSerialNumbersIf SET SYNC_STATUS = ?1 WHERE SERIAL_STATUS = 'PRINT' AND WORK_CENTER_ID = 10006 AND RECIVE_TAG = 'PENDING' AND SYNC_STATUS != 'CHANGED' AND SYNC_STATUS NOT LIKE 'F%'  AND ROWNUM <= 5 ")
	int updateStatusToReady(String flag);
	
	List<PtsSerialNumbersIf> findAllBySyncStatus(String flag);
}
