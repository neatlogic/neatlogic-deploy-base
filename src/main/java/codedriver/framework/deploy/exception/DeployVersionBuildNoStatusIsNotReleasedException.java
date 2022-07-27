package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/7/27 9:55 上午
 */
public class DeployVersionBuildNoStatusIsNotReleasedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2734267695520966092L;

    public DeployVersionBuildNoStatusIsNotReleasedException(String sysName, String moduleName, String envName, String version, Integer buildNo, String status) {
        super(String.format("%s/%s/%s 版本:%s buildNo:%d 状态不是released,而是%s", sysName, moduleName, envName, version, buildNo, status));
    }
}
