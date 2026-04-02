package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbof implements zzbnx, zzbnv {
    private final zzcgm zza;

    public zzbof(Context context, VersionInfoParcel versionInfoParcel, zzawo zzawoVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcgy {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzcgm zza = zzcgz.zza(context, zzcie.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbcx.zza(), null, null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (com.google.android.gms.ads.internal.util.zzt.zza.post(runnable)) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // java.lang.Runnable
            public final void run() {
                zzbof.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbnu.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbnu.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbnu.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboc
            @Override // java.lang.Runnable
            public final void run() {
                zzbof.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnz
            @Override // java.lang.Runnable
            public final void run() {
                zzbof.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                zzbof.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzi() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbpe zzj() {
        return new zzbpe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzk(final zzbol zzbolVar) {
        zzcic zzN = this.zza.zzN();
        Objects.requireNonNull(zzbolVar);
        zzN.zzH(new zzcib() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzcib
            public final void zza() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbol zzbolVar2 = zzbol.this;
                final long j = zzbolVar2.zzc;
                final ArrayList arrayList = zzbolVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j));
                String valueOf = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
                zzftg zzftgVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbpc zzbpcVar = zzbolVar2.zza;
                final zzbpb zzbpbVar = zzbolVar2.zzd;
                final zzbnx zzbnxVar = zzbolVar2.zze;
                zzftgVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbpc.this.zzi(zzbpbVar, zzbnxVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbnu.zzd(this, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq(String str, zzbky zzbkyVar) {
        this.zza.zzae(str, new zzboe(this, zzbkyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(String str, final zzbky zzbkyVar) {
        this.zza.zzax(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbny
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbky zzbkyVar2;
                zzbky zzbkyVar3 = (zzbky) obj;
                if (zzbkyVar3 instanceof zzboe) {
                    zzbky zzbkyVar4 = zzbky.this;
                    zzbkyVar2 = ((zzboe) zzbkyVar3).zzb;
                    return zzbkyVar2.equals(zzbkyVar4);
                }
                return false;
            }
        });
    }
}
