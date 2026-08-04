package neatlogic.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;
import neatlogic.framework.util.I18n;

import java.util.List;

/**
 * @author longrf
 * @date 2022/7/12 9:40 上午
 */
public enum BuildNoStatus implements IEnum {
    PENDING("pending", new I18n("nfdc.buildnostatus.text.pending")),
    COMPILING("compiling", new I18n("nfdc.buildnostatus.text.compiling")),
    COMPILED("compiled", new I18n("nfdc.buildnostatus.text.compiled")),
    COMPILE_FAILED("compile-failed", new I18n("nfdc.buildnostatus.text.compile_failed")),
    RELEASING("releasing", new I18n("nfdc.buildnostatus.text.releasing")),
    RELEASE_FAILED("release-failed", new I18n("nfdc.buildnostatus.text.release_failed")),
    RELEASED("released", new I18n("nfdc.buildnostatus.text.released"));

    private final String status;
    private final I18n text;

    BuildNoStatus(String status, I18n text) {
        this.status = status;
        this.text = text;
    }

    public String getValue() {
        return status;
    }

    public String getText() {
        return $.t(text.toString());
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
