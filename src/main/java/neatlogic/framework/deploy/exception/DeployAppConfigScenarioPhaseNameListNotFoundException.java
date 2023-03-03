package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/12 12:22 下午
 */
public class DeployAppConfigScenarioPhaseNameListNotFoundException extends ApiRuntimeException {

    public DeployAppConfigScenarioPhaseNameListNotFoundException() {
        super("exception.deploy.deployappconfigscenariophasenamelistnotfoundexception");
    }
}
