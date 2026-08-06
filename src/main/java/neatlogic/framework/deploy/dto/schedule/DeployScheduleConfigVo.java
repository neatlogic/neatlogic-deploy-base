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

package neatlogic.framework.deploy.dto.schedule;

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.dto.job.DeployJobModuleVo;
import neatlogic.framework.deploy.dto.version.DeploySystemModuleVersionVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployScheduleConfigVo {
    @EntityField(name = "term.autoexec.scenarioid", type = ApiParamType.LONG)
    private Long scenarioId;
    @EntityField(name = "term.autoexec.scenarioname", type = ApiParamType.STRING)
    private String scenarioName;
    @EntityField(name = "term.cmdb.envid", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "term.cmdb.envname", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "term.autoexec.roundcount", type = ApiParamType.INTEGER)
    private Integer roundCount;
    @EntityField(name = "term.autoexec.parallelcount", type = ApiParamType.INTEGER)
    private Integer parallelCount;
    @EntityField(name = "term.autoexec.parallelpolicy", type = ApiParamType.STRING)
    private String parallelPolicy;

    @EntityField(name = "nfdds.deployscheduleconfigvo.param.name", type = ApiParamType.JSONOBJECT)
    private JSONObject param;
    @EntityField(name = "nfdds.deployscheduleconfigvo.modulelist.name", type = ApiParamType.JSONARRAY)
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

    public Integer getParallelCount() {
        return parallelCount;
    }

    public void setParallelCount(Integer parallelCount) {
        this.parallelCount = parallelCount;
    }

    public String getParallelPolicy() {
        return parallelPolicy;
    }

    public void setParallelPolicy(String parallelPolicy) {
        this.parallelPolicy = parallelPolicy;
    }
}
