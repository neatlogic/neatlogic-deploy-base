package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.asynchronization.threadlocal.UserContext;
import neatlogic.framework.auth.core.AuthActionChecker;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.deploy.auth.DEPLOY_MODIFY;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import neatlogic.framework.util.TimeUtil;
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

    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "term.deploy.version", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "term.cmdb.appsystemid", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "term.cmdb.appsystemname", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "term.cmdb.appsystemabbrname", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "term.cmdb.appmoduleid", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "term.cmdb.appmodulename", type = ApiParamType.STRING)
    private String appModuleName;
    @EntityField(name = "term.cmdb.appmoduleabbrname", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "term.deploy.isfreeze", type = ApiParamType.INTEGER)
    private Integer isFreeze;
    @EntityField(name = "common.description", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "nmdac.savedeployciapi.input.param.desc.repotype", type = ApiParamType.STRING)
    private String repoType;
    @EntityField(name = "term.deploy.repo", type = ApiParamType.STRING)
    private String repo;
    @EntityField(name = "term.deploy.trunk", type = ApiParamType.STRING)
    private String trunk;
    @EntityField(name = "common.branch", type = ApiParamType.STRING)
    private String branch;
    @EntityField(name = "common.tag", type = ApiParamType.STRING)
    private String tag;
    @EntityField(name = "common.tagsdir", type = ApiParamType.STRING)
    private String tagsDir;
    @EntityField(name = "term.deploy.startdev", type = ApiParamType.STRING)
    private String startRev;
    @EntityField(name = "term.deploy.endrev", type = ApiParamType.STRING)
    private String endRev;
    @EntityField(name = "term.appsystemidlist", type = ApiParamType.JSONARRAY)
    private List<Long> appSystemIdList;
    @EntityField(name = "term.cmdb.appmoduleidlist", type = ApiParamType.JSONARRAY)
    private List<Long> appModuleIdList;
    @EntityField(name = "term.cmdb.envlist", type = ApiParamType.JSONARRAY)
    private List<DeployVersionEnvVo> envList;
    @EntityField(name = "term.deploy.buildnolist", type = ApiParamType.JSONARRAY)
    private List<DeployVersionBuildNoVo> buildNoList;
    @JSONField(serialize = false)
    private JSONObject startTimeRange;
    @EntityField(name = "runnerMapId", type = ApiParamType.LONG)
    private Long runnerMapId;
    @EntityField(name = "runnerGroup", type = ApiParamType.JSONOBJECT)
    private JSONObject runnerGroup;
    @JSONField(serialize = false)
    private String runnerGroupStr;
    @EntityField(name = "term.deploy.compilecount", type = ApiParamType.INTEGER)
    private Integer compileCount = 0;
    @EntityField(name = "term.deploy.compilesuccesscount", type = ApiParamType.INTEGER)
    private Integer compileSuccessCount = 0;
    @EntityField(name = "term.deploy.compilefailcount", type = ApiParamType.INTEGER)
    private Integer compileFailCount = 0;
    @JSONField(serialize = false)
    private Integer isCompiled; // 是否编译成功

    @JSONField(serialize = false)
    private Integer isHasAllAuthority; //是否拥有发布管理员权限
    @JSONField(serialize = false)
    List<String> authorityActionList; //权限列表

    @EntityField(name = "nmdav.savedeployversioncommitanalyzeapi.input.param.desc.fileaddcount", type = ApiParamType.INTEGER)
    private Integer fileAddCount;

    @EntityField(name = "nmdav.savedeployversioncommitanalyzeapi.input.param.desc.filedeletecount", type = ApiParamType.INTEGER)
    private Integer fileDeleteCount;

    @EntityField(name = "nmdav.savedeployversioncommitanalyzeapi.input.param.desc.filemodifycount", type = ApiParamType.INTEGER)
    private Integer fileModifyCount;


    @EntityField(name = "nmdav.savedeployversioncommitanalyzeapi.input.param.desc.linedeletecount", type = ApiParamType.INTEGER)
    private Integer lineDeleteCount;

    @EntityField(name = "nmdav.savedeployversioncommitanalyzeapi.input.param.desc.lineaddcount", type = ApiParamType.INTEGER)
    private Integer lineAddCount;
    
    @EntityField(name = "term.deploy.issuecount", type = ApiParamType.INTEGER)
    private Integer issueCount;

    @EntityField(name = "term.deploy.highcvecount", type = ApiParamType.LONG)
    private Long highCveCount;

    @EntityField(name = "term.deploy.criticalcvecount", type = ApiParamType.LONG)
    private Long criticalCveCount;

    @EntityField(name = "term.deploy.criticalstarcvecount", type = ApiParamType.LONG)
    private Long criticalStarCveCount;

    public DeployVersionVo() {
    }

    public DeployVersionVo(String version, Long appSystemId, Long appModuleId) {
        this.version = version;
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
    }

    public DeployVersionVo(String version, Long appSystemId, Long appModuleId, Integer isFreeze) {
        this.version = version;
        this.appSystemId = appSystemId;
        this.appModuleId = appModuleId;
        this.isFreeze = isFreeze;
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

    public Integer getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getCompileCount() {
        compileCount = compileSuccessCount + compileFailCount;
        return compileCount;
    }

    public Integer getCompileSuccessCount() {
        return compileSuccessCount;
    }

    public void setCompileSuccessCount(Integer compileSuccessCount) {
        this.compileSuccessCount = compileSuccessCount;
    }

    public Integer getCompileFailCount() {
        return compileFailCount;
    }

    public void setCompileFailCount(Integer compileFailCount) {
        this.compileFailCount = compileFailCount;
    }

    public Integer getIsCompiled() {
        return isCompiled;
    }

    public void setIsCompiled(Integer isCompiled) {
        this.isCompiled = isCompiled;
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
        return UserContext.get().getUuidList();
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public Integer getFileAddCount() {
        return fileAddCount;
    }

    public void setFileAddCount(Integer fileAddCount) {
        this.fileAddCount = fileAddCount;
    }

    public Integer getFileDeleteCount() {
        return fileDeleteCount;
    }

    public void setFileDeleteCount(Integer fileDeleteCount) {
        this.fileDeleteCount = fileDeleteCount;
    }

    public Integer getFileModifyCount() {
        return fileModifyCount;
    }

    public void setFileModifyCount(Integer fileModifyCount) {
        this.fileModifyCount = fileModifyCount;
    }

    public Integer getLineDeleteCount() {
        return lineDeleteCount;
    }

    public void setLineDeleteCount(Integer lineDeleteCount) {
        this.lineDeleteCount = lineDeleteCount;
    }

    public Integer getLineAddCount() {
        return lineAddCount;
    }

    public void setLineAddCount(Integer lineAddCount) {
        this.lineAddCount = lineAddCount;
    }

    public Integer getIssueCount() {
        return issueCount;
    }

    public void setIssueCount(Integer issueCount) {
        this.issueCount = issueCount;
    }

    public Long getHighCveCount() {
        return highCveCount;
    }

    public void setHighCveCount(Long highCveCount) {
        this.highCveCount = highCveCount;
    }

    public Long getCriticalCveCount() {
        return criticalCveCount;
    }

    public void setCriticalCveCount(Long criticalCveCount) {
        this.criticalCveCount = criticalCveCount;
    }

    public Long getCriticalStarCveCount() {
        return criticalStarCveCount;
    }

    public void setCriticalStarCveCount(Long criticalStarCveCount) {
        this.criticalStarCveCount = criticalStarCveCount;
    }
}
