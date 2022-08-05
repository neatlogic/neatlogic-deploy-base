package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/04 9:55 上午
 */
public class DeployBatchJobCannotExecuteException extends ApiRuntimeException {

    private static final long serialVersionUID = -968102062963735436L;

    public DeployBatchJobCannotExecuteException() {
        super("非当前批量发布执行人，无法执行，请先保存或接管" );
    }
}
