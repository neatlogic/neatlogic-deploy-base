/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.trigger;

import codedriver.framework.autoexec.constvalue.JobNodeStatus;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class DeployJobTriggerAuditVo extends BasePageVo {
    private static final long serialVersionUID = -8243357692436223665L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "触发器id", type = ApiParamType.LONG)
    private Long triggerId;
    @EntityField(name = "记录名", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "状态名", type = ApiParamType.STRING)
    private String statusName;
    @EntityField(name = "集成记录id", type = ApiParamType.LONG)
    private Long integrationAuditId;
    @EntityField(name = "触发时间", type = ApiParamType.LONG)
    private Date lcd;
    @EntityField(name = "入参文件路径", type = ApiParamType.STRING)
    private String paramFilePath;
    @EntityField(name = "结果文件路径", type = ApiParamType.STRING)
    private String resultFilePath;
    @EntityField(name = "异常文件路径", type = ApiParamType.STRING)
    private String errorFilePath;

    public DeployJobTriggerAuditVo() {
    }

    public DeployJobTriggerAuditVo(String jobName, Long triggerId, Long auditId) {
        this.name = jobName;
        this.triggerId = triggerId;
        this.integrationAuditId = auditId;
    }


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public Long getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Long triggerId) {
        this.triggerId = triggerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        if(StringUtils.isNotBlank(status) && StringUtils.isBlank(statusName)){
            statusName = JobNodeStatus.getText(status);
        }
        return statusName;
    }

    public Long getIntegrationAuditId() {
        return integrationAuditId;
    }

    public void setIntegrationAuditId(Long integrationAuditId) {
        this.integrationAuditId = integrationAuditId;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public String getParamFilePath() {
        return paramFilePath;
    }

    public void setParamFilePath(String paramFilePath) {
        this.paramFilePath = paramFilePath;
    }

    public String getResultFilePath() {
        return resultFilePath;
    }

    public void setResultFilePath(String resultFilePath) {
        this.resultFilePath = resultFilePath;
    }

    public String getErrorFilePath() {
        return errorFilePath;
    }

    public void setErrorFilePath(String errorFilePath) {
        this.errorFilePath = errorFilePath;
    }
}
