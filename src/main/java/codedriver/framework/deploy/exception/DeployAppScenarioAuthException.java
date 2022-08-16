/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.exception;

import codedriver.framework.autoexec.dto.scenario.AutoexecScenarioVo;
import codedriver.framework.cmdb.dto.cientity.CiEntityVo;
import codedriver.framework.exception.core.ApiRuntimeException;

public class DeployAppScenarioAuthException extends ApiRuntimeException {

    public DeployAppScenarioAuthException(CiEntityVo appSystemCiEntity, AutoexecScenarioVo scenarioVo) {
        super("您没有系统：" + appSystemCiEntity.getName() + "(" + appSystemCiEntity.getId() + ")下的场景：" + scenarioVo.getName() + "(" + scenarioVo.getId() + ")" + "的【场景权限】");
    }
}
