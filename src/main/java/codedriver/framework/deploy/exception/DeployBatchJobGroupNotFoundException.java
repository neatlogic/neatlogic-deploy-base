/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/2 9:55 上午
 */
public class DeployBatchJobGroupNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 9159259200526197969L;

    public DeployBatchJobGroupNotFoundException(Long id) {
        super("批量发布分组：" + id + "不存在");
    }
}
