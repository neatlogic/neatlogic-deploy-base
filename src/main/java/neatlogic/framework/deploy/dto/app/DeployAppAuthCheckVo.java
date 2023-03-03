/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

