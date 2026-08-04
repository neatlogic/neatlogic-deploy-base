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

package neatlogic.framework.deploy.dto.app;

import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.autoexec.dto.AutoexecParamVo;
import neatlogic.framework.autoexec.dto.combop.*;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.collections4.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeployPipelineConfigVo implements Serializable {

    @EntityField(name = "nfdda.deploypipelineconfigvo.disabledphaseidlist.name", type = ApiParamType.JSONARRAY)
    private List<Long> disabledPhaseIdList;

    @EntityField(name = "nfdda.deploypipelineconfigvo.combopphaselist.name", type = ApiParamType.JSONARRAY)
    private List<DeployPipelinePhaseVo> combopPhaseList;

    @EntityField(name = "nfdda.deploypipelineconfigvo.combopgrouplist.name", type = ApiParamType.JSONARRAY)
    private List<DeployPipelineGroupVo> combopGroupList;

    @EntityField(name = "nfdda.deploypipelineconfigvo.executeconfig.name", type = ApiParamType.JSONOBJECT)
    private DeployPipelineExecuteConfigVo executeConfig;

    @EntityField(name = "nfdda.deploypipelineconfigvo.scenariolist.name", type = ApiParamType.JSONARRAY)
    private List<AutoexecCombopScenarioVo> scenarioList;

    @EntityField(name = "nfdda.deploypipelineconfigvo.defaultscenarioid.name", type = ApiParamType.LONG)
    private Long defaultScenarioId;

    @EntityField(name = "nfdda.deploypipelineconfigvo.runtimeparamlist.name", type = ApiParamType.INTEGER)
    private List<AutoexecParamVo> runtimeParamList;

    @EntityField(name = "nfdda.deploypipelineconfigvo.overrideprofilelist.name", type = ApiParamType.JSONARRAY)
    private List<DeployProfileVo> overrideProfileList;

    @JSONField(serialize = false)
    private List<DeployAppModuleRunnerGroupVo> moduleRunnerGroupList;

    @JSONField(serialize = false)
    private AutoexecCombopConfigVo autoexecCombopConfigVo;

    public List<DeployPipelinePhaseVo> getCombopPhaseList() {
        return combopPhaseList;
    }

    public void setCombopPhaseList(List<DeployPipelinePhaseVo> combopPhaseList) {
        this.combopPhaseList = combopPhaseList;
    }

    public List<DeployPipelineGroupVo> getCombopGroupList() {
        return combopGroupList;
    }

    public void setCombopGroupList(List<DeployPipelineGroupVo> combopGroupList) {
        this.combopGroupList = combopGroupList;
    }

    public DeployPipelineExecuteConfigVo getExecuteConfig() {
        if (executeConfig == null) {
            executeConfig = new DeployPipelineExecuteConfigVo();
        }
        return executeConfig;
    }

    public void setExecuteConfig(DeployPipelineExecuteConfigVo executeConfig) {
        this.executeConfig = executeConfig;
    }

    public List<AutoexecCombopScenarioVo> getScenarioList() {
        return scenarioList;
    }

    public void setScenarioList(List<AutoexecCombopScenarioVo> scenarioList) {
        this.scenarioList = scenarioList;
    }

    public Long getDefaultScenarioId() {
        return defaultScenarioId;
    }

    public void setDefaultScenarioId(Long defaultScenarioId) {
        this.defaultScenarioId = defaultScenarioId;
    }

    public List<AutoexecParamVo> getRuntimeParamList() {
        return runtimeParamList;
    }

    public void setRuntimeParamList(List<AutoexecParamVo> runtimeParamList) {
        this.runtimeParamList = runtimeParamList;
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

    public AutoexecCombopConfigVo getAutoexecCombopConfigVo() {
        autoexecCombopConfigVo = new AutoexecCombopConfigVo();
//        autoexecCombopConfigVo.setCombopGroupList(this.combopGroupList);
        autoexecCombopConfigVo.setRuntimeParamList(this.runtimeParamList);
        autoexecCombopConfigVo.setScenarioList(this.scenarioList);
        if (CollectionUtils.isNotEmpty(this.combopGroupList)) {
            List<AutoexecCombopGroupVo> autoexecCombopGroupList = new ArrayList<>();
            for (DeployPipelineGroupVo deployPipelineGroupVo : combopGroupList) {
                autoexecCombopGroupList.add(deployPipelineGroupVo);
            }
            autoexecCombopConfigVo.setCombopGroupList(autoexecCombopGroupList);
        }
        if (CollectionUtils.isNotEmpty(this.combopPhaseList)) {
            List<AutoexecCombopPhaseVo> autoexecCombopPhaseList = new ArrayList<>();
            for (DeployPipelinePhaseVo deployPipelinePhaseVo : combopPhaseList) {
                autoexecCombopPhaseList.add(deployPipelinePhaseVo);
            }
            autoexecCombopConfigVo.setCombopPhaseList(autoexecCombopPhaseList);
        }
        if (this.executeConfig != null) {
            AutoexecCombopExecuteConfigVo executeConfigVo = new AutoexecCombopExecuteConfigVo();
            executeConfigVo.setExecuteUser(this.executeConfig.getExecuteUser());
            executeConfigVo.setProtocolId(this.executeConfig.getProtocolId());
            autoexecCombopConfigVo.setExecuteConfig(executeConfigVo);
        }
        return autoexecCombopConfigVo;
    }

    public List<DeployAppModuleRunnerGroupVo> getModuleRunnerGroupList() {
        return moduleRunnerGroupList;
    }

    public void setModuleRunnerGroupList(List<DeployAppModuleRunnerGroupVo> moduleRunnerGroupList) {
        this.moduleRunnerGroupList = moduleRunnerGroupList;
    }

    public List<Long> getDisabledPhaseIdList() {
        return disabledPhaseIdList;
    }

    public void setDisabledPhaseIdList(List<Long> disabledPhaseIdList) {
        this.disabledPhaseIdList = disabledPhaseIdList;
    }

}
