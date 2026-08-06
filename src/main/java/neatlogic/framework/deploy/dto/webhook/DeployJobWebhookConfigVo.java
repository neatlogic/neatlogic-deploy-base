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

package neatlogic.framework.deploy.dto.webhook;

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

import java.io.Serializable;
import java.util.List;

public class DeployJobWebhookConfigVo implements Serializable {
    private static final long serialVersionUID = 9213556846712167853L;
    @EntityField(name = "nfddw.deployjobwebhookconfigvo.envnamelist.name", type = ApiParamType.JSONARRAY)
    private List<String> envNameList;
    @EntityField(name = "term.autoexec.jobstatuslist", type = ApiParamType.JSONARRAY)
    private List<String> jobStatusList;
    @EntityField(name = "nfddw.deployjobwebhookconfigvo.integrationinputparam.name", type = ApiParamType.JSONOBJECT)
    private JSONObject integrationInputParam;
    @EntityField(name = "nfddw.deployjobwebhookconfigvo.webhookappmodulelist.name", type = ApiParamType.JSONARRAY)
    private List<DeployJobWebhookAppModuleVo> webhookAppModuleList;
    @EntityField(name = "nfddw.deployjobwebhookconfigvo.pipelineid.name", type = ApiParamType.LONG)
    private Long pipeLineId;



    public List<String> getEnvNameList() {
        return envNameList;
    }

    public void setEnvNameList(List<String> envNameList) {
        this.envNameList = envNameList;
    }

    public List<String> getJobStatusList() {
        return jobStatusList;
    }

    public void setJobStatusList(List<String> jobStatusList) {
        this.jobStatusList = jobStatusList;
    }

    public List<DeployJobWebhookAppModuleVo> getWebhookAppModuleList() {
        return webhookAppModuleList;
    }

    public void setWebhookAppModuleList(List<DeployJobWebhookAppModuleVo> webhookAppModuleList) {
        this.webhookAppModuleList = webhookAppModuleList;
    }

    public JSONObject getIntegrationInputParam() {
        return integrationInputParam;
    }

    public void setIntegrationInputParam(JSONObject integrationInputParam) {
        this.integrationInputParam = integrationInputParam;
    }

    public Long getPipeLineId() {
        return pipeLineId;
    }

    public void setPipeLineId(Long pipeLineId) {
        this.pipeLineId = pipeLineId;
    }
}
