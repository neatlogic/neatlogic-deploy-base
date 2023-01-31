/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

import java.io.Serializable;

public class DeployPipelineExecuteConfigVo implements Serializable {

    @EntityField(name = "协议id", type = ApiParamType.LONG)
    private Long protocolId;
    @EntityField(name = "执行用户", type = ApiParamType.STRING)
    private String executeUser;
    @EntityField(name = "重载", type = ApiParamType.INTEGER)
    private Integer inherit;

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    public Integer getInherit() {
        return inherit;
    }

    public void setInherit(Integer inherit) {
        this.inherit = inherit;
    }
}
