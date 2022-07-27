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

public class LaneVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "状态", type = ApiParamType.ENUM, member = JobStatus.class)
    private String status;
    @EntityField(name = "批量作业id", type = ApiParamType.LONG)
    private Long batchJobId;
    @EntityField(name = "组列表", type = ApiParamType.JSONARRAY)
    private List<LaneGroupVo> groupList;
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

    public List<LaneGroupVo> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<LaneGroupVo> groupList) {
        this.groupList = groupList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getBatchJobId() {
        return batchJobId;
    }

    public void setBatchJobId(Long batchJobId) {
        this.batchJobId = batchJobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
