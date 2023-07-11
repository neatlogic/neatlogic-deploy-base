/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.deploy.dto.version;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

public class DeployVersionCveVo extends BasePageVo {
    @EntityField(name = "common.id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "common.versionid", type = ApiParamType.LONG)
    private Long versionId;
    @EntityField(name = "common.dependency", type = ApiParamType.STRING)
    private String dependency;
    @EntityField(name = "term.deploy.vulnerabilityids", type = ApiParamType.STRING)
    private String vulnerabilityIds;
    @EntityField(name = "common.packagename", type = ApiParamType.STRING)
    private String packageName;
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

    public String getVulnerabilityIds() {
        return vulnerabilityIds;
    }

    public void setVulnerabilityIds(String vulnerabilityIds) {
        this.vulnerabilityIds = vulnerabilityIds;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
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
