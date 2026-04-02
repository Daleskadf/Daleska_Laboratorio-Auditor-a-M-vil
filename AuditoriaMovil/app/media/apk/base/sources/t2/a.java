package T2;

import N2.f;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class a extends X2.a {
    public static final Parcelable.Creator<a> CREATOR = new f(24);

    /* renamed from: a  reason: collision with root package name */
    public final String f5325a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5326b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5327c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5328d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5329e;
    public final Bundle f;

    public a(int i7, String str, int i8, long j, byte[] bArr, Bundle bundle) {
        this.f5329e = i7;
        this.f5325a = str;
        this.f5326b = i8;
        this.f5327c = j;
        this.f5328d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f5325a + ", method: " + this.f5326b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 1, this.f5325a, false);
        d.K(parcel, 2, 4);
        parcel.writeInt(this.f5326b);
        d.K(parcel, 3, 8);
        parcel.writeLong(this.f5327c);
        d.r(parcel, 4, this.f5328d, false);
        d.q(parcel, 5, this.f, false);
        d.K(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, 4);
        parcel.writeInt(this.f5329e);
        d.J(G2, parcel);
    }
}
