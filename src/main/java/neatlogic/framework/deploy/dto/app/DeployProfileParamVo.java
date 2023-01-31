/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.autoexec.dto.AutoexecParamVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class DeployProfileParamVo extends AutoexecParamVo {

    @JSONField(serialize = false)
    @EntityField(name = "来源", type = ApiParamType.STRING)
    private String source;
    @EntityField(name = "继承", type = ApiParamType.INTEGER)
    private Integer inherit;

    public DeployProfileParamVo() {

    }

    public DeployProfileParamVo(AutoexecParamVo autoexecParamVo) {
        super.setId(autoexecParamVo.getId());
        super.setKey(autoexecParamVo.getKey());
        super.setName(autoexecParamVo.getName());
        super.setDefaultValue(autoexecParamVo.getDefaultValue());
        super.setMode(autoexecParamVo.getMode());
        super.setType(autoexecParamVo.getType());
        super.setIsRequired(autoexecParamVo.getIsRequired());
        super.setDescription(autoexecParamVo.getDescription());
        super.setSort(autoexecParamVo.getSort());
        super.setValidate(autoexecParamVo.getValidate());
        super.setOperationId(autoexecParamVo.getOperationId());
        super.setOperationType(autoexecParamVo.getOperationType());
        if (autoexecParamVo.getConfig() != null) {
            super.setConfig(JSONObject.toJSONString(autoexecParamVo.getConfig()));

        }
        super.setArgumentCount(autoexecParamVo.getArgumentCount());
        super.setMappingMode(autoexecParamVo.getMappingMode());
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getInherit() {
        return inherit;
    }

    public void setInherit(Integer inherit) {
        this.inherit = inherit;
    }
}
