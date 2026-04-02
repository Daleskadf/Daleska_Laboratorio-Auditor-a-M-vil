package com.google.android.gms.internal.mlkit_vision_common;

import D.AbstractC0055e;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C0765n;
import com.google.android.gms.common.internal.C0769s;
import com.google.android.gms.tasks.Task;
import d0.e;
import e5.c;
import e5.f;
import e5.k;
import e5.n;
import j3.C1367d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final k kVar, zzmc zzmcVar, String str) {
        int i7;
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        f a7 = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzmj.this.zza();
            }
        };
        a7.getClass();
        this.zzg = f.b(callable);
        f a8 = f.a();
        kVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.this.a();
            }
        };
        a8.getClass();
        this.zzh = f.b(callable2);
        zzr zzrVar = zzb;
        if (zzrVar.containsKey(str)) {
            i7 = C1367d.d(context, (String) zzrVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.zzj = i7;
    }

    private static synchronized zzp zzd() {
        synchronized (zzmj.class) {
            try {
                zzp zzpVar = zza;
                if (zzpVar != null) {
                    return zzpVar;
                }
                e j = AbstractC0055e.j(Resources.getSystem().getConfiguration());
                zzm zzmVar = new zzm();
                for (int i7 = 0; i7 < j.f10166a.size(); i7++) {
                    Locale locale = j.f10166a.get(i7);
                    C0765n c0765n = c.f10890a;
                    zzmVar.zzb(locale.toLanguageTag());
                }
                zzp zzc = zzmVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zza() {
        return C0769s.f9387c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        String a7;
        zzmbVar.zza(zzivVar);
        String zzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(zzc);
        zzkyVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a7 = (String) this.zzh.getResult();
        } else {
            a7 = this.zzf.a();
        }
        zzkyVar.zzi(a7);
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        zzii zziiVar;
        zzio zzioVar;
        final String a7;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && elapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(elapsedRealtime));
        int i7 = zzmtVar.zza;
        int i8 = zzmtVar.zzb;
        int i9 = zzmtVar.zzc;
        int i10 = zzmtVar.zzd;
        int i11 = zzmtVar.zze;
        long j = zzmtVar.zzf;
        int i12 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        if (i7 != -1) {
            if (i7 != 35) {
                if (i7 != 842094169) {
                    if (i7 != 16) {
                        if (i7 != 17) {
                            zziiVar = zzii.UNKNOWN_FORMAT;
                        } else {
                            zziiVar = zzii.NV21;
                        }
                    } else {
                        zziiVar = zzii.NV16;
                    }
                } else {
                    zziiVar = zzii.YV12;
                }
            } else {
                zziiVar = zzii.YUV_420_888;
            }
        } else {
            zziiVar = zzii.BITMAP;
        }
        zzinVar.zzd(zziiVar);
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        zzioVar = zzio.ANDROID_MEDIA_IMAGE;
                    } else {
                        zzioVar = zzio.FILEPATH;
                    }
                } else {
                    zzioVar = zzio.BYTEBUFFER;
                }
            } else {
                zzioVar = zzio.BYTEARRAY;
            }
        } else {
            zzioVar = zzio.BITMAP;
        }
        zzinVar.zzf(zzioVar);
        zzinVar.zzc(Integer.valueOf(i9));
        zzinVar.zze(Integer.valueOf(i10));
        zzinVar.zzg(Integer.valueOf(i11));
        zzinVar.zzb(Long.valueOf(j));
        zzinVar.zzh(Integer.valueOf(i12));
        zziq zzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zzj);
        final zzmb zze = zzmk.zze(zziwVar);
        if (this.zzg.isSuccessful()) {
            a7 = (String) this.zzg.getResult();
        } else {
            a7 = C0769s.f9387c.a(this.zzi);
        }
        n.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                zzmj.this.zzb(zze, zzivVar, a7);
            }
        });
    }
}
