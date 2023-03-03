package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionRunnerNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -881044150035926493L;

    public DeployVersionRunnerNotFoundException(String versionName) {
        super("exception.deploy.deployversionrunnernotfoundexception", versionName);
    }

    public DeployVersionRunnerNotFoundException(String versionName, Integer buildNo) {
        super("exception.deploy.deployversionrunnernotfoundexception.1", versionName, buildNo);
    }

    public DeployVersionRunnerNotFoundException(String versionName, String envName) {
        super("exception.deploy.deployversionrunnernotfoundexception.2", versionName, envName);
    }
}
