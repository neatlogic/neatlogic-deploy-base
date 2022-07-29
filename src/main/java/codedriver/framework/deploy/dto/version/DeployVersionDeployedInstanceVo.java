package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class DeployVersionDeployedInstanceVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "实例id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;

    public DeployVersionDeployedInstanceVo() {
    }

    public DeployVersionDeployedInstanceVo(Long resourceId, Long versionId, String lcu, Date lcd) {
        this.resourceId = resourceId;
        this.versionId = versionId;
        super.setLcu(lcu);
        super.setLcd(lcd);
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
}
