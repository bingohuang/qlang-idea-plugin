package com.q.ide;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Author: binghuang
 * Date: 8/11/16
 * Time: 6:14 PM
 */
public class QlangFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(QlangFileType.INSTANCE, QlangFileType.INSTANCE.getDefaultExtension());
    }
}
