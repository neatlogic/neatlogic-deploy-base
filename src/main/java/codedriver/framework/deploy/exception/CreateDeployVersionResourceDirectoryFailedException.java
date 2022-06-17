package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class CreateDeployVersionResourceDirectoryFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2758560181351338670L;

    public CreateDeployVersionResourceDirectoryFailedException(String error) {
        super("新建目录失败，错误：" + error);
    }
}
