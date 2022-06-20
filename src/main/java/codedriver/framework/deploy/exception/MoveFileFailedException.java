package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class MoveFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -7615529238650830358L;

    public MoveFileFailedException(String error) {
        super("文件复制或重命名失败，错误：" + error);
    }
}
