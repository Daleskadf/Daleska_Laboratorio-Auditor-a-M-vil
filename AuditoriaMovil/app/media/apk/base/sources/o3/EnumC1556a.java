package o3;

import android.os.Parcel;
import android.os.Parcelable;
import n3.c0;
/* renamed from: o3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1556a implements Parcelable {
    ABSENT(0),
    STRING(1),
    OBJECT(2);
    
    public static final Parcelable.Creator<EnumC1556a> CREATOR = new c0(3);
    private final int zzb;

    EnumC1556a(int i7) {
        this.zzb = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.zzb);
    }
}
