/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.job;

import codedriver.framework.autoexec.dto.job.AutoexecJobVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.dto.app.DeployPipelineConfigVo;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DeployJobVo extends AutoexecJobVo {

    private static final long serialVersionUID = 7515358153391228987L;

    @EntityField(name = "应用资产id", type = ApiParamType.LONG)
    private Long appSystemId;

    @EntityField(name = "应用资产名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "系统模块id", type = ApiParamType.LONG)
    private Long appModuleId;

    @EntityField(name = "系统模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境资产名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "编译|构造的runner_id", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "流水线配置信息", type = ApiParamType.JSONOBJECT)
    private DeployPipelineConfigVo pipeLineConfig;
    @JSONField(serialize = false)
    private String pipeLineConfigStr;
    @JSONField(serialize = false)
    private String configHash;
    @EntityField(name = "泳道列表")
    private List<LaneVo> laneList;


    public DeployJobVo() {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("deploy");
        sourceList.add("batchdeploy");
        this.setSourceList(sourceList);
    }

    public DeployJobVo(JSONObject jsonObj) {
        appSystemId = jsonObj.getLong("appSystemId");
        appModuleId = jsonObj.getLong("appModuleId");
        envId = jsonObj.getLong("envId");
        version = jsonObj.getString("version");
        buildNo = jsonObj.getInteger("buildNo");
        List<String> sourceList = new ArrayList<>();
        sourceList.add("deploy");
        sourceList.add("batchdeploy");
        this.setSourceList(sourceList);
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

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public List<LaneVo> getLaneList() {
        return laneList;
    }

    public void setLaneList(List<LaneVo> laneList) {
        this.laneList = laneList;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public Long getRunnerMapId() {
        return runnerMapId;
    }

    public void setRunnerMapId(Long runnerMapId) {
        this.runnerMapId = runnerMapId;
    }

    public void setPipeLineConfig(DeployPipelineConfigVo pipeLineConfig) {
        this.pipeLineConfig = pipeLineConfig;
    }

    public String getPipeLineConfigStr() {
        if (pipeLineConfigStr == null && pipeLineConfig != null) {
            pipeLineConfigStr = JSONObject.toJSONString(pipeLineConfig);
        }
        return pipeLineConfigStr;
    }

    public void setPipeLineConfigStr(String pipeLineConfigStr) {
        this.pipeLineConfigStr = pipeLineConfigStr;
    }

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public DeployPipelineConfigVo getPipeLineConfig() {
        return pipeLineConfig;
    }

    public String getConfigHash() {
        if (StringUtils.isBlank(configHash) && StringUtils.isNotBlank(pipeLineConfigStr)) {
            configHash = DigestUtils.md5DigestAsHex(pipeLineConfigStr.getBytes(StandardCharsets.UTF_8));
        }
        return configHash;
    }

    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }
}
