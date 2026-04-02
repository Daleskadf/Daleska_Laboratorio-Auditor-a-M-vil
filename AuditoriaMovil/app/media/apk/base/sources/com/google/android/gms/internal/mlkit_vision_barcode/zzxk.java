package com.google.android.gms.internal.mlkit_vision_barcode;

import R.b;
import android.content.Context;
import androidx.camera.core.impl.g0;
import com.google.android.gms.common.internal.C0765n;
import e5.k;
import g5.C1010b;
import g5.C1011c;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.C1399b;
import k5.C1401d;
import kotlin.jvm.internal.j;
import x5.C2010l;
import x5.C2014p;
import x5.C2019u;
/* loaded from: classes.dex */
public final class zzxk {
    private static final C0765n zzf = new C0765n("AutoZoom", null);
    final zzxm zza;
    final zzbw zzb;
    ScheduledFuture zzc;
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private C1399b zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new k(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = unconfigurableScheduledExecutorService;
        this.zzj = zza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.b("Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f) {
        int i7 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        float f4 = this.zzo;
        if (i7 < 0) {
            f = 1.0f;
        }
        return (f4 <= 0.0f || f <= f4) ? f : f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f, float f4, zzxn zzxnVar) {
        long convert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f));
            zzuoVar.zzc(Float.valueOf(f4));
            synchronized (this.zzh) {
                convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(convert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z7) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z7 && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long zza() {
        long convert;
        synchronized (this.zzh) {
            convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    public final zzet zzc(float f) {
        double d7;
        b bVar;
        C1399b c1399b = this.zzs;
        float zzp = zzp(f);
        C1011c c1011c = c1399b.f13705a;
        C1010b c1010b = C1401d.f13709f0;
        C2014p this$0 = (C2014p) c1011c.f11130a.f6409b;
        j.e(this$0, "this$0");
        try {
            C2010l c2010l = this$0.f16563e0;
            j.b(c2010l);
            d7 = zzp;
            bVar = c2010l.f16537h;
        } catch (C2019u unused) {
            zzp = 0.0f;
        }
        if (bVar != null) {
            g0 g0Var = bVar.f4508c.f2103k0;
            if (g0Var != null) {
                g0Var.m((float) d7);
            }
            return zzej.zza(Float.valueOf(zzp));
        }
        throw new Exception();
    }

    public final void zzi(int i7, zzxn zzxnVar) {
        float f;
        synchronized (this.zzh) {
            try {
                if (this.zze != 2) {
                    return;
                }
                if (zzxnVar.zzh() && (!this.zza.zzl() || this.zza.zzb() <= 0.0f)) {
                    if (!this.zzr) {
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f4 = this.zzn;
                        zzq(zzrcVar, f4, f4, zzxnVar);
                        this.zzr = true;
                    }
                    C0765n c0765n = zzf;
                    Locale locale = Locale.getDefault();
                    Float valueOf = Float.valueOf(zzxnVar.zzc());
                    Float valueOf2 = Float.valueOf(zzxnVar.zze());
                    Float valueOf3 = Float.valueOf(zzxnVar.zzb());
                    Float valueOf4 = Float.valueOf(zzxnVar.zzd());
                    Float valueOf5 = Float.valueOf(0.0f);
                    Integer valueOf6 = Integer.valueOf(i7);
                    c0765n.b(String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                    this.zzb.zzt(valueOf6, zzxnVar);
                    Set<Integer> zzw = this.zzb.zzw();
                    if (zzw.size() - 1 > this.zza.zzh()) {
                        int i8 = i7;
                        for (Integer num : zzw) {
                            int intValue = num.intValue();
                            if (i8 > intValue) {
                                i8 = intValue;
                            }
                        }
                        C0765n c0765n2 = zzf;
                        c0765n2.b("Removing recent frameIndex = " + i8);
                        this.zzb.zzf(Integer.valueOf(i8));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.zzb.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i7) {
                            zzxn zzxnVar2 = (zzxn) entry.getValue();
                            if (!zzxnVar2.zzh() || !zzxnVar.zzh()) {
                                f = 0.0f;
                            } else {
                                zzxg zzxgVar = new zzxg(Math.max(zzxnVar2.zzc(), zzxnVar.zzc()), Math.max(zzxnVar2.zze(), zzxnVar.zze()), Math.min(zzxnVar2.zzb(), zzxnVar.zzb()), Math.min(zzxnVar2.zzd(), zzxnVar.zzd()), 0.0f);
                                f = zzxgVar.zzf() / ((zzxnVar2.zzf() + zzxnVar.zzf()) - zzxgVar.zzf());
                            }
                            if (f >= this.zza.zzd()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.zza.zzg() || (this.zza.zzl() && this.zza.zza() <= 0.0f)) {
                        synchronized (this.zzh) {
                            if (zza() >= this.zza.zzj()) {
                                zzdv listIterator = zzcs.zzi(Float.valueOf(zzxnVar.zzc()), Float.valueOf(zzxnVar.zze()), Float.valueOf(zzxnVar.zzb()), Float.valueOf(zzxnVar.zzd())).listIterator(0);
                                float f8 = 1.0E9f;
                                while (listIterator.hasNext()) {
                                    float zzc = (this.zza.zzc() / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                    if (f8 > zzc) {
                                        f8 = zzc;
                                    }
                                }
                                float zzp = zzp(this.zzn * f8);
                                if (this.zza.zzk()) {
                                    float f9 = this.zzn;
                                    float f10 = (zzp - f9) / f9;
                                    if (f10 <= this.zza.zze() && f10 >= (-this.zza.zzf())) {
                                        C0765n c0765n3 = zzf;
                                        c0765n3.b("Auto zoom to " + zzp + " is filtered by threshold");
                                        this.zzp = this.zzj.zza();
                                    }
                                }
                                C0765n c0765n4 = zzf;
                                c0765n4.b("Going to set zoom = " + zzp);
                                zzl(zzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk(float f) {
        boolean z7;
        synchronized (this.zzh) {
            if (f >= 1.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            zzaz.zzd(z7);
            this.zzo = f;
        }
    }

    public final void zzl(float f, zzrc zzrcVar, zzxn zzxnVar) {
        synchronized (this.zzh) {
            try {
                if (this.zzm != null && this.zzs != null && this.zze == 2) {
                    if (!this.zzg.compareAndSet(false, true)) {
                        return;
                    }
                    zzej.zzb(zzej.zzc(new zzxh(this, f), this.zzm), new zzxj(this, zzrcVar, this.zzn, zzxnVar, f), zzeu.zza());
                }
            } finally {
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i7 = this.zze;
                if (i7 != 2 && i7 != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(zzxk.this);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f = this.zzn;
                        zzq(zzrcVar, f, f, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f4 = this.zzn;
                        zzq(zzrcVar2, f4, f4, null);
                    }
                    this.zze = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z7) {
        synchronized (this.zzh) {
            try {
                int i7 = this.zze;
                if (i7 != 1 && i7 != 4) {
                    zzr(true);
                    if (z7) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.zzn;
                            zzq(zzrcVar, f, f, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f4 = this.zzn;
                        zzq(zzrcVar2, f4, f4, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f8 = this.zzn;
                        zzq(zzrcVar3, f8, f8, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(C1399b c1399b, Executor executor) {
        this.zzs = c1399b;
        this.zzm = executor;
    }
}
