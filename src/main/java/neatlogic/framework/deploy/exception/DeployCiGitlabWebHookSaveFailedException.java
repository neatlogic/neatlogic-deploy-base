package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployCiGitlabWebHookSaveFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1106736504402463949L;

    public DeployCiGitlabWebHookSaveFailedException(String error) {
        super("gitlab webhook设置失败，错误：" + error);
    }
}
