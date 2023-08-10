package neatlogic.framework.deploy.dto.codehub;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author YuJH
 *
 *   代码提交信息
 */
public class CommitVo extends BasePageVo implements Serializable {

    /**
     * commit_id
     */
    @EntityField(name = "commid id", type = ApiParamType.STRING)
    private String commitId;

    /**
     * mrId
     */
    @EntityField(name = "mr id", type = ApiParamType.LONG)
    private Long mrId;
    
    /**
     * repositoryId
     */
    @EntityField(name = "仓库id", type = ApiParamType.LONG)
    private Long repositoryId;

    /**
     * author
     */
    @EntityField(name = "作者", type = ApiParamType.STRING)
    private String author;

    /**
     * author_email
     */
    @EntityField(name = "作者邮箱", type = ApiParamType.STRING)
    private String authorEmail;

    /**
     * author_date
     */
    @EntityField(name = "作者编写时间", type = ApiParamType.LONG)
    private Date authorDate;

    /**
     * committer
     */
    @EntityField(name = "提交者", type = ApiParamType.STRING)
    private String committer;

    /**
     * committer_email
     */
    @EntityField(name = "提交者邮箱", type = ApiParamType.STRING)
    private String committerEmail;

    /**
     * committer_date
     */
    @EntityField(name = "提交者编写时间", type = ApiParamType.LONG)
    private Date committerDate;

    /**
     * message
     */
    @EntityField(name = "commit消息", type = ApiParamType.STRING)
    private String message;

    @EntityField(name = "排序规则", type = ApiParamType.STRING)
    private String sortColumn;

    @EntityField(name = "所属分支列表", type = ApiParamType.JSONARRAY)
    private List<String> branchList;
    
    @EntityField(name = "需求号", type = ApiParamType.STRING)
    private String issueNo;
    

    @EntityField(name = "分支名称", type = ApiParamType.STRING)
    private String branchName;
    
    @EntityField(name = "Json字符串存储的文件变更记录", type = ApiParamType.STRING)
    private String filePaths;
    
    

    @EntityField(name = "Commit的合并状态", type = ApiParamType.STRING)
    private String mergeStatus;
    
    @EntityField(name = "本次mr合并的commit，该值为 1", type = ApiParamType.INTEGER)
    private Integer isNew;

    @EntityField(name = "文件添加计数", type = ApiParamType.INTEGER)
    private Integer fileAddCount;
    @EntityField(name = "文件修改计数", type = ApiParamType.INTEGER)
    private Integer fileModifyCount;
    @EntityField(name = "文件删除计数", type = ApiParamType.INTEGER)
    private Integer fileDeleteCount;
    @EntityField(name = "行添加计数", type = ApiParamType.INTEGER)
    private Integer lineAddCount;
    @EntityField(name = "行删除计数", type = ApiParamType.INTEGER)
    private Integer lineDeleteCount;

    private static final long serialVersionUID = 1L;

    public String getCommitId() {
        return this.commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public Long getRepositoryId() {
        return this.repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return this.authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public Date getAuthorDate() {
        return this.authorDate;
    }

    public void setAuthorDate(Date authorDate) {
        this.authorDate = authorDate;
    }

    public String getCommitter() {
        return this.committer;
    }

    public void setCommitter(String committer) {
        this.committer = committer;
    }

    public String getCommitterEmail() {
        return this.committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    public Date getCommitterDate() {
        return this.committerDate;
    }

    public void setCommitterDate(Date committerDate) {
        this.committerDate = committerDate;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }
    

    public List<String> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<String> branchList) {
        this.branchList = branchList;
    }



    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    
    public Long getMrId() {
        return mrId;
    }

    public void setMrId(Long mrId) {
        this.mrId = mrId;
    }

    public String getFilePaths() {
        return filePaths;
    }

    

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }
    
    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }
    
    public Integer getFileAddCount() {
        return fileAddCount;
    }

    public void setFileAddCount(Integer fileAddCount) {
        this.fileAddCount = fileAddCount;
    }

    public Integer getFileDeleteCount() {
        return fileDeleteCount;
    }

    public void setFileDeleteCount(Integer fileDeleteCount) {
        this.fileDeleteCount = fileDeleteCount;
    }

    public Integer getLineAddCount() {
        return lineAddCount;
    }

    public void setLineAddCount(Integer lineAddCount) {
        this.lineAddCount = lineAddCount;
    }

    public Integer getLineDeleteCount() {
        return lineDeleteCount;
    }

    public void setLineDeleteCount(Integer lineDeleteCount) {
        this.lineDeleteCount = lineDeleteCount;
    }

    public Integer getFileModifyCount() {
        return fileModifyCount;
    }

    public void setFileModifyCount(Integer fileModifyCount) {
        this.fileModifyCount = fileModifyCount;
    }
    

    @Override
    public String toString() {
        return "CommitVo{" +
                "commitId='" + commitId + '\'' +
                ", mrId=" + mrId +
                ", repositoryId=" + repositoryId +
                ", author='" + author + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", authorDate=" + authorDate +
                ", committer='" + committer + '\'' +
                ", committerEmail='" + committerEmail + '\'' +
                ", committerDate=" + committerDate +
                ", message='" + message + '\'' +
                ", sortColumn='" + sortColumn + '\'' +
                ", branchList=" + branchList +
                ", issueNo='" + issueNo + '\'' +
                ", branchName='" + branchName + '\'' +
                ", filePaths='" + filePaths + '\'' +
                ", mergeStatus='" + mergeStatus + '\'' +
                ", isNew=" + isNew +
                ", fileAddCount=" + fileAddCount +
                ", fileModifyCount=" + fileModifyCount +
                ", fileDeleteCount=" + fileDeleteCount +
                ", lineAddCount=" + lineAddCount +
                ", lineDeleteCount=" + lineDeleteCount +
                '}';
    }
}