/*Copyright (C) $today.year  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

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

    @EntityField(name = "禁用阶段ID列表", type = ApiParamType.JSONARRAY)
    private List<Long> disabledPhaseIdList;

    @EntityField(name = "阶段列表", type = ApiParamType.JSONARRAY)
    private List<DeployPipelinePhaseVo> combopPhaseList;

    @EntityField(name = "阶段组列表", type = ApiParamType.JSONARRAY)
    private List<DeployPipelineGroupVo> combopGroupList;

    @EntityField(name = "执行信息配置", type = ApiParamType.JSONOBJECT)
    private DeployPipelineExecuteConfigVo executeConfig;

    @EntityField(name = "场景列表", type = ApiParamType.JSONARRAY)
    private List<AutoexecCombopScenarioVo> scenarioList;

    @EntityField(name = "默认场景id", type = ApiParamType.LONG)
    private Long defaultScenarioId;

    @EntityField(name = "运行时参数列表", type = ApiParamType.INTEGER)
    private List<AutoexecParamVo> runtimeParamList;

    @EntityField(name = "重载预置参数集列表", type = ApiParamType.JSONARRAY)
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
