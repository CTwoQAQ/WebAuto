package com.lemon.day06;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("aa","bb");
        map.put("cc","dd");

        System.out.println(map.get("aa"));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //先拿到key在通过key来取到value
            System.out.println(key+map.get(key));
        }
        //取值
        Collection<String> collection = map.values();
        for (String value : collection) {
            System.out.println(value);
        }
        //直接取到key，value
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
