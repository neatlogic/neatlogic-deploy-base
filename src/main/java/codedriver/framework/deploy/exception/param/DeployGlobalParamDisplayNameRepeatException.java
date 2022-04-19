package codedriver.framework.deploy.exception.param;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/19 11:23 上午
 */
public class DeployGlobalParamDisplayNameRepeatException extends ApiRuntimeException {
    public DeployGlobalParamDisplayNameRepeatException(String name) {
        super("全局参数显示名：'" + name + "'已存在");
    }
}
