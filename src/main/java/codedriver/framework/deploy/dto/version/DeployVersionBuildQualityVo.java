package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.Date;

public class DeployVersionBuildQualityVo {

    @EntityField(name = "应用模块ID", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "版本ID", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "构建时间", type = ApiParamType.LONG)
    private Date buildTime;
    private Integer files;
    private Integer classes;
    private Integer lines;
    private Integer ncloc;
    private Integer functions;
    private Integer statements;
    private Integer complexity;
    private Integer fileComplexity;
    private Integer classComplexity;
    private Integer functionComplexity;
    private Integer violations;
    private Integer blockerViolations;
    private Integer criticalViolations;
    private Integer majorViolations;
    private Integer minorViolations;
    private Integer executableLinesData;
    private Integer itConditionsToCover;
    private Integer itBranchCoverage;
    private Integer itConditionsByLine;
    private Integer itCoverage;
    private Integer itCoverageLineHitsData;
    private Integer itCoveredConditionsByLine;
    private Integer itLineCoverage;
    private Integer itLinesToCover;
    private Integer commentLinesDensity;
    private Integer publicDocumentedApiDensity;
    private Integer duplicatedFiles;
    private Integer duplicatedLines;
    private Integer duplicatedLinesDensity;
    private Integer newDuplicatedLines;
    private Integer newDuplicatedLinesDensity;
    private Integer duplicatedBlocks;
    private Integer newDuplicatedBlocks;
    @EntityField(name = "漏洞数量", type = ApiParamType.INTEGER)
    private Integer bugs;//漏洞
    @EntityField(name = "缺陷数量", type = ApiParamType.INTEGER)
    private Integer vulnerabilities;//缺陷
    @EntityField(name = "代码异味数量", type = ApiParamType.INTEGER)
    private Integer codeSmells;//代码异味

    @EntityField(name = "单元测试总数", type = ApiParamType.INTEGER)
    private Integer tests;
    @EntityField(name = "单元测试成功率", type = ApiParamType.INTEGER)
    private Integer testSuccessDensity;
    @EntityField(name = "单元测试失败数", type = ApiParamType.INTEGER)
    private Integer testErrors;
    @EntityField(name = "全量代码分支覆盖率", type = ApiParamType.INTEGER)
    private Integer branchCoverage;
    @EntityField(name = "增量代码分支覆盖率", type = ApiParamType.INTEGER)
    private Integer newBranchCoverage;
    @EntityField(name = "全量行覆盖率", type = ApiParamType.INTEGER)
    private Integer lineCoverage;
    @EntityField(name = "增量行覆盖率", type = ApiParamType.INTEGER)
    private Integer newLineCoverage;


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

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
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

    public Integer getFiles() {
        return files;
    }

    public void setFiles(Integer files) {
        this.files = files;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public Integer getNcloc() {
        return ncloc;
    }

    public void setNcloc(Integer ncloc) {
        this.ncloc = ncloc;
    }

    public Integer getFunctions() {
        return functions;
    }

    public void setFunctions(Integer functions) {
        this.functions = functions;
    }

    public Integer getStatements() {
        return statements;
    }

    public void setStatements(Integer statements) {
        this.statements = statements;
    }

    public Integer getComplexity() {
        return complexity;
    }

    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    public Integer getFileComplexity() {
        return fileComplexity;
    }

    public void setFileComplexity(Integer fileComplexity) {
        this.fileComplexity = fileComplexity;
    }

    public Integer getClassComplexity() {
        return classComplexity;
    }

    public void setClassComplexity(Integer classComplexity) {
        this.classComplexity = classComplexity;
    }

    public Integer getFunctionComplexity() {
        return functionComplexity;
    }

    public void setFunctionComplexity(Integer functionComplexity) {
        this.functionComplexity = functionComplexity;
    }

    public Integer getViolations() {
        return violations;
    }

    public void setViolations(Integer violations) {
        this.violations = violations;
    }

    public Integer getBlockerViolations() {
        return blockerViolations;
    }

    public void setBlockerViolations(Integer blockerViolations) {
        this.blockerViolations = blockerViolations;
    }

    public Integer getCriticalViolations() {
        return criticalViolations;
    }

    public void setCriticalViolations(Integer criticalViolations) {
        this.criticalViolations = criticalViolations;
    }

    public Integer getMajorViolations() {
        return majorViolations;
    }

    public void setMajorViolations(Integer majorViolations) {
        this.majorViolations = majorViolations;
    }

    public Integer getMinorViolations() {
        return minorViolations;
    }

    public void setMinorViolations(Integer minorViolations) {
        this.minorViolations = minorViolations;
    }

    public Integer getExecutableLinesData() {
        return executableLinesData;
    }

    public void setExecutableLinesData(Integer executableLinesData) {
        this.executableLinesData = executableLinesData;
    }

    public Integer getItConditionsToCover() {
        return itConditionsToCover;
    }

    public void setItConditionsToCover(Integer itConditionsToCover) {
        this.itConditionsToCover = itConditionsToCover;
    }

    public Integer getItBranchCoverage() {
        return itBranchCoverage;
    }

    public void setItBranchCoverage(Integer itBranchCoverage) {
        this.itBranchCoverage = itBranchCoverage;
    }

    public Integer getItConditionsByLine() {
        return itConditionsByLine;
    }

    public void setItConditionsByLine(Integer itConditionsByLine) {
        this.itConditionsByLine = itConditionsByLine;
    }

    public Integer getItCoverage() {
        return itCoverage;
    }

    public void setItCoverage(Integer itCoverage) {
        this.itCoverage = itCoverage;
    }

    public Integer getItCoverageLineHitsData() {
        return itCoverageLineHitsData;
    }

    public void setItCoverageLineHitsData(Integer itCoverageLineHitsData) {
        this.itCoverageLineHitsData = itCoverageLineHitsData;
    }

    public Integer getItCoveredConditionsByLine() {
        return itCoveredConditionsByLine;
    }

    public void setItCoveredConditionsByLine(Integer itCoveredConditionsByLine) {
        this.itCoveredConditionsByLine = itCoveredConditionsByLine;
    }

    public Integer getItLineCoverage() {
        return itLineCoverage;
    }

    public void setItLineCoverage(Integer itLineCoverage) {
        this.itLineCoverage = itLineCoverage;
    }

    public Integer getItLinesToCover() {
        return itLinesToCover;
    }

    public void setItLinesToCover(Integer itLinesToCover) {
        this.itLinesToCover = itLinesToCover;
    }

    public Integer getCommentLinesDensity() {
        return commentLinesDensity;
    }

    public void setCommentLinesDensity(Integer commentLinesDensity) {
        this.commentLinesDensity = commentLinesDensity;
    }

    public Integer getPublicDocumentedApiDensity() {
        return publicDocumentedApiDensity;
    }

    public void setPublicDocumentedApiDensity(Integer publicDocumentedApiDensity) {
        this.publicDocumentedApiDensity = publicDocumentedApiDensity;
    }

    public Integer getDuplicatedFiles() {
        return duplicatedFiles;
    }

    public void setDuplicatedFiles(Integer duplicatedFiles) {
        this.duplicatedFiles = duplicatedFiles;
    }

    public Integer getDuplicatedLines() {
        return duplicatedLines;
    }

    public void setDuplicatedLines(Integer duplicatedLines) {
        this.duplicatedLines = duplicatedLines;
    }

    public Integer getDuplicatedLinesDensity() {
        return duplicatedLinesDensity;
    }

    public void setDuplicatedLinesDensity(Integer duplicatedLinesDensity) {
        this.duplicatedLinesDensity = duplicatedLinesDensity;
    }

    public Integer getNewDuplicatedLines() {
        return newDuplicatedLines;
    }

    public void setNewDuplicatedLines(Integer newDuplicatedLines) {
        this.newDuplicatedLines = newDuplicatedLines;
    }

    public Integer getNewDuplicatedLinesDensity() {
        return newDuplicatedLinesDensity;
    }

    public void setNewDuplicatedLinesDensity(Integer newDuplicatedLinesDensity) {
        this.newDuplicatedLinesDensity = newDuplicatedLinesDensity;
    }

    public Integer getDuplicatedBlocks() {
        return duplicatedBlocks;
    }

    public void setDuplicatedBlocks(Integer duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
    }

    public Integer getNewDuplicatedBlocks() {
        return newDuplicatedBlocks;
    }

    public void setNewDuplicatedBlocks(Integer newDuplicatedBlocks) {
        this.newDuplicatedBlocks = newDuplicatedBlocks;
    }

    public Integer getBugs() {
        return bugs;
    }

    public void setBugs(Integer bugs) {
        this.bugs = bugs;
    }

    public Integer getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(Integer vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public Integer getCodeSmells() {
        return codeSmells;
    }

    public void setCodeSmells(Integer codeSmells) {
        this.codeSmells = codeSmells;
    }


}
