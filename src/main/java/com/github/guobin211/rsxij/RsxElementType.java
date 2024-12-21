package com.github.guobin211.rsxij;

import com.intellij.psi.tree.IElementType;

public class RsxElementType extends IElementType {
    public RsxElementType(String rustCode) {
        super(rustCode, RsxLanguage.INSTANCE);
    }
}
