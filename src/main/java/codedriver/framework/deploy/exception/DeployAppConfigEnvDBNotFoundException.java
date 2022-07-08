package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/7 6:07 下午
 */
public class DeployAppConfigEnvDBNotFoundException extends ApiRuntimeException {
    public DeployAppConfigEnvDBNotFoundException(Long id) {
        super("DB配置id：" + id + "不存在");
    }
}
