package com.github.guobin211.rsxij;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class RsxLexerAdapter extends FlexAdapter {
    public RsxLexerAdapter() {
        super(new RsxLexer(null));
    }
}
