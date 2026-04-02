package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfhe {
    private static zzfhe zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfhe(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfhe zzd(Context context) {
        synchronized (zzfhe.class) {
            zzfhe zzfheVar = zza;
            if (zzfheVar != null) {
                return zzfheVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbfu.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 241199800) {
                zzclVar = zza(applicationContext);
            }
            zzfhe zzfheVar2 = new zzfhe(applicationContext, zzclVar);
            zza = zzfheVar2;
            return zzfheVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbqo zzb() {
        return (zzbqo) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzg;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(241199000, i2, true, zzE);
        return (((Boolean) zzbfu.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(241199000, zzg.zza(), true, zzE) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbqo r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbfu.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L1c
        L15:
            com.google.android.gms.internal.ads.zzbqo r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L1a
            goto L1c
        L1a:
            goto L13
        L1c:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L21
            r4 = r0
        L21:
            com.google.android.gms.internal.ads.zzfhd.zza(r2, r1, r4)
            return
        L25:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfhd.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhe.zzf(com.google.android.gms.internal.ads.zzbqo):void");
    }
}
