package com.redhat.camel.dmzDao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.redhat.camel.dmzEntity.PtsSerialNumbersIf2;


/**
 * 创建JPA
 */
@Repository
public interface PtsSerialNumbersIf2Dao extends JpaRepository<PtsSerialNumbersIf2, BigDecimal>, JpaSpecificationExecutor<PtsSerialNumbersIf2> {

}
