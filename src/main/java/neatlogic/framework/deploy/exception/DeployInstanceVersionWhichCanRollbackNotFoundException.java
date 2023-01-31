package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployInstanceVersionWhichCanRollbackNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -7928742271799411171L;

    public DeployInstanceVersionWhichCanRollbackNotFoundException(Long resourceId) {
        super("没有找到实例：" + resourceId + "的可回退版本");
    }
}
