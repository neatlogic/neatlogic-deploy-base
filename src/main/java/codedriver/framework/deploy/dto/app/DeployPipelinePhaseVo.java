/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.autoexec.dto.combop.AutoexecCombopPhaseVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployPipelinePhaseVo extends AutoexecCombopPhaseVo {

    @EntityField(name = "父级启用", type = ApiParamType.INTEGER)
    private Integer parentIsActive;
    @EntityField(name = "启用", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer override;
    @EntityField(name = "来源", type = ApiParamType.STRING)
    private String source;

    //发布作业：当前场景是否有BUILD分类的工具，前端需要根据此标识调用 不同的选择版本下拉接口
    @EntityField(name = "是否拥有BUILD类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;
    @EntityField(name = "是否拥有DEPLOY类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasDeployTypeTool = 0;

    public Integer getParentIsActive() {
        return parentIsActive;
    }

    public void setParentIsActive(Integer parentIsActive) {
        this.parentIsActive = parentIsActive;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getOverride() {
        return override;
    }

    public void setOverride(Integer override) {
        this.override = override;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getIsHasBuildTypeTool() {
        return isHasBuildTypeTool;
    }

    public void setIsHasBuildTypeTool(int isHasBuildTypeTool) {
        this.isHasBuildTypeTool = isHasBuildTypeTool;
    }

    public int getIsHasDeployTypeTool() {
        return isHasDeployTypeTool;
    }

    public void setIsHasDeployTypeTool(int isHasDeployTypeTool) {
        this.isHasDeployTypeTool = isHasDeployTypeTool;
    }
}
