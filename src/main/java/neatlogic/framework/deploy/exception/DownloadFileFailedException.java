package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author laiwt
 * @date 2022/6/14 9:55 上午
 */
public class DownloadFileFailedException extends ApiRuntimeException {

    private static final long serialVersionUID = 5178707131323656000L;

    public DownloadFileFailedException(String error) {
        super("下载文件失败，错误：{0}", error);
    }
}
