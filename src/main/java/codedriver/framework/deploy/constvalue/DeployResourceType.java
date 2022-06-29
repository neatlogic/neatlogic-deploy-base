package codedriver.framework.deploy.constvalue;

/**
 * 版本制品类型 todo 名称待定
 *
 * @author laiwt
 * @date 2022/06/29 4:16 下午
 */
public enum DeployResourceType {
    VERSION_RESOURCE("version_product", "版本制品"),
    ENV_RESOURCE("env_product", "环境制品"),
    DIFF_DIRECTORY("diff_directory", "差异目录"),
    SQL_SCRIPT("sql_script", "SQL脚本");

    private final String value;
    private final String text;

    DeployResourceType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
