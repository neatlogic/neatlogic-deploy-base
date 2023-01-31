/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.deploy.constvalue.PipelineType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

public class PipelineVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "类型", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "类型名", type = ApiParamType.STRING)
    private String typeName;
    @EntityField(name = "应用ID", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用名称", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "应用简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "创建时间", type = ApiParamType.LONG)
    private Date fcd;
    @EntityField(name = "创建用户", type = ApiParamType.STRING)
    private String fcu;
    @EntityField(name = "修改时间", type = ApiParamType.LONG)
    private Date lcd;
    @EntityField(name = "修改用户", type = ApiParamType.STRING)
    private String lcu;
    @EntityField(name = "通道列表", type = ApiParamType.JSONARRAY)
    private List<PipelineLaneVo> laneList;
    @EntityField(name = "授权列表", type = ApiParamType.JSONARRAY)
    private List<PipelineAuthVo> authList;
    //目前用于创建批量作业
    @EntityField(name = "是否拥有BUILD类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;
    @EntityField(name = "是否拥有DEPLOY类型的工具库工具", type = ApiParamType.INTEGER)
    private int isHasDeployTypeTool = 0;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
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

    public List<PipelineLaneVo> getLaneList() {
        return laneList;
    }

    public void setLaneList(List<PipelineLaneVo> laneList) {
        this.laneList = laneList;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        if (StringUtils.isBlank(typeName) && StringUtils.isNotBlank(type)) {
            typeName = PipelineType.getText(type);
        }
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public String getAppSystemName() {
        return appSystemName;
    }

    public void setAppSystemName(String appSystemName) {
        this.appSystemName = appSystemName;
    }

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public String getFcu() {
        return fcu;
    }

    public void setFcu(String fcu) {
        this.fcu = fcu;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    public List<PipelineAuthVo> getAuthList() {
        return authList;
    }

    public void setAuthList(List<PipelineAuthVo> authList) {
        this.authList = authList;
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
