package z1;

import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import z0.P;
/* renamed from: z1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2068c implements G {
    public static final Parcelable.Creator<C2068c> CREATOR = new P(2);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16874a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16875b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16876c;

    public C2068c(byte[] bArr, String str, String str2) {
        this.f16874a = bArr;
        this.f16875b = str;
        this.f16876c = str2;
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final void c(E e7) {
        String str = this.f16875b;
        if (str != null) {
            e7.f1648a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2068c.class == obj.getClass()) {
            return Arrays.equals(this.f16874a, ((C2068c) obj).f16874a);
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16874a);
    }

    public final String toString() {
        int length = this.f16874a.length;
        return "ICY: title=\"" + this.f16875b + "\", url=\"" + this.f16876c + "\", rawMetadata.length=\"" + length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f16874a);
        parcel.writeString(this.f16875b);
        parcel.writeString(this.f16876c);
    }

    public C2068c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f16874a = createByteArray;
        this.f16875b = parcel.readString();
        this.f16876c = parcel.readString();
    }
}
