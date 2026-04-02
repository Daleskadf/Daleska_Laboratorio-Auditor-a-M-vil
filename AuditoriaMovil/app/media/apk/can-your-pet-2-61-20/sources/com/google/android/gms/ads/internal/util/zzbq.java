package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbq {
    private static zzaqt zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbl zza = new zzbi();

    public zzbq(Context context) {
        zzaqt zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbdz.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzet)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzarw.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcbw zzcbwVar = new zzcbw();
        zzb.zza(new zzbp(str, null, zzcbwVar));
        return zzcbwVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbn zzbnVar = new zzbn(null);
        zzbj zzbjVar = new zzbj(this, str, zzbnVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbk zzbkVar = new zzbk(this, i, str, zzbnVar, zzbjVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, ShareTarget.METHOD_GET, zzbkVar.zzl(), zzbkVar.zzx());
            } catch (zzapy e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbkVar);
        return zzbnVar;
    }
}
