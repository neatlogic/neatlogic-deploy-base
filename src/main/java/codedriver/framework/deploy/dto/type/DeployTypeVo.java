/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.dto.type;

import codedriver.framework.autoexec.dto.AutoexecTypeVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

/**
 * @author longrf
 * @date 2022/12/8 14:51
 */

public class DeployTypeVo extends AutoexecTypeVo {

    @EntityField(name = "是否激活(0:禁用，1：激活)", type = ApiParamType.INTEGER)
    private Integer isActive;

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
