package C1;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f454a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f455b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f456c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f457d;

    /* renamed from: e  reason: collision with root package name */
    public final long f458e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f459g;

    /* renamed from: h  reason: collision with root package name */
    public final long f460h;

    /* renamed from: i  reason: collision with root package name */
    public final int f461i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final int f462k;

    public h(long j, boolean z7, boolean z8, boolean z9, ArrayList arrayList, long j8, boolean z10, long j9, int i7, int i8, int i9) {
        this.f454a = j;
        this.f455b = z7;
        this.f456c = z8;
        this.f457d = z9;
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.f458e = j8;
        this.f459g = z10;
        this.f460h = j9;
        this.f461i = i7;
        this.j = i8;
        this.f462k = i9;
    }

    public h(Parcel parcel) {
        this.f454a = parcel.readLong();
        this.f455b = parcel.readByte() == 1;
        this.f456c = parcel.readByte() == 1;
        this.f457d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.f458e = parcel.readLong();
        this.f459g = parcel.readByte() == 1;
        this.f460h = parcel.readLong();
        this.f461i = parcel.readInt();
        this.j = parcel.readInt();
        this.f462k = parcel.readInt();
    }
}
