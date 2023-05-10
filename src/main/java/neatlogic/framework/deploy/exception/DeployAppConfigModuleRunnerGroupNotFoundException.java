/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
 */

package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;
import org.apache.commons.lang3.StringUtils;

public class DeployAppConfigModuleRunnerGroupNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 6333597401986892305L;

    public DeployAppConfigModuleRunnerGroupNotFoundException(String appSystem, String systemModule) {
        super("exception.deploy.deployappconfigmodulerunnergroupnotfoundexception", (StringUtils.isBlank(appSystem) ? StringUtils.EMPTY : appSystem), (StringUtils.isBlank(systemModule) ? StringUtils.EMPTY : systemModule));
    }
}
