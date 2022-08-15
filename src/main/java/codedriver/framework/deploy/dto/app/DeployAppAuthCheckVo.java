/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */
package codedriver.framework.deploy.dto.app;

import codedriver.framework.asynchronization.threadlocal.UserContext;
import codedriver.framework.dto.AuthenticationInfoVo;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DeployAppAuthCheckVo {

    private Long appSystemId;
    private List<String> authorityActionList;
    private List<String> authUuidList;
    private List<DeployAppConfigAuthorityActionVo> actionVoList;

    public DeployAppAuthCheckVo(Long appSystemId, Set<String> authorityActionList) {
        this.appSystemId = appSystemId;
        this.authorityActionList = new ArrayList<>(authorityActionList);
    }

    public DeployAppAuthCheckVo(Long appSystemId, List<DeployAppConfigAuthorityActionVo> actionVoList) {
        this.appSystemId = appSystemId;
        this.actionVoList = actionVoList;
    }
    public DeployAppAuthCheckVo(){
    }

    public Long getAppSystemId() {
        return appSystemId;
    }

    public void setAppSystemId(Long appSystemId) {
        this.appSystemId = appSystemId;
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
        if (CollectionUtils.isEmpty(authorityActionList) && CollectionUtils.isNotEmpty(actionVoList)) {
            authorityActionList = actionVoList.stream().map(DeployAppConfigAuthorityActionVo::getAction).collect(Collectors.toList());
        }
        return authorityActionList;
    }

    public void setAuthorityActionList(List<String> authorityActionList) {
        this.authorityActionList = authorityActionList;
    }

    public List<DeployAppConfigAuthorityActionVo> getActionVoList() {
        return actionVoList;
    }

    public void setActionVoList(List<DeployAppConfigAuthorityActionVo> actionVoList) {
        this.actionVoList = actionVoList;
    }
}

