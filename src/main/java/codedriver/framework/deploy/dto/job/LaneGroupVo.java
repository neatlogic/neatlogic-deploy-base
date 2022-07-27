/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.job;

import codedriver.framework.autoexec.constvalue.JobStatus;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.List;

public class LaneGroupVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "通道id", type = ApiParamType.LONG)
    private Long laneId;
    @EntityField(name = "是否需要等待", type = ApiParamType.INTEGER)
    private Integer needWait;
    @EntityField(name = "状态", type = ApiParamType.ENUM, member = JobStatus.class)
    private String status;
    @EntityField(name = "作业列表", type = ApiParamType.JSONARRAY)
    private List<DeployJobVo> jobList;

    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;

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
}
