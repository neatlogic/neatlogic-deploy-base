package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class GetDeployVersionResourceFailedException extends ApiRuntimeException {
    private static final long serialVersionUID = -1446535816055079448L;

    public GetDeployVersionResourceFailedException(String error) {
        super("获取目录失败，错误：" + error);
    }
}
