/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
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
