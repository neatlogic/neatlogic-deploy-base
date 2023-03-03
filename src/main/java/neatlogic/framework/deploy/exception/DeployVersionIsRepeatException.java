package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2022/6/1 4:31 下午
 */
public class DeployVersionIsRepeatException extends ApiRuntimeException {
    public DeployVersionIsRepeatException(String version) {
        super("exception.deploy.deployversionisrepeatexception", version);
    }
}
