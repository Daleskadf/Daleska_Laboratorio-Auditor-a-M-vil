package com.google.android.recaptcha.internal;

import F6.C0106t;
import F6.InterfaceC0105s;
import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l6.j;
/* loaded from: classes.dex */
public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzek zzekVar;
        zzen zzenVar;
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        zzekVar = this.zza.zzj;
        zzekVar.zze((zztx) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzek zzekVar;
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        zzekVar = this.zza.zzj;
        zzekVar.zze((zztx) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() == zztv.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (!((C0106t) this.zza.zzA()).C(j.f13876a)) {
                this.zza.zzA().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        int i7 = zzbd.zza;
        zzbd zza = zzbc.zza(zzg.zzi());
        this.zza.zzA().hashCode();
        ((C0106t) this.zza.zzA()).O(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        map = this.zza.zze;
        InterfaceC0105s interfaceC0105s = (InterfaceC0105s) map.remove(zzi.zzk());
        if (interfaceC0105s != null) {
            ((C0106t) interfaceC0105s).C(zzi);
        }
    }
}
