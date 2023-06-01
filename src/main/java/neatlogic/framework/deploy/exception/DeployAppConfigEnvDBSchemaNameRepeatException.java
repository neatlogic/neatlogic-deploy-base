package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/5 11:21 上午
 */
public class DeployAppConfigEnvDBSchemaNameRepeatException extends ApiRuntimeException {
    public DeployAppConfigEnvDBSchemaNameRepeatException(String dbSchema) {
        super("数据库schema“{0}”已存在", dbSchema);
    }
}
