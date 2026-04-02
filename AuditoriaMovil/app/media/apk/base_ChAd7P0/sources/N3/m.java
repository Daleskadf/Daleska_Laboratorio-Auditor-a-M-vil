package N3;

import D.AbstractC0059i;
import G3.AbstractC0115c;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class m extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f3429b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3430c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3431d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3432e;

    public m(int i7, int i8, d dVar, d dVar2) {
        this.f3429b = i7;
        this.f3430c = i8;
        this.f3431d = dVar;
        this.f3432e = dVar2;
    }

    public final int b() {
        d dVar = d.f3414o;
        int i7 = this.f3430c;
        d dVar2 = this.f3431d;
        if (dVar2 == dVar) {
            return i7;
        }
        if (dVar2 == d.f3411l) {
            return i7 + 5;
        }
        if (dVar2 == d.f3412m) {
            return i7 + 5;
        }
        if (dVar2 == d.f3413n) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (mVar.f3429b != this.f3429b || mVar.b() != b() || mVar.f3431d != this.f3431d || mVar.f3432e != this.f3432e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(m.class, Integer.valueOf(this.f3429b), Integer.valueOf(this.f3430c), this.f3431d, this.f3432e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f3431d);
        sb.append(", hashType: ");
        sb.append(this.f3432e);
        sb.append(", ");
        sb.append(this.f3430c);
        sb.append("-byte tags, and ");
        return AbstractC0059i.B(sb, this.f3429b, "-byte key)");
    }
}
