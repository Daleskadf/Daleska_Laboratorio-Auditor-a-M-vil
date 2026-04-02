package C1;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import s3.C1772G;
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new C1772G(19);

    /* renamed from: a  reason: collision with root package name */
    public final List f463a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new h(parcel));
        }
        this.f463a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f463a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) list.get(i8);
            parcel.writeLong(hVar.f454a);
            parcel.writeByte(hVar.f455b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f456c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f457d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                g gVar = (g) list2.get(i9);
                parcel.writeInt(gVar.f452a);
                parcel.writeLong(gVar.f453b);
            }
            parcel.writeLong(hVar.f458e);
            parcel.writeByte(hVar.f459g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f460h);
            parcel.writeInt(hVar.f461i);
            parcel.writeInt(hVar.j);
            parcel.writeInt(hVar.f462k);
        }
    }

    public i(ArrayList arrayList) {
        this.f463a = DesugarCollections.unmodifiableList(arrayList);
    }
}
