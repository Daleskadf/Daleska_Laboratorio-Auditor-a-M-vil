package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzawp;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzcxy;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdtq;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzfgg;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfkv;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflh;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzgdk;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.ads.zzgep;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzab extends zzcao {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private String zzA;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final zzbfa zzJ;
    private final zzcik zzf;
    private Context zzg;
    private final zzawo zzh;
    private final zzfgm zzi;
    private final zzfhh zzj;
    private final zzgep zzk;
    private final ScheduledExecutorService zzl;
    private zzbvn zzm;
    private final zzdum zzq;
    private final zzfmt zzr;
    private final VersionInfoParcel zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzy = new AtomicInteger(0);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicBoolean zzH = new AtomicBoolean(false);
    private final AtomicInteger zzI = new AtomicInteger(0);
    private final boolean zzs = ((Boolean) zzba.zzc().zza(zzbdz.zzho)).booleanValue();
    private final boolean zzt = ((Boolean) zzba.zzc().zza(zzbdz.zzhn)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zza(zzbdz.zzhq)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zza(zzbdz.zzhs)).booleanValue();
    private final String zzw = (String) zzba.zzc().zza(zzbdz.zzhr);
    private final String zzx = (String) zzba.zzc().zza(zzbdz.zzht);
    private final String zzB = (String) zzba.zzc().zza(zzbdz.zzhu);

    public zzab(zzcik zzcikVar, Context context, zzawo zzawoVar, zzfhh zzfhhVar, zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, zzdum zzdumVar, zzfmt zzfmtVar, VersionInfoParcel versionInfoParcel, zzbfa zzbfaVar, zzfgm zzfgmVar) {
        List list;
        this.zzf = zzcikVar;
        this.zzg = context;
        this.zzh = zzawoVar;
        this.zzi = zzfgmVar;
        this.zzj = zzfhhVar;
        this.zzk = zzgepVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzdumVar;
        this.zzr = zzfmtVar;
        this.zzz = versionInfoParcel;
        this.zzJ = zzbfaVar;
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhv)).booleanValue()) {
            this.zzC = zzaa((String) zzba.zzc().zza(zzbdz.zzhw));
            this.zzD = zzaa((String) zzba.zzc().zza(zzbdz.zzhx));
            this.zzE = zzaa((String) zzba.zzc().zza(zzbdz.zzhy));
            list = zzaa((String) zzba.zzc().zza(zzbdz.zzhz));
        } else {
            this.zzC = zza;
            this.zzD = zzb;
            this.zzE = zzc;
            list = zzd;
        }
        this.zzF = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzH(zzab zzabVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzabVar.zzO((Uri) it.next())) {
                zzabVar.zzy.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzj zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, Bundle bundle) {
        char c;
        zzfgg zzfggVar = new zzfgg();
        if ("REWARDED".equals(str2)) {
            zzfggVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfggVar.zzp().zza(3);
        }
        zzi zzp = this.zzf.zzp();
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfggVar.zzt(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfggVar.zzG(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            } else if (c == 1 || c == 2) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
            } else if (c == 3) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
            } else if (c == 4) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzb();
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq();
            }
        }
        zzfggVar.zzs(zzqVar);
        zzfggVar.zzy(true);
        zzfggVar.zzz(bundle);
        zzcxyVar.zzi(zzfggVar.zzI());
        zzp.zza(zzcxyVar.zzj());
        zzae zzaeVar = new zzae();
        zzaeVar.zza(str2);
        zzp.zzb(new zzag(zzaeVar, null));
        new zzdef();
        return zzp.zzc();
    }

    private final ListenableFuture zzS(final String str) {
        final zzdpx[] zzdpxVarArr = new zzdpx[1];
        ListenableFuture zzn = zzgee.zzn(this.zzj.zza(), new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzab.this.zzv(zzdpxVarArr, str, (zzdpx) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // java.lang.Runnable
            public final void run() {
                zzab.this.zzJ(zzdpxVarArr);
            }
        }, this.zzk);
        return zzgee.zze(zzgee.zzm((zzgdv) zzgee.zzo(zzgdv.zzu(zzn), ((Integer) zzba.zzc().zza(zzbdz.zzhF)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                int i = zzab.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                int i = zzab.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        ListenableFuture zzb2;
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkK)).booleanValue()) {
            zzb2 = zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                @Override // com.google.android.gms.internal.ads.zzgdk
                public final ListenableFuture zza() {
                    return zzab.this.zzu();
                }
            }, zzcbr.zza);
        } else {
            zzb2 = zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
        }
        zzgee.zzr(zzb2, new zzaa(this), this.zzf.zzB());
    }

    private final void zzU() {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjv)).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzjy)).booleanValue()) {
                return;
            }
            if (((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue() && this.zzG.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbve zzbveVar, boolean z) {
        ListenableFuture zzb2;
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbveVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzO(uri)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                zzb2 = zzgee.zzh(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzab.this.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb2 = zzgee.zzn(zzb2, new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                        @Override // com.google.android.gms.internal.ads.zzgdl
                        public final ListenableFuture zza(Object obj) {
                            ListenableFuture zzm;
                            zzm = zzgee.zzm(r0.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                                @Override // com.google.android.gms.internal.ads.zzfwf
                                public final Object apply(Object obj2) {
                                    return zzab.zzQ(r2, (String) obj2);
                                }
                            }, zzab.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzgee.zzr(zzgee.zzd(arrayList), new zzz(this, zzbveVar, z), this.zzf.zzB());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbve zzbveVar, boolean z) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            try {
                zzbveVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        ListenableFuture zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzab.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb2 = zzgee.zzn(zzb2, new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return zzab.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgee.zzr(zzb2, new zzy(this, zzbveVar, z), this.zzf.zzB());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbvn zzbvnVar = this.zzm;
        return (zzbvnVar == null || (map = zzbvnVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfxg.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzflh zzr(ListenableFuture listenableFuture, zzcat zzcatVar) {
        if (zzflk.zza() && ((Boolean) zzbfm.zze.zze()).booleanValue()) {
            try {
                zzflh zza2 = ((zzj) zzgee.zzp(listenableFuture)).zza();
                zza2.zze(new ArrayList(Collections.singletonList(zzcatVar.zzb)));
                com.google.android.gms.ads.internal.client.zzl zzlVar = zzcatVar.zzd;
                zza2.zzb(zzlVar == null ? "" : zzlVar.zzp);
                return zza2;
            } catch (ExecutionException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "ms", zzh));
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(zzdpx[] zzdpxVarArr) {
        zzdpx zzdpxVar = zzdpxVarArr[0];
        if (zzdpxVar != null) {
            this.zzj.zzb(zzgee.zzh(zzdpxVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzX(uri, this.zzC, this.zzD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzP(Uri uri) {
        return zzX(uri, this.zzE, this.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzjF)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzJ.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        return ObjectWrapper.wrap(this.zzJ.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzf(IObjectWrapper iObjectWrapper, final zzcat zzcatVar, zzcam zzcamVar) {
        ListenableFuture zzb2;
        ListenableFuture listenableFuture;
        ListenableFuture zzb3;
        ListenableFuture zzn;
        final Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            bundle.putLong(zzdtq.PUBLIC_API_CALL.zza(), zzcatVar.zzd.zzz);
            bundle.putLong(zzdtq.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfkw zza2 = zzfkv.zza(context, zzflo.CUI_NAME_SCAR_SIGNALS);
        zza2.zzi();
        if ("UNKNOWN".equals(zzcatVar.zzb)) {
            List arrayList = new ArrayList();
            if (!((String) zzba.zzc().zza(zzbdz.zzhD)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzba.zzc().zza(zzbdz.zzhD)).split(","));
            }
            if (arrayList.contains(zzh.zzb(zzcatVar.zzd))) {
                zzb3 = zzgee.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzn = zzgee.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFuture = zzb3;
                zzb2 = zzn;
                zzgee.zzr(zzb2, new zzx(this, listenableFuture, zzcatVar, zzcamVar, zza2), this.zzf.zzB());
            }
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkK)).booleanValue()) {
            zzb3 = zzcbr.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzab.this.zzq(zzcatVar, bundle);
                }
            });
            zzn = zzgee.zzn(zzb3, new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return ((zzj) obj).zzb();
                }
            }, zzcbr.zza);
            listenableFuture = zzb3;
            zzb2 = zzn;
            zzgee.zzr(zzb2, new zzx(this, listenableFuture, zzcatVar, zzcamVar, zza2), this.zzf.zzB());
        }
        zzj zzR = zzR(this.zzg, zzcatVar.zza, zzcatVar.zzb, zzcatVar.zzc, zzcatVar.zzd, bundle);
        ListenableFuture zzh = zzgee.zzh(zzR);
        zzb2 = zzR.zzb();
        listenableFuture = zzh;
        zzgee.zzr(zzb2, new zzx(this, listenableFuture, zzcatVar, zzcamVar, zza2), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg(zzbvn zzbvnVar) {
        this.zzm = zzbvnVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzV(list, iObjectWrapper, zzbveVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzW(list, iObjectWrapper, zzbveVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzju)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzhC)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzq, this.zzr, this.zzi), "gmaSdk");
                if (((Boolean) zzba.zzc().zza(zzbdz.zzjE)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzs();
                }
                if (((Boolean) zzba.zzc().zza(zzbdz.zzhC)).booleanValue()) {
                    zzU();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbvn zzbvnVar = this.zzm;
            this.zzn = zzbz.zza(motionEvent, zzbvnVar == null ? null : zzbvnVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzV(list, iObjectWrapper, zzbveVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzW(list, iObjectWrapper, zzbveVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfgm zzfgmVar;
        try {
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || (zzfgmVar = this.zzi) == null) {
                uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            } else {
                uri = zzfgmVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            }
        } catch (zzawp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzj zzq(zzcat zzcatVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzcatVar.zza, zzcatVar.zzb, zzcatVar.zzc, zzcatVar.zzd, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzv(zzdpx[] zzdpxVarArr, String str, zzdpx zzdpxVar) throws Exception {
        zzdpxVarArr[0] = zzdpxVar;
        Context context = this.zzg;
        zzbvn zzbvnVar = this.zzm;
        Map map = zzbvnVar.zzb;
        JSONObject zzd2 = zzbz.zzd(context, map, map, zzbvnVar.zza, null);
        JSONObject zzg = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbz.zzf(this.zzm.zza);
        JSONObject zze2 = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdpxVar.zzg(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzgee.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return zzab.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
