package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class ChangeFilePermissionFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -6955100823785381175L;

    public ChangeFilePermissionFailedException(String error) {
        super("修改权限失败，错误：" + error);
    }
}
