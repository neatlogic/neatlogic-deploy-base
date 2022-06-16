package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/6/1 4:31 下午
 */
public class DeployVersionIsRepeatException extends ApiRuntimeException {
    public DeployVersionIsRepeatException(String version) {
        super("当前模块存在重复版本号“" + version + "”，请修改版本号后重新保存");
    }
}
