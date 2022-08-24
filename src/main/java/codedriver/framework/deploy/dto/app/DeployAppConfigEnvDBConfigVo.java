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
    @EntityField(name = "数据库schema", type = ApiParamType.STRING)
    private String dbSchema;
    @EntityField(name = "数据库资产id", type = ApiParamType.LONG)
    private Long dbResourceId;
    @EntityField(name = "账号id", type = ApiParamType.LONG)
    private Long accountId;
    @EntityField(name = "账号", type = ApiParamType.STRING)
    private String account;
    @EntityField(name = "数据库名称", type = ApiParamType.STRING)
    private String dbResourceName;
    @EntityField(name = "加密密码", type = ApiParamType.STRING)
    private String passwordCipher;
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

    public DeployAppConfigEnvDBConfigVo(Long appSystemId, Long appModuleId, Long envId, String dbSchema) {
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.envId = envId;
        this.dbSchema = dbSchema;
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

    public String getDbSchema() {
        return dbSchema;
    }

    public void setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public String getPasswordCipher() {
        return passwordCipher;
    }

    public void setPasswordCipher(String passwordCipher) {
        this.passwordCipher = passwordCipher;
    }
}
