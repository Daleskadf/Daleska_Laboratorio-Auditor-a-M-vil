package com.distriqt.extension.adverts.platforms.admob;

import com.distriqt.core.utils.FREUtils;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.AdvertRequestConfiguration;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdOptions;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleAdMobUtils {
    public static final String TAG = "GoogleAdMobUtils";

    public static RequestConfiguration toRequestConfiguration(AdvertRequestConfiguration advertRequestConfiguration) {
        RequestConfiguration.Builder tagForUnderAgeOfConsent = new RequestConfiguration.Builder().setTagForChildDirectedTreatment(advertRequestConfiguration.tagForChildDirectedTreatment).setMaxAdContentRating(advertRequestConfiguration.maxAdContentRating).setTagForUnderAgeOfConsent(advertRequestConfiguration.tagForUnderAgeOfConsent);
        if (advertRequestConfiguration.testDeviceIds != null && advertRequestConfiguration.testDeviceIds.size() > 0) {
            tagForUnderAgeOfConsent.setTestDeviceIds(advertRequestConfiguration.testDeviceIds);
        }
        return tagForUnderAgeOfConsent.build();
    }

    public static AdRequest toAdRequest(AdvertRequest advertRequest) {
        if (advertRequest.testDevices != null || advertRequest.tagForChildDirectedTreatment >= 0 || advertRequest.isDesignedForFamilies >= 0) {
            RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
            if (advertRequest.testDevices != null && advertRequest.testDevices.length > 0) {
                builder.setTestDeviceIds(Arrays.asList(advertRequest.testDevices));
            }
            if (advertRequest.tagForChildDirectedTreatment >= 0) {
                builder.setTagForChildDirectedTreatment(advertRequest.tagForChildDirectedTreatment);
            }
            MobileAds.setRequestConfiguration(builder.build());
        }
        AdRequest.Builder builder2 = new AdRequest.Builder();
        if (advertRequest.keywords != null) {
            for (String str : advertRequest.keywords) {
                builder2.addKeyword(str);
            }
        }
        if (advertRequest.networkExtras != null) {
            builder2.addNetworkExtrasBundle(AdMobAdapter.class, advertRequest.networkExtras);
        }
        return builder2.build();
    }

    public static NativeAdOptions toNativeAdOptions(AdvertNativeAdOptions advertNativeAdOptions) {
        return new NativeAdOptions.Builder().build();
    }

    public static String formatStatusForEvent(Map<String, AdapterStatus> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                try {
                    jSONArray.put(adapterStatusToJSONObject(str, map.get(str)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            jSONObject.put("adapterStatusArray", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            Errors.handleException(e2);
            return "{}";
        }
    }

    public static JSONObject adapterStatusToJSONObject(String str, AdapterStatus adapterStatus) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        if (adapterStatus != null) {
            jSONObject.put("description", adapterStatus.getDescription());
            jSONObject.put("latency", adapterStatus.getLatency());
            int i = AnonymousClass1.$SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State[adapterStatus.getInitializationState().ordinal()];
            if (i == 1) {
                jSONObject.put("state", "NOT_READY");
            } else if (i == 2) {
                jSONObject.put("state", "READY");
            }
        } else {
            jSONObject.put("state", "NOT_READY");
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.distriqt.extension.adverts.platforms.admob.GoogleAdMobUtils$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State;

        static {
            int[] iArr = new int[AdapterStatus.State.values().length];
            $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State = iArr;
            try {
                iArr[AdapterStatus.State.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$gms$ads$initialization$AdapterStatus$State[AdapterStatus.State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean shouldUseImmersiveMode(IExtensionContext iExtensionContext) {
        try {
            int systemUiVisibility = FREUtils.getAIRWindowSurfaceView(iExtensionContext.getActivity()).getSystemUiVisibility();
            Logger.d(TAG, "systemUiVisibility = %x", Integer.valueOf(systemUiVisibility));
            return (systemUiVisibility & 2048) > 0 || (systemUiVisibility & 4096) > 0 || (systemUiVisibility & 4) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
