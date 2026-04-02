package com.distriqt.extension.adverts.functions.rewarded;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class GetAdUnitIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            String str = "";
            if (advertsContext.v) {
                RewardedVideoAd rewardedVideoAd = advertsContext.controller().platform().getRewardedVideoAd(fREObjectArr[0].getAsString());
                if (rewardedVideoAd != null) {
                    str = rewardedVideoAd.getAdUnitId();
                }
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
