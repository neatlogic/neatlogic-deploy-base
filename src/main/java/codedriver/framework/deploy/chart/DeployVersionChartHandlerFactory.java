/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.deploy.chart;

import codedriver.framework.applicationlistener.core.ModuleInitializedListenerBase;
import codedriver.framework.bootstrap.CodedriverWebApplicationContext;
import codedriver.framework.common.RootComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@RootComponent
public class DeployVersionChartHandlerFactory extends ModuleInitializedListenerBase {

    private static final Map<String, IDeployVersionChartHandler> handlerMap = new HashMap<>();

    public static IDeployVersionChartHandler getHandler(String handler) {
        return handlerMap.get(handler);
    }

    @Override
    public void onInitialized(CodedriverWebApplicationContext context) {
        Map<String, IDeployVersionChartHandler> map = context.getBeansOfType(IDeployVersionChartHandler.class);
        for (Entry<String, IDeployVersionChartHandler> entry : map.entrySet()) {
            handlerMap.put(entry.getValue().getMenu(), entry.getValue());
        }
    }

    @Override
    protected void myInit() {

    }

}
