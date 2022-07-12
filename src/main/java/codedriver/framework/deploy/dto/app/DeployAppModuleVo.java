package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

/**
 * @author longrf
 * @date 2022/6/23 3:41 下午
 */
public class DeployAppModuleVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    private String abbrName;
    @EntityField(name = "是否有环境（1：有，0：没有）", type = ApiParamType.INTEGER)
    private Integer isHasEnv = 0;
    //发布作业：当前场景是否有BUILD分类的工具，前端需要根据此标识调用 不同的选择版本下拉接口
    @EntityField(name = "是否拥有BUILD类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;


    private List<DeployAppConfigInstanceVo> instanceVoList;

    public DeployAppModuleVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrName() {
        return abbrName;
    }

    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
    }

    public Integer getIsHasEnv() {
        return isHasEnv;
    }

    public void setIsHasEnv(Integer isHasEnv) {
        this.isHasEnv = isHasEnv;
    }

    public List<DeployAppConfigInstanceVo> getInstanceVoList() {
        return instanceVoList;
    }

    public void setInstanceVoList(List<DeployAppConfigInstanceVo> instanceVoList) {
        this.instanceVoList = instanceVoList;
    }

    public int getIsHasBuildTypeTool() {
        return isHasBuildTypeTool;
    }

    public void setIsHasBuildTypeTool(int isHasBuildTypeTool) {
        this.isHasBuildTypeTool = isHasBuildTypeTool;
    }

}
