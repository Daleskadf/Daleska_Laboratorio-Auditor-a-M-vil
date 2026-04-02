package com.distriqt.extension.share.functions.sms;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import com.adobe.air.AIRFileUtils$$ExternalSyntheticApiModelOutline2;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.android.billingclient.api.BillingClient;
import com.distriqt.extension.share.ShareContext;
import com.distriqt.extension.share.utils.Errors;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GetSubscriptionInfoFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        int subscriptionId;
        CharSequence displayName;
        CharSequence carrierName;
        String countryIso;
        String number;
        String iccId;
        int simSlotIndex;
        try {
            ShareContext shareContext = (ShareContext) fREContext;
            JSONArray jSONArray = new JSONArray();
            if (Build.VERSION.SDK_INT >= 22) {
                Iterator<SubscriptionInfo> it = shareContext.smsController().getSubscriptions().iterator();
                while (it.hasNext()) {
                    SubscriptionInfo m193m = AIRFileUtils$$ExternalSyntheticApiModelOutline2.m193m((Object) it.next());
                    JSONObject jSONObject = new JSONObject();
                    subscriptionId = m193m.getSubscriptionId();
                    jSONObject.put("id", subscriptionId);
                    displayName = m193m.getDisplayName();
                    jSONObject.put("displayName", displayName.toString());
                    carrierName = m193m.getCarrierName();
                    jSONObject.put("carrierName", carrierName.toString());
                    countryIso = m193m.getCountryIso();
                    jSONObject.put("country", countryIso);
                    number = m193m.getNumber();
                    jSONObject.put("number", number);
                    iccId = m193m.getIccId();
                    jSONObject.put("ICCID", iccId);
                    simSlotIndex = m193m.getSimSlotIndex();
                    jSONObject.put("simSlotIndex", simSlotIndex);
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(BillingClient.FeatureType.SUBSCRIPTIONS, jSONArray);
            return FREObject.newObject(jSONObject2.toString());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
