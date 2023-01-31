/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.job;

import neatlogic.framework.autoexec.constvalue.JobStatus;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.List;

public class LaneGroupVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "通道id", type = ApiParamType.LONG)
    private Long laneId;
    @EntityField(name = "是否需要等待", type = ApiParamType.INTEGER)
    private Integer needWait = 0;
    @EntityField(name = "执行完当前组是否停止不继续执行后续组，但仍受needWait约束，1：是，0：否", type = ApiParamType.INTEGER)
    private Integer isGoon = 1;
    @EntityField(name = "是否是强行执行组，1：是，0：否", type = ApiParamType.INTEGER)
    private Integer isGroupRun = 0;
    @EntityField(name = "状态", type = ApiParamType.ENUM, member = JobStatus.class)
    private String status;
    @EntityField(name = "作业列表", type = ApiParamType.JSONARRAY)
    private List<DeployJobVo> jobList;
    @EntityField(name = "批量作业执行策略，refire：跳过所有已完成的子作业；reset_refire:执行所有子作业", type = ApiParamType.STRING)
    private String batchJobAction;
    @EntityField(name = "子作业执行策略，refire：跳过所有已完成、已忽略的节点；reset_refire:执行所有节点", type = ApiParamType.STRING)
    private String jobAction;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;

    public LaneGroupVo() {
    }

    public LaneGroupVo(Long id, String status) {
        this.id = id;
        this.status = status;
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

    public Long getLaneId() {
        return laneId;
    }

    public void setLaneId(Long laneId) {
        this.laneId = laneId;
    }

    public List<DeployJobVo> getJobList() {
        return jobList;
    }

    public void setJobList(List<DeployJobVo> jobList) {
        this.jobList = jobList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getNeedWait() {
        return needWait;
    }

    public void setNeedWait(Integer needWait) {
        this.needWait = needWait;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBatchJobAction() {
        return batchJobAction;
    }

    public void setBatchJobAction(String batchJobAction) {
        this.batchJobAction = batchJobAction;
    }

    public String getJobAction() {
        return jobAction;
    }

    public void setJobAction(String jobAction) {
        this.jobAction = jobAction;
    }

    public Integer getIsGoon() {
        return isGoon;
    }

    public void setIsGoon(Integer isGoon) {
        this.isGoon = isGoon;
    }

    public Integer getIsGroupRun() {
        return isGroupRun;
    }

    public void setIsGroupRun(Integer isGroupRun) {
        this.isGroupRun = isGroupRun;
    }
}
