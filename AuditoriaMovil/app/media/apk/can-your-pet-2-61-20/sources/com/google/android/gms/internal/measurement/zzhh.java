package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzhh<T> {
    @Nullable
    private static volatile zzhs zzb = null;
    private static volatile boolean zzc = false;
    private final zzhp zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzhh<?>>> zzd = new AtomicReference<>();
    private static zzhw zze = new zzhw(new zzhv() { // from class: com.google.android.gms.internal.measurement.zzhm
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final boolean zza() {
            return zzhh.zzd();
        }
    });
    private static final AtomicInteger zzf = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Boolean bool, boolean z) {
        return new zzho(zzhpVar, str, bool, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Double d, boolean z) {
        return new zzhn(zzhpVar, str, d, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Long l, boolean z) {
        return new zzhl(zzhpVar, str, l, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, String str2, boolean z) {
        return new zzhq(zzhpVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzl) {
            Preconditions.checkState(zze.zza(this.zzh), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zzf.get();
        if (this.zzj < i) {
            synchronized (this) {
                if (this.zzj < i) {
                    zzhs zzhsVar = zzb;
                    Optional<zzhf> absent = Optional.absent();
                    String str = null;
                    if (zzhsVar != null) {
                        absent = zzhsVar.zzb().get();
                        if (absent.isPresent()) {
                            str = absent.get().zza(this.zzg.zzb, this.zzg.zza, this.zzg.zzd, this.zzh);
                        }
                    }
                    Preconditions.checkState(zzhsVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzg.zzf ? (zzb2 = zzb(zzhsVar)) == null && (zzb2 = zza(zzhsVar)) == null : (zzb2 = zza(zzhsVar)) == null && (zzb2 = zzb(zzhsVar)) == null) {
                        zzb2 = this.zzi;
                    }
                    if (absent.isPresent()) {
                        zzb2 = str == null ? this.zzi : zza((Object) str);
                    }
                    this.zzk = zzb2;
                    this.zzj = i;
                }
            }
        }
        return this.zzk;
    }

    @Nullable
    private final T zza(zzhs zzhsVar) {
        if (!this.zzg.zze && (this.zzg.zzh == null || this.zzg.zzh.apply(zzhsVar.zza()).booleanValue())) {
            Object zza2 = zzha.zza(zzhsVar.zza()).zza(this.zzg.zze ? null : zza(this.zzg.zzc));
            if (zza2 != null) {
                return zza(zza2);
            }
        }
        return null;
    }

    @Nullable
    private final T zzb(zzhs zzhsVar) {
        zzgz zza2;
        Object zza3;
        if (this.zzg.zzb != null) {
            if (!zzhg.zza(zzhsVar.zza(), this.zzg.zzb)) {
                zza2 = null;
            } else if (this.zzg.zzg) {
                zza2 = zzgs.zza(zzhsVar.zza().getContentResolver(), zzhi.zza(zzhi.zza(zzhsVar.zza(), this.zzg.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhh.zzc();
                    }
                });
            } else {
                zza2 = zzgs.zza(zzhsVar.zza().getContentResolver(), this.zzg.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhh.zzc();
                    }
                });
            }
        } else {
            zza2 = zzhu.zza(zzhsVar.zza(), this.zzg.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                @Override // java.lang.Runnable
                public final void run() {
                    zzhh.zzc();
                }
            });
        }
        if (zza2 == null || (zza3 = zza2.zza(zzb())) == null) {
            return null;
        }
        return zza(zza3);
    }

    public final String zzb() {
        return zza(this.zzg.zzd);
    }

    private final String zza(String str) {
        if (str == null || !str.isEmpty()) {
            String str2 = this.zzh;
            return str + str2;
        }
        return this.zzh;
    }

    private zzhh(zzhp zzhpVar, String str, T t, boolean z) {
        this.zzj = -1;
        if (zzhpVar.zza == null && zzhpVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzhpVar.zza != null && zzhpVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzhpVar;
        this.zzh = str;
        this.zzi = t;
        this.zzl = z;
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null && context != null) {
                synchronized (obj) {
                    zzhs zzhsVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhsVar == null || zzhsVar.zza() != context) {
                        if (zzhsVar != null) {
                            zzgs.zzc();
                            zzhu.zza();
                            zzha.zza();
                        }
                        zzb = new zzgt(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhj
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                Optional zza2;
                                zza2 = zzhe.zza.zza(context);
                                return zza2;
                            }
                        }));
                        zzf.incrementAndGet();
                    }
                }
            }
        }
    }
}
