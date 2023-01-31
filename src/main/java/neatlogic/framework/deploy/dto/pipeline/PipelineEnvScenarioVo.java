/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class PipelineEnvScenarioVo {
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "场景id", type = ApiParamType.LONG)
    private Long scenarioId;
    @EntityField(name = "场景名称", type = ApiParamType.STRING)
    private String scenarioName;

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public Long getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }
}
