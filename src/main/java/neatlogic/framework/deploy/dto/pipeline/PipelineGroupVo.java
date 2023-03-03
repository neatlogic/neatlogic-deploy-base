/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

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
