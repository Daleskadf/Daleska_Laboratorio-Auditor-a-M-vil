package z0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import s3.C1770E;
/* renamed from: z0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2042b implements Parcelable {
    public static final Parcelable.Creator<C2042b> CREATOR = new C1770E(26);

    /* renamed from: X  reason: collision with root package name */
    public final int f16744X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f16745Y;

    /* renamed from: Z  reason: collision with root package name */
    public final CharSequence f16746Z;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f16747a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16748b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f16749c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f16750d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16751e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f16752e0;
    public final String f;

    /* renamed from: f0  reason: collision with root package name */
    public final CharSequence f16753f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f16754g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f16755h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f16756i0;

    public C2042b(C2041a c2041a) {
        int size = c2041a.f16728a.size();
        this.f16747a = new int[size * 6];
        if (c2041a.f16733g) {
            this.f16748b = new ArrayList(size);
            this.f16749c = new int[size];
            this.f16750d = new int[size];
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                U u7 = (U) c2041a.f16728a.get(i8);
                int i9 = i7 + 1;
                this.f16747a[i7] = u7.f16715a;
                ArrayList arrayList = this.f16748b;
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = u7.f16716b;
                arrayList.add(abstractComponentCallbacksC2061v != null ? abstractComponentCallbacksC2061v.f16830e : null);
                int[] iArr = this.f16747a;
                iArr[i9] = u7.f16717c ? 1 : 0;
                iArr[i7 + 2] = u7.f16718d;
                iArr[i7 + 3] = u7.f16719e;
                int i10 = i7 + 5;
                iArr[i7 + 4] = u7.f;
                i7 += 6;
                iArr[i10] = u7.f16720g;
                this.f16749c[i8] = u7.f16721h.ordinal();
                this.f16750d[i8] = u7.f16722i.ordinal();
            }
            this.f16751e = c2041a.f;
            this.f = c2041a.f16734h;
            this.f16744X = c2041a.f16743r;
            this.f16745Y = c2041a.f16735i;
            this.f16746Z = c2041a.j;
            this.f16752e0 = c2041a.f16736k;
            this.f16753f0 = c2041a.f16737l;
            this.f16754g0 = c2041a.f16738m;
            this.f16755h0 = c2041a.f16739n;
            this.f16756i0 = c2041a.f16740o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f16747a);
        parcel.writeStringList(this.f16748b);
        parcel.writeIntArray(this.f16749c);
        parcel.writeIntArray(this.f16750d);
        parcel.writeInt(this.f16751e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f16744X);
        parcel.writeInt(this.f16745Y);
        TextUtils.writeToParcel(this.f16746Z, parcel, 0);
        parcel.writeInt(this.f16752e0);
        TextUtils.writeToParcel(this.f16753f0, parcel, 0);
        parcel.writeStringList(this.f16754g0);
        parcel.writeStringList(this.f16755h0);
        parcel.writeInt(this.f16756i0 ? 1 : 0);
    }

    public C2042b(Parcel parcel) {
        this.f16747a = parcel.createIntArray();
        this.f16748b = parcel.createStringArrayList();
        this.f16749c = parcel.createIntArray();
        this.f16750d = parcel.createIntArray();
        this.f16751e = parcel.readInt();
        this.f = parcel.readString();
        this.f16744X = parcel.readInt();
        this.f16745Y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16746Z = (CharSequence) creator.createFromParcel(parcel);
        this.f16752e0 = parcel.readInt();
        this.f16753f0 = (CharSequence) creator.createFromParcel(parcel);
        this.f16754g0 = parcel.createStringArrayList();
        this.f16755h0 = parcel.createStringArrayList();
        this.f16756i0 = parcel.readInt() != 0;
    }
}
