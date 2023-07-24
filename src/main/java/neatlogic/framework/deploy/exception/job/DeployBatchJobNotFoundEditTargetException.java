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

package neatlogic.framework.deploy.exception.job;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

/**
 * @author lvzk
 * @date 2022/8/04 9:55 上午
 */
public class DeployBatchJobNotFoundEditTargetException extends NotFoundEditTargetException {

    private static final long serialVersionUID = 3138988475130730715L;

    public DeployBatchJobNotFoundEditTargetException(Long id) {
        super("批量发布作业：“{0}” 不存在", id);
    }
}
