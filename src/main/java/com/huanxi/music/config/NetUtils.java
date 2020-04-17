package com.huanxi.music.config;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author huanxi
 * @date 2020/4/17 7:21 下午
 * @email 1355473748@qq.com
 */

public class NetUtils {
    public static String getRedirectUrl(String path) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(path)
                .openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setConnectTimeout(5000);
        return conn.getHeaderField("Location");
    }
}
