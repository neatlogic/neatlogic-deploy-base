/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package neatlogic.framework.deploy.exception;

import neatlogic.framework.autoexec.dto.scenario.AutoexecScenarioVo;
import neatlogic.framework.cmdb.dto.cientity.CiEntityVo;
import neatlogic.framework.cmdb.dto.resourcecenter.entity.AppSystemVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployAppScenarioAuthException extends ApiRuntimeException {

    public DeployAppScenarioAuthException(CiEntityVo appSystemCiEntity, AutoexecScenarioVo scenarioVo) {
        super("nfde.deployappscenarioauthexception.deployappscenarioauthexception", appSystemCiEntity.getName(), appSystemCiEntity.getId(), scenarioVo.getName(), scenarioVo.getId());
    }

    public DeployAppScenarioAuthException(AppSystemVo appSystemVo, AutoexecScenarioVo scenarioVo) {
        super("nfde.deployappscenarioauthexception.deployappscenarioauthexception", appSystemVo.getName(), appSystemVo.getAbbrName(), scenarioVo.getName(), scenarioVo.getId());
    }
}
