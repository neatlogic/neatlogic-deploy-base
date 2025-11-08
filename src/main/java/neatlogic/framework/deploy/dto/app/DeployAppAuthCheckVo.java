/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package neatlogic.framework.deploy.dto.app;

import neatlogic.framework.asynchronization.threadlocal.UserContext;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DeployAppAuthCheckVo {

    private Long appSystemId;
    private List<String> authorityActionList;
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
        return UserContext.get().getUuidList();
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

