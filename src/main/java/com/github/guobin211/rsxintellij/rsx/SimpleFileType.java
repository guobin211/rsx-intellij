package com.github.guobin211.rsxintellij.rsx;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;

import com.intellij.lang.Language;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.awt.*;

class SimpleLanguage extends Language {

    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage() {
        super("rsx");
    }

}

class SimpleIcons {
    static Icon getIcon() {
        Icon originalIcon = IconLoader.getIcon("/icons/logo.png", SimpleIcons.class);
//        // 获取原始图像
//        Image originalImage = ((ImageIcon) originalIcon).getImage();
//        // 设置新的宽度
//        int newWidth = 16; // 你想要的宽度
//        int newHeight = (int) (originalImage.getHeight(null) * ((double) newWidth / originalImage.getWidth(null)));
//        // 创建一个新的Image对象，调整大小
//        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
//        // 创建一个新的ImageIcon
//        Icon resizedIcon = new ImageIcon(scaledImage);
        return originalIcon;
    }

    public static final Icon FILE = SimpleIcons.getIcon();

}

public final class SimpleFileType extends LanguageFileType {

    public static final SimpleFileType INSTANCE = new SimpleFileType();

    private SimpleFileType() {
        super(SimpleLanguage.INSTANCE);
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
        return SimpleIcons.FILE;
    }

}