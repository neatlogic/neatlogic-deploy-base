/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.dto.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeployProfileVo implements Serializable {

    private Long profileId;
    private String profileName;
    private List<DeployProfileParamVo> paramList;

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public List<DeployProfileParamVo> getParamList() {
        if (paramList == null) {
            paramList = new ArrayList<>();
        }
        return paramList;
    }

    public void setParamList(List<DeployProfileParamVo> paramList) {
        this.paramList = paramList;
    }
}
