package D3;

import G.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f857c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f858a;

    /* renamed from: b  reason: collision with root package name */
    public final int f859b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f858a = iArr;
        this.f859b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i7 = aVar.f859b;
        int i8 = this.f859b;
        if (i8 != i7) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            i.i(i9, i8);
            int i10 = this.f858a[i9];
            i.i(i9, aVar.f859b);
            if (i10 != aVar.f858a[i9]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f859b; i8++) {
            i7 = (i7 * 31) + this.f858a[i8];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f859b;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        int[] iArr = this.f858a;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }
}
