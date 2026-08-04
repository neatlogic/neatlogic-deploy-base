package neatlogic.framework.deploy.dto.codehub;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RepositoryVo extends BaseEditorVo implements Serializable {

    /**
     * id
     */
    @EntityField(name = "nfddc.repositoryvo.id.name", type = ApiParamType.LONG)
    private Long id;

    /**
     * repo_service_id
     */
    @EntityField(name = "nfddc.repositoryvo.reposerviceid.name", type = ApiParamType.LONG)
    private Long repoServiceId;

    /**
     * name
     */
    @EntityField(name = "nfddc.repositoryvo.name.name", type = ApiParamType.STRING)
    private String name;

    @EntityField(name = "nfddc.repositoryvo.type.name", type = ApiParamType.STRING)
    private String type;
    
    /**
     * address
     */
    @EntityField(name = "nfddc.repositoryvo.address.name", type = ApiParamType.STRING)
    private String address;

    /**
     * main_branch
     */
    @EntityField(name = "nfddc.repositoryvo.mainbranch.name", type = ApiParamType.STRING)
    private String mainBranch;
    
    /**
     * default_branch
     */
    @EntityField(name = "nfddc.repositoryvo.defaultbranch.name", type = ApiParamType.STRING)
    private String defaultBranch;
    
    @EntityField(name = "nfddc.repositoryvo.branchespath.name", type = ApiParamType.STRING)
    private String branchesPath;
    
    @EntityField(name = "nfddc.repositoryvo.tagspath.name", type = ApiParamType.STRING)
    private String tagsPath;

    /**
     * app_mopdule_id
     */
    @EntityField(name = "nfddc.repositoryvo.appmoduleid.name", type = ApiParamType.LONG)
    private Long appModuleId;

    /**
     * create_mode
     */
    @EntityField(name = "nfddc.repositoryvo.createmode.name", type = ApiParamType.ENUM)
    private String createMode;

    /**
     * description
     */
    @EntityField(name = "nfddc.repositoryvo.description.name", type = ApiParamType.STRING)
    private String description;

    /**
     * sync_status
     */
    @EntityField(name = "nfddc.repositoryvo.syncstatus.name", type = ApiParamType.ENUM)
    private String syncStatus;

    /**
     * sync_time
     */
    @EntityField(name = "nfddc.repositoryvo.synctime.name", type = ApiParamType.LONG)
    private Date syncTime;
    
    @EntityField(name = "nfddc.repositoryvo.sortcolumn.name", type = ApiParamType.STRING)
    private String sortColumn;
    
    @EntityField(name = "nfddc.repositoryvo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;

    @EntityField(name = "nfddc.repositoryvo.repositoryservicevo.name", type = ApiParamType.JSONOBJECT)
    private RepositoryServiceVo repositoryServiceVo;
    
    @EntityField(name = "nfddc.repositoryvo.runnername.name", type = ApiParamType.STRING)
    private String runnerName;
    private Long runnerId;
    
    
    private Boolean delegation = false;


    @EntityField(name = "nfddc.repositoryvo.ishasallauthority.name", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "nfddc.repositoryvo.authorityactionlist.name", type = ApiParamType.JSONARRAY)
    List<String> authorityActionList;
    @EntityField(name = "nfddc.repositoryvo.authuuidlist.name", type = ApiParamType.JSONARRAY)
    private List<String> authUuidList;

    public String getBranchesPath() {
        return branchesPath;
    }

    public void setBranchesPath(String branchesPath) {
        this.branchesPath = branchesPath;
    }

    public String getTagsPath() {
        return tagsPath;
    }

    public void setTagsPath(String tagsPath) {
        this.tagsPath = tagsPath;
    }

    public RepositoryServiceVo getRepositoryServiceVo() {
        return repositoryServiceVo;
    }

    public void setRepositoryServiceVo(RepositoryServiceVo repositoryServiceVo) {
        this.repositoryServiceVo = repositoryServiceVo;
    }
    

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private static final long serialVersionUID = 1L;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRepoServiceId() {
        return this.repoServiceId;
    }

    public void setRepoServiceId(Long repoServiceId) {
        this.repoServiceId = repoServiceId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMainBranch() {
        return this.mainBranch;
    }

    public void setMainBranch(String mainBranch) {
        this.mainBranch = mainBranch;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Long getAppModuleId() {
        return this.appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getCreateMode() {
        return this.createMode;
    }

    public void setCreateMode(String createMode) {
        this.createMode = createMode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSyncStatus() {
        return this.syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Date getSyncTime() {
        return this.syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }
    
    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }
    
    public String getRunnerName() {
        return runnerName;
    }
    
    public void setRunnerName(String agentName) {
        this.runnerName = agentName;
    }
    
    public Long getRunnerId() {
        return runnerId;
    }
    
    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }
    
    public Boolean getDelegation() {
        return delegation;
    }
    
    public void setDelegation(Boolean delegation) {
        this.delegation = delegation;
    }

    public Integer getIsHasAllAuthority() {
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public List<String> getAuthUuidList() {
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }


    @Override
    public String toString() {
        return "RepositoryVo{" +
                "id='" + id + '\'' +
                ", repoServiceId='" + repoServiceId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", mainBranch='" + mainBranch + '\'' +
                ", defaultBranch='" + defaultBranch + '\'' +
                ", branchesPath='" + branchesPath + '\'' +
                ", tagsPath='" + tagsPath + '\'' +
                ", appModuleId='" + appModuleId + '\'' +
                ", createMode='" + createMode + '\'' +
                ", description='" + description + '\'' +
                ", syncStatus='" + syncStatus + '\'' +
                ", syncTime=" + syncTime +
                ", sortColumn='" + sortColumn + '\'' +
                ", appSystemId='" + appSystemId + '\'' +
                ", repositoryServiceVo=" + repositoryServiceVo +
                ", runnerName='" + runnerName + '\'' +
                ", runnerId=" + runnerId +
                ", delegation=" + delegation +
                '}';
    }
}