package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionJobNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = -3856906176272934432L;

    public DeployVersionJobNotFoundException(String version, Integer buildNo) {
        super("版本：“" + version + "”的编译号：" + buildNo + "对应的作业不存在");
    }

    public DeployVersionJobNotFoundException(String version, String envName) {
        super("版本：“" + version + "”的环境：" + envName + "对应的作业不存在");
    }
}
