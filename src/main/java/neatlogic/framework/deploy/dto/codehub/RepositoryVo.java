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
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;

    /**
     * repo_service_id
     */
    @EntityField(name = "关联代码库服务的id", type = ApiParamType.LONG)
    private Long repoServiceId;

    /**
     * name
     */
    @EntityField(name = "仓库名称", type = ApiParamType.STRING)
    private String name;

    @EntityField(name = "仓库类型，git、gitlab、svn", type = ApiParamType.STRING)
    private String type;
    
    /**
     * address
     */
    @EntityField(name = "仓库地址", type = ApiParamType.STRING)
    private String address;

    /**
     * main_branch
     */
    @EntityField(name = "主干分支 ，git仓库默认master，svn仓库默认为空", type = ApiParamType.STRING)
    private String mainBranch;
    
    /**
     * default_branch
     */
    @EntityField(name = "默认分支 ，git仓库默认master，svn仓库不支持此字段", type = ApiParamType.STRING)
    private String defaultBranch;
    
    @EntityField(name = "分支路径", type = ApiParamType.STRING)
    private String branchesPath;
    
    @EntityField(name = "标签路径", type = ApiParamType.STRING)
    private String tagsPath;

    /**
     * app_mopdule_id
     */
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;

    /**
     * create_mode
     */
    @EntityField(name = "import：导入，manual：手动创建...[import,manual]", type = ApiParamType.ENUM)
    private String createMode;

    /**
     * description
     */
    @EntityField(name = "仓库描述", type = ApiParamType.STRING)
    private String description;

    /**
     * sync_status
     */
    @EntityField(name = "同步状态，success：成功，failed：失败...[success,failed,none]", type = ApiParamType.ENUM)
    private String syncStatus;

    /**
     * sync_time
     */
    @EntityField(name = "最后同步时间", type = ApiParamType.LONG)
    private Date syncTime;
    
    @EntityField(name = "排序规则, 如: repository.lcd DESC", type = ApiParamType.STRING)
    private String sortColumn;
    
    @EntityField(name = "系统id", type = ApiParamType.LONG)
    private Long appSystemId;

    @EntityField(name = "仓库服务对象", type = ApiParamType.JSONOBJECT)
    private RepositoryServiceVo repositoryServiceVo;
    
    @EntityField(name = "节点名", type = ApiParamType.STRING)
    private String runnerName;
    private Long runnerId;
    
    
    private Boolean delegation = false;


    @EntityField(name = "是否拥有发布管理员权限", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "权限列表", type = ApiParamType.JSONARRAY)
    List<String> authorityActionList;
    @EntityField(name = "用户、分组、角色的uuid列表", type = ApiParamType.JSONARRAY)
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