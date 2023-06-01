package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployCiGitlabAccountLostException extends ApiRuntimeException {

    private static final long serialVersionUID = 3238618567460399200L;

    public DeployCiGitlabAccountLostException(String repoServerAddress, String repoName) {
        super("{0}/{1}的gitlab账号用户名与密码不能为空", repoServerAddress, repoName);
    }
}
