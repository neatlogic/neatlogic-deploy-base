package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeleteFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -4331461538518639541L;

    public DeleteFileFailedException(String error) {
        super("删除文件失败，错误：" + error);
    }
}
