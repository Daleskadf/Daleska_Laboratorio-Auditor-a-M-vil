package F3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class q implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1189a;

    public q(byte[] bArr) {
        this.f1189a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        byte[] bArr = this.f1189a;
        int length = bArr.length;
        byte[] bArr2 = qVar.f1189a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b5 = bArr[i7];
            byte b7 = qVar.f1189a[i7];
            if (b5 != b7) {
                return b5 - b7;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        return Arrays.equals(this.f1189a, ((q) obj).f1189a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1189a);
    }

    public final String toString() {
        return m5.d.e(this.f1189a);
    }
}
