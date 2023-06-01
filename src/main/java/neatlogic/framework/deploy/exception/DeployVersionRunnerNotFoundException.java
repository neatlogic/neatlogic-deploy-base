package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionRunnerNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -881044150035926493L;

    public DeployVersionRunnerNotFoundException(String versionName) {
        super("未找到版本“{0}”对应的runnner", versionName);
    }

    public DeployVersionRunnerNotFoundException(String versionName, Integer buildNo) {
        super("未找到版本“{0}”(buildNo为{1})对应的runnner", versionName, buildNo);
    }

    public DeployVersionRunnerNotFoundException(String versionName, String envName) {
        super("未找到版本“{0}”({1}环境)对应的runnner", versionName, envName);
    }
}
