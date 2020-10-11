package org.example.config.impl;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:27
 */

import java.util.Collection;

/**
 * Status of substitution resolution.
 */
enum ResolveStatus {
    UNRESOLVED, RESOLVED;

    final static ResolveStatus fromValues(
            Collection<? extends AbstractConfigValue> values) {
        for (AbstractConfigValue v : values) {
            if (v.resolveStatus() == ResolveStatus.UNRESOLVED)
                return ResolveStatus.UNRESOLVED;
        }
        return ResolveStatus.RESOLVED;
    }

    final static ResolveStatus fromBoolean(boolean resolved) {
        return resolved ? ResolveStatus.RESOLVED : ResolveStatus.UNRESOLVED;
    }
}
