/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package neatlogic.framework.deploy.exception;

import neatlogic.framework.cmdb.dto.cientity.CiEntityVo;
import neatlogic.framework.deploy.constvalue.DeployAppConfigAction;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployAppOperationAuthException extends ApiRuntimeException {
    public DeployAppOperationAuthException(CiEntityVo appSystemCiEntity, DeployAppConfigAction action) {
        super("您没有系统：" + appSystemCiEntity.getName() + "(" + appSystemCiEntity.getId() + ")下的：" + action.getText() + "的【操作权限】");
    }
}
