package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionResourceHasBeenLockedException extends ApiRuntimeException {

    private static final long serialVersionUID = 7151703755201232671L;

    public DeployVersionResourceHasBeenLockedException() {
        super("HOME已被锁定，请稍后再试");
    }
}
