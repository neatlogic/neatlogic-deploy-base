package neatlogic.framework.deploy.constvalue;

import neatlogic.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.util.I18nUtils;

import java.util.List;

/**
 * @author longrf
 * @date 2022/7/12 9:40 上午
 */
public enum BuildNoStatus implements IEnum {
    PENDING("pending", "enum.deploy.buildnostatus.pending"),
    COMPILING("compiling", " enum.deploy.buildnostatus.compiling"),
    COMPILED("compiled", "enum.deploy.buildnostatus.compiled"),
    COMPILE_FAILED("compile-failed", "enum.deploy.buildnostatus.compile_failed"),
    RELEASING("releasing", "enum.deploy.buildnostatus.releasing"),
    RELEASE_FAILED("release-failed", "enum.deploy.buildnostatus.release_failed"),
    RELEASED("released", "enum.deploy.buildnostatus.released");

    private final String status;
    private final String text;

    BuildNoStatus(String status, String text) {
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
        for (BuildNoStatus s : BuildNoStatus.values()) {
            if (s.getValue().equals(_status)) {
                return s.getText();
            }
        }
        return "";
    }

    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (BuildNoStatus type : values()) {
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
