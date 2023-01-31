package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/5 11:21 上午
 */
public class DeployAppConfigEnvDBSchemaNameRepeatException extends ApiRuntimeException {
    public DeployAppConfigEnvDBSchemaNameRepeatException(String dbSchema) {
        super("数据库schema“" + dbSchema + "”已存在");
    }
}
