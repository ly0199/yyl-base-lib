package com.github.relucent.base.util.net.copy;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 网络信息工具类
 * @author YYL
 */
public class NetworkHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(NetworkHelper.class);

    /**
     * 获得本机网卡物理地址
     * @return 网卡物理地址(数组)
     */
    public static final String[] getMacAddress() {
        Set<String> macSet = new LinkedHashSet<String>();
        try {
            for (Enumeration<NetworkInterface> el = NetworkInterface.getNetworkInterfaces(); el.hasMoreElements();) {
                NetworkInterface networkInterface = el.nextElement();
                byte[] mac = networkInterface.getHardwareAddress();
                if (mac == null || mac.length == 0) {
                    continue;
                }
                StringBuilder builder = new StringBuilder();
                for (int i = 0, length = mac.length; i < length; i++) {
                    if (i != 0) {
                        builder.append("-");
                    }
                    String hex = Integer.toHexString(mac[i]);
                    switch (hex.length()) {
                        case 0:
                            builder.append("0");// 00
                        case 1:
                            builder.append("0");// 0+
                        default:
                            builder.append(hex.substring(Math.max(hex.length() - 2, 0)));// ++
                    }
                }
                macSet.add(builder.toString().toUpperCase());
            }
        } catch (SocketException e) {
            LOGGER.error("?", e);
        }
        return macSet.toArray(new String[macSet.size()]);
    }

    /**
     * 获得本机IP地址
     * @return 本机IP地址
     */
    public static final String getHostAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            LOGGER.error("?", e);
            return "";
        }
    }
}
