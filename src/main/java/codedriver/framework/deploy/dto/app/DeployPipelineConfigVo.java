/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.autoexec.dto.combop.AutoexecCombopConfigVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

import java.util.ArrayList;
import java.util.List;

public class DeployPipelineConfigVo extends AutoexecCombopConfigVo {

    @EntityField(name = "重载预置参数集列表", type = ApiParamType.JSONARRAY)
    private List<DeployProfileVo> overrideProfileList;

    public List<DeployProfileVo> getOverrideProfileList() {
        if (overrideProfileList == null) {
            overrideProfileList = new ArrayList<>();
        }
        return overrideProfileList;
    }

    public void setOverrideProfileList(List<DeployProfileVo> overrideProfileList) {
        this.overrideProfileList = overrideProfileList;
    }

}
