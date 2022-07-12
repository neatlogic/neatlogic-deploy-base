package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author longrf
 * @date 2022/7/1 3:29 下午
 */
public class DeployAppConfigEnvDBConfigVo {

    private static final long serialVersionUID = -1948079786425118588L;
    @EntityField(name = "应用id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "数据库别名", type = ApiParamType.STRING)
    private String dbAlias;
    @EntityField(name = "数据库资产id", type = ApiParamType.LONG)
    private Long dbResourceId;
    @EntityField(name = "数据库名称", type = ApiParamType.STRING)
    private String dbResourceName;
    @EntityField(name = "执行用户列表", type = ApiParamType.JSONARRAY)
    private List<DeployAppConfigEnvDBConfigAccountVo> accountList;
    @EntityField(name = "高级设置", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @JSONField(serialize = false)
    private String configStr;

    public DeployAppConfigEnvDBConfigVo() {
    }

    public DeployAppConfigEnvDBConfigVo(Long appSystemId, Long appModuleId, Long envId) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
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

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDbAlias() {
        return dbAlias;
    }

    public void setDbAlias(String dbAlias) {
        this.dbAlias = dbAlias;
    }

    public Long getDbResourceId() {
        return dbResourceId;
    }

    public void setDbResourceId(Long dbResourceId) {
        this.dbResourceId = dbResourceId;
    }

    public String getDbResourceName() {
        return dbResourceName;
    }

    public void setDbResourceName(String dbResourceName) {
        this.dbResourceName = dbResourceName;
    }

    public List<DeployAppConfigEnvDBConfigAccountVo> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<DeployAppConfigEnvDBConfigAccountVo> accountList) {
        this.accountList = accountList;
    }


    public JSONObject getConfig() {
        if (MapUtils.isEmpty(config) && StringUtils.isNotBlank(configStr)) {
            config = JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public String getConfigStr() {
        if (StringUtils.isEmpty(configStr) && MapUtils.isNotEmpty(config)) {
            configStr = config.toJSONString();
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }
}
