package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzgea;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nonnull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzy implements zzgea {
    final /* synthetic */ zzbve zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzab zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzab zzabVar, zzbve zzbveVar, boolean z) {
        this.zza = zzbveVar;
        this.zzb = z;
        this.zzc = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        try {
            zzbve zzbveVar = this.zza;
            String message = th.getMessage();
            zzbveVar.zze("Internal error: " + message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzZ;
        zzfmt zzfmtVar;
        zzfmt zzfmtVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzs;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        str = this.zzc.zzB;
                        zzZ = zzab.zzZ(uri, str, "1");
                        zzfmtVar = this.zzc.zzr;
                        zzfmtVar.zzc(zzZ.toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zza(zzbdz.zzhA)).booleanValue()) {
                            zzfmtVar2 = this.zzc.zzr;
                            zzfmtVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
