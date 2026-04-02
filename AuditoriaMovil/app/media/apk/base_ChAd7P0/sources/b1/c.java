package B1;

import H0.E;
import H0.G;
import H0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.C1772G;
/* loaded from: classes.dex */
public final class c implements G {
    public static final Parcelable.Creator<c> CREATOR = new C1772G(13);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f238a;

    public c(ArrayList arrayList) {
        this.f238a = arrayList;
        boolean z7 = false;
        if (!arrayList.isEmpty()) {
            long j = ((b) arrayList.get(0)).f236b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i7)).f235a < j) {
                    z7 = true;
                    break;
                } else {
                    j = ((b) arrayList.get(i7)).f236b;
                    i7++;
                }
            }
        }
        K0.a.e(!z7);
    }

    @Override // H0.G
    public final /* synthetic */ r b() {
        return null;
    }

    @Override // H0.G
    public final /* synthetic */ void c(E e7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f238a.equals(((c) obj).f238a);
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        return this.f238a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f238a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f238a);
    }
}
