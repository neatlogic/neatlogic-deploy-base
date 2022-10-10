package codedriver.framework.deploy.dto.version;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;

public class DeployVersionBuildQualityVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
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
    private Double commentLinesDensity;
    private Integer publicDocumentedApiDensity;
    private Integer duplicatedFiles;
    private Integer duplicatedLines;
    private Double duplicatedLinesDensity;
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

    private Integer newSecurityHotspots;
    private String newSecurityRating;
    private Integer newSecurityRemediationEffort;
    private Integer newVulnerabilities;
    private Integer securityHotspots;
    private String securityRating;
    private Integer securityRemediationEffort;
    private Integer commentLines;
    private String nclocLanguageDistribution;
    private Integer newLines;
    private Integer cognitiveComplexity;
    private Integer conditionsToCover;
    private Double coverage;
    private Integer linesToCover;
    private Integer newConditionsToCover;
    private Double newCoverage;
    private Integer newLinesToCover;
    private Integer newUncoveredConditions;
    private Integer newUncoveredLines;
    private Integer uncoveredConditions;
    private Integer uncoveredLines;
    private Integer newBugs;
    private String newReliabilityRating;
    private String reliabilityRating;
    private Integer newCodeSmells;
    private Double newSqaleDebtRatio;
    private Integer newTechnicalDebt;
    private Double sqaleDebtRatio;
    private String sqaleIndex;
    private String sqaleRating;
    private Integer confirmedIssues;
    private Integer falsePositiveIssues;
    private Integer infoViolations;
    private Integer newBlockerViolations;
    private Integer newCriticalViolations;
    private Integer newInfoViolations;
    private Integer newMajorViolations;
    private Integer newMinorViolations;
    private Integer newViolations;
    private Integer openIssues;
    private Integer reopenedIssues;
    private Integer wontFixIssues;
    private String alertStatus;
    private String qualityGateDetails;
    private String newMaintainabilityRating;
    @EntityField(name = "漏洞阈值", type = ApiParamType.INTEGER)
    private Integer threshold;

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

    public Double getCommentLinesDensity() {
        return commentLinesDensity;
    }

    public void setCommentLinesDensity(Double commentLinesDensity) {
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

    public Double getDuplicatedLinesDensity() {
        return duplicatedLinesDensity;
    }

    public void setDuplicatedLinesDensity(Double duplicatedLinesDensity) {
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

    public Integer getNewSecurityHotspots() {
        return newSecurityHotspots;
    }

    public void setNewSecurityHotspots(Integer newSecurityHotspots) {
        this.newSecurityHotspots = newSecurityHotspots;
    }

    public String getNewSecurityRating() {
        return newSecurityRating;
    }

    public void setNewSecurityRating(String newSecurityRating) {
        this.newSecurityRating = newSecurityRating;
    }

    public Integer getNewSecurityRemediationEffort() {
        return newSecurityRemediationEffort;
    }

    public void setNewSecurityRemediationEffort(Integer newSecurityRemediationEffort) {
        this.newSecurityRemediationEffort = newSecurityRemediationEffort;
    }

    public Integer getNewVulnerabilities() {
        return newVulnerabilities;
    }

    public void setNewVulnerabilities(Integer newVulnerabilities) {
        this.newVulnerabilities = newVulnerabilities;
    }

    public Integer getSecurityHotspots() {
        return securityHotspots;
    }

    public void setSecurityHotspots(Integer securityHotspots) {
        this.securityHotspots = securityHotspots;
    }

    public String getSecurityRating() {
        return securityRating;
    }

    public void setSecurityRating(String securityRating) {
        this.securityRating = securityRating;
    }

    public Integer getSecurityRemediationEffort() {
        return securityRemediationEffort;
    }

    public void setSecurityRemediationEffort(Integer securityRemediationEffort) {
        this.securityRemediationEffort = securityRemediationEffort;
    }

    public Integer getCommentLines() {
        return commentLines;
    }

    public void setCommentLines(Integer commentLines) {
        this.commentLines = commentLines;
    }

    public String getNclocLanguageDistribution() {
        return nclocLanguageDistribution;
    }

    public void setNclocLanguageDistribution(String nclocLanguageDistribution) {
        this.nclocLanguageDistribution = nclocLanguageDistribution;
    }

    public Integer getNewLines() {
        return newLines;
    }

    public void setNewLines(Integer newLines) {
        this.newLines = newLines;
    }

    public Integer getCognitiveComplexity() {
        return cognitiveComplexity;
    }

    public void setCognitiveComplexity(Integer cognitiveComplexity) {
        this.cognitiveComplexity = cognitiveComplexity;
    }

    public Integer getConditionsToCover() {
        return conditionsToCover;
    }

    public void setConditionsToCover(Integer conditionsToCover) {
        this.conditionsToCover = conditionsToCover;
    }

    public Double getCoverage() {
        return coverage;
    }

    public void setCoverage(Double coverage) {
        this.coverage = coverage;
    }

    public Integer getLinesToCover() {
        return linesToCover;
    }

    public void setLinesToCover(Integer linesToCover) {
        this.linesToCover = linesToCover;
    }

    public Integer getNewConditionsToCover() {
        return newConditionsToCover;
    }

    public void setNewConditionsToCover(Integer newConditionsToCover) {
        this.newConditionsToCover = newConditionsToCover;
    }

    public Double getNewCoverage() {
        return newCoverage;
    }

    public void setNewCoverage(Double newCoverage) {
        this.newCoverage = newCoverage;
    }

    public Integer getNewLinesToCover() {
        return newLinesToCover;
    }

    public void setNewLinesToCover(Integer newLinesToCover) {
        this.newLinesToCover = newLinesToCover;
    }

    public Integer getNewUncoveredConditions() {
        return newUncoveredConditions;
    }

    public void setNewUncoveredConditions(Integer newUncoveredConditions) {
        this.newUncoveredConditions = newUncoveredConditions;
    }

    public Integer getNewUncoveredLines() {
        return newUncoveredLines;
    }

    public void setNewUncoveredLines(Integer newUncoveredLines) {
        this.newUncoveredLines = newUncoveredLines;
    }

    public Integer getUncoveredConditions() {
        return uncoveredConditions;
    }

    public void setUncoveredConditions(Integer uncoveredConditions) {
        this.uncoveredConditions = uncoveredConditions;
    }

    public Integer getUncoveredLines() {
        return uncoveredLines;
    }

    public void setUncoveredLines(Integer uncoveredLines) {
        this.uncoveredLines = uncoveredLines;
    }

    public Integer getNewBugs() {
        return newBugs;
    }

    public void setNewBugs(Integer newBugs) {
        this.newBugs = newBugs;
    }

    public String getNewReliabilityRating() {
        return newReliabilityRating;
    }

    public void setNewReliabilityRating(String newReliabilityRating) {
        this.newReliabilityRating = newReliabilityRating;
    }

    public String getReliabilityRating() {
        return reliabilityRating;
    }

    public void setReliabilityRating(String reliabilityRating) {
        this.reliabilityRating = reliabilityRating;
    }

    public Integer getNewCodeSmells() {
        return newCodeSmells;
    }

    public void setNewCodeSmells(Integer newCodeSmells) {
        this.newCodeSmells = newCodeSmells;
    }

    public Double getNewSqaleDebtRatio() {
        return newSqaleDebtRatio;
    }

    public void setNewSqaleDebtRatio(Double newSqaleDebtRatio) {
        this.newSqaleDebtRatio = newSqaleDebtRatio;
    }

    public Integer getNewTechnicalDebt() {
        return newTechnicalDebt;
    }

    public void setNewTechnicalDebt(Integer newTechnicalDebt) {
        this.newTechnicalDebt = newTechnicalDebt;
    }

    public Double getSqaleDebtRatio() {
        return sqaleDebtRatio;
    }

    public void setSqaleDebtRatio(Double sqaleDebtRatio) {
        this.sqaleDebtRatio = sqaleDebtRatio;
    }

    public String getSqaleIndex() {
        return sqaleIndex;
    }

    public void setSqaleIndex(String sqaleIndex) {
        this.sqaleIndex = sqaleIndex;
    }

    public String getSqaleRating() {
        return sqaleRating;
    }

    public void setSqaleRating(String sqaleRating) {
        this.sqaleRating = sqaleRating;
    }

    public Integer getConfirmedIssues() {
        return confirmedIssues;
    }

    public void setConfirmedIssues(Integer confirmedIssues) {
        this.confirmedIssues = confirmedIssues;
    }

    public Integer getFalsePositiveIssues() {
        return falsePositiveIssues;
    }

    public void setFalsePositiveIssues(Integer falsePositiveIssues) {
        this.falsePositiveIssues = falsePositiveIssues;
    }

    public Integer getInfoViolations() {
        return infoViolations;
    }

    public void setInfoViolations(Integer infoViolations) {
        this.infoViolations = infoViolations;
    }

    public Integer getNewBlockerViolations() {
        return newBlockerViolations;
    }

    public void setNewBlockerViolations(Integer newBlockerViolations) {
        this.newBlockerViolations = newBlockerViolations;
    }

    public Integer getNewCriticalViolations() {
        return newCriticalViolations;
    }

    public void setNewCriticalViolations(Integer newCriticalViolations) {
        this.newCriticalViolations = newCriticalViolations;
    }

    public Integer getNewInfoViolations() {
        return newInfoViolations;
    }

    public void setNewInfoViolations(Integer newInfoViolations) {
        this.newInfoViolations = newInfoViolations;
    }

    public Integer getNewMajorViolations() {
        return newMajorViolations;
    }

    public void setNewMajorViolations(Integer newMajorViolations) {
        this.newMajorViolations = newMajorViolations;
    }

    public Integer getNewMinorViolations() {
        return newMinorViolations;
    }

    public void setNewMinorViolations(Integer newMinorViolations) {
        this.newMinorViolations = newMinorViolations;
    }

    public Integer getNewViolations() {
        return newViolations;
    }

    public void setNewViolations(Integer newViolations) {
        this.newViolations = newViolations;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getReopenedIssues() {
        return reopenedIssues;
    }

    public void setReopenedIssues(Integer reopenedIssues) {
        this.reopenedIssues = reopenedIssues;
    }

    public Integer getWontFixIssues() {
        return wontFixIssues;
    }

    public void setWontFixIssues(Integer wontFixIssues) {
        this.wontFixIssues = wontFixIssues;
    }

    public String getAlertStatus() {
        return alertStatus;
    }

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    public String getQualityGateDetails() {
        return qualityGateDetails;
    }

    public void setQualityGateDetails(String qualityGateDetails) {
        this.qualityGateDetails = qualityGateDetails;
    }

    public String getNewMaintainabilityRating() {
        return newMaintainabilityRating;
    }

    public void setNewMaintainabilityRating(String newMaintainabilityRating) {
        this.newMaintainabilityRating = newMaintainabilityRating;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
}
