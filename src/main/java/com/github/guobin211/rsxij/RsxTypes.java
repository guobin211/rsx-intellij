package com.github.guobin211.rsxij;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class RsxTypes {
    public static final @NotNull IElementType BAD_CHARACTER = new RsxElementType("BAD_CHARACTER");
    public static final @NotNull IElementType WHITESPACE = new RsxElementType("WHITESPACE");

    public static final @NotNull IElementType RUST_CODE = new RsxElementType("RUST_CODE");
    public static final @NotNull IElementType JS_CODE = new RsxElementType("JS_CODE");
    public static final @NotNull IElementType HTML_CODE = new RsxElementType("HTML_CODE");
    public static final @NotNull IElementType CSS_CODE = new RsxElementType("CSS_CODE");

    public static final @NotNull IElementType RUST_START = new RsxElementType("RUST_START");
    public static final @NotNull IElementType RUST_END = new RsxElementType("RUST_END");
    public static final @NotNull IElementType CSS_START = new RsxElementType("CSS_START");
    public static final @NotNull IElementType JS_START = new RsxElementType("JS_START");
    public static final @NotNull IElementType CSS_END = new RsxElementType("CSS_END");
    public static final @NotNull IElementType JS_END = new RsxElementType("JS_END");
    public static final @NotNull IElementType HTML_START = new RsxElementType("HTML_START");
    public static final @NotNull IElementType HTML_END = new RsxElementType("HTML_END");

    public static final @NotNull IElementType COMMENT = new RsxElementType("COMMENT");
}
