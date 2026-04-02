package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzld extends zze {
    private final zzmc zza;
    private zzfs zzb;
    private volatile Boolean zzc;
    private final zzat zzd;
    private final zzmx zze;
    private final List<Runnable> zzf;
    private final zzat zzg;

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    private final zzo zzc(boolean z) {
        return zzg().zza(z ? zzj().zzx() : null);
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzaj zzaa() {
        zzt();
        zzu();
        zzfs zzfsVar = this.zzb;
        if (zzfsVar == null) {
            zzad();
            zzj().zzc().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzc = zzc(false);
        Preconditions.checkNotNull(zzc);
        try {
            zzaj zza = zzfsVar.zza(zzc);
            zzaq();
            return zza;
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to get consents; remote exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzft zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfw zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjc zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzky zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzld zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmn zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzab() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzld zzldVar) {
        zzldVar.zzt();
        if (zzldVar.zzak()) {
            zzldVar.zzj().zzp().zza("Inactivity, disconnecting from the service");
            zzldVar.zzae();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zza(zzld zzldVar, ComponentName componentName) {
        zzldVar.zzt();
        if (zzldVar.zzb != null) {
            zzldVar.zzb = null;
            zzldVar.zzj().zzp().zza("Disconnected from device MeasurementService", componentName);
            zzldVar.zzt();
            zzldVar.zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzld(zzhm zzhmVar) {
        super(zzhmVar);
        this.zzf = new ArrayList();
        this.zze = new zzmx(zzhmVar.zzb());
        this.zza = new zzmc(this);
        this.zzd = new zzli(this, zzhmVar);
        this.zzg = new zzlr(this, zzhmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzac() {
        zzt();
        zzu();
        zzo zzc = zzc(true);
        zzh().zzab();
        zza(new zzlq(this, zzc));
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzad() {
        zzt();
        zzu();
        if (zzak()) {
            return;
        }
        if (zzao()) {
            this.zza.zza();
        } else if (zze().zzx()) {
        } else {
            List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if ((queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent);
                return;
            }
            zzj().zzg().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    public final void zzae() {
        zzt();
        zzu();
        this.zza.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap() {
        zzt();
        zzj().zzp().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                zzj().zzg().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zza();
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdi zzdiVar) {
        zzt();
        zzu();
        zza(new zzln(this, zzc(false), zzdiVar));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzt();
        zzu();
        zza(new zzlo(this, atomicReference, zzc(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzdi zzdiVar, String str, String str2) {
        zzt();
        zzu();
        zza(new zzma(this, str, str2, zzc(false), zzdiVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        zzt();
        zzu();
        zza(new zzlx(this, atomicReference, str, str2, str3, zzc(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzna>> atomicReference, Bundle bundle) {
        zzt();
        zzu();
        zza(new zzlj(this, atomicReference, zzc(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zznt>> atomicReference, boolean z) {
        zzt();
        zzu();
        zza(new zzlk(this, atomicReference, zzc(false), z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzdi zzdiVar, String str, String str2, boolean z) {
        zzt();
        zzu();
        zza(new zzlh(this, str, str2, zzc(false), z, zzdiVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zznt>> atomicReference, String str, String str2, String str3, boolean z) {
        zzt();
        zzu();
        zza(new zzlz(this, atomicReference, str, str2, str3, zzc(false), z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaf() {
        zzfs zzfsVar = this.zzb;
        if (zzfsVar == null) {
            zzj().zzg().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzfsVar.zzf(zzc);
            zzaq();
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to send Dma consent settings to the service", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzag() {
        zzfs zzfsVar = this.zzb;
        if (zzfsVar == null) {
            zzj().zzg().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzo zzc = zzc(false);
            Preconditions.checkNotNull(zzc);
            zzfsVar.zzh(zzc);
            zzaq();
        } catch (RemoteException e) {
            zzj().zzg().zza("Failed to send storage consent settings to the service", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzbd zzbdVar, String str) {
        Preconditions.checkNotNull(zzbdVar);
        zzt();
        zzu();
        zza(new zzlv(this, true, zzc(true), zzh().zza(zzbdVar), zzbdVar, str));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdi zzdiVar, zzbd zzbdVar, String str) {
        zzt();
        zzu();
        if (zzq().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzj().zzu().zza("Not bundling data. Service unavailable or out of date");
            zzq().zza(zzdiVar, new byte[0]);
            return;
        }
        zza(new zzlu(this, zzbdVar, str, zzdiVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaq() {
        zzt();
        this.zze.zzb();
        this.zzd.zza(zzbf.zzaj.zza(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzah() {
        zzt();
        zzu();
        zzo zzc = zzc(false);
        zzh().zzaa();
        zza(new zzll(this, zzc));
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzt();
        if (zzak()) {
            runnable.run();
        } else if (this.zzf.size() >= 1000) {
            zzj().zzg().zza("Discarding data. Max runnable queue size reached");
        } else {
            this.zzf.add(runnable);
            this.zzg.zza(60000L);
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfs zzfsVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int i;
        zzt();
        zzu();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> zza = zzh().zza(100);
            if (zza != null) {
                arrayList.addAll(zza);
                i = zza.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbd) {
                    try {
                        zzfsVar.zza((zzbd) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e) {
                        zzj().zzg().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zznt) {
                    try {
                        zzfsVar.zza((zznt) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e2) {
                        zzj().zzg().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        zzfsVar.zza((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e3) {
                        zzj().zzg().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzj().zzg().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzu();
        zza(new zzly(this, true, zzc(true), zzh().zza(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(boolean z) {
        zzt();
        zzu();
        if ((!zzoe.zza() || !zze().zza(zzbf.zzde)) && z) {
            zzh().zzaa();
        }
        if (zzam()) {
            zza(new zzlw(this, zzc(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzkv zzkvVar) {
        zzt();
        zzu();
        zza(new zzlp(this, zzkvVar));
    }

    public final void zza(Bundle bundle) {
        zzt();
        zzu();
        zza(new zzls(this, zzc(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzai() {
        zzt();
        zzu();
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final void run() {
                zzld.this.zzaf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaj() {
        zzt();
        zzu();
        zza(new zzlt(this, zzc(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzfs zzfsVar) {
        zzt();
        Preconditions.checkNotNull(zzfsVar);
        this.zzb = zzfsVar;
        zzaq();
        zzap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(boolean z) {
        zzt();
        zzu();
        if ((!zzoe.zza() || !zze().zza(zzbf.zzde)) && z) {
            zzh().zzaa();
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
            @Override // java.lang.Runnable
            public final void run() {
                zzld.this.zzag();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zznt zzntVar) {
        zzt();
        zzu();
        zza(new zzlm(this, zzc(true), zzh().zza(zzntVar), zzntVar));
    }

    public final boolean zzak() {
        zzt();
        zzu();
        return this.zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzal() {
        zzt();
        zzu();
        return !zzao() || zzq().zzg() >= 200900;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzam() {
        zzt();
        zzu();
        return !zzao() || zzq().zzg() >= zzbf.zzbn.zza(null).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzan() {
        zzt();
        zzu();
        return !zzao() || zzq().zzg() >= 241200;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzao() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzld.zzao():boolean");
    }
}
