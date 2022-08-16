/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.pipeline;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.List;

public class PipelineGroupVo {
    @EntityField(name = "泳道id", type = ApiParamType.LONG)
    private Long laneId;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "是否需要等待", type = ApiParamType.INTEGER)
    private Integer needWait;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private int sort;

    @EntityField(name = "作业模板列表", type = ApiParamType.JSONARRAY)
    private List<PipelineJobTemplateVo> jobTemplateList;

    public Long getLaneId() {
        return laneId;
    }

    public void setLaneId(Long laneId) {
        this.laneId = laneId;
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

    public Integer getNeedWait() {
        return needWait;
    }

    public void setNeedWait(Integer needWait) {
        this.needWait = needWait;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public List<PipelineJobTemplateVo> getJobTemplateList() {
        return jobTemplateList;
    }

    public void setJobTemplateList(List<PipelineJobTemplateVo> jobTemplateList) {
        this.jobTemplateList = jobTemplateList;
    }
}
