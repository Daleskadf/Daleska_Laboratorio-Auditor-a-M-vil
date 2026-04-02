package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import j3.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahz  reason: invalid package */
/* loaded from: classes.dex */
public final class zzahz implements Parcelable.Creator<zzaia> {
    @Override // android.os.Parcelable.Creator
    public final zzaia createFromParcel(Parcel parcel) {
        int T7 = f.T(parcel);
        while (parcel.dataPosition() < T7) {
            f.S(parcel.readInt(), parcel);
        }
        f.s(T7, parcel);
        return new zzaia();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int i7) {
        return new zzaia[i7];
    }
}
