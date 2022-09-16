/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception.trigger;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author: lvzk
 * @since: 2022/9/16 11:12
 **/
public class DeployTriggerNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 449494603488752065L;

    public DeployTriggerNotFoundException(Long id) {
        super("触发器id '" + id.toString() + "' 不存在");
    }
}
