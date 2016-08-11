package com.q.ide;

import com.intellij.lang.Language;

/**
 * Author: binghuang
 * Date: 8/11/16
 * Time: 6:50 PM
 */
public class QLanguae extends Language{
    public static final QLanguae INSTANCE = new QLanguae();

    private QLanguae() {
        super("Qlang");
    }
}
