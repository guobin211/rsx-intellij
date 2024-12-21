package com.github.guobin211.rsxij;

import com.intellij.psi.tree.IElementType;

public class RsxTokenType extends IElementType {
    public RsxTokenType(String debugName) {
        super(debugName, RsxLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "RsxTokenType." + super.toString();
    }
}
