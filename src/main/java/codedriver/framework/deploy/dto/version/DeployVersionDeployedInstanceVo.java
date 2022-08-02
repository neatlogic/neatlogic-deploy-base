package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.dto.UserVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class DeployVersionDeployedInstanceVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    private Long envId;

    @EntityField(name = "实例名", type = ApiParamType.STRING)
    private String resourceName;
    @EntityField(name = "ip", type = ApiParamType.STRING)
    private String ip;

    @EntityField(name = "发布用户uuid", type = ApiParamType.STRING)
    private String deployUser;
    @EntityField(name = "发布时间", type = ApiParamType.LONG)
    private Date deployTime;
    @EntityField(name = "是否发布", type = ApiParamType.INTEGER)
    private Integer status = 0;
    @EntityField(name = "发布用户", type = ApiParamType.JSONOBJECT)
    private UserVo deployUserVo;

    public DeployVersionDeployedInstanceVo() {
    }

    public DeployVersionDeployedInstanceVo(Long resourceId, String resourceName, String ip) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.ip = ip;
    }

    public DeployVersionDeployedInstanceVo(Long resourceId, Long versionId, Long envId, String deployUser, Date deployTime) {
        this.resourceId = resourceId;
        this.versionId = versionId;
        this.envId = envId;
        this.deployUser = deployUser;
        this.deployTime = deployTime;
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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeployUser() {
        return deployUser;
    }

    public void setDeployUser(String deployUser) {
        this.deployUser = deployUser;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UserVo getDeployUserVo() {
        return deployUserVo;
    }

    public void setDeployUserVo(UserVo deployUserVo) {
        this.deployUserVo = deployUserVo;
    }
}
