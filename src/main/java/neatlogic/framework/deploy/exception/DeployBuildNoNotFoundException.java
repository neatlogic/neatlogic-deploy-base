package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/7/29 9:55 上午
 */
public class DeployBuildNoNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 4672351140551885969L;

    public DeployBuildNoNotFoundException(String appSystemName, String appModuleName, String version) {
        super("exception.deploy.deploybuildnonotfoundexception", appSystemName, appModuleName, version);
    }

}
