package T3;

import java.util.Arrays;
import m5.d;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5335a;

    public a(byte[] bArr, int i7) {
        byte[] bArr2 = new byte[i7];
        this.f5335a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i7);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(((a) obj).f5335a, this.f5335a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5335a);
    }

    public final String toString() {
        return "Bytes(" + d.e(this.f5335a) + ")";
    }
}
