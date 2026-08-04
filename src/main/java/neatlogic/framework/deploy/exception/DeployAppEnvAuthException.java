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

import neatlogic.framework.cmdb.dto.cientity.CiEntityVo;
import neatlogic.framework.cmdb.dto.resourcecenter.ResourceVo;
import neatlogic.framework.cmdb.dto.resourcecenter.entity.AppSystemVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class DeployAppEnvAuthException extends ApiRuntimeException {
    public DeployAppEnvAuthException(CiEntityVo appSystemCiEntity, ResourceVo envCiEntity) {
        super("nfde.deployappenvauthexception.deployappenvauthexception", appSystemCiEntity.getName(), appSystemCiEntity.getId(), envCiEntity.getName(), envCiEntity.getId());
    }

    public DeployAppEnvAuthException(AppSystemVo appSystemVo, ResourceVo env) {
        super("nfde.deployappenvauthexception.deployappenvauthexception", appSystemVo.getName(), appSystemVo.getAbbrName(), env.getName(), env.getId());
    }
}
