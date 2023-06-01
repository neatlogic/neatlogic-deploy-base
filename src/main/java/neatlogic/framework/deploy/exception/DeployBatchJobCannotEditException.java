package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/04 9:55 上午
 */
public class DeployBatchJobCannotEditException extends ApiRuntimeException {


    private static final long serialVersionUID = 6736760604677810375L;

    public DeployBatchJobCannotEditException(String status) {
        super("当批量发布作业状态为：“{0}” 时，无法编辑保存", status);
    }
}
