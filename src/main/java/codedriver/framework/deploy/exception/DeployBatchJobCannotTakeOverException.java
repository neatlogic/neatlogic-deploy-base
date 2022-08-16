package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/12 9:55 上午
 */
public class DeployBatchJobCannotTakeOverException extends ApiRuntimeException {

    private static final long serialVersionUID = -6814489211544097125L;

    public DeployBatchJobCannotTakeOverException() {
        super("无法接管，请联系管理员" );
    }
}
