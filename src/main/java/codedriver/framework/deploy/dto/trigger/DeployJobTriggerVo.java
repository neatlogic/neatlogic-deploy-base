/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.trigger;

import codedriver.framework.autoexec.dto.job.AutoexecJobStatusVo;
import codedriver.framework.cmdb.dto.resourcecenter.entity.AppEnvironmentVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class DeployJobTriggerVo extends BaseEditorVo {
    private static final long serialVersionUID = -5715414967862953577L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "集成id", type = ApiParamType.STRING)
    private String IntegrationUuid;
    @EntityField(name = "配置", type = ApiParamType.JSONARRAY)
    private List<DeployJobTriggerAppModuleVo> triggerAppModuleList;
    @EntityField(name = "配置", type = ApiParamType.JSONOBJECT)
    private DeployJobTriggerConfigVo config;
    @EntityField(name = "源环境范围集合", type = ApiParamType.JSONARRAY)
    private List<AppEnvironmentVo> envList;
    @EntityField(name = "源环境范围集合", type = ApiParamType.JSONARRAY)
    private List<AutoexecJobStatusVo> jobStatusList;


    @JSONField(serialize = false)
    private String configStr;


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
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
        return IntegrationUuid;
    }

    public void setIntegrationUuid(String integrationUuid) {
        IntegrationUuid = integrationUuid;
    }

    public DeployJobTriggerConfigVo getConfig() {
        return config;
    }

    public void setConfig(DeployJobTriggerConfigVo config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (config != null) {
            configStr = JSONObject.toJSONString(config);
        }
        return configStr;
    }

    public List<DeployJobTriggerAppModuleVo> getTriggerAppModuleList() {
        return triggerAppModuleList;
    }

    public void setTriggerAppModuleList(List<DeployJobTriggerAppModuleVo> triggerAppModuleList) {
        this.triggerAppModuleList = triggerAppModuleList;
    }

    public List<AppEnvironmentVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<AppEnvironmentVo> envList) {
        this.envList = envList;
    }

    public List<AutoexecJobStatusVo> getJobStatusList() {
        return jobStatusList;
    }

    public void setJobStatusList(List<AutoexecJobStatusVo> jobStatusList) {
        this.jobStatusList = jobStatusList;
    }
}
