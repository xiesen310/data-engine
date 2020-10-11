package org.example.core.plugin;

import lombok.Data;

/**
 * @author xiese
 * @Description CheckResult
 * @Email xiesen310@163.com
 * @Date 2020/10/11 17:36
 */
@Data
public class CheckResult {
    private boolean success;

    private String msg;

    public CheckResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }
}
