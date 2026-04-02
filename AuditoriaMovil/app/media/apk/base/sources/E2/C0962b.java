package e2;

import D.AbstractC0059i;
import S.f;
import S.k;
import android.os.Parcel;
import android.util.SparseIntArray;
import org.apache.tika.utils.StringUtils;
/* renamed from: e2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962b extends AbstractC0961a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f10860d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f10861e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10862g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10863h;

    /* renamed from: i  reason: collision with root package name */
    public int f10864i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f10865k;

    /* JADX WARN: Type inference failed for: r5v0, types: [S.k, S.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [S.k, S.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [S.k, S.f] */
    public C0962b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), StringUtils.EMPTY, new k(0), new k(0), new k(0));
    }

    @Override // e2.AbstractC0961a
    public final C0962b a() {
        Parcel parcel = this.f10861e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.j;
        if (i7 == this.f) {
            i7 = this.f10862g;
        }
        return new C0962b(parcel, dataPosition, i7, AbstractC0059i.D(new StringBuilder(), this.f10863h, "  "), this.f10857a, this.f10858b, this.f10859c);
    }

    @Override // e2.AbstractC0961a
    public final boolean e(int i7) {
        while (this.j < this.f10862g) {
            int i8 = this.f10865k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.j;
            Parcel parcel = this.f10861e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f10865k = parcel.readInt();
            this.j += readInt;
        }
        if (this.f10865k != i7) {
            return false;
        }
        return true;
    }

    @Override // e2.AbstractC0961a
    public final void i(int i7) {
        int i8 = this.f10864i;
        SparseIntArray sparseIntArray = this.f10860d;
        Parcel parcel = this.f10861e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f10864i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public C0962b(Parcel parcel, int i7, int i8, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f10860d = new SparseIntArray();
        this.f10864i = -1;
        this.f10865k = -1;
        this.f10861e = parcel;
        this.f = i7;
        this.f10862g = i8;
        this.j = i7;
        this.f10863h = str;
    }
}
