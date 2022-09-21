/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.webhook;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
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
