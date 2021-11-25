package com.redhat.camel.prodEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PTS_SERIAL_NUMBERS_IF database table.
 * 
 */
@Entity
@Table(name="PTS_SERIAL_NUMBERS_IF")
@NamedQuery(name="PtsSerialNumbersIf.findAll", query="SELECT p FROM PtsSerialNumbersIf p")
public class PtsSerialNumbersIf implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attribute1;

	private String attribute10;

	private String attribute11;

	private String attribute12;

	private String attribute13;

	private String attribute14;

	private String attribute15;

	private String attribute2;

	private String attribute3;

	private String attribute4;

	private String attribute5;

	private String attribute6;

	private String attribute7;

	private String attribute8;

	private String attribute9;

	@Column(name="CONTROL_STATUS")
	private String controlStatus;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DEFINE_DATE")
	private Date defineDate;

	private String description;

	@Column(name="EMPLOYEE_ID")
	private BigDecimal employeeId;

	@Column(name="INVENTORY_ITEM_ID")
	private BigDecimal inventoryItemId;

	@Column(name="LAST_CENTER_ID")
	private BigDecimal lastCenterId;

	@Column(name="LAST_INVENTORY_ITEM_ID")
	private BigDecimal lastInventoryItemId;

	@Column(name="LAST_LOCATOR_CODE")
	private String lastLocatorCode;

	@Column(name="LAST_ORGANIZATION")
	private BigDecimal lastOrganization;

	@Column(name="LAST_RACK_CODE")
	private String lastRackCode;

	@Column(name="LAST_SUBINVENTORY")
	private String lastSubinventory;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATED_BY")
	private BigDecimal lastUpdatedBy;

	@Column(name="MACHINE_ID")
	private BigDecimal machineId;

	@Temporal(TemporalType.DATE)
	@Column(name="MANUFACTURE_DATE")
	private Date manufactureDate;

	@Column(name="MES_BATCH_NUM")
	private BigDecimal mesBatchNum;

	@Column(name="ORGANIZATION_ID")
	private BigDecimal organizationId;

	@Column(name="ORIGNAL_QTY")
	private BigDecimal orignalQty;

	@Column(name="OUTBOUND_STATUS")
	private String outboundStatus;

	@Column(name="PRINT_COUNTS")
	private BigDecimal printCounts;

	@Temporal(TemporalType.DATE)
	@Column(name="PRINT_DATE")
	private Date printDate;

	@Column(name="PRINT_STATUS")
	private String printStatus;

	@Column(name="RECIVE_DESC")
	private String reciveDesc;

	@Column(name="RECIVE_TAG")
	private String reciveTag;

	@Temporal(TemporalType.DATE)
	@Column(name="RECIVE_TIME")
	private Date reciveTime;

	@Column(name="RULE_HEADER_ID")
	private BigDecimal ruleHeaderId;

	@Column(name="SERIAL_DEFINE_ID")
	private BigDecimal serialDefineId;

	@Column(name="SERIAL_GROUP")
	private String serialGroup;

	@Column(name="SERIAL_NUMBER")
	private String serialNumber;

	@Id
	@Column(name="SERIAL_NUMBER_ID")
	private BigDecimal serialNumberId;

	@Column(name="SERIAL_QTY")
	private BigDecimal serialQty;

	@Column(name="SERIAL_STATUS")
	private String serialStatus;

	@Column(name="SERIAL_TYPE")
	private String serialType;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="SOURCE_LINE_ID")
	private BigDecimal sourceLineId;

	@Column(name="SOURCE_REFERENCE")
	private String sourceReference;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	@Temporal(TemporalType.DATE)
	@Column(name="SYNC_DATE")
	private Date syncDate;

	@Column(name="SYNC_MESSAGE")
	private String syncMessage;

	@Column(name="SYNC_STATUS")
	private String syncStatus;

	@Column(name="TESTING_TYPE")
	private String testingType;

	@Column(name="WORK_CENTER_ID")
	private BigDecimal workCenterId;

	@Column(name="WORK_GROUP_CODE")
	private String workGroupCode;

	@Column(name="WORK_SHIFT_CODE")
	private String workShiftCode;

	public PtsSerialNumbersIf() {
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute10() {
		return this.attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}

	public String getAttribute11() {
		return this.attribute11;
	}

	public void setAttribute11(String attribute11) {
		this.attribute11 = attribute11;
	}

	public String getAttribute12() {
		return this.attribute12;
	}

	public void setAttribute12(String attribute12) {
		this.attribute12 = attribute12;
	}

	public String getAttribute13() {
		return this.attribute13;
	}

	public void setAttribute13(String attribute13) {
		this.attribute13 = attribute13;
	}

	public String getAttribute14() {
		return this.attribute14;
	}

	public void setAttribute14(String attribute14) {
		this.attribute14 = attribute14;
	}

	public String getAttribute15() {
		return this.attribute15;
	}

	public void setAttribute15(String attribute15) {
		this.attribute15 = attribute15;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getAttribute7() {
		return this.attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return this.attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return this.attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	public String getControlStatus() {
		return this.controlStatus;
	}

	public void setControlStatus(String controlStatus) {
		this.controlStatus = controlStatus;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDefineDate() {
		return this.defineDate;
	}

	public void setDefineDate(Date defineDate) {
		this.defineDate = defineDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(BigDecimal employeeId) {
		this.employeeId = employeeId;
	}

	public BigDecimal getInventoryItemId() {
		return this.inventoryItemId;
	}

	public void setInventoryItemId(BigDecimal inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public BigDecimal getLastCenterId() {
		return this.lastCenterId;
	}

	public void setLastCenterId(BigDecimal lastCenterId) {
		this.lastCenterId = lastCenterId;
	}

	public BigDecimal getLastInventoryItemId() {
		return this.lastInventoryItemId;
	}

	public void setLastInventoryItemId(BigDecimal lastInventoryItemId) {
		this.lastInventoryItemId = lastInventoryItemId;
	}

	public String getLastLocatorCode() {
		return this.lastLocatorCode;
	}

	public void setLastLocatorCode(String lastLocatorCode) {
		this.lastLocatorCode = lastLocatorCode;
	}

	public BigDecimal getLastOrganization() {
		return this.lastOrganization;
	}

	public void setLastOrganization(BigDecimal lastOrganization) {
		this.lastOrganization = lastOrganization;
	}

	public String getLastRackCode() {
		return this.lastRackCode;
	}

	public void setLastRackCode(String lastRackCode) {
		this.lastRackCode = lastRackCode;
	}

	public String getLastSubinventory() {
		return this.lastSubinventory;
	}

	public void setLastSubinventory(String lastSubinventory) {
		this.lastSubinventory = lastSubinventory;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public BigDecimal getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigDecimal getMachineId() {
		return this.machineId;
	}

	public void setMachineId(BigDecimal machineId) {
		this.machineId = machineId;
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public BigDecimal getMesBatchNum() {
		return this.mesBatchNum;
	}

	public void setMesBatchNum(BigDecimal mesBatchNum) {
		this.mesBatchNum = mesBatchNum;
	}

	public BigDecimal getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(BigDecimal organizationId) {
		this.organizationId = organizationId;
	}

	public BigDecimal getOrignalQty() {
		return this.orignalQty;
	}

	public void setOrignalQty(BigDecimal orignalQty) {
		this.orignalQty = orignalQty;
	}

	public String getOutboundStatus() {
		return this.outboundStatus;
	}

	public void setOutboundStatus(String outboundStatus) {
		this.outboundStatus = outboundStatus;
	}

	public BigDecimal getPrintCounts() {
		return this.printCounts;
	}

	public void setPrintCounts(BigDecimal printCounts) {
		this.printCounts = printCounts;
	}

	public Date getPrintDate() {
		return this.printDate;
	}

	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}

	public String getPrintStatus() {
		return this.printStatus;
	}

	public void setPrintStatus(String printStatus) {
		this.printStatus = printStatus;
	}

	public String getReciveDesc() {
		return this.reciveDesc;
	}

	public void setReciveDesc(String reciveDesc) {
		this.reciveDesc = reciveDesc;
	}

	public String getReciveTag() {
		return this.reciveTag;
	}

	public void setReciveTag(String reciveTag) {
		this.reciveTag = reciveTag;
	}

	public Date getReciveTime() {
		return this.reciveTime;
	}

	public void setReciveTime(Date reciveTime) {
		this.reciveTime = reciveTime;
	}

	public BigDecimal getRuleHeaderId() {
		return this.ruleHeaderId;
	}

	public void setRuleHeaderId(BigDecimal ruleHeaderId) {
		this.ruleHeaderId = ruleHeaderId;
	}

	public BigDecimal getSerialDefineId() {
		return this.serialDefineId;
	}

	public void setSerialDefineId(BigDecimal serialDefineId) {
		this.serialDefineId = serialDefineId;
	}

	public String getSerialGroup() {
		return this.serialGroup;
	}

	public void setSerialGroup(String serialGroup) {
		this.serialGroup = serialGroup;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getSerialNumberId() {
		return this.serialNumberId;
	}

	public void setSerialNumberId(BigDecimal serialNumberId) {
		this.serialNumberId = serialNumberId;
	}

	public BigDecimal getSerialQty() {
		return this.serialQty;
	}

	public void setSerialQty(BigDecimal serialQty) {
		this.serialQty = serialQty;
	}

	public String getSerialStatus() {
		return this.serialStatus;
	}

	public void setSerialStatus(String serialStatus) {
		this.serialStatus = serialStatus;
	}

	public String getSerialType() {
		return this.serialType;
	}

	public void setSerialType(String serialType) {
		this.serialType = serialType;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public BigDecimal getSourceLineId() {
		return this.sourceLineId;
	}

	public void setSourceLineId(BigDecimal sourceLineId) {
		this.sourceLineId = sourceLineId;
	}

	public String getSourceReference() {
		return this.sourceReference;
	}

	public void setSourceReference(String sourceReference) {
		this.sourceReference = sourceReference;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getSyncDate() {
		return this.syncDate;
	}

	public void setSyncDate(Date syncDate) {
		this.syncDate = syncDate;
	}

	public String getSyncMessage() {
		return this.syncMessage;
	}

	public void setSyncMessage(String syncMessage) {
		this.syncMessage = syncMessage;
	}

	public String getSyncStatus() {
		return this.syncStatus;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

	public String getTestingType() {
		return this.testingType;
	}

	public void setTestingType(String testingType) {
		this.testingType = testingType;
	}

	public BigDecimal getWorkCenterId() {
		return this.workCenterId;
	}

	public void setWorkCenterId(BigDecimal workCenterId) {
		this.workCenterId = workCenterId;
	}

	public String getWorkGroupCode() {
		return this.workGroupCode;
	}

	public void setWorkGroupCode(String workGroupCode) {
		this.workGroupCode = workGroupCode;
	}

	public String getWorkShiftCode() {
		return this.workShiftCode;
	}

	public void setWorkShiftCode(String workShiftCode) {
		this.workShiftCode = workShiftCode;
	}

}