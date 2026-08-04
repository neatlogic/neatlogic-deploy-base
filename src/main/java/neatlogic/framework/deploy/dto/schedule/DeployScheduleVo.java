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

package neatlogic.framework.deploy.dto.schedule;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.ScheduleType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.scheduler.dto.JobStatusVo;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.UUID;

public class DeployScheduleVo extends BaseEditorVo {
    @EntityField(name = "nfdds.deployschedulevo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfdds.deployschedulevo.uuid.name", type = ApiParamType.STRING)
    private String uuid;
    @EntityField(name = "nfdds.deployschedulevo.name.name", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "nfdds.deployschedulevo.begintime.name", type = ApiParamType.LONG)
    private Date beginTime;
    @EntityField(name = "nfdds.deployschedulevo.endtime.name", type = ApiParamType.LONG)
    private Date endTime;
    @EntityField(name = "nfdds.deployschedulevo.cron.name", type = ApiParamType.STRING)
    private String cron;
    @EntityField(name = "nfdds.deployschedulevo.isactive.name", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "nfdds.deployschedulevo.config.name", type = ApiParamType.JSONOBJECT)
    private DeployScheduleConfigVo config;
    @JSONField(serialize = false)
    private String configStr;

    @EntityField(name = "nfdds.deployschedulevo.execcount.name", type = ApiParamType.INTEGER)
    private Integer execCount;
    @EntityField(name = "nfdds.deployschedulevo.type.name", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "nfdds.deployschedulevo.typename.name", type = ApiParamType.STRING)
    private String typeName;
    @EntityField(name = "nfdds.deployschedulevo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfdds.deployschedulevo.appsystemname.name", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "nfdds.deployschedulevo.appsystemabbrname.name", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "nfdds.deployschedulevo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "nfdds.deployschedulevo.appmodulename.name", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "nfdds.deployschedulevo.appmoduleabbrname.name", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "nfdds.deployschedulevo.pipelineid.name", type = ApiParamType.LONG)
    private Long pipelineId;
    @EntityField(name = "nfdds.deployschedulevo.pipelinename.name", type = ApiParamType.STRING)
    private String pipelineName;
    @EntityField(name = "nfdds.deployschedulevo.pipelinetype.name", type = ApiParamType.STRING)
    private String pipelineType;
    @EntityField(name = "nfdds.deployschedulevo.editable.name", type = ApiParamType.INTEGER)
    private Integer editable = 0;
    @EntityField(name = "nfdds.deployschedulevo.deletable.name", type = ApiParamType.INTEGER)
    private Integer deletable = 0;

    private JobStatusVo jobStatus;

    // 记录定时作业配置最初由哪个应用服务器创建，用于按应用服务分组过滤管理页数据。
    private Integer sourceServerId;
    private String sourceServerGroup;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        if (StringUtils.isBlank(uuid)) {
            uuid = UUID.randomUUID().toString().replace("-", "");
        }
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public DeployScheduleConfigVo getConfig() {
        if (config == null && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr, DeployScheduleConfigVo.class);
        }
        return config;
    }

    public void setConfig(DeployScheduleConfigVo config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (config != null) {
            return JSONObject.toJSONString(config);
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public Integer getExecCount() {
        if (execCount == null) {
            execCount = 0;
        }
        return execCount;
    }

    public void setExecCount(Integer execCount) {
        this.execCount = execCount;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        if (StringUtils.isBlank(typeName) && StringUtils.isNotBlank(type)) {
            typeName = ScheduleType.getText(type);
        }
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public String getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public Integer getDeletable() {
        return deletable;
    }

    public void setDeletable(Integer deletable) {
        this.deletable = deletable;
    }

    public JobStatusVo getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusVo jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Integer getSourceServerId() {
        return sourceServerId;
    }

    public void setSourceServerId(Integer sourceServerId) {
        this.sourceServerId = sourceServerId;
    }

    public String getSourceServerGroup() {
        return sourceServerGroup;
    }

    public void setSourceServerGroup(String sourceServerGroup) {
        this.sourceServerGroup = sourceServerGroup;
    }
}
