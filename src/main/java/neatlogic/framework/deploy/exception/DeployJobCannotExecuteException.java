package neatlogic.framework.deploy.exception;

import neatlogic.framework.deploy.dto.job.DeployJobVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/17 9:55 上午
 */
public class DeployJobCannotExecuteException extends ApiRuntimeException {


    private static final long serialVersionUID = -6988752668439074063L;

    public DeployJobCannotExecuteException(DeployJobVo deployJobVo) {
        super("exception.deploy.deployjobcannotexecuteexception", deployJobVo.getAppSystemName(), deployJobVo.getAppSystemId(), deployJobVo.getEnvName(), deployJobVo.getEnvId(), deployJobVo.getScenarioName(), deployJobVo.getScenarioId());
    }
}
