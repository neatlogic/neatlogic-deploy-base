package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.Date;

public class DeployVersionUnitTestVo {

    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "common.versionid", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "nfddv.deployversionunittestvo.buildtime.name", type = ApiParamType.LONG)
    private Date buildTime;
    @EntityField(name = "nfddv.deployversionunittestvo.tests.name", type = ApiParamType.INTEGER)
    private Integer tests;
    @EntityField(name = "nfddv.deployversionunittestvo.testsuccessdensity.name", type = ApiParamType.INTEGER)
    private Integer testSuccessDensity;
    @EntityField(name = "nfddv.deployversionunittestvo.testerrors.name", type = ApiParamType.INTEGER)
    private Integer testErrors;
    @EntityField(name = "nfddv.deployversionunittestvo.branchcoverage.name", type = ApiParamType.INTEGER)
    private Integer branchCoverage;
    @EntityField(name = "nfddv.deployversionunittestvo.newbranchcoverage.name", type = ApiParamType.INTEGER)
    private Integer newBranchCoverage;
    @EntityField(name = "nfddv.deployversionunittestvo.linecoverage.name", type = ApiParamType.INTEGER)
    private Integer lineCoverage;
    @EntityField(name = "nfddv.deployversionunittestvo.newlinecoverage.name", type = ApiParamType.INTEGER)
    private Integer newLineCoverage;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTests() {
        return tests;
    }

    public void setTests(Integer tests) {
        this.tests = tests;
    }

    public Integer getTestSuccessDensity() {
        return testSuccessDensity;
    }

    public void setTestSuccessDensity(Integer testSuccessDensity) {
        this.testSuccessDensity = testSuccessDensity;
    }

    public Integer getTestErrors() {
        return testErrors;
    }

    public void setTestErrors(Integer testErrors) {
        this.testErrors = testErrors;
    }

    public Integer getBranchCoverage() {
        return branchCoverage;
    }

    public void setBranchCoverage(Integer branchCoverage) {
        this.branchCoverage = branchCoverage;
    }

    public Integer getNewBranchCoverage() {
        return newBranchCoverage;
    }

    public void setNewBranchCoverage(Integer newBranchCoverage) {
        this.newBranchCoverage = newBranchCoverage;
    }

    public Integer getLineCoverage() {
        return lineCoverage;
    }

    public void setLineCoverage(Integer lineCoverage) {
        this.lineCoverage = lineCoverage;
    }

    public Integer getNewLineCoverage() {
        return newLineCoverage;
    }

    public void setNewLineCoverage(Integer newLineCoverage) {
        this.newLineCoverage = newLineCoverage;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

}
