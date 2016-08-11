package com.q.ide;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;

/**
 * Author: binghuang
 * Date: 8/11/16
 * Time: 6:34 PM
 */
public class QlangFileType extends LanguageFileType{
    public static final QlangFileType INSTANCE = new QlangFileType();

    private QlangFileType() {
        super(QLanguae.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return QlangConstants.QLANG;
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Qlang file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ql";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return QlangIcons.ICON;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return CharsetToolkit.UTF8;
    }

    @Override
    public Charset extractCharsetFromFileContent(@Nullable Project project, @Nullable VirtualFile file, @NotNull CharSequence content) {
        return CharsetToolkit.UTF8_CHARSET;
    }
}
