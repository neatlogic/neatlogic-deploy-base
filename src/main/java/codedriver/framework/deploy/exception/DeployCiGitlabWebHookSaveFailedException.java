package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployCiGitlabWebHookSaveFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1106736504402463949L;

    public DeployCiGitlabWebHookSaveFailedException() {
        super("gitlab webhook设置失败，请检查仓库服务器地址、仓库名、用户名、密码是否正确");
    }
}
