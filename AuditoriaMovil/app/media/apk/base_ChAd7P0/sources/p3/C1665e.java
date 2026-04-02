package p3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzer;
import java.util.Arrays;
import n3.c0;
/* renamed from: p3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665e extends X2.a {
    public static final Parcelable.Creator<C1665e> CREATOR = new c0(26);

    /* renamed from: X  reason: collision with root package name */
    public final float f15097X;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f15098a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15099b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15100c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15101d;

    /* renamed from: e  reason: collision with root package name */
    public final byte f15102e;
    public final float f;

    public C1665e(float[] fArr, float f, float f4, long j, byte b5, float f8, float f9) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (fArr != null && fArr.length == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzer.zzb(z7, "Input attitude array should be of length 4.");
        if (!Float.isNaN(fArr[0]) && !Float.isNaN(fArr[1]) && !Float.isNaN(fArr[2]) && !Float.isNaN(fArr[3])) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzer.zzb(z8, "Input attitude cannot contain NaNs.");
        if (f >= 0.0f && f < 360.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzer.zza(z9);
        if (f4 >= 0.0f && f4 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzer.zza(z10);
        if (f9 >= 0.0f && f9 <= 180.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzer.zza(z11);
        zzer.zza(j >= 0);
        this.f15098a = fArr;
        this.f15099b = f;
        this.f15100c = f4;
        this.f = f8;
        this.f15097X = f9;
        this.f15101d = j;
        this.f15102e = (byte) (((byte) (((byte) (b5 | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665e)) {
            return false;
        }
        C1665e c1665e = (C1665e) obj;
        byte b5 = this.f15102e;
        if ((b5 & 32) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((c1665e.f15102e & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 == z8 && ((b5 & 32) == 0 || Float.compare(this.f, c1665e.f) == 0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((b5 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((c1665e.f15102e & 64) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11 && ((b5 & 64) == 0 || Float.compare(this.f15097X, c1665e.f15097X) == 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (Float.compare(this.f15099b, c1665e.f15099b) == 0 && Float.compare(this.f15100c, c1665e.f15100c) == 0 && z9 && z12 && this.f15101d == c1665e.f15101d && Arrays.equals(this.f15098a, c1665e.f15098a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15099b), Float.valueOf(this.f15100c), Float.valueOf(this.f15097X), Long.valueOf(this.f15101d), this.f15098a, Byte.valueOf(this.f15102e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.f15098a));
        sb.append(", headingDegrees=");
        sb.append(this.f15099b);
        sb.append(", headingErrorDegrees=");
        sb.append(this.f15100c);
        if ((this.f15102e & 64) != 0) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.f15097X);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.f15101d);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = m5.d.G(20293, parcel);
        m5.d.t(parcel, 1, (float[]) this.f15098a.clone(), false);
        m5.d.K(parcel, 4, 4);
        parcel.writeFloat(this.f15099b);
        m5.d.K(parcel, 5, 4);
        parcel.writeFloat(this.f15100c);
        m5.d.K(parcel, 6, 8);
        parcel.writeLong(this.f15101d);
        m5.d.K(parcel, 7, 4);
        parcel.writeInt(this.f15102e);
        m5.d.K(parcel, 8, 4);
        parcel.writeFloat(this.f);
        m5.d.K(parcel, 9, 4);
        parcel.writeFloat(this.f15097X);
        m5.d.J(G2, parcel);
    }
}
