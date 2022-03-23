package codedriver.framework.deploy.exception.profile;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/3/18 10:57 上午
 */
public class DeployProfileIsNotFoundException extends ApiRuntimeException {
    public DeployProfileIsNotFoundException(Long id) {
        super("profile id“" + id + "”不存在");
    }
}
