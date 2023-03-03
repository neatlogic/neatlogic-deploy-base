/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.deploy.dto.webhook;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.List;

public class DeployJobWebhookConfigVo implements Serializable {
    private static final long serialVersionUID = 9213556846712167853L;
    @EntityField(name = "源环境集合", type = ApiParamType.JSONARRAY)
    private List<String> envNameList;
    @EntityField(name = "作业状态集合", type = ApiParamType.JSONARRAY)
    private List<String> jobStatusList;
    @EntityField(name = "集成入参", type = ApiParamType.JSONOBJECT)
    private JSONObject integrationInputParam;
    @EntityField(name = "配置", type = ApiParamType.JSONARRAY)
    private List<DeployJobWebhookAppModuleVo> webhookAppModuleList;
    @EntityField(name = "流水线id", type = ApiParamType.LONG)
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
