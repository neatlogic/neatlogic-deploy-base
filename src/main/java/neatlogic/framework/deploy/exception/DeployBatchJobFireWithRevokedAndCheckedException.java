/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author lvzk
 * @date 2022/8/2 9:55 上午
 */
public class DeployBatchJobFireWithRevokedAndCheckedException extends ApiRuntimeException {

    private static final long serialVersionUID = 2949252138258270630L;

    public DeployBatchJobFireWithRevokedAndCheckedException() {
        super("无法执行，批量执行的作业都是'已撤销'或'已验证'的作业");
    }
}
