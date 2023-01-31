package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class UploadFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = -258088119518145858L;

    public UploadFileFailedException(String error) {
        super("上传文件失败，错误：" + error);
    }
}
