package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.util.I18nUtils;

import java.util.List;

/**
 * @author longrf
 * @date 2022/7/11 6:36 下午
 */
public enum VersionEnvStatus implements IEnum {
    PENDING("pending", "enum.deploy.versionenvstatus.pending"),
    RELEASING("releasing", "enum.deploy.versionenvstatus.releasing"),
    RELEASE_FAILED("release-failed", "enum.deploy.versionenvstatus.release_failed"),
    RELEASED("released", "enum.deploy.versionenvstatus.released");

    private final String status;
    private final String text;

    VersionEnvStatus(String status, String text) {
        this.status = status;
        this.text = text;
    }

    public String getValue() {
        return status;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

    public static String getText(String _status) {
        for (VersionEnvStatus s : VersionEnvStatus.values()) {
            if (s.getValue().equals(_status)) {
                return s.getText();
            }
        }
        return "";
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (VersionEnvStatus type : values()) {
            array.add(new JSONObject() {
                {
                    this.put("value", type.getValue());
                    this.put("text", type.getText());
                }
            });
        }
        return array;
    }
}
