package org.example.core.plugin;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xiese
 * @Description 插件
 * @Email xiesen310@163.com
 * @Date 2020/10/11 17:36
 */
public interface Plugin<T> extends Serializable {
    String RESULT_TABLE_NAME = "result_table_name";
    String SOURCE_TABLE_NAME = "source_table_name";
    String PARALLELISM_NAME = "parallelism";

    /**
     * 获取额外配置
     *
     * @return
     */
    Map<String, Object> getExtConfig();

    /**
     * 赋值额外的配置
     *
     * @param extConfig
     */
    void setExtConfig(Map<String, Object> extConfig);

    /**
     * 获取配置
     *
     * @return
     */
//    Config getConfig();

    /**
     * 设置配置
     *
     * @param config
     */
//    void setConfig(Config config);

    /**
     * 检查配置
     *
     * @return
     */
    CheckResult checkConfig();

    /**
     * 初始化
     *
     * @param prepareEnv
     */
    void prepare(T prepareEnv);
}
