package codedriver.framework.deploy.exception.param;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/19 11:21 上午
 */
public class DeployGlobalParamNameRepeatException extends ApiRuntimeException {
    public DeployGlobalParamNameRepeatException(String name) {
        super("全局参数名：'" + name + "'已存在");
    }
}
