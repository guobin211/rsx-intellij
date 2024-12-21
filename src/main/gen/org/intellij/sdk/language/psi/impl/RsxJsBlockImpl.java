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

public class RsxJsBlockImpl extends ASTWrapperPsiElement implements RsxJsBlock {

  public RsxJsBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsxVisitor visitor) {
    visitor.visitJsBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsxVisitor) accept((RsxVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsxJsCode getJsCode() {
    return findNotNullChildByClass(RsxJsCode.class);
  }

}
