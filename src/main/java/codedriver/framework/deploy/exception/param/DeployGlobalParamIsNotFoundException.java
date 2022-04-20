package codedriver.framework.deploy.exception.param;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/18 7:09 下午
 */
public class DeployGlobalParamIsNotFoundException extends ApiRuntimeException {
    public DeployGlobalParamIsNotFoundException(Long paramId) {
        super("全局参数 id“" + paramId + "”不存在");
    }
}
