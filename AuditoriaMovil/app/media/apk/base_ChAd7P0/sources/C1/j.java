package C1;

import D.AbstractC0059i;
import K0.q;
import android.os.Parcel;
import android.os.Parcelable;
import s3.C1772G;
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new C1772G(20);

    /* renamed from: a  reason: collision with root package name */
    public final long f464a;

    /* renamed from: b  reason: collision with root package name */
    public final long f465b;

    public j(long j, long j8) {
        this.f464a = j;
        this.f465b = j8;
    }

    public static long a(long j, q qVar) {
        long u7 = qVar.u();
        if ((128 & u7) != 0) {
            return 8589934591L & ((((u7 & 1) << 32) | qVar.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // C1.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f464a);
        sb.append(", playbackPositionUs= ");
        return AbstractC0059i.C(sb, this.f465b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f464a);
        parcel.writeLong(this.f465b);
    }
}
