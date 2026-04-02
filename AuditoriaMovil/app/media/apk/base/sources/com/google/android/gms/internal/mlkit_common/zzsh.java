package com.google.android.gms.internal.mlkit_common;

import D.AbstractC0055e;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.C0765n;
import com.google.android.gms.common.internal.C0769s;
import com.google.android.gms.tasks.Task;
import d0.e;
import d5.AbstractC0900b;
import e5.c;
import e5.f;
import e5.i;
import e5.k;
import e5.n;
import j$.util.Objects;
import j3.C1367d;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzsh {
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final k kVar, zzrz zzrzVar, String str) {
        int i7;
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        f a7 = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzsh.this.zza();
            }
        };
        a7.getClass();
        this.zzg = f.b(callable);
        f a8 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.this.a();
            }
        };
        a8.getClass();
        this.zzh = f.b(callable2);
        zzai zzaiVar = zzb;
        if (zzaiVar.containsKey(str)) {
            i7 = C1367d.d(context, (String) zzaiVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.zzj = i7;
    }

    private static synchronized zzaf zzh() {
        synchronized (zzsh.class) {
            try {
                zzaf zzafVar = zza;
                if (zzafVar != null) {
                    return zzafVar;
                }
                e j = AbstractC0055e.j(Resources.getSystem().getConfiguration());
                zzac zzacVar = new zzac();
                for (int i7 = 0; i7 < j.f10166a.size(); i7++) {
                    Locale locale = j.f10166a.get(i7);
                    C0765n c0765n = c.f10890a;
                    zzacVar.zzb(locale.toLanguageTag());
                }
                zzaf zzc = zzacVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final zzqt zzi(String str, String str2) {
        String a7;
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        if (this.zzh.isSuccessful()) {
            a7 = (String) this.zzh.getResult();
        } else {
            a7 = this.zzf.a();
        }
        zzqtVar.zzi(a7);
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return C0769s.f9387c.a(this.zzi);
    }

    public final String zza() {
        return C0769s.f9387c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    public final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, AbstractC0900b abstractC0900b) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(abstractC0900b, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String zzj = zzj();
        n.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.zzb(zzryVar, zzmvVar, zzj);
            }
        });
    }

    public final void zze(zzry zzryVar, AbstractC0900b abstractC0900b, boolean z7, int i7) {
        zzsj.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzry zzryVar, AbstractC0900b abstractC0900b, zzmu zzmuVar, boolean z7, i iVar, zzna zznaVar) {
        zzsi zzh = zzsj.zzh();
        zzh.zzf(z7);
        zzh.zzd(iVar);
        zzh.zzb(zzmuVar);
        zzh.zza(zznaVar);
        zzg(zzryVar, abstractC0900b, zzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final AbstractC0900b abstractC0900b, final zzsj zzsjVar) {
        n.zza.execute(new Runnable(zzryVar, zzsjVar, abstractC0900b) { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            public final /* synthetic */ zzry zzb;
            public final /* synthetic */ zzsj zzc;
            public final /* synthetic */ AbstractC0900b zzd;

            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.zzc(this.zzb, this.zzc, null);
            }
        });
    }
}
