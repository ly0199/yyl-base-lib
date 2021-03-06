package com.github.relucent.base.util.codec;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeUtil {

    private static final String DEFAULT_URI_ENCODING = "UTF-8";

    /**
     * 将字节数组编码成Base64字符串
     * @param data 字节数组
     * @return Base64字符串
     */
    public static String encodeBase64(byte[] data) {
        return javax.xml.bind.DatatypeConverter.printBase64Binary(data);
    }

    /**
     * 将Base64字符串解码成字节数组
     * @param base64 Base64字符串
     * @return 字节数组
     */
    public static byte[] decodeBase64(String base64) {
        return javax.xml.bind.DatatypeConverter.parseBase64Binary(base64);
    }

    /**
     * URL 编码, Encode默认为UTF-8.
     * @param input 需要编码的字符串
     * @return 编码后字符串
     */
    public static String encodeURI(String input) {
        try {
            return URLEncoder.encode(input, DEFAULT_URI_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Unsupported Encoding Exception", e);
        }
    }

    /**
     * URL 解码, Encode默认为UTF-8.
     * @param input 需要解码的字符串
     * @return 解码后字符串
     */
    public static String decodeURI(String input) {
        try {
            return URLDecoder.decode(input, DEFAULT_URI_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Unsupported Encoding Exception", e);
        }
    }
}
