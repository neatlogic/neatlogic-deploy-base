package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployCiGitlabWebHookDeleteFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = 9060379251793437357L;

    public DeployCiGitlabWebHookDeleteFailedException(String repoServerAddress, String repoName) {
        super(repoServerAddress + "/" + repoName + "的gitlab webhook删除失败");
    }
}
