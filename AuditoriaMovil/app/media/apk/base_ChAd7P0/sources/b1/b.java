package B1;

import K0.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import s3.C1772G;
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C1772G(14);

    /* renamed from: a  reason: collision with root package name */
    public final long f235a;

    /* renamed from: b  reason: collision with root package name */
    public final long f236b;

    /* renamed from: c  reason: collision with root package name */
    public final int f237c;

    public b(int i7, long j, long j8) {
        boolean z7;
        if (j < j8) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        this.f235a = j;
        this.f236b = j8;
        this.f237c = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f235a == bVar.f235a && this.f236b == bVar.f236b && this.f237c == bVar.f237c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f235a), Long.valueOf(this.f236b), Integer.valueOf(this.f237c)});
    }

    public final String toString() {
        int i7 = x.f2529a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f235a + ", endTimeMs=" + this.f236b + ", speedDivisor=" + this.f237c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f235a);
        parcel.writeLong(this.f236b);
        parcel.writeInt(this.f237c);
    }
}
