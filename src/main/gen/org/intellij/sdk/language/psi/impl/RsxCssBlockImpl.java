// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.RsxTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class RsxCssBlockImpl extends ASTWrapperPsiElement implements RsxCssBlock {

  public RsxCssBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsxVisitor visitor) {
    visitor.visitCssBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsxVisitor) accept((RsxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsxCssCode getCssCode() {
    return findNotNullChildByClass(RsxCssCode.class);
  }

}
