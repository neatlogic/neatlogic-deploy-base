package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.deploy.dto.env.DeployEnvVersionVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployActiveVersionVo {

    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "版本号", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "编译次数", type = ApiParamType.INTEGER)
    private Integer compileCount = 0;
    @EntityField(name = "编译成功次数", type = ApiParamType.INTEGER)
    private Integer compileSuccessCount = 0;
    @EntityField(name = "编译失败次数", type = ApiParamType.INTEGER)
    private Integer compileFailCount = 0;
    @EntityField(name = "发布环境列表", type = ApiParamType.JSONARRAY)
    List<DeployEnvVersionVo> envList;

    public DeployActiveVersionVo() {
    }

    public DeployActiveVersionVo(DeployVersionVo versionVo) {
        this.versionId = versionVo.getId();
        this.version = versionVo.getVersion();
        this.compileSuccessCount = versionVo.getcompileSuccessCount();
        this.compileFailCount = versionVo.getcompileFailCount();
    }

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

    public Integer getcompileCount() {
        compileCount = compileSuccessCount + compileFailCount;
        return compileCount;
    }

    public Integer getcompileSuccessCount() {
        return compileSuccessCount;
    }

    public void setcompileSuccessCount(Integer compileSuccessCount) {
        this.compileSuccessCount = compileSuccessCount;
    }

    public Integer getcompileFailCount() {
        return compileFailCount;
    }

    public void setcompileFailCount(Integer compileFailCount) {
        this.compileFailCount = compileFailCount;
    }

    public List<DeployEnvVersionVo> getEnvList() {
        return envList;
    }

    public void setEnvList(List<DeployEnvVersionVo> envList) {
        this.envList = envList;
    }
}
