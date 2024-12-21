package com.github.guobin211.rsxij;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class RsxFileType extends LanguageFileType {
    public static final RsxFileType INSTANCE = new RsxFileType();

    private RsxFileType() {
        super(RsxLanguage.INSTANCE);
    }

    @Override
    public String getName() {
        return "rsx";
    }

    @Override
    public String getDescription() {
        return "rsx language file";
    }

    @Override
    public String getDefaultExtension() {
        return "rsx";
    }

    @Override
    public Icon getIcon() {
        return RsxIcons.FILE;
    }
}
