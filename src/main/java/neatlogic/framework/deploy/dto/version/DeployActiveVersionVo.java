package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.dto.env.DeployEnvVersionVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployActiveVersionVo {

    @EntityField(name = "nfddv.deployactiveversionvo.versionid.name", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "nfddv.deployactiveversionvo.version.name", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "nfddv.deployactiveversionvo.compilecount.name", type = ApiParamType.INTEGER)
    private Integer compileCount = 0;
    @EntityField(name = "nfddv.deployactiveversionvo.compilesuccesscount.name", type = ApiParamType.INTEGER)
    private Integer compileSuccessCount = 0;
    @EntityField(name = "nfddv.deployactiveversionvo.compilefailcount.name", type = ApiParamType.INTEGER)
    private Integer compileFailCount = 0;
    @EntityField(name = "nfddv.deployactiveversionvo.envlist.name", type = ApiParamType.JSONARRAY)
    List<DeployEnvVersionVo> envList;

    public DeployActiveVersionVo() {
    }

    public DeployActiveVersionVo(DeployVersionVo versionVo) {
        this.versionId = versionVo.getId();
        this.version = versionVo.getVersion();
        this.compileSuccessCount = versionVo.getCompileSuccessCount();
        this.compileFailCount = versionVo.getCompileFailCount();
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
