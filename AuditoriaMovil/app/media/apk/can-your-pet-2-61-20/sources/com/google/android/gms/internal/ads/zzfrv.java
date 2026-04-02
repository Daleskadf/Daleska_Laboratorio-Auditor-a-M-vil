package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrv {
    final zzfry zza;
    final boolean zzb;

    private zzfrv(zzfry zzfryVar) {
        this.zza = zzfryVar;
        this.zzb = zzfryVar != null;
    }

    public static zzfrv zzb(Context context, String str, String str2) {
        zzfry zzfrwVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfrwVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfrwVar = queryLocalInterface instanceof zzfry ? (zzfry) queryLocalInterface : new zzfrw(instantiate);
                    }
                    zzfrwVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfrv(zzfrwVar);
                } catch (Exception e) {
                    throw new zzfqx(e);
                }
            } catch (Exception e2) {
                throw new zzfqx(e2);
            }
        } catch (RemoteException | zzfqx | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfrv(new zzfrz());
        }
    }

    public static zzfrv zzc() {
        zzfrz zzfrzVar = new zzfrz();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfrv(zzfrzVar);
    }

    public final zzfru zza(byte[] bArr) {
        return new zzfru(this, bArr, null);
    }
}
