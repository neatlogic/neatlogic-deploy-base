/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.job;

import codedriver.framework.asynchronization.threadlocal.UserContext;
import codedriver.framework.auth.core.AuthActionChecker;
import codedriver.framework.autoexec.dto.job.AutoexecJobVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.auth.DEPLOY_MODIFY;
import codedriver.framework.deploy.constvalue.JobSource;
import codedriver.framework.deploy.dto.app.DeployPipelineConfigVo;
import codedriver.framework.deploy.dto.version.DeploySystemModuleVersionVo;
import codedriver.framework.dto.AuthenticationInfoVo;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DeployJobVo extends AutoexecJobVo {

    private static final long serialVersionUID = 7515358153391228987L;

    @EntityField(name = "应用资产id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用资产名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用资产简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "系统模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "系统模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "系统模块简称", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "环境资产id", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "环境资产名称", type = ApiParamType.STRING)
    private String envName;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "版本Id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "编译号", type = ApiParamType.INTEGER)
    private Integer buildNo;
    @EntityField(name = "编译|构造的runner_id", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "流水线配置信息", type = ApiParamType.JSONOBJECT)
    private DeployPipelineConfigVo pipeLineConfig;
    @EntityField(name = "是否有执行组权限", type = ApiParamType.INTEGER)
    private Integer isCanGroupExecute = 0;
    @EntityField(name = "泳道列表", type = ApiParamType.JSONARRAY)
    private List<LaneVo> laneList;
    @EntityField(name = "授权列表", type = ApiParamType.JSONARRAY)
    private List<DeployJobAuthVo> authList;

    @EntityField(name = "超级流水线id", type = ApiParamType.LONG)
    private Long pipelineId;

    private List<DeploySystemModuleVersionVo> appSystemModuleVersionList;

    @JSONField(serialize = false)
    private Integer isHasAllAuthority; //是否拥有发布管理员权限
    @JSONField(serialize = false)
    List<String> authorityActionList; //权限列表
    @JSONField(serialize = false)
    private List<String> authUuidList; //用户、分组、角色的uuid列表
    @JSONField(serialize = false)
    private List<DeployJobModuleVo> moduleList;
    @JSONField(serialize = false)
    private boolean isJobInitParam = false;//用于判断是否初始化过作业参数

    private Integer isNeedNameAndAbbrName = 0; //创建批量作业时，需要从列表获取简称回显，等于1时才会join 视图

    public DeployJobVo() {
        this.setSourceList(Arrays.asList(JobSource.DEPLOY.getValue(), JobSource.BATCHDEPLOY.getValue(), JobSource.DEPLOY_SCHEDULE_GENERAL.getValue(), JobSource.DEPLOY_SCHEDULE_PIPELINE.getValue()));
    }

    public List<DeployJobAuthVo> getAuthList() {
        return authList;
    }

    public void setAuthList(List<DeployJobAuthVo> authList) {
        this.authList = authList;
    }

    public DeployJobVo(JSONObject jsonObj) {
        this();
        appSystemId = jsonObj.getLong("appSystemId");
        appModuleId = jsonObj.getLong("appModuleId");
        super.setScenarioId(jsonObj.getLong("scenarioId"));
        envId = jsonObj.getLong("envId");
        version = jsonObj.getString("version");
        buildNo = jsonObj.getInteger("buildNo");
    }

    public DeployJobVo(Long appSystemId, Long scenarioId, Long envId, String triggerType, Date planStartTime, Integer roundCount, JSONObject param) {
        this.appSystemId = appSystemId;
        super.setScenarioId(scenarioId);
        this.envId = envId;
        super.setTriggerType(triggerType);
        super.setPlanStartTime(planStartTime);
        super.setRoundCount(roundCount);
        super.setParam(param);
    }


    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public void setSysName(String sysName) {
        this.appSystemName = sysName;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
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

    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public DeployPipelineConfigVo getPipeLineConfig() {
        return pipeLineConfig;
    }

    public Integer getIsHasAllAuthority() {
        if (isHasAllAuthority == null) {
            if (AuthActionChecker.check(DEPLOY_MODIFY.class)) {
                isHasAllAuthority = 1;
            } else {
                isHasAllAuthority = 0;
            }
        }
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public List<String> getAuthUuidList() {
        if (CollectionUtils.isEmpty(authUuidList)) {
            authUuidList = new ArrayList<>();
            AuthenticationInfoVo authInfo = UserContext.get().getAuthenticationInfoVo();
            authUuidList.add(authInfo.getUserUuid());
            if (CollectionUtils.isNotEmpty(authInfo.getTeamUuidList())) {
                authUuidList.addAll(authInfo.getTeamUuidList());
            }
            if (CollectionUtils.isNotEmpty(authInfo.getRoleUuidList())) {
                authUuidList.addAll(authInfo.getRoleUuidList());
            }
        }
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public Integer getIsCanGroupExecute() {
        return isCanGroupExecute;
    }

    public void setIsCanGroupExecute(Integer isCanGroupExecute) {
        this.isCanGroupExecute = isCanGroupExecute;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public List<DeployJobModuleVo> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<DeployJobModuleVo> moduleList) {
        this.moduleList = moduleList;
    }

    public Long getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    @Override
    public String getName() {
        if (StringUtils.isBlank(super.getName())) {
            return appSystemAbbrName + "/" + appModuleAbbrName + "/" + envName + (StringUtils.isBlank(version) ? StringUtils.EMPTY : "/" + version);
        }
        return super.getName();
    }

    public List<DeploySystemModuleVersionVo> getAppSystemModuleVersionList() {
        return appSystemModuleVersionList;
    }

    public void setAppSystemModuleVersionList(List<DeploySystemModuleVersionVo> appSystemModuleVersionList) {
        this.appSystemModuleVersionList = appSystemModuleVersionList;
    }

    public Integer getIsNeedNameAndAbbrName() {
        return isNeedNameAndAbbrName;
    }

    public void setIsNeedNameAndAbbrName(Integer isNeedNameAndAbbrName) {
        this.isNeedNameAndAbbrName = isNeedNameAndAbbrName;
    }

    public boolean getIsJobInitParam() {
        return isJobInitParam;
    }

    public void setIsJobInitParam(boolean jobInitParam) {
        isJobInitParam = jobInitParam;
    }
}
