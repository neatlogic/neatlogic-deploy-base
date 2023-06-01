package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionEnvNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -1562312611391613513L;

    public DeployVersionEnvNotFoundException(String versionName, Long envId) {
        super("版本“{0}”的{1}环境不存在", versionName, envId);
    }

    public DeployVersionEnvNotFoundException(Long envId) {
        super("环境id:{0}不存在", envId);
    }

    public DeployVersionEnvNotFoundException(String sysName, String moduleName, String envName, String version) {
        super("{0}/{1}/{3} 环境:{2} 不存在", sysName, moduleName, version, envName);
    }
}
