package codedriver.framework.deploy.exception.profile;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/3/18 11:00 上午
 */
public class DeployProfileHasBeenReferredException extends ApiRuntimeException {
    public DeployProfileHasBeenReferredException(String name) {
        super("当前profile“" + name + "”已被引用，无法删除");

    }
}
