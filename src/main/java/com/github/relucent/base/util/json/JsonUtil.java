package com.github.relucent.base.util.json;


import com.github.relucent.base.util.collect.Listx;
import com.github.relucent.base.util.collect.Mapx;

/**
 * JSON解析工具类<br>
 */
public class JsonUtil {

    // ===================================Fields==============================================
    private static volatile JsonHandler HANDLER = new com.github.relucent.base.util.json.v1.JsonHandler();

    // ===================================Methods=============================================
    /**
     * 将JAVA对象编码为JSON字符串
     * @param <T> JAVA对象泛型
     * @param src JAVA对象
     * @return 对象的JSON字符串
     */
    public static <T> String encode(T src) {
        return HANDLER.encode(src);
    }

    /**
     * 将JSON字符串解码为JAVA对象
     * @param <T> JAVA对象泛型
     * @param json 对象的JSON字符串
     * @param type JAVA对象类型
     * @return JSON对应的JAVA对象，如果无法解析将返回NULL.
     */
    public static <T> T decode(String json, Class<T> type) {
        return decode(json, type, null);
    }

    /**
     * 将JSON字符串，解码为JAVA对象
     * @param <T> JAVA对象泛型
     * @param json JSON字符串
     * @param type JAVA对象类型
     * @param defaultValue 默认值
     * @return JSON对应的JAVA对象，如果无法解析将返回默认值.
     */
    public static <T> T decode(String json, Class<T> type, T defaultValue) {
        T object = HANDLER.decode(json, type);
        return object != null ? object : defaultValue;
    }


    /**
     * 将JSON转换为MAP对象
     * @param json JSON字符串
     * @return MAP对象,如果类型不匹配或者转换出现异常则返回null.
     */
    public static Mapx toMap(String json) {
        return HANDLER.toMap(json);
    }

    /**
     * 将JSON转换为LIST对象
     * @param json JSON字符串
     * @return LIST对象,如果类型不匹配或者转换出现异常则返回null.
     */
    public static Listx toList(String json) {
        return HANDLER.toList(json);
    }

    /**
     * 设置JSON处理类
     * @param handler JSON处理类
     */
    public static void setHANDLER(JsonHandler handler) {
        HANDLER = handler;
    }
}
