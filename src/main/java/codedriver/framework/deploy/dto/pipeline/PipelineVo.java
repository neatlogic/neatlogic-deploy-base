/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.pipeline;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;

import java.util.Date;
import java.util.List;

public class PipelineVo extends BasePageVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "创建时间", type = ApiParamType.LONG)
    private Date fcd;
    @EntityField(name = "创建用户", type = ApiParamType.STRING)
    private String fcu;
    @EntityField(name = "修改时间", type = ApiParamType.LONG)
    private Long lcd;
    @EntityField(name = "修改用户", type = ApiParamType.STRING)
    private String lcu;
    @EntityField(name = "通道列表", type = ApiParamType.JSONARRAY)
    private List<PipelineLaneVo> laneList;
    @EntityField(name = "授权列表", type = ApiParamType.JSONARRAY)
    private List<PipelineAuthVo> authList;

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

    public Long getLcd() {
        return lcd;
    }

    public void setLcd(Long lcd) {
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
}
