package com.distriqt.extension.share.utils;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class JSONUtils {
    private static final String TAG = "JSONUtils";

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        Logger.d(TAG, "toMap( %s )", jSONObject.toString());
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
        String str = TAG;
        Logger.d(str, "toJavaValue( %s )", obj.getClass().getSimpleName());
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return toList((JSONArray) obj);
        }
        if (obj == JSONObject.NULL) {
            Logger.d(str, "toJavaValue: NULL", new Object[0]);
            return null;
        }
        return obj;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        Logger.d(TAG, "toBundle( %s )", jSONObject.toString());
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                Double valueOf = Double.valueOf(jSONObject.optDouble(next));
                int optInt = jSONObject.optInt(next, Integer.MAX_VALUE);
                if (obj instanceof JSONObject) {
                    bundle.putAll(toBundle((JSONObject) obj));
                } else if (obj == JSONObject.NULL) {
                    Logger.d(TAG, "toJavaValue: NULL", new Object[0]);
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (optInt != Integer.MAX_VALUE) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (!valueOf.isNaN()) {
                    bundle.putDouble(next, valueOf.doubleValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bundle;
    }

    public static Object toJsonValue(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), toJsonValue(entry.getValue()));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } else if (!(obj instanceof List)) {
            return obj instanceof Date ? Long.valueOf(((Date) obj).getTime()) : obj;
        } else {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (List) obj) {
                try {
                    jSONArray.put(toJsonValue(obj2));
                } catch (Exception unused2) {
                }
            }
            return jSONArray;
        }
    }
}
