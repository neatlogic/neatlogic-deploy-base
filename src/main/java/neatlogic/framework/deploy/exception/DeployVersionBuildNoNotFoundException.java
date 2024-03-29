package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionBuildNoNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -1986418233980948539L;

    public DeployVersionBuildNoNotFoundException(String versionName, Integer buildNo) {
        super("版本“{0}”的buildNo“{1}”不存在", versionName, buildNo);
    }

    public DeployVersionBuildNoNotFoundException(Integer buildNo) {
        super("buildNo“{0}”不存在", buildNo);
    }
}
