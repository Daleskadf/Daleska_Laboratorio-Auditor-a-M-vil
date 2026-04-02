package z0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new P(0);

    /* renamed from: X  reason: collision with root package name */
    public final boolean f16696X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f16697Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f16698Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f16699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16700b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16701c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16702d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16703e;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f16704e0;
    public final String f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f16705f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f16706g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f16707h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f16708i0;

    public Q(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        this.f16699a = abstractComponentCallbacksC2061v.getClass().getName();
        this.f16700b = abstractComponentCallbacksC2061v.f16830e;
        this.f16701c = abstractComponentCallbacksC2061v.f16835i0;
        this.f16702d = abstractComponentCallbacksC2061v.f16843r0;
        this.f16703e = abstractComponentCallbacksC2061v.f16844s0;
        this.f = abstractComponentCallbacksC2061v.f16845t0;
        this.f16696X = abstractComponentCallbacksC2061v.f16848w0;
        this.f16697Y = abstractComponentCallbacksC2061v.f16833g0;
        this.f16698Z = abstractComponentCallbacksC2061v.f16847v0;
        this.f16704e0 = abstractComponentCallbacksC2061v.f16846u0;
        this.f16705f0 = abstractComponentCallbacksC2061v.f16817G0.ordinal();
        this.f16706g0 = abstractComponentCallbacksC2061v.f16824Y;
        this.f16707h0 = abstractComponentCallbacksC2061v.f16825Z;
        this.f16708i0 = abstractComponentCallbacksC2061v.f16812B0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append("FragmentState{");
        sb.append(this.f16699a);
        sb.append(" (");
        sb.append(this.f16700b);
        sb.append(")}:");
        if (this.f16701c) {
            sb.append(" fromLayout");
        }
        int i7 = this.f16703e;
        if (i7 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i7));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f16696X) {
            sb.append(" retainInstance");
        }
        if (this.f16697Y) {
            sb.append(" removing");
        }
        if (this.f16698Z) {
            sb.append(" detached");
        }
        if (this.f16704e0) {
            sb.append(" hidden");
        }
        String str2 = this.f16706g0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f16707h0);
        }
        if (this.f16708i0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16699a);
        parcel.writeString(this.f16700b);
        parcel.writeInt(this.f16701c ? 1 : 0);
        parcel.writeInt(this.f16702d);
        parcel.writeInt(this.f16703e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f16696X ? 1 : 0);
        parcel.writeInt(this.f16697Y ? 1 : 0);
        parcel.writeInt(this.f16698Z ? 1 : 0);
        parcel.writeInt(this.f16704e0 ? 1 : 0);
        parcel.writeInt(this.f16705f0);
        parcel.writeString(this.f16706g0);
        parcel.writeInt(this.f16707h0);
        parcel.writeInt(this.f16708i0 ? 1 : 0);
    }

    public Q(Parcel parcel) {
        this.f16699a = parcel.readString();
        this.f16700b = parcel.readString();
        this.f16701c = parcel.readInt() != 0;
        this.f16702d = parcel.readInt();
        this.f16703e = parcel.readInt();
        this.f = parcel.readString();
        this.f16696X = parcel.readInt() != 0;
        this.f16697Y = parcel.readInt() != 0;
        this.f16698Z = parcel.readInt() != 0;
        this.f16704e0 = parcel.readInt() != 0;
        this.f16705f0 = parcel.readInt();
        this.f16706g0 = parcel.readString();
        this.f16707h0 = parcel.readInt();
        this.f16708i0 = parcel.readInt() != 0;
    }
}
