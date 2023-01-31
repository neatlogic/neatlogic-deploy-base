package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class CopyOrMoveFileToSubDirectoryException extends ApiRuntimeException {

    private static final long serialVersionUID = -5564588450510859134L;

    public CopyOrMoveFileToSubDirectoryException() {
        super("禁止复制或移动到自身的子目录");
    }
}
