/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;

public class DeployAppConfigResourceVo extends BaseEditorVo {
    private static final long serialVersionUID = 8079670497813410203L;
    @EntityField(name = "应用系统id", type = ApiParamType.LONG)
    private Long appSystemId;
    @EntityField(name = "应用系统名", type = ApiParamType.STRING)
    private String appSystemName;
    @EntityField(name = "是否被收藏", type = ApiParamType.INTEGER)
    private Integer isFavorite;
    @EntityField(name = "是否已配置", type = ApiParamType.INTEGER)
    private Integer isConfig;

    public Integer getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
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

    public Integer getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Integer isConfig) {
        this.isConfig = isConfig;
    }
}
