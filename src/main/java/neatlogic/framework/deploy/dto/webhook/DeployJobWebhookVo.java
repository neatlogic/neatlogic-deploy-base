/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.deploy.dto.webhook;

import neatlogic.framework.autoexec.constvalue.JobStatus;
import neatlogic.framework.autoexec.dto.job.AutoexecJobStatusVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.constvalue.DeployWebhookBuildNoPolicy;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
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
