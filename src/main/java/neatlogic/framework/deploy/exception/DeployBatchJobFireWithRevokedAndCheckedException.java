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

import neatlogic.framework.deploy.dto.job.DeployJobVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/2 9:55 上午
 */
public class DeployBatchJobFireWithRevokedAndCheckedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2949252138258270630L;

    public DeployBatchJobFireWithRevokedAndCheckedException(DeployJobVo deployJobVo) {
        super("nfde.deploybatchjobfirewithrevokedandcheckedexception.deploybatchjobfirewithrevokedandcheckedexception", deployJobVo.getName(), deployJobVo.getId());
    }
}
