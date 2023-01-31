/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployCiPipelineIdLostException extends ApiRuntimeException {

    public DeployCiPipelineIdLostException() {
        super("持续集成配置缺少超级流水线配置");
    }
}
