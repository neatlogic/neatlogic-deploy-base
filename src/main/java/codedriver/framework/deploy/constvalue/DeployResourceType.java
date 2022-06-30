package codedriver.framework.deploy.constvalue;

/**
 * 版本制品类型 todo 名称待定
 *
 * @author laiwt
 * @date 2022/06/29 4:16 下午
 */
public enum DeployResourceType {
    VERSION_RESOURCE("version_product", "版本制品", "app"),
    ENV_RESOURCE("env_product", "环境制品", "app"),
    DIFF_DIRECTORY("diff_directory", "差异目录", "app.ins"),
    SQL_SCRIPT("sql_script", "SQL脚本", "db");

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
        return text;
    }

    public String getDirectoryName() {
        return directoryName;
    }


}
