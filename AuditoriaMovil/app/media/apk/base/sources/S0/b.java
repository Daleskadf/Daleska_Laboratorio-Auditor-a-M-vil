package S0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4843a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4844b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4845c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4846d;

    public b(String str, int i7, int i8, String str2) {
        this.f4843a = str;
        this.f4844b = str2;
        this.f4845c = i7;
        this.f4846d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4845c == bVar.f4845c && this.f4846d == bVar.f4846d && F.f.l(this.f4843a, bVar.f4843a) && F.f.l(this.f4844b, bVar.f4844b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4843a, this.f4844b, Integer.valueOf(this.f4845c), Integer.valueOf(this.f4846d)});
    }
}
