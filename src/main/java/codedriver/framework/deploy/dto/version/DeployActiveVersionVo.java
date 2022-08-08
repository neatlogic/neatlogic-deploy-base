package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.dto.env.DeployEnvVersionAuditVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployActiveVersionVo {

    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "版本号", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "编译次数", type = ApiParamType.INTEGER)
    private Integer complieCount = 0;
    @EntityField(name = "编译成功次数", type = ApiParamType.INTEGER)
    private Integer complieSuccessCount = 0;
    @EntityField(name = "编译失败次数", type = ApiParamType.INTEGER)
    private Integer complieFailCount = 0;
    @EntityField(name = "发布环境列表", type = ApiParamType.JSONARRAY)
    List<DeployEnvVersionAuditVo> envList;

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public List<DeployEnvVersionAuditVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployEnvVersionAuditVo> envList) {
        this.envList = envList;
    }
}
