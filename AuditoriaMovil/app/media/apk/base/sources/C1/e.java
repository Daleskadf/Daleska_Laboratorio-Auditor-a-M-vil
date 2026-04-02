package C1;

import D.AbstractC0059i;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import s3.C1772G;
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new C1772G(17);

    /* renamed from: X  reason: collision with root package name */
    public final long f440X;

    /* renamed from: Y  reason: collision with root package name */
    public final List f441Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f442Z;

    /* renamed from: a  reason: collision with root package name */
    public final long f443a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f444b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f445c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f446d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f447e;

    /* renamed from: e0  reason: collision with root package name */
    public final long f448e0;
    public final long f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f449f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f450g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f451h0;

    public e(long j, boolean z7, boolean z8, boolean z9, boolean z10, long j8, long j9, List list, boolean z11, long j10, int i7, int i8, int i9) {
        this.f443a = j;
        this.f444b = z7;
        this.f445c = z8;
        this.f446d = z9;
        this.f447e = z10;
        this.f = j8;
        this.f440X = j9;
        this.f441Y = DesugarCollections.unmodifiableList(list);
        this.f442Z = z11;
        this.f448e0 = j10;
        this.f449f0 = i7;
        this.f450g0 = i8;
        this.f451h0 = i9;
    }

    @Override // C1.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC0059i.C(sb, this.f440X, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f443a);
        parcel.writeByte(this.f444b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f445c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f446d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f447e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.f440X);
        List list = this.f441Y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) list.get(i8);
            parcel.writeInt(dVar.f437a);
            parcel.writeLong(dVar.f438b);
            parcel.writeLong(dVar.f439c);
        }
        parcel.writeByte(this.f442Z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f448e0);
        parcel.writeInt(this.f449f0);
        parcel.writeInt(this.f450g0);
        parcel.writeInt(this.f451h0);
    }

    public e(Parcel parcel) {
        this.f443a = parcel.readLong();
        this.f444b = parcel.readByte() == 1;
        this.f445c = parcel.readByte() == 1;
        this.f446d = parcel.readByte() == 1;
        this.f447e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.f440X = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f441Y = DesugarCollections.unmodifiableList(arrayList);
        this.f442Z = parcel.readByte() == 1;
        this.f448e0 = parcel.readLong();
        this.f449f0 = parcel.readInt();
        this.f450g0 = parcel.readInt();
        this.f451h0 = parcel.readInt();
    }
}
