package codedriver.framework.deploy.dto.sql;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/**
 * @author longrf
 * @date 2022/4/27 11:29 上午
 */
public class DeploySqlDetailVo extends BaseEditorVo {

    private static final long serialVersionUID = -3906325036032471623L;

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "资源id", type = ApiParamType.LONG)
    private Long resourceId;
    @EntityField(name = "runner id", type = ApiParamType.LONG)
    private Long runnerId;
    @EntityField(name = "runner 端口", type = ApiParamType.INTEGER)
    private Integer runnerPort;
    @EntityField(name = "systemId", type = ApiParamType.LONG)
    private Long systemId;
    @EntityField(name = "moduleId", type = ApiParamType.LONG)
    private Long moduleId;
    @EntityField(name = "envId", type = ApiParamType.LONG)
    private Long envId;
    @EntityField(name = "version", type = ApiParamType.STRING)
    private String version;
    @EntityField(name = "sql文件名", type = ApiParamType.STRING)
    private String sqlFile;
    @EntityField(name = "ip", type = ApiParamType.STRING)
    private String host;
    @EntityField(name = "端口", type = ApiParamType.INTEGER)
    private Integer port;
    @EntityField(name = "状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "md5", type = ApiParamType.STRING)
    private String md5;
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "是否已经被删除", type = ApiParamType.INTEGER)
    private Integer isDelete = 0;
    @EntityField(name = "开始时间", type = ApiParamType.LONG)
    private Date startTime;
    @EntityField(name = "结束时间", type = ApiParamType.LONG)
    private Date endTime;


    public DeploySqlDetailVo(JSONObject paramObj) {
        this.systemId=(paramObj.getLong("systemId"));
        this.moduleId=(paramObj.getLong("moduleId"));
        this.envId=(paramObj.getLong("envId"));
        this.version=(paramObj.getString("version"));
        this.status=(paramObj.getString("status"));
        this.sqlFile=(paramObj.getString("sqlFile"));
        this.md5=(paramObj.getString("md5"));
        this.host=(paramObj.getString("host"));
        this.port=(paramObj.getInteger("port"));
        this.resourceId=(paramObj.getLong("resourceId"));
        this.runnerId=(paramObj.getLong("runnerId"));
        this.runnerPort=(paramObj.getInteger("runnerPort"));
    }

    public DeploySqlDetailVo(Long systemId, Long moduleId, Long envId, String version) {
        this.systemId = systemId;
        this.moduleId = moduleId;
        this.envId = envId;
        this.version = version;
    }

    public DeploySqlDetailVo() {

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


    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public Integer getRunnerPort() {
        return runnerPort;
    }

    public void setRunnerPort(Integer runnerPort) {
        this.runnerPort = runnerPort;
    }

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSqlFile() {
        return sqlFile;
    }

    public void setSqlFile(String sqlFile) {
        this.sqlFile = sqlFile;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
