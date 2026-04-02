package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbrp extends zzbqq {
    private final Object zza;
    private zzbrr zzb;
    private zzbyb zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbrp(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzs();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbrn(this, zzbquVar));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            zzbql.zza(iObjectWrapper, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzA(this.zzd, zzlVar, str, new zzbrs((Adapter) obj, this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbrn(this, zzbquVar));
        } catch (Exception e) {
            zzbql.zza(iObjectWrapper, e, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } catch (RuntimeException e) {
                zzbql.zza(iObjectWrapper, e, "adapter.appOpen.showAd");
                throw e;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation app open ad.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).showInterstitial();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                try {
                    mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    return;
                } catch (RuntimeException e) {
                    zzbql.zza(iObjectWrapper, e, "adapter.interstitial.showAd");
                    throw e;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } catch (RuntimeException e) {
                zzbql.zza(iObjectWrapper, e, "adapter.rewarded.showAd");
                throw e;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation rewarded ad.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                return;
            } catch (RuntimeException e) {
                zzbql.zza(this.zzd, e, "adapter.showVideo");
                throw e;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediated rewarded ad.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqz zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbra zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbhy zzi() {
        zzbrr zzbrrVar = this.zzb;
        if (zzbrrVar != null) {
            zzbhz zzc = zzbrrVar.zzc();
            if (zzc instanceof zzbhz) {
                return zzc.zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqx zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbrq(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbrd zzk() {
        UnifiedNativeAdMapper zza;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbrr zzbrrVar = this.zzb;
            if (zzbrrVar == null || (zza = zzbrrVar.zza()) == null) {
                return null;
            }
            return new zzbrv(zza);
        } else if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbrt(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbrv(unifiedNativeAdMapper);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbtc.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbtc.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbyb zzbybVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbybVar;
            zzbybVar.zzl(ObjectWrapper.wrap(this.zza));
            return;
        }
        Object obj2 = this.zza;
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzq(IObjectWrapper iObjectWrapper, zzbna zzbnaVar, List list) throws RemoteException {
        char c;
        if (!(this.zza instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbri zzbriVar = new zzbri(this, zzbnaVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbng zzbngVar = (zzbng) it.next();
            String str = zzbngVar.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            AdFormat adFormat = null;
            switch (c) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    break;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    break;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    break;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlw)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbngVar.zzb));
            }
        }
        ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbriVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzr(IObjectWrapper iObjectWrapper, zzbyb zzbybVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting app open ad from adapter.");
        try {
            ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbro(this, zzbquVar));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            zzbql.zza(iObjectWrapper, e, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbquVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        AdSize zzc;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting banner ad from adapter.");
            if (zzqVar.zzn) {
                zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
            } else {
                zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
            }
            AdSize adSize = zzc;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = zzlVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzlVar.zzb;
                    zzbrg zzbrgVar = new zzbrg(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbrr(zzbquVar), zzW(str, zzlVar, str2), adSize, zzbrgVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                    zzbql.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), adSize, this.zzl), new zzbrj(this, zzbquVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                    zzbql.zza(iObjectWrapper, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) this.zza;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbrh(this, zzbquVar, adapter));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            zzbql.zza(iObjectWrapper, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzbquVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = zzlVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzlVar.zzb;
                    zzbrg zzbrgVar = new zzbrg(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbrr(zzbquVar), zzW(str, zzlVar, str2), zzbrgVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                    zzbql.zza(iObjectWrapper, th, "adapter.requestInterstitialAd");
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl), new zzbrk(this, zzbquVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                    zzbql.zza(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar, zzbgt zzbgtVar, List list) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = zzlVar.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzlVar.zzb;
                    zzbru zzbruVar = new zzbru(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzbgtVar, list, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzbrr(zzbquVar);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzW(str, zzlVar, str2), zzbruVar, bundle2);
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                    zzbql.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl, zzbgtVar), new zzbrm(this, zzbquVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                    zzbql.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                    String message = th2.getMessage();
                    if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                        throw new RemoteException();
                    }
                    try {
                        ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl, zzbgtVar), new zzbrl(this, zzbquVar));
                        return;
                    } catch (Throwable th3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", th3);
                        zzbql.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationNativeAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        com.google.android.gms.ads.internal.util.client.zzm.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    public zzbrp(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
