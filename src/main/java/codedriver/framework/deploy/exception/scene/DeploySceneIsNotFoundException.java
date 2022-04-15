package codedriver.framework.deploy.exception.scene;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/15 2:12 下午
 */
public class DeploySceneIsNotFoundException extends ApiRuntimeException {
    public DeploySceneIsNotFoundException(Long id) {
        super("场景 id“" + id + "”不存在");
    }
}