package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegb implements zzegc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfmy zzc(String str, String str2, String str3, zzegd zzegdVar, String str4, WebView webView, String str5, String str6, zzege zzegeVar) {
        zzfni zza = zzfni.zza("Google", str2);
        zzfnh zzm = zzm("javascript");
        zzfnd zzk = zzk(zzegdVar.toString());
        if (zzm == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzegdVar))));
            return null;
        } else {
            zzfnh zzm2 = zzm(str4);
            if (zzk != zzfnd.VIDEO || zzm2 != zzfnh.NONE) {
                return zzfmy.zza(zzfmz.zza(zzk, zzl(zzegeVar.toString()), zzm, zzm2, true), zzfna.zzb(zza, webView, str5, ""));
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfmy zzd(String str, String str2, String str3, String str4, zzegd zzegdVar, WebView webView, String str5, String str6, zzege zzegeVar) {
        zzfni zza = zzfni.zza(str, str2);
        zzfnh zzm = zzm("javascript");
        zzfnh zzm2 = zzm(str4);
        zzfnd zzk = zzk(zzegdVar.toString());
        if (zzm == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzegdVar))));
            return null;
        } else if (zzk != zzfnd.VIDEO || zzm2 != zzfnh.NONE) {
            return zzfmy.zza(zzfmz.zza(zzk, zzl(zzegeVar.toString()), zzm, zzm2, true), zzfna.zzc(zza, webView, str5, ""));
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
    }

    private static zzfnd zzk(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfnd.VIDEO;
            }
            return zzfnd.NATIVE_DISPLAY;
        }
        return zzfnd.HTML_DISPLAY;
    }

    private static zzfng zzl(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return zzfng.ONE_PIXEL;
                }
                return zzfng.UNSPECIFIED;
            }
            return zzfng.DEFINED_BY_JAVASCRIPT;
        }
        return zzfng.BEGIN_TO_RENDER;
    }

    private static zzfnh zzm(String str) {
        if ("native".equals(str)) {
            return zzfnh.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfnh.JAVASCRIPT;
        }
        return zzfnh.NONE;
    }

    private static final Object zzn(zzega zzegaVar) {
        try {
            return zzegaVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final zzfmy zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzege zzegeVar, final zzegd zzegdVar, final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
            return (zzfmy) zzn(new zzega("Google", str, "javascript", zzegdVar, str4, webView, str5, "", zzegeVar) { // from class: com.google.android.gms.internal.ads.zzefx
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzegd zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzege zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzegdVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzegeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzega
                public final Object zza() {
                    return zzegb.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final zzfmy zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzege zzegeVar, final zzegd zzegdVar, final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
            return (zzfmy) zzn(new zzega(str5, str, "javascript", str4, zzegdVar, webView, str6, "", zzegeVar) { // from class: com.google.android.gms.internal.ads.zzefu
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzegd zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzege zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzegdVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzegeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzega
                public final Object zza() {
                    return zzegb.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final String zze(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue()) {
            return (String) zzn(new zzega() { // from class: com.google.android.gms.internal.ads.zzefy
                @Override // com.google.android.gms.internal.ads.zzega
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzf(final zzfmy zzfmyVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmy.this.zzb(view, zzfnf.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzg(final zzfmy zzfmyVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmy.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzh(final zzfmy zzfmyVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmy.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzi(final zzfmy zzfmyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
            Objects.requireNonNull(zzfmyVar);
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmy.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final boolean zzj(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzn(new zzega() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzega
            public final Object zza() {
                if (zzfmw.zzb()) {
                    return true;
                }
                zzfmw.zza(context);
                return Boolean.valueOf(zzfmw.zzb());
            }
        });
        return bool != null && bool.booleanValue();
    }
}
