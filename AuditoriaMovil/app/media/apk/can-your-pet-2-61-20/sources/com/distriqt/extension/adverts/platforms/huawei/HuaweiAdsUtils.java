package com.distriqt.extension.adverts.platforms.huawei;

import android.os.Bundle;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.utils.Errors;
import com.huawei.hms.ads.AdParam;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class HuaweiAdsUtils {
    public static String formatStatusForEvent() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adapterStatusArray", new JSONArray());
            return jSONObject.toString();
        } catch (Exception e) {
            Errors.handleException(e);
            return "{}";
        }
    }

    public static AdParam toAdParam(AdvertRequest advertRequest) {
        AdParam.Builder builder = new AdParam.Builder();
        if (advertRequest.gender >= 0) {
            builder.setGender(advertRequest.gender);
        }
        if (advertRequest.keywords != null) {
            for (String str : advertRequest.keywords) {
                builder.addKeyword(str);
            }
        }
        Bundle bundle = advertRequest.networkExtras;
        if (advertRequest.tagForChildDirectedTreatment >= 0) {
            builder.setTagForChildProtection(Integer.valueOf(advertRequest.tagForChildDirectedTreatment));
        }
        int i = advertRequest.isDesignedForFamilies;
        return builder.build();
    }
}
