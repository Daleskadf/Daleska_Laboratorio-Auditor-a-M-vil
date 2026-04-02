package com.distriqt.extension.adverts.utils;

import android.os.Bundle;
import com.adobe.fre.FREArray;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdTemplateStyle;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertsFREObjectUtils {
    public static AdvertNativeAdTemplateStyle templateStyleFromFREObject(FREObject fREObject) {
        AdvertNativeAdTemplateStyle advertNativeAdTemplateStyle;
        AdvertNativeAdTemplateStyle advertNativeAdTemplateStyle2 = null;
        if (fREObject != null) {
            try {
                advertNativeAdTemplateStyle = new AdvertNativeAdTemplateStyle();
            } catch (Exception e) {
                e = e;
            }
            try {
                advertNativeAdTemplateStyle.json = new JSONObject(fREObject.getProperty("jsonString").getAsString());
                return advertNativeAdTemplateStyle;
            } catch (Exception e2) {
                e = e2;
                advertNativeAdTemplateStyle2 = advertNativeAdTemplateStyle;
                Errors.handleException(e);
                return advertNativeAdTemplateStyle2;
            }
        }
        return null;
    }

    public static AdvertViewParams viewParamsFromFREObject(FREObject fREObject) {
        AdvertViewParams advertViewParams;
        AdvertViewParams advertViewParams2 = null;
        if (fREObject != null) {
            try {
                advertViewParams = new AdvertViewParams();
            } catch (Exception e) {
                e = e;
            }
            try {
                advertViewParams.x = fREObject.getProperty("x").getAsInt();
                advertViewParams.y = fREObject.getProperty("y").getAsInt();
                advertViewParams.width = fREObject.getProperty("width").getAsInt();
                advertViewParams.height = fREObject.getProperty("height").getAsInt();
                advertViewParams.horizontalAlign = AdvertViewParams.alignmentFromString(fREObject.getProperty("horizontalAlign").getAsString());
                advertViewParams.verticalAlign = AdvertViewParams.alignmentFromString(fREObject.getProperty("verticalAlign").getAsString());
                return advertViewParams;
            } catch (Exception e2) {
                e = e2;
                advertViewParams2 = advertViewParams;
                Errors.handleException(e);
                return advertViewParams2;
            }
        }
        return null;
    }

    public static AdvertRequest requestFromFREObject(FREObject fREObject) throws Exception {
        AdvertRequest advertRequest = new AdvertRequest();
        advertRequest.testDevices = FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObject.getProperty("testDevices"));
        advertRequest.keywords = FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObject.getProperty("keywords"));
        advertRequest.gender = fREObject.getProperty("gender").getAsInt();
        if (fREObject.getProperty("birthday") != null) {
            advertRequest.birthday = new Date((long) fREObject.getProperty("birthday").getProperty("time").getAsDouble());
        }
        advertRequest.tagForChildDirectedTreatment = fREObject.getProperty("tagForChildDirectedTreatment").getAsInt();
        advertRequest.isDesignedForFamilies = fREObject.getProperty("isDesignedForFamilies").getAsInt();
        try {
            JSONObject jSONObject = new JSONObject(fREObject.getProperty("networkExtrasJSON").getAsString());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object javaValue = JSONUtils.toJavaValue(jSONObject.get(next));
                    if (advertRequest.networkExtras == null) {
                        advertRequest.networkExtras = new Bundle();
                    }
                    if (javaValue instanceof String) {
                        advertRequest.networkExtras.putString(next, (String) javaValue);
                    } else if (javaValue instanceof Boolean) {
                        advertRequest.networkExtras.putBoolean(next, ((Boolean) javaValue).booleanValue());
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return advertRequest;
    }
}
