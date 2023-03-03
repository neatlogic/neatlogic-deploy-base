package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/7/27 9:55 上午
 */
public class DeployVersionBuildNoStatusIsNotReleasedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2734267695520966092L;

    public DeployVersionBuildNoStatusIsNotReleasedException(String sysName, String moduleName, String envName, String version, Integer buildNo, String status) {
        super("exception.deploy.deployversionbuildnostatusisnotreleasedexception", sysName, moduleName, envName, version, buildNo, status);
    }
}
