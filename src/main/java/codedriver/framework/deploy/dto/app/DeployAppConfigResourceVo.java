/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.cmdb.dto.resourcecenter.ResourceVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

public class DeployAppConfigResourceVo extends ResourceVo {
    private static final long serialVersionUID = 8079670497813410203L;
    @EntityField(name = "是否被收藏", type = ApiParamType.INTEGER)
    private Integer isFavorite;

    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }
}
