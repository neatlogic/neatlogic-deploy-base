package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployPackageRequiredAttributeLostException extends ApiRuntimeException {

    private static final long serialVersionUID = -4092425927248172614L;

    public DeployPackageRequiredAttributeLostException(int index) {
        super("exception.deploy.deploypackagerequiredattributelostexception", index);
    }

}
