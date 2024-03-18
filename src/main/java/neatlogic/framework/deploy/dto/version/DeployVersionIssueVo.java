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
import neatlogic.framework.exception.util.FreemarkerTransformException;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.FreemarkerUtil;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.Date;

public class DeployVersionIssueVo extends BasePageVo {
    /**
     * id
     */
    @EntityField(name = "nfddv.deployversionissuevo.issueid.name", type = ApiParamType.LONG)
    private Long id;

    /**
     * sourceId
     */
    @EntityField(name = "nfddv.deployversionissuevo.sourceid.name", type = ApiParamType.LONG)
    private Long sourceId;

    /**
     * source
     */
    @EntityField(name = "nfddv.deployversionissuevo.source.name", type = ApiParamType.STRING)
    private String source;

    /**
     * no
     */
    @EntityField(name = "nfddv.deployversionissuevo.no.name", type = ApiParamType.STRING)
    private String no;

    /**
     * name
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuename.name", type = ApiParamType.STRING)
    private String name;


    /**
     * type
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuetype.name", type = ApiParamType.STRING)
    private String type;


    /**
     * status
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuestatus.name", type = ApiParamType.STRING)
    private String status;

    /**
     * description
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuedescription.name", type = ApiParamType.STRING)
    private String description;

    /**
     * handleUserId
     */
    @EntityField(name = "nfddv.deployversionissuevo.handleuserid.name", type = ApiParamType.STRING)
    private String handleUserId;

    /**
     * issueCreateTime
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuecreatetime.name", type = ApiParamType.STRING)
    private Date issueCreateTime = null;

    /**
     * issueUpdateTime
     */
    @EntityField(name = "nfddv.deployversionissuevo.issueupdatetime.name", type = ApiParamType.STRING)
    private Date issueUpdateTime = null;

    /**
     * issueLastSyncTime
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuelastsynctime.name", type = ApiParamType.STRING)
    private Date issueLastSyncTime = null;

    /**
     * issueCreator
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuecreator.name", type = ApiParamType.STRING)
    private String issueCreator = null;

    /**
     * issueUpdateUser
     */
    @EntityField(name = "nfddv.deployversionissuevoissueupdateuser.name", type = ApiParamType.STRING)
    private String issueUpdateUser = null;

    /**
     * issuePersonIncharge
     */
    @EntityField(name = "nfddv.deployversionissuevo.issuepersonincharge.name", type = ApiParamType.STRING)
    private String issuePersonIncharge = null;

    /**
     * issueSyncUser
     */
    @EntityField(name = "nfddv.deployversionissuevo.syncuser.name", type = ApiParamType.STRING)
    private String issueSyncUser;

    /**
     * fcd
     */
    @EntityField(name = "common.createtime", type = ApiParamType.STRING)
    private Date fcd;

    /**
     * fcu
     */
    @EntityField(name = "common.createuser", type = ApiParamType.STRING)
    private String fcu;

    /**
     * lcd
     */
    @EntityField(name = "nfddv.deployversionissuevo.lcd.name", type = ApiParamType.STRING)
    private Date lcd;

    /**
     * lcu
     */
    @EntityField(name = "nfddv.deployversionissuevo.lcu.name", type = ApiParamType.STRING)
    private String lcu;


    @EntityField(name = "common.versionid", type = ApiParamType.LONG)
    private Long versionId;

    @EntityField(name = "nfddv.deployversionissuevo.browseurl.name", type = ApiParamType.LONG)
    private String browseUrl;


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHandleUserId() {
        return handleUserId;
    }

    public void setHandleUserId(String handleUserId) {
        this.handleUserId = handleUserId;
    }

    public Date getIssueCreateTime() {
        return issueCreateTime;
    }

    public void setIssueCreateTime(Date issueCreateTime) {
        this.issueCreateTime = issueCreateTime;
    }

    public Date getIssueUpdateTime() {
        return issueUpdateTime;
    }

    public void setIssueUpdateTime(Date issueUpdateTime) {
        this.issueUpdateTime = issueUpdateTime;
    }

    public Date getIssueLastSyncTime() {
        return issueLastSyncTime;
    }

    public void setIssueLastSyncTime(Date issueLastSyncTime) {
        this.issueLastSyncTime = issueLastSyncTime;
    }

    public String getIssueCreator() {
        return issueCreator;
    }

    public void setIssueCreator(String issueCreator) {
        this.issueCreator = issueCreator;
    }

    public String getIssueUpdateUser() {
        return issueUpdateUser;
    }

    public void setIssueUpdateUser(String issueUpdateUser) {
        this.issueUpdateUser = issueUpdateUser;
    }

    public String getIssuePersonIncharge() {
        return issuePersonIncharge;
    }

    public void setIssuePersonIncharge(String issuePersonIncharge) {
        this.issuePersonIncharge = issuePersonIncharge;
    }

    public String getIssueSyncUser() {
        return issueSyncUser;
    }

    public void setIssueSyncUser(String issueSyncUser) {
        this.issueSyncUser = issueSyncUser;
    }

    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public String getFcu() {
        return fcu;
    }

    public void setFcu(String fcu) {
        this.fcu = fcu;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getBrowseUrl() {
        // neatlogic/framework/dependency/dto/DependencyInfoVo.java.getUrl()
        if (browseUrl != null) {
            try {
                browseUrl = FreemarkerUtil.transform(this, browseUrl);
            } catch (FreemarkerTransformException e) {
            }
        }
        return browseUrl;
    }

    public void setBrowseUrl(String browseUrl) {
        this.browseUrl = browseUrl;
    }

    @Override
    public String toString() {
        return "IssueVo{" +
                "id=" + id +
                ", sourceId=" + sourceId +
                ", source='" + source + '\'' +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", handleUserId='" + handleUserId + '\'' +
                ", issueCreateTime=" + issueCreateTime +
                ", issueUpdateTime=" + issueUpdateTime +
                ", issueLastSyncTime=" + issueLastSyncTime +
                ", issueCreator='" + issueCreator + '\'' +
                ", issueUpdateUser='" + issueUpdateUser + '\'' +
                ", issuePersonIncharge='" + issuePersonIncharge + '\'' +
                ", issueSyncUser='" + issueSyncUser + '\'' +
                ", fcd=" + fcd +
                ", fcu='" + fcu + '\'' +
                ", lcd=" + lcd +
                ", lcu='" + lcu + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
