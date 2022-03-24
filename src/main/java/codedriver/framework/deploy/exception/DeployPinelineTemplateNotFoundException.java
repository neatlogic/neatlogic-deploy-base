/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author: linbq
 * @since: 2021/4/13 14:50
 **/
public class DeployPinelineTemplateNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -977868275722986183L;

    public DeployPinelineTemplateNotFoundException(Long id){
        super("流水线模板：'" + id + "'不存在");
    }

    public DeployPinelineTemplateNotFoundException(String label){
        super("流水线模板：'" + label + "'不存在");
    }
}
