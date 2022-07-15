/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.dto.app.DeployPipelineConfigVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

public class DeployJobVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用资产id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "系统模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "编译|构造的runner_id", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "流水线配置信息", type = ApiParamType.JSONOBJECT)
    private DeployPipelineConfigVo config;
    @JSONField(serialize = false)
    private String configStr;
    @JSONField(serialize = false)
    private String configHash;
    public DeployJobVo(){

    }

    public DeployJobVo(JSONObject jsonObj) {
        appSystemId = jsonObj.getLong("appSystemId");
        appModuleId = jsonObj.getLong("appModuleId");
        envId = jsonObj.getLong("envId");
        version = jsonObj.getString("version");
        buildNo = jsonObj.getInteger("buildNo");
    }

    public DeployJobVo(Long _jobId, Long _runnerMapId) {
        jobId = _jobId;
        runnerMapId = _runnerMapId;
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getRunnerMapId() {
        return runnerMapId;
    }

    public void setRunnerMapId(Long runnerMapId) {
        this.runnerMapId = runnerMapId;
    }

    public void setConfig(DeployPipelineConfigVo config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (configStr == null && config != null) {
            configStr = JSONObject.toJSONString(config);
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public DeployPipelineConfigVo getConfig() {
        return config;
    }

    public String getConfigHash() {
        if (StringUtils.isBlank(configHash) && StringUtils.isNotBlank(configStr)) {
            configHash = DigestUtils.md5DigestAsHex(configStr.getBytes(StandardCharsets.UTF_8));
        }
        return configHash;
    }

    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }
}
