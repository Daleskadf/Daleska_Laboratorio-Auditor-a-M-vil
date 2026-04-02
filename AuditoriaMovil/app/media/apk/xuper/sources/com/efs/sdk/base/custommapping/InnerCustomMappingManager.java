package com.efs.sdk.base.custommapping;

import android.text.TextUtils;
import android.util.Log;
import com.umeng.umcrash.custommapping.UAPMCustomMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class InnerCustomMappingManager {
    private static final int MAX_SIZE = 10;
    private static final int MAX_VALUE_LENGTH = 100;
    private static final String TAG = "CustomMappingManager";
    private static final JSONObject sCustomMappingObj = new JSONObject();
    private static final List<String> STRING_PARAMS_LIST = new ArrayList(Arrays.asList(UAPMCustomMapping.STRING_PARAM_1, UAPMCustomMapping.STRING_PARAM_2, UAPMCustomMapping.STRING_PARAM_3, UAPMCustomMapping.STRING_PARAM_4, UAPMCustomMapping.STRING_PARAM_5, UAPMCustomMapping.STRING_PARAM_6, UAPMCustomMapping.STRING_PARAM_7, UAPMCustomMapping.STRING_PARAM_8, UAPMCustomMapping.STRING_PARAM_9, UAPMCustomMapping.STRING_PARAM_10));

    public static String getCustomMappingJsonStr() {
        String jSONObject;
        synchronized (InnerCustomMappingManager.class) {
            jSONObject = sCustomMappingObj.toString();
        }
        return jSONObject;
    }

    public static String getStringParam(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && STRING_PARAMS_LIST.contains(str)) {
            synchronized (InnerCustomMappingManager.class) {
                str2 = (String) sCustomMappingObj.opt(str);
            }
            return str2;
        }
        Log.e(TAG, "illegal parameter in getStringParam(String key): key/value can't be empty and key must be UAPMCustomMapping.java.");
        return null;
    }

    public static boolean putStringParam(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && STRING_PARAMS_LIST.contains(str)) {
            if (str2.length() > 100) {
                Log.e(TAG, "illegal parameter in putStringParam(String key, String value): value's length must be less than 100.");
                return false;
            }
            synchronized (InnerCustomMappingManager.class) {
                sCustomMappingObj.put(str, str2);
            }
            return true;
        }
        Log.e(TAG, "illegal parameter in putStringParam(String key, String value): key/value can't be empty and key must be UAPMCustomMapping.java.");
        return false;
    }
}
