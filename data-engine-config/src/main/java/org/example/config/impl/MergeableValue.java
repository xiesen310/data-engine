package org.example.config.impl;

import org.example.config.ConfigMergeable;
import org.example.config.ConfigValue;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:22
 */
interface MergeableValue extends ConfigMergeable {
    // converts a Config to its root object and a ConfigValue to itself
    ConfigValue toFallbackValue();
}

