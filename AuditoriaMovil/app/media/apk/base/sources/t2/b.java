package T2;

import N2.f;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m5.d;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class b extends X2.a {
    public static final Parcelable.Creator<b> CREATOR = new f(25);

    /* renamed from: a  reason: collision with root package name */
    public final int f5330a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f5331b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5332c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5333d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5334e;
    public final Bundle f;

    public b(int i7, int i8, PendingIntent pendingIntent, int i9, Bundle bundle, byte[] bArr) {
        this.f5334e = i7;
        this.f5330a = i8;
        this.f5332c = i9;
        this.f = bundle;
        this.f5333d = bArr;
        this.f5331b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.K(parcel, 1, 4);
        parcel.writeInt(this.f5330a);
        d.A(parcel, 2, this.f5331b, i7, false);
        d.K(parcel, 3, 4);
        parcel.writeInt(this.f5332c);
        d.q(parcel, 4, this.f, false);
        d.r(parcel, 5, this.f5333d, false);
        d.K(parcel, PipesIterator.DEFAULT_QUEUE_SIZE, 4);
        parcel.writeInt(this.f5334e);
        d.J(G2, parcel);
    }
}
