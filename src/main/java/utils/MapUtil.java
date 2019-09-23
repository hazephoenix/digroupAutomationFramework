package utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapUtil {

    public static Entry entry(String key, String value) {
        return new Entry(key, value);
    }


    public static Map<String, String> map (Entry... entries) {
        return populate(new LinkedHashMap<>(), entries);
    }


    public static Map<String, String> populate(Map<String, String> map, Entry... entries) {
        for(Entry entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }


    public static class Entry {
        private String key;
        private String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        String getKey() {
            return key;
        }

        String getValue() {
            return value;
        }
    }
}
