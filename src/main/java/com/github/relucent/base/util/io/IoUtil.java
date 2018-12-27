package com.github.relucent.base.util.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * IO工具类 <br>
 */
public class IoUtil {
    
    /**
     * 将文本写入到输出流中
     * @param text 文本
     * @param output 输出流中
     * @param encoding 字符编码
     * @return 写入的字节数
     * @throws IOException IO异常
     */
    public static int write(String text, OutputStream output, Charset encoding) throws IOException {
        int length = 0;
        if (text != null) {
            byte[] data = text.getBytes(encoding);
            length = data.length;
            output.write(data);
        }
        return length;
    }

    /**
     * 关闭流
     * @param closeable 文件流
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                // ignore
            }
        }
    }
}
