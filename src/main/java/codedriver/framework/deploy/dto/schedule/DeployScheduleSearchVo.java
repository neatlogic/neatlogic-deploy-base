/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.schedule;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

public class DeployScheduleSearchVo extends BasePageVo {
    @EntityField(name = "状态(0:禁用，1：启用)", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "应用id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;
    @EntityField(name = "是否拥有发布管理员权限", type = ApiParamType.INTEGER)
    private Integer isHasAllAuthority;
    @EntityField(name = "权限列表", type = ApiParamType.JSONARRAY)
    List<String> authorityActionList;
    @EntityField(name = "用户、分组、角色的uuid列表", type = ApiParamType.JSONARRAY)
    private List<String> authUuidList;

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public Integer getIsHasAllAuthority() {
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public List<String> getAuthUuidList() {
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }
}
