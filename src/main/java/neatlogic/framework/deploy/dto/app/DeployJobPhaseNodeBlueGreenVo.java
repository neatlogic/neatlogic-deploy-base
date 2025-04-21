/*
 * Copyright (C) 2025  深圳极向量科技有限公司 All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

public class DeployJobPhaseNodeBlueGreenVo extends BaseEditorVo {
    @EntityField(name = "作业id", type = ApiParamType.LONG)
    private Long jobId;
    @EntityField(name = "作业阶段id", type = ApiParamType.LONG)
    private Long jobPhaseId;
    @EntityField(name = "作业节点id", type = ApiParamType.LONG)
    private Long jobPhaseNodeId;
    @EntityField(name = "蓝绿id", type = ApiParamType.LONG)
    private Long blueGreenId;
    @EntityField(name = "跟新标记", type = ApiParamType.LONG)
    private Long updateTag;
    @EntityField(name = "蓝绿名", type = ApiParamType.STRING)
    private String blueGreenName;
    @EntityField(name = "蓝绿排序", type = ApiParamType.STRING)
    private String blueGreenSort;
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getJobPhaseId() {
        return jobPhaseId;
    }

    public void setJobPhaseId(Long jobPhaseId) {
        this.jobPhaseId = jobPhaseId;
    }

    public Long getJobPhaseNodeId() {
        return jobPhaseNodeId;
    }

    public void setJobPhaseNodeId(Long jobPhaseNodeId) {
        this.jobPhaseNodeId = jobPhaseNodeId;
    }

    public Long getBlueGreenId() {
        return blueGreenId;
    }

    public void setBlueGreenId(Long blueGreenId) {
        this.blueGreenId = blueGreenId;
    }

    public Long getUpdateTag() {
        return updateTag;
    }

    public void setUpdateTag(Long updateTag) {
        this.updateTag = updateTag;
    }

    public String getBlueGreenName() {
        return blueGreenName;
    }

    public void setBlueGreenName(String blueGreenName) {
        this.blueGreenName = blueGreenName;
    }

    public String getBlueGreenSort() {
        return blueGreenSort;
    }

    public void setBlueGreenSort(String blueGreenSort) {
        this.blueGreenSort = blueGreenSort;
    }
}
