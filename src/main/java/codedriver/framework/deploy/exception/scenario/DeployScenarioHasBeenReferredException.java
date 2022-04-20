package codedriver.framework.deploy.exception.scenario;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/19 3:49 下午
 */
public class DeployScenarioHasBeenReferredException extends ApiRuntimeException {
    public DeployScenarioHasBeenReferredException(String name) {
        super("若当前场景：'" + name + "'被引用，无法删除。");
    }
}
