package codedriver.framework.deploy.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

public class DeployPackageVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "工程足标识", type = ApiParamType.STRING)
    private String groupId;
    @EntityField(name = "工程标识", type = ApiParamType.STRING)
    private String artifactId;
    @EntityField(name = "工程版本号", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "包类型", type = ApiParamType.STRING)
    private String type = "jar";
    @EntityField(name = "版权许可、开源协议", type = ApiParamType.STRING)
    private String license;
    @EntityField(name = "包在maven仓库中的地址", type = ApiParamType.STRING)
    private String url;

    public DeployPackageVo(String groupId, String artifactId, String version, String license, String url, String type) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.license = license;
        this.url = url;
        this.type = StringUtils.isNotBlank(type) ? type : "jar";
    }

    public DeployPackageVo() {
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
