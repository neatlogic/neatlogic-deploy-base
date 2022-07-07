package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/5 11:21 上午
 */
public class DeployAppConfigEnvDBAliasNameRepeatException extends ApiRuntimeException {
    public DeployAppConfigEnvDBAliasNameRepeatException(String dbAlias) {
        super("数据库别名“" + dbAlias + "”已存在");
    }
}
