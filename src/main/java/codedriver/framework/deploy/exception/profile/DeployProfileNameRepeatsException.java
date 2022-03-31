package codedriver.framework.deploy.exception.profile;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/3/25 5:01 下午
 */
public class DeployProfileNameRepeatsException extends ApiRuntimeException {
    public DeployProfileNameRepeatsException(String name) {
        super("profile名称：'" + name + "'已存在");
    }
}
