package com.github.relucent.base.util.io;

import java.io.File;

/**
 * 文件工具类
 */
public class FileUtil {

    // ===================================Fields==============================================
    /** UNIX 文件名路径分隔符 */
    public static final char UNIX_SEPARATOR = '/';
    /** WINDOWS 文件名路径分隔符 */
    public static final char WINDOWS_SEPARATOR = '\\';
    /** 文件名后缀分隔符 */
    public static final char EXTENSION_SEPARATOR = '.';

    /** 1KB */
    public static final long ONE_KB = 1024L;
    /** 1MB */
    public static final long ONE_MB = ONE_KB * ONE_KB;
    /** 1GB */
    public static final long ONE_GB = ONE_KB * ONE_MB;

    // ===================================Methods=============================================
    /**
     * 获得文件相对路径
     * @param root 根目录
     * @param path 文件路径
     * @return 拆分后的相对路径
     */
    public static String relative(String root, String path) {
        root = separatorsToUnix(root);
        path = separatorsToUnix(path);
        if (path.indexOf(root) == 0) {
            return new String(path.substring(root.length()));
        }
        return path;
    }

    /**
     * 规范化文件路径[文件分割符使用正斜杠(/)]
     * @param path 规范化文件路径
     * @return 符合规范的文件路径
     */
    public static String separatorsToUnix(String path) {
        if ((path == null) || (path.indexOf('\\') == -1)) {
            return path;
        }
        return path.replace('\\', '/');
    }


    /**
     * 获得文件名称
     * @param path 文件路径
     * @return 文件名称
     */
    public static String getName(String path) {
        if (path == null) {
            return null;
        }
        int index = indexOfLastSeparator(path);
        return path.substring(index + 1);
    }

    /**
     * 获得文件名最后一个路径分割位置
     * @param path 文件路径
     * @return 最后一个路径分割位置
     */
    private static int indexOfLastSeparator(String path) {
        if (path == null) {
            return -1;
        }
        int lastUnixPos = path.lastIndexOf(UNIX_SEPARATOR);
        int lastWindowsPos = path.lastIndexOf(WINDOWS_SEPARATOR);
        return Math.max(lastUnixPos, lastWindowsPos);
    }

    /**
     * 开放文件权限读写权限(rw/rw/rw)
     * @param file 文件
     */
    public static void chmod666(File file) {
        if (file.exists()) {
            file.setReadable(true, false);// 读
            file.setWritable(true, false);// 写
        }
    }
}
