package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zzr extends com.google.android.gms.internal.p001authapi.zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p001authapi.zzd
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zzk();
        } else {
            zzj();
        }
        return true;
    }
}
