/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class DeployAppConfigOverrideVo {

    private Long appSystemId;
    private Long moduleId = 0L;
    private Long envId = 0L;
    private DeployPipelineConfigVo config;
    private String configStr;

    public DeployAppConfigOverrideVo() {

    }

    public DeployAppConfigOverrideVo(Long appSystemId, Long moduleId) {
        this(appSystemId, moduleId, null);
    }

    public DeployAppConfigOverrideVo(Long appSystemId, Long moduleId, Long envId) {
        this.appSystemId = appSystemId;
        this.moduleId = moduleId;
        this.envId = envId;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public DeployPipelineConfigVo getConfig() {
        if (config == null && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr, DeployPipelineConfigVo.class);
        }
        return config;
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
}
