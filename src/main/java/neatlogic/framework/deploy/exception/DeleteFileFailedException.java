package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeleteFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -4331461538518639541L;

    public DeleteFileFailedException(String error) {
        super("exception.deploy.deletefilefailedexception", error);
    }
}
