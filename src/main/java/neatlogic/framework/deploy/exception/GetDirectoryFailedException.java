package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class GetDirectoryFailedException extends ApiRuntimeException {
    private static final long serialVersionUID = -1446535816055079448L;

    public GetDirectoryFailedException(String error) {
        super("获取目录失败，错误：{0}", error);
    }
}
