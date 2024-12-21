package com.github.guobin211.rsxij;

import com.intellij.lang.Language;

public class RsxLanguage extends Language {
    public static final RsxLanguage INSTANCE = new RsxLanguage();

    private RsxLanguage() {
        super("rsx");
    }
}
