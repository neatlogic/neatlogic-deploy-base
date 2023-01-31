package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.deploy.dto.app.DeployAppConfigAuthorityActionVo;
import neatlogic.framework.deploy.exception.DeployAppAuthActionIrregularException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lvzk
 * @date 2022/05/24 4:16 下午
 */
public enum DeployAppConfigActionType {
    OPERATION("operation", "操作"),
    SCENARIO("scenario", "场景"),
    ENV("env", "环境");

    private final String value;
    private final String text;

    DeployAppConfigActionType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static List<JSONObject> getValueTextList() {
        List<JSONObject> returnList = new ArrayList<>();
        for (DeployAppConfigActionType action : DeployAppConfigActionType.values()) {
            returnList.add(new JSONObject() {
                private static final long serialVersionUID = 1670544546905960015L;

                {
                    this.put("value", action.getValue());
                    this.put("text", action.getText());
                }
            });
        }
        return returnList;
    }

    public static List<String> getValueList() {
        List<String> returnList = new ArrayList<>();
        for (DeployAppConfigActionType action : DeployAppConfigActionType.values()) {
            returnList.add(action.getValue());
        }
        return returnList;
    }

    /**
     * 批量将带有operation#、scenario#、env# 前缀的转为 DeployAppConfigAuthorityActionVo类
     *
     * @param paramActionList 权限信息字符串列表
     * @return 权限actionVo列表
     */
    public static List<DeployAppConfigAuthorityActionVo> getActionVoList(List<String> paramActionList) {
        List<DeployAppConfigAuthorityActionVo> returnList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(paramActionList)) {
            for (String action : paramActionList) {
                String[] actionString = action.split("#");
                if (actionString.length < 2) {
                    throw new DeployAppAuthActionIrregularException(action);
                }
                String returnActionType = actionString[0];
                String returnAction = actionString[1];
                if (!getValueList().contains(returnActionType) || StringUtils.isEmpty(returnAction)) {
                    throw new DeployAppAuthActionIrregularException(action);
                }
                returnList.add(new DeployAppConfigAuthorityActionVo(returnAction, returnActionType));
            }
        }
        return returnList;
    }

    /**
     * 批量将带有operation#、scenario#、env# 前缀去掉
     *
     * @param paramActionList 权限信息字符串列表
     * @return 权限actionVo列表
     */
    public static Set<String> getActionList(List<String> paramActionList) {
        Set<String> returnSet = new HashSet<>();
        if (CollectionUtils.isNotEmpty(paramActionList)) {
            for (String action : paramActionList) {
                String[] actionString = action.split("#");
                if (actionString.length < 2) {
                    throw new DeployAppAuthActionIrregularException(action);
                }
                String returnActionType = actionString[0];
                String returnAction = actionString[1];
                if (!getValueList().contains(returnActionType) || StringUtils.isEmpty(returnAction)) {
                    throw new DeployAppAuthActionIrregularException(action);
                }
                returnSet.add(returnAction);
            }
        }
        return returnSet;
    }


    /**
     * 将带有operation#、scenario#、env# 前缀去掉
     *
     * @param paramAction 权限信息字符串
     * @return 权限action
     */
    public static String getAction(String paramAction) {
        String[] actionString = paramAction.split("#");
        if (actionString.length < 2) {
            throw new DeployAppAuthActionIrregularException(paramAction);
        }
        return actionString[1];
    }
}
