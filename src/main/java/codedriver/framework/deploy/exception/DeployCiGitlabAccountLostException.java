package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployCiGitlabAccountLostException extends ApiRuntimeException {

    private static final long serialVersionUID = 3238618567460399200L;

    public DeployCiGitlabAccountLostException(String repoServerAddress, String repoName) {
        super(repoServerAddress + "/" + repoName + "的gitlab账号用户名与密码不能为空");
    }
}
