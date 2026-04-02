package P3;

import F3.g;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final g f4018a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4019b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4020c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4021d;

    public b(g gVar, int i7, String str, String str2) {
        this.f4018a = gVar;
        this.f4019b = i7;
        this.f4020c = str;
        this.f4021d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4018a != bVar.f4018a || this.f4019b != bVar.f4019b || !this.f4020c.equals(bVar.f4020c) || !this.f4021d.equals(bVar.f4021d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f4018a, Integer.valueOf(this.f4019b), this.f4020c, this.f4021d);
    }

    public final String toString() {
        return "(status=" + this.f4018a + ", keyId=" + this.f4019b + ", keyType='" + this.f4020c + "', keyPrefix='" + this.f4021d + "')";
    }
}
