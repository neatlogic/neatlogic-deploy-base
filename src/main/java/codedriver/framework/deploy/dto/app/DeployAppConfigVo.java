/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

public class DeployAppConfigVo extends BaseEditorVo {
    private static final long serialVersionUID = -4457900289777364590L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "应用系统ID", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块ID", type = ApiParamType.LONG)
    private Long appModuleId = 0L;
    @EntityField(name = "环境ID", type = ApiParamType.LONG)
    private Long envId = 0L;
    @EntityField(name = "流水线配置信息", type = ApiParamType.JSONOBJECT)
    private DeployPipelineConfigVo config;

    @JSONField(serialize = false)
    private String configStr;

    public DeployAppConfigVo() {
    }
    public DeployAppConfigVo(Long appSystemId) {
        this.appSystemId = appSystemId;
    }
    public DeployAppConfigVo(Long appSystemId, Long moduleId) {
        this.appSystemId = appSystemId;
        this.appModuleId = moduleId;
    }
    public DeployAppConfigVo(Long appSystemId, Long moduleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = moduleId;
        this.envId = envId;
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
