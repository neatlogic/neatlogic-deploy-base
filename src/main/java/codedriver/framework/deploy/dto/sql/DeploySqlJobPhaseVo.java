package codedriver.framework.deploy.dto.sql;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.io.Serializable;

/**
 * @author longrf
 * @date 2022/4/27 11:04 上午
 */
public class DeploySqlJobPhaseVo implements Serializable {
    private static final long serialVersionUID = -3975625036003451623L;

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "作业剧本id", type = ApiParamType.LONG)
    private Long phaseId;
    @EntityField(name = "作业剧本名", type = ApiParamType.STRING)
    private String phaseName;
    @EntityField(name = "sql文件id", type = ApiParamType.LONG)
    private Long sqlId;

    public DeploySqlJobPhaseVo(Long jobId, String phaseName, Long phaseId, Long sqlId) {
        this.jobId = jobId;
        this.phaseId = phaseId;
        this.phaseName = phaseName;
        this.sqlId = sqlId;
    }

    public DeploySqlJobPhaseVo() {
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(Long phaseId) {
        this.phaseId = phaseId;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public Long getSqlId() {
        return sqlId;
    }

    public void setSqlId(Long sqlId) {
        this.sqlId = sqlId;
    }
}
