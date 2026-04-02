package com.google.android.gms.internal.mlkit_vision_barcode;

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
import j$.util.Objects;
import j3.C1367d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import k5.C1404g;
import k5.C1405h;
/* loaded from: classes.dex */
public final class zzwp {
    private static zzcs zza;
    private static final zzcu zzb = zzcu.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzwf zze;
    private final k zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzwp(Context context, final k kVar, zzwf zzwfVar, String str) {
        int i7;
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = kVar;
        this.zze = zzwfVar;
        zzxb.zza();
        this.zzi = str;
        f a7 = f.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzwp.this.zzb();
            }
        };
        a7.getClass();
        this.zzg = f.b(callable);
        f a8 = f.a();
        Objects.requireNonNull(kVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.this.a();
            }
        };
        a8.getClass();
        this.zzh = f.b(callable2);
        zzcu zzcuVar = zzb;
        if (zzcuVar.containsKey(str)) {
            i7 = C1367d.d(context, (String) zzcuVar.get(str), false);
        } else {
            i7 = -1;
        }
        this.zzj = i7;
    }

    public static long zza(List list, double d7) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d7 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzcs zzi() {
        synchronized (zzwp.class) {
            try {
                zzcs zzcsVar = zza;
                if (zzcsVar != null) {
                    return zzcsVar;
                }
                e j = AbstractC0055e.j(Resources.getSystem().getConfiguration());
                zzcp zzcpVar = new zzcp();
                for (int i7 = 0; i7 < j.f10166a.size(); i7++) {
                    Locale locale = j.f10166a.get(i7);
                    C0765n c0765n = c.f10890a;
                    zzcpVar.zzd(locale.toLanguageTag());
                }
                zzcs zzf = zzcpVar.zzf();
                zza = zzf;
                return zzf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return C0769s.f9387c.a(this.zzi);
    }

    private final boolean zzk(zzrc zzrcVar, long j, long j8) {
        if (this.zzk.get(zzrcVar) == null || j - ((Long) this.zzk.get(zzrcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        return C0769s.f9387c.a(this.zzi);
    }

    public final /* synthetic */ void zzc(zzwe zzweVar, zzrc zzrcVar, String str) {
        String a7;
        zzweVar.zzb(zzrcVar);
        String zzd = zzweVar.zzd();
        zzvb zzvbVar = new zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(Boolean.TRUE);
        zzvbVar.zzl(zzd);
        zzvbVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a7 = (String) this.zzh.getResult();
        } else {
            a7 = this.zzf.a();
        }
        zzvbVar.zzi(a7);
        zzvbVar.zzd(10);
        zzvbVar.zzk(Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(zzwe zzweVar, zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final zzwe zzweVar, final zzrc zzrcVar, final String str) {
        n.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                zzwp.this.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    public final void zzf(zzwo zzwoVar, zzrc zzrcVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zzk(zzrcVar, elapsedRealtime, 30L)) {
            return;
        }
        this.zzk.put(zzrcVar, Long.valueOf(elapsedRealtime));
        zze(zzwoVar.zza(), zzrcVar, zzj());
    }

    public final void zzg(zzrc zzrcVar, C1404g c1404g) {
        zzra zzraVar;
        zzcy zzcyVar = (zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (Object obj : zzcyVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzcyVar.zze(obj));
                Collections.sort(arrayList);
                zzqb zzqbVar = new zzqb();
                Iterator it = arrayList.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((Long) it.next()).longValue();
                }
                zzqbVar.zza(Long.valueOf(j / arrayList.size()));
                zzqbVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zzqd zzg = zzqbVar.zzg();
                int size = arrayList.size();
                c1404g.getClass();
                zzft zzftVar = (zzft) obj;
                C1405h c1405h = c1404g.f13720a;
                c1405h.getClass();
                zzrd zzrdVar = new zzrd();
                if (c1405h.f13726i) {
                    zzraVar = zzra.TYPE_THICK;
                } else {
                    zzraVar = zzra.TYPE_THIN;
                }
                zzrdVar.zze(zzraVar);
                zzfq zzfqVar = new zzfq();
                zzfqVar.zza(Integer.valueOf(size));
                zzfqVar.zzc(zzftVar);
                zzfqVar.zzb(zzg);
                zzrdVar.zzd(zzfqVar.zze());
                zze(zzws.zzf(zzrdVar), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    public final void zzh(final zzrc zzrcVar, Object obj, long j, final C1404g c1404g) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, zzbw.zzz());
        }
        ((zzcy) this.zzl.get(zzrcVar)).zzt(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zzk(zzrcVar, elapsedRealtime, 30L)) {
            return;
        }
        this.zzk.put(zzrcVar, Long.valueOf(elapsedRealtime));
        n.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
            @Override // java.lang.Runnable
            public final void run() {
                zzwp.this.zzg(zzrcVar, c1404g);
            }
        });
    }
}
