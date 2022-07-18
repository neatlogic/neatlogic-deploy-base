package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.constvalue.CiphertextPrefix;
import codedriver.framework.common.util.RC4Util;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

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
    @EntityField(name = "账号", type = ApiParamType.STRING)
    private String account;
    @EntityField(name = "账号id", type = ApiParamType.LONG)
    private Long accountId;
    @EntityField(name = "解密密码", type = ApiParamType.STRING)
    private String passwordPlain;
    @EntityField(name = "加密密码", type = ApiParamType.STRING)
    private String passwordCipher;

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswordPlain() {
        if (StringUtils.isBlank(passwordPlain)) {
            if (StringUtils.isNotBlank(passwordCipher)) {
                if (passwordCipher.startsWith(CiphertextPrefix.RC4.getValue())) {
                    this.passwordPlain = RC4Util.decrypt(this.passwordCipher.substring(4));
                } else {
                    this.passwordPlain = this.passwordCipher;
                }
            }
        }
        return passwordPlain;
    }

    public void setPasswordPlain(String passwordPlain) {
        this.passwordPlain = passwordPlain;
    }

    public String getPasswordCipher() {
        if (StringUtils.isBlank(passwordCipher)) {
            if (StringUtils.isNotBlank(passwordPlain)) {
                this.passwordCipher = CiphertextPrefix.RC4.getValue() + RC4Util.encrypt(passwordPlain);
            }
        }
        return passwordCipher;
    }

    public void setPasswordCipher(String passwordCipher) {
        this.passwordCipher = passwordCipher;
    }

}
