package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/12 9:55 上午
 */
public class DeployBatchJobCannotCheckException extends ApiRuntimeException {

    private static final long serialVersionUID = -3691919399447331497L;

    public DeployBatchJobCannotCheckException() {
        super("无法验证，请联系管理员" );
    }
}
