package U0;

import D.AbstractC0059i;
import H0.E;
import H0.G;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.Y;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class t implements G {
    public static final Parcelable.Creator<t> CREATOR = new N2.f(26);

    /* renamed from: a  reason: collision with root package name */
    public final String f5703a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5704b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5705c;

    public t(String str, List list, String str2) {
        this.f5703a = str;
        this.f5704b = str2;
        this.f5705c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // H0.G
    public final /* synthetic */ H0.r b() {
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
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (TextUtils.equals(this.f5703a, tVar.f5703a) && TextUtils.equals(this.f5704b, tVar.f5704b) && this.f5705c.equals(tVar.f5705c)) {
            return true;
        }
        return false;
    }

    @Override // H0.G
    public final /* synthetic */ byte[] h() {
        return null;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        String str = this.f5703a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        String str2 = this.f5704b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return this.f5705c.hashCode() + ((i9 + i8) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f5703a;
        if (str2 != null) {
            str = AbstractC0059i.D(Y.m(" [", str2, ", "), this.f5704b, "]");
        } else {
            str = StringUtils.EMPTY;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f5703a);
        parcel.writeString(this.f5704b);
        List list = this.f5705c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) list.get(i8), 0);
        }
    }

    public t(Parcel parcel) {
        this.f5703a = parcel.readString();
        this.f5704b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((s) parcel.readParcelable(s.class.getClassLoader()));
        }
        this.f5705c = DesugarCollections.unmodifiableList(arrayList);
    }
}
