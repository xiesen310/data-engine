package org.example.config.impl;

import org.example.config.ConfigIncluder;
import org.example.config.ConfigIncluderClasspath;
import org.example.config.ConfigIncluderFile;
import org.example.config.ConfigIncluderURL;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:22
 */
interface FullIncluder extends ConfigIncluder, ConfigIncluderFile, ConfigIncluderURL,
        ConfigIncluderClasspath {

}
