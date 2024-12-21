// This is a generated file. Not intended for manual editing.
package com.github.guobin211.rsxij;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.RsxTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RsxParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return rsxFile(b, l + 1);
  }

  /* ********************************************************** */
  // CSS_START cssCode CSS_END
  public static boolean cssBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cssBlock")) return false;
    if (!nextTokenIs(b, CSS_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CSS_START);
    r = r && cssCode(b, l + 1);
    r = r && consumeToken(b, CSS_END);
    exit_section_(b, m, CSS_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // {ANY_CHARACTER}*
  public static boolean cssCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cssCode")) return false;
    Marker m = enter_section_(b, l, _NONE_, CSS_CODE, "<css code>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ANY_CHARACTER)) break;
      if (!empty_element_parsed_guard_(b, "cssCode", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // HTML_START htmlCode HTML_END
  public static boolean htmlBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htmlBlock")) return false;
    if (!nextTokenIs(b, HTML_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML_START);
    r = r && htmlCode(b, l + 1);
    r = r && consumeToken(b, HTML_END);
    exit_section_(b, m, HTML_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // {ANY_CHARACTER}*
  public static boolean htmlCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htmlCode")) return false;
    Marker m = enter_section_(b, l, _NONE_, HTML_CODE, "<html code>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ANY_CHARACTER)) break;
      if (!empty_element_parsed_guard_(b, "htmlCode", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // JS_START jsCode JS_END
  public static boolean jsBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jsBlock")) return false;
    if (!nextTokenIs(b, JS_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JS_START);
    r = r && jsCode(b, l + 1);
    r = r && consumeToken(b, JS_END);
    exit_section_(b, m, JS_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // {ANY_CHARACTER}*
  public static boolean jsCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jsCode")) return false;
    Marker m = enter_section_(b, l, _NONE_, JS_CODE, "<js code>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ANY_CHARACTER)) break;
      if (!empty_element_parsed_guard_(b, "jsCode", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // rustBlock ws jsBlock ws htmlBlock ws cssBlock
  static boolean rsxFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rsxFile")) return false;
    if (!nextTokenIs(b, RUST_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rustBlock(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && jsBlock(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && htmlBlock(b, l + 1);
    r = r && ws(b, l + 1);
    r = r && cssBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RUST_START rustCode RUST_END
  public static boolean rustBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rustBlock")) return false;
    if (!nextTokenIs(b, RUST_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RUST_START);
    r = r && rustCode(b, l + 1);
    r = r && consumeToken(b, RUST_END);
    exit_section_(b, m, RUST_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // {ANY_CHARACTER}*
  public static boolean rustCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rustCode")) return false;
    Marker m = enter_section_(b, l, _NONE_, RUST_CODE, "<rust code>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ANY_CHARACTER)) break;
      if (!empty_element_parsed_guard_(b, "rustCode", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // WHITESPACE*
  public static boolean ws(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ws")) return false;
    Marker m = enter_section_(b, l, _NONE_, WS, "<ws>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, WHITESPACE)) break;
      if (!empty_element_parsed_guard_(b, "ws", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

}
