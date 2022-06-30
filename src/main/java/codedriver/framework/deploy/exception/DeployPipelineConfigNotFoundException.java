/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class DeployPipelineConfigNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 7358357393598874016L;

    public DeployPipelineConfigNotFoundException(){
        super("该应用系统的流水线不存在");
    }
}
