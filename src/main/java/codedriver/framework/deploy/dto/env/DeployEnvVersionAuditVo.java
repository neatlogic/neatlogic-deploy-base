package codedriver.framework.deploy.dto.env;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

public class DeployEnvVersionAuditVo extends DeployEnvVersionVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "操作", type = ApiParamType.STRING)
    private String operate;

    public DeployEnvVersionAuditVo() {
    }

    public DeployEnvVersionAuditVo(Long envId, Long versionId, Integer buildNo, String operate) {
        super(envId, versionId, buildNo);
        this.operate = operate;
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

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }
}
