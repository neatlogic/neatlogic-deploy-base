package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/7/12 12:22 下午
 */
public class DeployAppConfigScenarioPhaseNameListNotFoundException extends ApiRuntimeException {

    public DeployAppConfigScenarioPhaseNameListNotFoundException() {
        super("当前流水线的场景没有绑定阶段");
    }
}
