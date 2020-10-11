package org.example.config.impl;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:25
 */
/**
 * Implemented by a merge stack (ConfigDelayedMerge, ConfigDelayedMergeObject)
 * that replaces itself during substitution resolution in order to implement
 * "look backwards only" semantics.
 */
interface ReplaceableMergeStack extends Container {
    /**
     * Make a replacement for this object skipping the given number of elements
     * which are lower in merge priority.
     */
    AbstractConfigValue makeReplacement(ResolveContext context, int skipping);
}

