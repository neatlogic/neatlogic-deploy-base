package codedriver.framework.deploy.constvalue;

import codedriver.framework.common.constvalue.IEnum;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author longrf
 * @date 2022/7/12 9:40 上午
 */
public enum BuildNoStatus implements IEnum {
    PENDING("pending", "待编译"),
    COMPILING("compiling", " 编译中"),
    COMPILED("compiled", "已编译"),
    COMPILE_FAILED("compile-failed", "编译失败"),
    RELEASING("releasing", "释放中"),
    RELEASE_FAILED("release-failed", "释放失败"),
    RELEASED("released", "已释放");

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
        return text;
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
