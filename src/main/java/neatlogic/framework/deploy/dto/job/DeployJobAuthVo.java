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

package neatlogic.framework.deploy.dto.job;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployJobAuthVo {
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "授权类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "授权对象", type = ApiParamType.STRING)
    private String authUuid;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthUuid() {
        return authUuid;
    }

    public void setAuthUuid(String authUuid) {
        this.authUuid = authUuid;
    }
}
