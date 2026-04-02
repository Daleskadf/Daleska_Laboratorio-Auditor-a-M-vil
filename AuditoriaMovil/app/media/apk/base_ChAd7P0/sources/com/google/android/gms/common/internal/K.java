package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
/* loaded from: classes.dex */
public final class K extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0757f f9317a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9318b;

    public K(AbstractC0757f abstractC0757f, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f9317a = abstractC0757f;
        this.f9318b = i7;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        int i9 = this.f9318b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                O o7 = (O) zzc.zza(parcel, O.CREATOR);
                zzc.zzb(parcel);
                AbstractC0757f abstractC0757f = this.f9317a;
                I.j(abstractC0757f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                I.i(o7);
                AbstractC0757f.zzj(abstractC0757f, o7);
                Bundle bundle = o7.f9324a;
                I.j(this.f9317a, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f9317a.onPostInitHandler(readInt, readStrongBinder, bundle, i9);
                this.f9317a = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            zzc.zzb(parcel);
            I.j(this.f9317a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f9317a.onPostInitHandler(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR), i9);
            this.f9317a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
