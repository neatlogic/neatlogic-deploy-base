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

package neatlogic.framework.deploy.dto.pipeline;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.deploy.constvalue.PipelineType;
import neatlogic.framework.deploy.dto.app.DeployAppConfigVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

public class PipelineVo {
    @EntityField(name = "nfddp.pipelinevo.id.name", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "nfddp.pipelinevo.name.name", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "nfddp.pipelinevo.isactive.name", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "nfddp.pipelinevo.type.name", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "nfddp.pipelinevo.typename.name", type = ApiParamType.STRING)
    private String typeName;
    @EntityField(name = "nfddp.pipelinevo.appsystemid.name", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "nfddp.pipelinevo.appsystemname.name", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "nfddp.pipelinevo.appsystemabbrname.name", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "nfddp.pipelinevo.fcd.name", type = ApiParamType.LONG)
    private Date fcd;
    @EntityField(name = "nfddp.pipelinevo.fcu.name", type = ApiParamType.STRING)
    private String fcu;
    @EntityField(name = "nfddp.pipelinevo.lcd.name", type = ApiParamType.LONG)
    private Date lcd;
    @EntityField(name = "nfddp.pipelinevo.lcu.name", type = ApiParamType.STRING)
    private String lcu;
    @EntityField(name = "nfddp.pipelinevo.lanelist.name", type = ApiParamType.JSONARRAY)
    private List<PipelineLaneVo> laneList;
    @EntityField(name = "nfddp.pipelinevo.authlist.name", type = ApiParamType.JSONARRAY)
    private List<PipelineAuthVo> authList;
    //目前用于创建批量作业
    @EntityField(name = "nfddp.pipelinevo.ishasbuildtypetool.name", type = ApiParamType.INTEGER)
    private int isHasBuildTypeTool = 0;
    @EntityField(name = "nfddp.pipelinevo.ishasdeploytypetool.name", type = ApiParamType.INTEGER)
    private int isHasDeployTypeTool = 0;
    @EntityField(name = "nfddp.pipelinevo.appconfiglist.name", type = ApiParamType.JSONARRAY)
    private List<DeployAppConfigVo> appConfigList;
    @EntityField(name = "nfddp.pipelinevo.defaultversion.name", type = ApiParamType.STRING)
    private String  defaultVersion;

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

    public List<DeployAppConfigVo> getAppConfigList() {
        return appConfigList;
    }

    public void setAppConfigList(List<DeployAppConfigVo> appConfigList) {
        this.appConfigList = appConfigList;
    }

    public String getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }
}
