package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import codedriver.framework.util.TimeUtil;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author longrf
 * @date 2022/5/26 4:37 下午
 */
public class DeployVersionVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "版本", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "应用模块名称", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "是否封版", type = ApiParamType.INTEGER)
    private Integer isFreeze;
    @EntityField(name = "仓库类型", type = ApiParamType.STRING)
    private String repoType;
    @EntityField(name = "仓库地址", type = ApiParamType.STRING)
    private String repo;
    @EntityField(name = "主干", type = ApiParamType.STRING)
    private String trunk;
    @EntityField(name = "分支", type = ApiParamType.STRING)
    private String branch;
    @EntityField(name = "标签", type = ApiParamType.STRING)
    private String tag;
    @EntityField(name = "标签目录", type = ApiParamType.STRING)
    private String tagsDir;
    @EntityField(name = "开始Rev号", type = ApiParamType.STRING)
    private String startRev;
    @EntityField(name = "结束Rev号", type = ApiParamType.STRING)
    private String endRev;
    @EntityField(name = "应用系统id列表", type = ApiParamType.JSONARRAY)
    private List<Long> appSystemIdList;
    @EntityField(name = "应用模块id列表", type = ApiParamType.JSONARRAY)
    private List<Long> appModuleIdList;
    @EntityField(name = "环境列表", type = ApiParamType.JSONARRAY)
    private List<DeployVersionEnvVo> envList;
    @EntityField(name = "编译号列表", type = ApiParamType.JSONARRAY)
    private List<DeployVersionBuildNoVo> buildNoList;
    @JSONField(serialize = false)
    private JSONObject startTimeRange;
    @EntityField(name = "runnerMapId", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "runnerGroup", type = ApiParamType.JSONOBJECT)
    private JSONObject runnerGroup;
    @JSONField(serialize = false)
    private String runnerGroupStr;
    @EntityField(name = "编译次数", type = ApiParamType.INTEGER)
    private Integer complieCount = 0;
    @EntityField(name = "编译成功次数", type = ApiParamType.INTEGER)
    private Integer complieSuccessCount = 0;
    @EntityField(name = "编译失败次数", type = ApiParamType.INTEGER)
    private Integer complieFailCount = 0;
    @JSONField(serialize = false)
    private Integer isCompiled; // 是否编译成功

    public DeployVersionVo() {
    }

    public DeployVersionVo(String version, Long appSystemId, Long appModuleId) {
        this.version = version;
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }

    public Integer getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }


    public List<Long> getAppSystemIdList() {
        return appSystemIdList;
    }

    public void setAppSystemIdList(List<Long> appSystemIdList) {
        this.appSystemIdList = appSystemIdList;
    }

    public List<Long> getAppModuleIdList() {
        return appModuleIdList;
    }

    public void setAppModuleIdList(List<Long> appModuleIdList) {
        this.appModuleIdList = appModuleIdList;
    }

    public List<DeployVersionEnvVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployVersionEnvVo> envList) {
        this.envList = envList;
    }

    public List<DeployVersionBuildNoVo> getBuildNoList() {
        return buildNoList;
    }

    public void setBuildNoList(List<DeployVersionBuildNoVo> buildNoList) {
        this.buildNoList = buildNoList;
    }

    public List<Long> getStartTimeRange() {
        return TimeUtil.getTimeRangeList(this.startTimeRange);
    }

    public void setStartTimeRange(JSONObject startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagsDir() {
        return tagsDir;
    }

    public void setTagsDir(String tagsDir) {
        this.tagsDir = tagsDir;
    }

    public String getStartRev() {
        return startRev;
    }

    public void setStartRev(String startRev) {
        this.startRev = startRev;
    }

    public String getEndRev() {
        return endRev;
    }

    public void setEndRev(String endRev) {
        this.endRev = endRev;
    }

    public Long getRunnerMapId() {
        return runnerMapId;
    }

    public void setRunnerMapId(Long runnerMapId) {
        this.runnerMapId = runnerMapId;
    }

    public JSONObject getRunnerGroup() {
        if (runnerGroup == null && StringUtils.isNotBlank(runnerGroupStr)) {
            runnerGroup = JSONObject.parseObject(runnerGroupStr);
        }
        return runnerGroup;
    }

    public void setRunnerGroup(JSONObject runnerGroup) {
        this.runnerGroup = runnerGroup;
    }

    public String getRunnerGroupStr() {
        if (StringUtils.isBlank(runnerGroupStr) && MapUtils.isNotEmpty(runnerGroup)) {
            runnerGroupStr = JSONObject.toJSONString(runnerGroup);
        }
        return runnerGroupStr;
    }

    public void setRunnerGroupStr(String runnerGroupStr) {
        this.runnerGroupStr = runnerGroupStr;
    }

    public Integer getComplieCount() {
        complieCount = complieSuccessCount + complieFailCount;
        return complieCount;
    }

    public Integer getComplieSuccessCount() {
        return complieSuccessCount;
    }

    public void setComplieSuccessCount(Integer complieSuccessCount) {
        this.complieSuccessCount = complieSuccessCount;
    }

    public Integer getComplieFailCount() {
        return complieFailCount;
    }

    public void setComplieFailCount(Integer complieFailCount) {
        this.complieFailCount = complieFailCount;
    }

    public Integer getIsCompiled() {
        return isCompiled;
    }

    public void setIsCompiled(Integer isCompiled) {
        this.isCompiled = isCompiled;
    }
}
