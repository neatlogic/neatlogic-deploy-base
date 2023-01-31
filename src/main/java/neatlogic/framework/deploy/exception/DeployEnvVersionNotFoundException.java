package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployEnvVersionNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 3395061883354029849L;

    public DeployEnvVersionNotFoundException(String envName) {
        super("没有找到环境：" + envName + "的当前版本");
    }
}
