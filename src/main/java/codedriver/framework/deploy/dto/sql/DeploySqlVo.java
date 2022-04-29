package codedriver.framework.deploy.dto.sql;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.io.Serializable;

/**
 * @author longrf
 * @date 2022/4/27 11:04 上午
 */
public class DeploySqlVo implements Serializable {
    private static final long serialVersionUID = -3975625036003451623L;

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "执行sql文件id", type = ApiParamType.LONG)
    private Long sqlId;
    @EntityField(name = "节点id", type = ApiParamType.LONG)
    private Long nodeId;
    @EntityField(name = "节点名称", type = ApiParamType.STRING)
    private String nodeName;

    public DeploySqlVo() {
    }

    public DeploySqlVo(Long jobId, Long sqlId, Long nodeId, String nodeName) {
        this.jobId = jobId;
        this.sqlId = sqlId;
        this.nodeId = nodeId;
        this.nodeName = nodeName;
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

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Long getSqlId() {
        return sqlId;
    }

    public void setSqlId(Long sqlId) {
        this.sqlId = sqlId;
    }
}
