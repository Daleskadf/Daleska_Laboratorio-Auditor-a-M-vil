package com.distriqt.extension.adverts.platforms.huawei;

import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.RewardedVideoAd;
import com.distriqt.extension.adverts.controller.ServerSideVerificationOptions;
import com.distriqt.extension.adverts.events.FullScreenContentEvent;
import com.distriqt.extension.adverts.events.RewardedVideoAdEvent;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.huawei.hms.ads.reward.Reward;
import com.huawei.hms.ads.reward.RewardAd;
import com.huawei.hms.ads.reward.RewardAdLoadListener;
import com.huawei.hms.ads.reward.RewardAdStatusListener;
/* loaded from: classes.dex */
public class HuaweiRewarded implements RewardedVideoAd {
    private static final String TAG = "HuaweiRewarded";
    private String _adUnitId;
    private IExtensionContext _extContext;
    private String _identifier;
    private RewardAd _rewardedVideoAd;
    private String _userId;
    private final RewardAdLoadListener _loadListener = new RewardAdLoadListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiRewarded.1
        public void onRewardAdFailedToLoad(int i) {
            Logger.d(HuaweiRewarded.TAG, "onRewardAdFailedToLoad( %d )", Integer.valueOf(i));
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(RewardedVideoAdEvent.ERROR, RewardedVideoAdEvent.formatForErrorEvent(HuaweiRewarded.this._identifier, i, ""));
            }
        }

        public void onRewardedLoaded() {
            Logger.d(HuaweiRewarded.TAG, "onRewardedLoaded()", new Object[0]);
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(RewardedVideoAdEvent.LOADED, RewardedVideoAdEvent.formatForEvent(HuaweiRewarded.this._identifier));
            }
        }
    };
    private final RewardAdStatusListener _adListener = new RewardAdStatusListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.HuaweiRewarded.2
        public void onRewardAdClosed() {
            Logger.d(HuaweiRewarded.TAG, "onRewardAdClosed()", new Object[0]);
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(FullScreenContentEvent.DISMISSED, FullScreenContentEvent.formatForEvent(HuaweiRewarded.this._identifier));
            }
        }

        public void onRewardAdFailedToShow(int i) {
            Logger.d(HuaweiRewarded.TAG, "onRewardAdFailedToShow( %d )", Integer.valueOf(i));
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(FullScreenContentEvent.FAILED_TO_SHOW, FullScreenContentEvent.formatForErrorEvent(HuaweiRewarded.this._identifier, i, ""));
            }
        }

        public void onRewardAdOpened() {
            Logger.d(HuaweiRewarded.TAG, "onRewardAdOpened()", new Object[0]);
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(FullScreenContentEvent.SHOW, FullScreenContentEvent.formatForEvent(HuaweiRewarded.this._identifier));
            }
        }

        public void onRewarded(Reward reward) {
            Logger.d(HuaweiRewarded.TAG, "onRewarded()", new Object[0]);
            if (HuaweiRewarded.this._extContext != null) {
                HuaweiRewarded.this._extContext.dispatchEvent(RewardedVideoAdEvent.REWARD, RewardedVideoAdEvent.formatForRewardEvent(HuaweiRewarded.this._identifier, reward.getAmount(), reward.getName()));
            }
        }
    };

    public HuaweiRewarded(IExtensionContext iExtensionContext, String str) {
        this._extContext = iExtensionContext;
        this._identifier = str;
        this._rewardedVideoAd = new RewardAd(this._extContext.getActivity(), "");
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void destroy() {
        if (this._rewardedVideoAd != null) {
            this._rewardedVideoAd = null;
        }
        this._extContext = null;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public String getUserId() {
        Logger.d(TAG, "getUserId()", new Object[0]);
        try {
            String str = this._userId;
            return str != null ? str : "";
        } catch (Exception e) {
            Errors.handleException(e);
            return "";
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setUserId(String str) {
        Logger.d(TAG, "setUserId( %s )", str);
        try {
            this._userId = str;
            RewardAd rewardAd = this._rewardedVideoAd;
            if (rewardAd != null) {
                rewardAd.setUserId(str);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public String getAdUnitId() {
        Logger.d(TAG, "getUserId()", new Object[0]);
        try {
            String str = this._adUnitId;
            return str != null ? str : "";
        } catch (Exception e) {
            Errors.handleException(e);
            return "";
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setAdUnitId(String str) {
        Logger.d(TAG, "setAdUnitId( %s )", str);
        try {
            this._adUnitId = str;
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void load(AdvertRequest advertRequest) {
        Logger.d(TAG, "load( ... )", new Object[0]);
        try {
            createAd();
            this._rewardedVideoAd.loadAd(HuaweiAdsUtils.toAdParam(advertRequest), this._loadListener);
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public boolean isLoaded() {
        Logger.d(TAG, "isLoaded()", new Object[0]);
        try {
            RewardAd rewardAd = this._rewardedVideoAd;
            if (rewardAd != null) {
                return rewardAd.isLoaded();
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return false;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public boolean show() {
        Logger.d(TAG, "show()", new Object[0]);
        RewardAd rewardAd = this._rewardedVideoAd;
        if (rewardAd == null || !rewardAd.isLoaded()) {
            return false;
        }
        this._rewardedVideoAd.show(this._extContext.getActivity(), this._adListener);
        return true;
    }

    @Override // com.distriqt.extension.adverts.controller.RewardedVideoAd
    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        Logger.d(TAG, "setServerSideVerificationOptions()", new Object[0]);
        if (this._rewardedVideoAd == null || serverSideVerificationOptions.userId == null || serverSideVerificationOptions.userId.length() <= 0) {
            return;
        }
        setUserId(serverSideVerificationOptions.userId);
    }

    private void createAd() {
        if (this._rewardedVideoAd != null) {
            this._rewardedVideoAd = null;
        }
        if (this._adUnitId != null) {
            this._rewardedVideoAd = new RewardAd(this._extContext.getActivity(), this._adUnitId);
            String str = this._userId;
            if (str != null) {
                setUserId(str);
            }
        }
    }
}
