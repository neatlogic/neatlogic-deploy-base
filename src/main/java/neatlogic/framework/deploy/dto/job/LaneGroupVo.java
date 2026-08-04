/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.deploy.dto.job;

import neatlogic.framework.autoexec.constvalue.JobStatus;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.List;

public class LaneGroupVo {
    @EntityField(name = "nfddj.lanegroupvo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddj.lanegroupvo.laneid.name", type = ApiParamType.LONG)
    private Long laneId;
    @EntityField(name = "nfddj.lanegroupvo.needwait.name", type = ApiParamType.INTEGER)
    private Integer needWait = 0;
    @EntityField(name = "nfddj.lanegroupvo.isgoon.name", type = ApiParamType.INTEGER)
    private Integer isGoon = 1;
    @EntityField(name = "nfddj.lanegroupvo.isgrouprun.name", type = ApiParamType.INTEGER)
    private Integer isGroupRun = 0;
    @EntityField(name = "nfddj.lanegroupvo.status.name", type = ApiParamType.ENUM, member = JobStatus.class)
    private String status;
    @EntityField(name = "nfddj.lanegroupvo.joblist.name", type = ApiParamType.JSONARRAY)
    private List<DeployJobVo> jobList;
    @EntityField(name = "nfddj.lanegroupvo.batchjobaction.name", type = ApiParamType.STRING)
    private String batchJobAction;
    @EntityField(name = "nfddj.lanegroupvo.jobaction.name", type = ApiParamType.STRING)
    private String jobAction;
    @EntityField(name = "nfddj.lanegroupvo.sort.name", type = ApiParamType.INTEGER)
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
