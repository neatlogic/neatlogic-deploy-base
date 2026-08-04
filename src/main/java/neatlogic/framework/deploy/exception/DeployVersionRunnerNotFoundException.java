package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionRunnerNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -881044150035926493L;

    public DeployVersionRunnerNotFoundException(String versionName) {
        super("nfde.deployversionrunnernotfoundexception.deployversionrunnernotfoundexception", versionName);
    }

    public DeployVersionRunnerNotFoundException(String versionName, Integer buildNo) {
        super("nfde.deployversionrunnernotfoundexception.b", versionName, buildNo);
    }

    public DeployVersionRunnerNotFoundException(String versionName, String envName) {
        super("nfde.deployversionrunnernotfoundexception.c", versionName, envName);
    }
}
