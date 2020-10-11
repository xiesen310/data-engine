package org.example.core.env;

import org.example.core.apis.BaseSink;
import org.example.core.apis.BaseSource;
import org.example.core.apis.BaseTransform;
import org.example.core.plugin.Plugin;

import java.util.List;

/**
 * @author xiese
 * @Description Execution
 * @Email xiesen310@163.com
 * @Date 2020/10/11 17:36
 */
public interface Execution<SR extends BaseSource, TF extends BaseTransform, SK extends BaseSink> extends Plugin<Void> {
    /**
     * 启动
     *
     * @param sources
     * @param transforms
     * @param sinks
     */
    void start(List<SR> sources, List<TF> transforms, List<SK> sinks);

    /**
     * 启动未执行
     *
     * @param sources
     * @param transforms
     * @param sinks
     */
    void startWithOutExecute(List<SR> sources, List<TF> transforms, List<SK> sinks);
}