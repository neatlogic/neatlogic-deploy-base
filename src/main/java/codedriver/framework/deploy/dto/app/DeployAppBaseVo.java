/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;

import java.util.List;

/**
 * @author longrf
 * @date 2022/8/31 12:01
 */

public class DeployAppBaseVo extends BaseEditorVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    public Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    public String name;
    @EntityField(name = "简称", type = ApiParamType.STRING)
    public String abbrName;
    @EntityField(name = "维护窗口", type = ApiParamType.STRING)
    private List<String> maintenanceWindow;
    @EntityField(name = "状态id列表", type = ApiParamType.JSONARRAY)
    private List<Long> stateIdList;
    @EntityField(name = "负责人id列表", type = ApiParamType.JSONARRAY)
    private List<Long> ownerIdList;

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

    public List<String> getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(List<String> maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public List<Long> getStateIdList() {
        return stateIdList;
    }

    public void setStateIdList(List<Long> stateIdList) {
        this.stateIdList = stateIdList;
    }

    public List<Long> getOwnerIdList() {
        return ownerIdList;
    }

    public void setOwnerIdList(List<Long> ownerIdList) {
        this.ownerIdList = ownerIdList;
    }
}
