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

package neatlogic.framework.deploy.dto.pipeline;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.autoexec.constvalue.AutoexecParallelPolicy;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.deploy.dto.job.DeployJobVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.Md5Util;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PipelineJobTemplateVo extends BasePageVo {
    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.idlist.name", type = ApiParamType.JSONARRAY)
    private List<Long> idList;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.excludeidlist.name", type = ApiParamType.JSONARRAY)
    private List<Long> excludeIdList;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.groupid.name", type = ApiParamType.LONG)
    private Long groupId;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "term.cmdb.envid", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "term.cmdb.appsystemname", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "term.cmdb.appsystemabbrname", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "term.cmdb.appmodulename", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "term.cmdb.appmoduleabbrname", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "term.cmdb.envname", type = ApiParamType.STRING)
    private String envName;
    @JSONField(serialize = false)
    private String configStr;
    @EntityField(name = "common.config", type = ApiParamType.JSONOBJECT)
    private JSONObject config;
    @EntityField(name = "term.autoexec.scenarioid", type = ApiParamType.LONG)
    private Long scenarioId;

    @EntityField(name = "term.autoexec.scenarioname", type = ApiParamType.STRING)
    private String scenarioName;
    @EntityField(name = "term.autoexec.roundcount", type = ApiParamType.INTEGER)
    private Integer roundCount;
    @EntityField(name = "term.autoexec.parallelcount", type = ApiParamType.INTEGER)
    private Integer parallelCount;
    @EntityField(name = "term.autoexec.parallelpolicy", type = ApiParamType.STRING)
    private String parallelPolicy;
    @EntityField(name = "common.sort", type = ApiParamType.INTEGER)
    private Integer sort;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.ishasbuildtypetool.name", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.ishasdeploytypetool.name", type = ApiParamType.INTEGER)
    private int isHasDeployTypeTool = 0;
    @EntityField(name = "nfddp.pipelinejobtemplatevo.envscenariolist.name")
    private List<PipelineEnvScenarioVo> envScenarioList;

    public PipelineJobTemplateVo() {
    }

    public PipelineJobTemplateVo(DeployJobVo deployJobVo) {
        this.appSystemId = deployJobVo.getAppSystemId();
        this.appModuleId = deployJobVo.getAppModuleId();
        this.envId = deployJobVo.getEnvId();
        this.scenarioId = deployJobVo.getScenarioId();
    }

    public void addEnvScenario(PipelineEnvScenarioVo envScenarioVo) {
        if (envScenarioList == null) {
            envScenarioList = new ArrayList<>();
        }
        if (envScenarioList.stream().noneMatch(d -> d.getEnvId().equals(envScenarioVo.getEnvId()) && d.getScenarioId().equals(envScenarioVo.getScenarioId()))) {
            envScenarioList.add(envScenarioVo);
        }
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getConfigStr() {
        if (StringUtils.isBlank(configStr) && config != null) {
            configStr = config.toJSONString();
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public JSONObject getConfig() {
        if (config == null && StringUtils.isNotBlank(configStr)) {
            config = JSON.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }


    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public Long getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
    }

    public List<Long> getExcludeIdList() {
        return excludeIdList;
    }

    public void setExcludeIdList(List<Long> excludeIdList) {
        this.excludeIdList = excludeIdList;
    }

    public Integer getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(Integer roundCount) {
        this.roundCount = roundCount;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public int getIsHasBuildTypeTool() {
        return isHasBuildTypeTool;
    }

    public void setIsHasBuildTypeTool(int isHasBuildTypeTool) {
        this.isHasBuildTypeTool = isHasBuildTypeTool;
    }

    public int getIsHasDeployTypeTool() {
        return isHasDeployTypeTool;
    }

    public void setIsHasDeployTypeTool(int isHasDeployTypeTool) {
        this.isHasDeployTypeTool = isHasDeployTypeTool;
    }

    public List<PipelineEnvScenarioVo> getEnvScenarioList() {
        return envScenarioList;
    }

    public void setEnvScenarioList(List<PipelineEnvScenarioVo> envScenarioList) {
        this.envScenarioList = envScenarioList;
    }

    public String getUuid() {
        return Md5Util.encryptMD5(String.valueOf(getId()));
    }

    public Integer getParallelCount() {
        return parallelCount;
    }

    public void setParallelCount(Integer parallelCount) {
        this.parallelCount = parallelCount;
    }

    public String getParallelPolicy() {
        //兼容老数据
        if (StringUtils.isBlank(parallelPolicy) && roundCount != null) {
            parallelPolicy = AutoexecParallelPolicy.ROUND_COUNT.getValue();
        }
        return parallelPolicy;
    }

    public void setParallelPolicy(String parallelPolicy) {
        this.parallelPolicy = parallelPolicy;
    }
}
