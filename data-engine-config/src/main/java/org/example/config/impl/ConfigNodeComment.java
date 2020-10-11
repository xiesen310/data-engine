package org.example.config.impl;

import org.example.config.ConfigException;

/**
 * @author xiese
 * @Description TODO
 * @Email xiesen310@163.com
 * @Date 2020/10/11 18:15
 */

final class ConfigNodeComment extends ConfigNodeSingleToken {
    ConfigNodeComment(Token comment) {
        super(comment);
        if (!Tokens.isComment(super.token)) {
            throw new ConfigException.BugOrBroken("Tried to create a ConfigNodeComment from a non-comment token");
        }
    }

    protected String commentText() {
        return Tokens.getCommentText(super.token);
    }
}
