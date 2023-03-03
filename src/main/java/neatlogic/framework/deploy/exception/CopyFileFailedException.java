package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class CopyFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -5812477063108418570L;

    public CopyFileFailedException(String error) {
        super("exception.deploy.copyfilefailedexception" , error);
    }
}
