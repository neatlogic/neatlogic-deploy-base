/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.autoexec.dto.AutoexecParamVo;
import codedriver.framework.autoexec.dto.combop.*;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.ArrayList;
import java.util.List;

public class DeployPipelineConfigVo {

    @EntityField(name = "阶段列表", type = ApiParamType.JSONARRAY)
    private List<DeployPipelinePhaseVo> combopPhaseList;

    @EntityField(name = "阶段组列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecCombopGroupVo> combopGroupList;

//    @EntityField(name = "执行目标配置", type = ApiParamType.JSONOBJECT)
//    private AutoexecCombopExecuteConfigVo executeConfig;

    @EntityField(name = "场景列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecCombopScenarioVo> scenarioList;

    @EntityField(name = "重载预置参数集列表", type = ApiParamType.JSONARRAY)
    private List<DeployProfileVo> overrideProfileList;

    @EntityField(name = "作业参数列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecParamVo> runtimeParamList;

    public List<DeployPipelinePhaseVo> getCombopPhaseList() {
        return combopPhaseList;
    }

    public void setCombopPhaseList(List<DeployPipelinePhaseVo> combopPhaseList) {
        this.combopPhaseList = combopPhaseList;
    }

    public List<AutoexecCombopGroupVo> getCombopGroupList() {
        return combopGroupList;
    }

    public void setCombopGroupList(List<AutoexecCombopGroupVo> combopGroupList) {
        this.combopGroupList = combopGroupList;
    }

//    public AutoexecCombopExecuteConfigVo getExecuteConfig() {
//        return executeConfig;
//    }
//
//    public void setExecuteConfig(AutoexecCombopExecuteConfigVo executeConfig) {
//        this.executeConfig = executeConfig;
//    }

    public List<AutoexecCombopScenarioVo> getScenarioList() {
        return scenarioList;
    }

    public void setScenarioList(List<AutoexecCombopScenarioVo> scenarioList) {
        this.scenarioList = scenarioList;
    }

    public List<DeployProfileVo> getOverrideProfileList() {
        if (overrideProfileList == null) {
            overrideProfileList = new ArrayList<>();
        }
        return overrideProfileList;
    }

    public void setOverrideProfileList(List<DeployProfileVo> overrideProfileList) {
        this.overrideProfileList = overrideProfileList;
    }

    public List<AutoexecParamVo> getRuntimeParamList() {
        return runtimeParamList;
    }

    public void setRuntimeParamList(List<AutoexecParamVo> runtimeParamList) {
        this.runtimeParamList = runtimeParamList;
    }
}
