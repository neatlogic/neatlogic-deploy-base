package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/7/27 9:55 上午
 */
public class DeployVersionBuildNoStatusIsNotReleasedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2734267695520966092L;

    public DeployVersionBuildNoStatusIsNotReleasedException(String sysName, String moduleName, String envName, String version, Integer buildNo, String status) {
        super("{0}/{1}/{2} 版本:{3} buildNo:{4} 状态不是released,而是{5}", sysName, moduleName, envName, version, buildNo, status);
    }
}
