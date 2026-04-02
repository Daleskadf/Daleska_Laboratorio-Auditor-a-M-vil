package com.distriqt.extension.adverts.functions.rewarded;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetAdUnitIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                String asString2 = fREObjectArr[1].getAsString();
                RewardedVideoAd rewardedVideoAd = advertsContext.controller().platform().getRewardedVideoAd(asString);
                if (rewardedVideoAd != null) {
                    rewardedVideoAd.setAdUnitId(asString2);
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
