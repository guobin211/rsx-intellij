// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.github.guobin211.rsxij.RsxElementType;
import com.github.guobin211.rsxij.RsxTokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface RsxTypes {

  IElementType CSS_BLOCK = new RsxElementType("CSS_BLOCK");
  IElementType CSS_CODE = new RsxElementType("CSS_CODE");
  IElementType HTML_BLOCK = new RsxElementType("HTML_BLOCK");
  IElementType HTML_CODE = new RsxElementType("HTML_CODE");
  IElementType JS_BLOCK = new RsxElementType("JS_BLOCK");
  IElementType JS_CODE = new RsxElementType("JS_CODE");
  IElementType RUST_BLOCK = new RsxElementType("RUST_BLOCK");
  IElementType RUST_CODE = new RsxElementType("RUST_CODE");
  IElementType WS = new RsxElementType("WS");

  IElementType ANY_CHARACTER = new RsxTokenType("ANY_CHARACTER");
  IElementType CSS_END = new RsxTokenType("CSS_END");
  IElementType CSS_START = new RsxTokenType("CSS_START");
  IElementType HTML_END = new RsxTokenType("HTML_END");
  IElementType HTML_START = new RsxTokenType("HTML_START");
  IElementType JS_END = new RsxTokenType("JS_END");
  IElementType JS_START = new RsxTokenType("JS_START");
  IElementType RUST_END = new RsxTokenType("RUST_END");
  IElementType RUST_START = new RsxTokenType("RUST_START");
  IElementType WHITESPACE = new RsxTokenType("WHITESPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CSS_BLOCK) {
        return new RsxCssBlockImpl(node);
      }
      else if (type == CSS_CODE) {
        return new RsxCssCodeImpl(node);
      }
      else if (type == HTML_BLOCK) {
        return new RsxHtmlBlockImpl(node);
      }
      else if (type == HTML_CODE) {
        return new RsxHtmlCodeImpl(node);
      }
      else if (type == JS_BLOCK) {
        return new RsxJsBlockImpl(node);
      }
      else if (type == JS_CODE) {
        return new RsxJsCodeImpl(node);
      }
      else if (type == RUST_BLOCK) {
        return new RsxRustBlockImpl(node);
      }
      else if (type == RUST_CODE) {
        return new RsxRustCodeImpl(node);
      }
      else if (type == WS) {
        return new RsxWsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
