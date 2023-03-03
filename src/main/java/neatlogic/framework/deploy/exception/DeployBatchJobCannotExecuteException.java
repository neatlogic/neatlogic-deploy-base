package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/04 9:55 上午
 */
public class DeployBatchJobCannotExecuteException extends ApiRuntimeException {

    private static final long serialVersionUID = -968102062963735436L;

    public DeployBatchJobCannotExecuteException() {
        super("exception.deploy.deploybatchjobcannotexecuteexception");
    }
}
