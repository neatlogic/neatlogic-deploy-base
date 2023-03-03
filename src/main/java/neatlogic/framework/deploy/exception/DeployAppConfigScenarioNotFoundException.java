package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/12 12:20 下午
 */
public class DeployAppConfigScenarioNotFoundException extends ApiRuntimeException {

    public DeployAppConfigScenarioNotFoundException() {
        super("exception.deploy.deployappconfigscenarionotfoundexception");
    }
}
