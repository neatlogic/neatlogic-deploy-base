/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.deploy.dto.job;

import neatlogic.framework.util.Md5Util;

/**
 * @author lvzk
 * @since 2021/7/15 11:46
 **/
public class DeployJobContentVo {
    private String hash;
    private String content;

    public DeployJobContentVo() {
    }

    public DeployJobContentVo(String content) {
        this.hash = Md5Util.encryptMD5(content);
        this.content = content;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
