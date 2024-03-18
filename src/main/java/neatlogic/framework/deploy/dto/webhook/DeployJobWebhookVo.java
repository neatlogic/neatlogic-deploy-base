/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

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

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.autoexec.constvalue.JobStatus;
import neatlogic.framework.autoexec.dto.job.AutoexecJobStatusVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.DeployWebhookBuildNoPolicy;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DeployJobWebhookVo extends BaseEditorVo {
    private static final long serialVersionUID = -5715414967862953577L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "集成uuid", type = ApiParamType.STRING)
    private String integrationUuid;
    @EntityField(name = "集成名称", type = ApiParamType.STRING)
    private String integrationName;
    @EntityField(name = "作业类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "作业类型名", type = ApiParamType.STRING)
    private String typeName;
    @EntityField(name = "流水线类型", type = ApiParamType.STRING)
    private String pipelineType;
    @EntityField(name = "配置", type = ApiParamType.JSONOBJECT)
    private DeployJobWebhookConfigVo config;
    @EntityField(name = "作业状态集合", type = ApiParamType.JSONARRAY)
    private List<AutoexecJobStatusVo> jobStatusList;
    @EntityField(name = "编译号策略", type = ApiParamType.ENUM, member = DeployWebhookBuildNoPolicy.class)
    private String buildNoPolicy;

    @JSONField(serialize = false)
    private String configStr;


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getIntegrationUuid() {
        return integrationUuid;
    }

    public void setIntegrationUuid(String integrationUuid) {
        this.integrationUuid = integrationUuid;
    }

    public String getIntegrationName() {
        return integrationName;
    }

    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
    }

    public DeployJobWebhookConfigVo getConfig() {
        if (StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr, DeployJobWebhookConfigVo.class);
        }
        return config;
    }

    public void setConfig(DeployJobWebhookConfigVo config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (config != null) {
            configStr = JSONObject.toJSONString(config);
        }
        return configStr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    public List<AutoexecJobStatusVo> getJobStatusList() {
        if (CollectionUtils.isEmpty(jobStatusList) && config != null) {
            jobStatusList = new ArrayList<>();
            List<String> statusList = config.getJobStatusList();
            for (String status : statusList) {
                jobStatusList.add(JobStatus.getStatus(status));
            }
        }
        return jobStatusList;
    }

    public void setJobStatusList(List<AutoexecJobStatusVo> jobStatusList) {
        this.jobStatusList = jobStatusList;
    }

    public String getBuildNoPolicy() {
        return buildNoPolicy;
    }

    public void setBuildNoPolicy(String buildNoPolicy) {
        this.buildNoPolicy = buildNoPolicy;
    }
}
