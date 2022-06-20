package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class CopyFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -5812477063108418570L;

    public CopyFileFailedException(String error) {
        super("复制文件失败，错误：" + error);
    }
}
