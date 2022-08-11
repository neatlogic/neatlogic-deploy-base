/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.dto.app;

import codedriver.framework.asynchronization.threadlocal.UserContext;
import codedriver.framework.auth.core.AuthActionChecker;
import codedriver.framework.deploy.auth.DEPLOY_MODIFY;
import codedriver.framework.dto.AuthenticationInfoVo;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class DeployAppAuthCheckVo {

    private Long appSystemId;
    private List<String> authorityActionList;
    private List<String> authUuidList;
    private Integer isHasAllAuthority;

    public DeployAppAuthCheckVo(Long appSystemId, List<String> authorityActionList) {
        this.appSystemId = appSystemId;
        this.authorityActionList = authorityActionList;
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
    }

    public Integer getIsHasAllAuthority() {
        if (isHasAllAuthority == null) {
            if (AuthActionChecker.check(DEPLOY_MODIFY.class)) {
                isHasAllAuthority = 1;
            } else {
                isHasAllAuthority = 0;
            }
        }
        return isHasAllAuthority;
    }

    public void setIsHasAllAuthority(Integer isHasAllAuthority) {
        this.isHasAllAuthority = isHasAllAuthority;
    }

    public List<String> getAuthUuidList() {
        if (CollectionUtils.isEmpty(authUuidList)) {
            authUuidList = new ArrayList<>();
            AuthenticationInfoVo authInfo = UserContext.get().getAuthenticationInfoVo();
            authUuidList.add(authInfo.getUserUuid());
            if (CollectionUtils.isNotEmpty(authInfo.getTeamUuidList())) {
                authUuidList.addAll(authInfo.getTeamUuidList());
            }
            if (CollectionUtils.isNotEmpty(authInfo.getRoleUuidList())) {
                authUuidList.addAll(authInfo.getRoleUuidList());
            }
        }
        return authUuidList;
    }

    public void setAuthUuidList(List<String> authUuidList) {
        this.authUuidList = authUuidList;
    }

    public List<String> getAuthorityActionList() {
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }
}

