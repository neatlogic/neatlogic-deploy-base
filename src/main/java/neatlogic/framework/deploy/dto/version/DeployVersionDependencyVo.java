package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.dto.DeployPackageVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Objects;

public class DeployVersionDependencyVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "发布版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "依赖包id", type = ApiParamType.LONG)
    private Long packageId;
    @EntityField(name = "依赖作用域", type = ApiParamType.STRING)
    private String scope = "compile";
    @EntityField(name = "父依赖id", type = ApiParamType.LONG)
    private Long parentId;
    @EntityField(name = "编译时间", type = ApiParamType.LONG)
    private Date buildTime;

    private String version;
    private DeployPackageVo packageVo;

    public DeployVersionDependencyVo() {
    }

    public DeployVersionDependencyVo(Long versionId, Long packageId, String scope, Long parentId) {
        this.versionId = versionId;
        this.packageId = packageId;
        this.scope = StringUtils.isNotBlank(scope) ? scope : "compile";
        this.parentId = parentId;
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

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DeployPackageVo getPackageVo() {
        return packageVo;
    }

    public void setPackageVo(DeployPackageVo packageVo) {
        this.packageVo = packageVo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeployVersionDependencyVo)) return false;
        DeployVersionDependencyVo that = (DeployVersionDependencyVo) o;
        return Objects.equals(getId(), that.getId()) || (Objects.equals(getVersionId(), that.getVersionId()) && Objects.equals(getPackageId(), that.getPackageId()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVersionId(), getPackageId());
    }
}
