/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.trigger;

import codedriver.framework.autoexec.dto.job.AutoexecJobStatusVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class DeployJobTriggerVo extends BaseEditorVo {
    private static final long serialVersionUID = -5715414967862953577L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "集成uuid", type = ApiParamType.STRING)
    private String integrationUuid;
    @EntityField(name = "作业类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "作业类型名", type = ApiParamType.STRING)
    private String typeName;
    @EntityField(name = "流水线类型", type = ApiParamType.STRING)
    private String pipelineType;
    @EntityField(name = "配置", type = ApiParamType.JSONOBJECT)
    private DeployJobTriggerConfigVo config;
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
        return integrationUuid;
    }

    public void setIntegrationUuid(String integrationUuid) {
        this.integrationUuid = integrationUuid;
    }

    public DeployJobTriggerConfigVo getConfig() {
        if(StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr,DeployJobTriggerConfigVo.class);
        }
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
        return jobStatusList;
    }

    public void setJobStatusList(List<AutoexecJobStatusVo> jobStatusList) {
        this.jobStatusList = jobStatusList;
    }
}
