package com.distriqt.extension.adverts.functions.rewarded;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.utils.AdvertsFREObjectUtils;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class LoadFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                AdvertRequest requestFromFREObject = AdvertsFREObjectUtils.requestFromFREObject(fREObjectArr[1]);
                RewardedVideoAd rewardedVideoAd = advertsContext.controller().platform().getRewardedVideoAd(asString);
                if (rewardedVideoAd != null) {
                    rewardedVideoAd.load(requestFromFREObject);
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
