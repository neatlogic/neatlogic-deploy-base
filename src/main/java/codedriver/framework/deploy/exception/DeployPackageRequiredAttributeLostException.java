package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployPackageRequiredAttributeLostException extends ApiRuntimeException {

    private static final long serialVersionUID = -4092425927248172614L;

    public DeployPackageRequiredAttributeLostException(int index) {
        super("第：" + index + "个依赖缺少groupId|artifactId|version属性");
    }

}
