/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.deploy.dto.webhook;

import neatlogic.framework.autoexec.constvalue.JobNodeStatus;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class DeployJobWebhookAuditVo extends BasePageVo {
    private static final long serialVersionUID = -8243357692436223665L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "触发器id", type = ApiParamType.LONG)
    private Long webhookId;
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
    @EntityField(name = "来源作业id", type = ApiParamType.LONG)
    private Long fromJobId;
    @EntityField(name = "来源作业名", type = ApiParamType.STRING)
    private Long fromJobName;

    public DeployJobWebhookAuditVo() {
    }

    public DeployJobWebhookAuditVo(Long fromJobId, String jobName, Long webhookId, Long auditId) {
        this.name = jobName;
        this.webhookId = webhookId;
        this.integrationAuditId = auditId;
        this.fromJobId = fromJobId;
    }


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public Long getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
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
        if (StringUtils.isNotBlank(status) && StringUtils.isBlank(statusName)) {
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

    public Long getFromJobId() {
        return fromJobId;
    }

    public void setFromJobId(Long fromJobId) {
        this.fromJobId = fromJobId;
    }

    public Long getFromJobName() {
        return fromJobName;
    }

    public void setFromJobName(Long fromJobName) {
        this.fromJobName = fromJobName;
    }
}
