package com.qzr.qzr_common.utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * 高德地图
 * @author ranGee
 */
public class LongitudeAndLatitudeUtils {

    public static  Map<String, BigDecimal> getLatAndLngByAddress(String addr){
        String address = "";
        //纬度值
        String lat = "";
        //经度值
        String lng = "";
        try {
            address = java.net.URLEncoder.encode(addr,"UTF-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        String url = String.format("http://api.map.baidu.com/geocoder/v2/?"
                +"ak=uWR5t7n00V7KohEwLOK7ffIk40GziUUy&output=json&address=%s&ret_coordtype=gcj02ll",address);
        URL myURL = null;
        URLConnection httpsConn = null;
        //进行转码
        try {
            myURL = new URL(url);
        } catch (MalformedURLException e) {

        }
        try {
            httpsConn = (URLConnection) myURL.openConnection();
            if (httpsConn != null) {
                InputStreamReader insr = new InputStreamReader(
                        httpsConn.getInputStream(), "UTF-8");
                BufferedReader br = new BufferedReader(insr);
                String data = null;
                if ((data = br.readLine()) != null) {
                    lat = data.substring(data.indexOf("\"lat\":")
                            + ("\"lat\":").length(), data.indexOf("},\"precise\""));
                    lng = data.substring(data.indexOf("\"lng\":")
                            + ("\"lng\":").length(), data.indexOf(",\"lat\""));
                }
                insr.close();
            }
        } catch (IOException e) {

        }
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("latitudu", new BigDecimal(lat));
        map.put("longitude", new BigDecimal(lng));
        System.out.println(map.get("latitudu")+","+map.get("longitude"));
        return map;
    }

    public static void main(String[] args) {
        Map<String, BigDecimal> decimalMap = getLatAndLngByAddress("北京市大兴区九龙山庄");
        System.out.println(decimalMap);
    }

}

