package org.example.config.impl;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:32
 */
import java.util.Collection;

/**
 * Interface that tags a ConfigValue that is not mergeable until after
 * substitutions are resolved. Basically these are special ConfigValue that
 * never appear in a resolved tree, like {@link ConfigSubstitution} and
 * {@link ConfigDelayedMerge}.
 */
interface Unmergeable {
    Collection<? extends AbstractConfigValue> unmergedValues();
}
