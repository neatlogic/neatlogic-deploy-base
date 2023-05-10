/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

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

package neatlogic.framework.deploy.dto.schedule;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.dto.job.DeployJobModuleVo;
import neatlogic.framework.deploy.dto.version.DeploySystemModuleVersionVo;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class DeployScheduleConfigVo {
    @EntityField(name = "场景id", type = ApiParamType.LONG)
    private Long scenarioId;
    @EntityField(name = "场景名称", type = ApiParamType.STRING)
    private String scenarioName;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境资产名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "分批数量", type = ApiParamType.INTEGER)
    private Integer roundCount;

    @EntityField(name = "作业参数映射列表", type = ApiParamType.JSONOBJECT)
    private JSONObject param;
    @EntityField(name = "模块列表", type = ApiParamType.JSONARRAY)
    private List<DeployJobModuleVo> moduleList;

    private List<DeploySystemModuleVersionVo> appSystemModuleVersionList;

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

    public Integer getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(Integer roundCount) {
        this.roundCount = roundCount;
    }

    public JSONObject getParam() {
        return param;
    }

    public void setParam(JSONObject param) {
        this.param = param;
    }

    public List<DeployJobModuleVo> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<DeployJobModuleVo> moduleList) {
        this.moduleList = moduleList;
    }

    public List<DeploySystemModuleVersionVo> getAppSystemModuleVersionList() {
        return appSystemModuleVersionList;
    }

    public void setAppSystemModuleVersionList(List<DeploySystemModuleVersionVo> appSystemModuleVersionList) {
        this.appSystemModuleVersionList = appSystemModuleVersionList;
    }
}
