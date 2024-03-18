/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/
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

