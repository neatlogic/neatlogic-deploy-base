package codedriver.framework.deploy.exception.scene;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/4/19 11:14 上午
 */
public class DeploySceneRepeatException extends ApiRuntimeException {
    public DeploySceneRepeatException(String name) {
        super("场景名称：'" + name + "'已存在");
    }
}
