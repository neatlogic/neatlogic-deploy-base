package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionEnvNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -1562312611391613513L;

    public DeployVersionEnvNotFoundException(String versionName, Long envId) {
        super("版本“" + versionName + "”的" + envId + "环境不存在");
    }

    public DeployVersionEnvNotFoundException(Long envId) {
        super("环境id:" + envId + "不存在");
    }

    public DeployVersionEnvNotFoundException(String sysName, String moduleName, String envName, String version) {
        super(String.format("%s/%s/%s 环境:%s 不存在", sysName, moduleName, version, envName));
    }
}
