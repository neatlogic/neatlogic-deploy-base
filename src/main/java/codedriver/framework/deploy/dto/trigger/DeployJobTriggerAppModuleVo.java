/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.trigger;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployJobTriggerAppModuleVo {
    @EntityField(name = "触发器id", type = ApiParamType.LONG)
    private Long triggerId;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统简称", type = ApiParamType.STRING)
    private String appSystemAbbrName;
    @EntityField(name = "应用系统简称", type = ApiParamType.STRING)
    private String appModuleAbbrName;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    private Long appModuleId;

    public Long getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Long triggerId) {
        this.triggerId = triggerId;
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

    public String getAppSystemAbbrName() {
        return appSystemAbbrName;
    }

    public void setAppSystemAbbrName(String appSystemAbbrName) {
        this.appSystemAbbrName = appSystemAbbrName;
    }

    public String getAppModuleAbbrName() {
        return appModuleAbbrName;
    }

    public void setAppModuleAbbrName(String appModuleAbbrName) {
        this.appModuleAbbrName = appModuleAbbrName;
    }
}
