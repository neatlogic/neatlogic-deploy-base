package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DeployVersionResourceTypeNotFoundException extends ApiRuntimeException {
    private static final long serialVersionUID = 1723831179942798814L;

    public DeployVersionResourceTypeNotFoundException(String type) {
        super("制品类型“{0}”不存在", type);
    }
}
