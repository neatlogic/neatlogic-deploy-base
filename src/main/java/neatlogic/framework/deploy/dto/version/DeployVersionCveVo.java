/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.List;

public class DeployVersionCveVo extends BasePageVo {
    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "common.versionid", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "common.dependency", type = ApiParamType.STRING)
    private String dependency;
    @EntityField(name = "term.deploy.vulnerabilityids", type = ApiParamType.JSONARRAY)
    private List<DeployVersionCveVulnerabilityVo> vulnerabilityIds;
    @EntityField(name = "common.packagename", type = ApiParamType.JSONARRAY)
    private List<DeployVersionCvePackageVo> packageList;
    @EntityField(name = "term.deploy.highestseverity", type = ApiParamType.STRING)
    private String highestSeverity;
    @EntityField(name = "term.deploy.cvecount", type = ApiParamType.INTEGER)
    private Integer cveCount;
    @EntityField(name = "term.deploy.confidence", type = ApiParamType.STRING)
    private String confidence;
    @EntityField(name = "term.deploy.evidencecount", type = ApiParamType.INTEGER)
    private Integer evidenceCount;

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

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public List<DeployVersionCveVulnerabilityVo> getVulnerabilityIds() {
        return vulnerabilityIds;
    }

    public void setVulnerabilityIds(List<DeployVersionCveVulnerabilityVo> vulnerabilityIds) {
        this.vulnerabilityIds = vulnerabilityIds;
    }

    public List<DeployVersionCvePackageVo> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<DeployVersionCvePackageVo> packageList) {
        this.packageList = packageList;
    }

    public String getHighestSeverity() {
        return highestSeverity;
    }

    public void setHighestSeverity(String highestSeverity) {
        this.highestSeverity = highestSeverity;
    }

    public Integer getCveCount() {
        return cveCount;
    }

    public void setCveCount(Integer cveCount) {
        this.cveCount = cveCount;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public Integer getEvidenceCount() {
        return evidenceCount;
    }

    public void setEvidenceCount(Integer evidenceCount) {
        this.evidenceCount = evidenceCount;
    }
}
