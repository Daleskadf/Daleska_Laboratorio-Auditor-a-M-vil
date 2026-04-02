package n3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: n3.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503r implements Parcelable {
    public static final Parcelable.Creator<C1503r> CREATOR = new U(27);

    /* renamed from: a  reason: collision with root package name */
    public final Enum f14244a;

    public C1503r(InterfaceC1486a interfaceC1486a) {
        com.google.android.gms.common.internal.I.i(interfaceC1486a);
        this.f14244a = (Enum) interfaceC1486a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1503r a(int i7) {
        EnumC1504s[] values;
        EnumC1474G enumC1474G;
        if (i7 == EnumC1474G.LEGACY_RS1.a()) {
            enumC1474G = EnumC1474G.RS1;
        } else {
            EnumC1474G[] values2 = EnumC1474G.values();
            int length = values2.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    EnumC1474G enumC1474G2 = values2[i8];
                    if (enumC1474G2.a() == i7) {
                        enumC1474G = enumC1474G2;
                        break;
                    }
                    i8++;
                } else {
                    for (EnumC1474G enumC1474G3 : EnumC1504s.values()) {
                        if (enumC1474G3.a() == i7) {
                            enumC1474G = enumC1474G3;
                        }
                    }
                    throw new Exception(io.flutter.plugins.pathprovider.b.f("Algorithm with COSE value ", i7, " not supported"));
                }
            }
        }
        return new C1503r(enumC1474G);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, n3.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n3.a] */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1503r) || this.f14244a.a() != ((C1503r) obj).f14244a.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14244a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, n3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f14244a.a());
    }
}
