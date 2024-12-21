package com.github.guobin211.rsxij;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.FileASTNode;
import com.intellij.lang.Language;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.psi.search.SearchScope;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RsxFile extends PsiFileBase {

    public RsxFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, RsxLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RsxFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Rsx File";
    }

}