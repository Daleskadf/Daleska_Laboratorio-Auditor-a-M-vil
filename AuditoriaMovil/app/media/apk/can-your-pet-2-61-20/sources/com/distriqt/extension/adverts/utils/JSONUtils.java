package com.distriqt.extension.adverts.utils;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class JSONUtils {
    private static final String TAG = "JSONUtils";

    public static Bundle toBundle(JSONObject jSONObject) {
        return null;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, toJavaValue(jSONObject.get(next)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    public static List<Object> toList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(toJavaValue(jSONArray.get(i)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static Object toJavaValue(Object obj) {
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    public static Object toJsonValue(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Iterator it = ((Map) obj).entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Map.Entry entry = (Map.Entry) it.next();
                    jSONObject.put((String) entry.getKey(), toJsonValue(entry.getValue()));
                    it.remove();
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } else if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (List) obj) {
                try {
                    jSONArray.put(toJsonValue(obj2));
                } catch (Exception unused2) {
                }
            }
            return jSONArray;
        } else {
            return obj;
        }
    }
}
