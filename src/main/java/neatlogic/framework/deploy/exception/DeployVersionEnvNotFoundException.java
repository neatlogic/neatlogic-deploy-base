package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionEnvNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -1562312611391613513L;

    public DeployVersionEnvNotFoundException(String versionName, Long envId) {
        super("nfde.deployversionenvnotfoundexception.deployversionenvnotfoundexception", versionName, envId);
    }

    public DeployVersionEnvNotFoundException(Long envId) {
        super("nfde.deployversionenvnotfoundexception.b", envId);
    }

    public DeployVersionEnvNotFoundException(String sysName, String moduleName, String envName, String version) {
        super("nfde.deployversionenvnotfoundexception.c", sysName, moduleName, version, envName);
    }
}
