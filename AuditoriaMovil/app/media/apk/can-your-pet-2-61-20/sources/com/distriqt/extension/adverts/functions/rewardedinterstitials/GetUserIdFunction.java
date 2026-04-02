package com.distriqt.extension.adverts.functions.rewardedinterstitials;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.RewardedInterstitialAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class GetUserIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            String str = "";
            if (advertsContext.v) {
                RewardedInterstitialAd rewardedInterstitialAd = advertsContext.controller().platform().getRewardedInterstitialAd(fREObjectArr[0].getAsString());
                if (rewardedInterstitialAd != null) {
                    str = rewardedInterstitialAd.getUserId();
                }
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
