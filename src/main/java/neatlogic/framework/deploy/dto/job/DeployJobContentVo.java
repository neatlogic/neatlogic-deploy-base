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
