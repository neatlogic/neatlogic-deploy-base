package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

/**
 * @author longrf
 * @date 2022/7/1 2:45 下午
 */
public class DeployAppConfigEnvDBConfigAccountVo {

    private static final long serialVersionUID = -1946249786425118588L;

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "DB配置id", type = ApiParamType.LONG)
    private Long DBConfigId;
    @EntityField(name = "用户别名", type = ApiParamType.STRING)
    private String accountAlias;
    @EntityField(name = "用户名", type = ApiParamType.STRING)
    private String accountName;
    @EntityField(name = "账号id", type = ApiParamType.LONG)
    private Long accountId;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDBConfigId() {
        return DBConfigId;
    }

    public void setDBConfigId(Long DBConfigId) {
        this.DBConfigId = DBConfigId;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}
