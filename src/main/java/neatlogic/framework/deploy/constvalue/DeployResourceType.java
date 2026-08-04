package neatlogic.framework.deploy.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;

import java.util.List;

/**
 * 版本制品类型
 *
 * @author laiwt
 * @date 2022/06/29 4:16 下午
 */
public enum DeployResourceType implements IEnum {
    BUILD_PRODUCT("build_product", "nfdc.deployresourcetype.text.build_product", "app"),
    BUILD_SQL_SCRIPT("build_sql_script", "nfdc.deployresourcetype.text.build_sql_script", "db"),
    ENV_PRODUCT("env_product", "nfdc.deployresourcetype.text.env_product", "app"),
    ENV_DIFF_DIRECTORY("env_diff_directory", "nfdc.deployresourcetype.text.env_diff_directory", "app.ins"),
    ENV_SQL_SCRIPT("env_sql_script", "nfdc.deployresourcetype.text.env_sql_script", "db"),
    MIRROR_PRODUCT("mirror_product", "nfdc.deployresourcetype.text.mirror_product", "app"),
    MIRROR_DIFF("mirror_diff", "nfdc.deployresourcetype.text.mirror_diff", "app.ins"),
    WORKSPACE("workspace", "nfdc.deployresourcetype.text.workspace", "workspace"),
    ;

    private final String value;
    private final String text;
    private final String directoryName; // runner中实际的目录名称

    DeployResourceType(String value, String text, String directoryName) {
        this.value = value;
        this.text = text;
        this.directoryName = directoryName;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public static DeployResourceType getDeployResourceType(String value) {
        for (DeployResourceType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }


    @Override
    public List getValueTextList() {
        JSONArray array = new JSONArray();
        for (DeployResourceType type : values()) {
            JSONObject json = new JSONObject();
            json.put("value", type.getValue());
            json.put("text", type.getText());
            array.add(json);
        }
        return array;
    }
}
