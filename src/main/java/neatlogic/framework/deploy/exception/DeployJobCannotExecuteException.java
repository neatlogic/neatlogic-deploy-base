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
        super("无法执行，当前用户没有当前应用系统/环境/场景 {0}({1})/{2}({3})/{4}({5}) 权限", deployJobVo.getAppSystemName(), deployJobVo.getAppSystemId(), deployJobVo.getEnvName(), deployJobVo.getEnvId(), deployJobVo.getScenarioName(), deployJobVo.getScenarioId());
    }
}
