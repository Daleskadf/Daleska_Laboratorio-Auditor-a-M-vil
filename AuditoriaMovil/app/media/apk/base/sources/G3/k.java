package G3;

import D.AbstractC0059i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class k extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1557b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1558c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1559d;

    /* renamed from: e  reason: collision with root package name */
    public final j f1560e;
    public final j f;

    public k(int i7, int i8, int i9, j jVar, j jVar2) {
        this.f1557b = i7;
        this.f1558c = i8;
        this.f1559d = i9;
        this.f1560e = jVar;
        this.f = jVar2;
    }

    public final int b() {
        j jVar = j.j;
        int i7 = this.f1559d;
        j jVar2 = this.f1560e;
        if (jVar2 == jVar) {
            return i7 + 16;
        }
        if (jVar2 != j.f1538h && jVar2 != j.f1539i) {
            throw new IllegalStateException("Unknown variant");
        }
        return i7 + 21;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f1557b != this.f1557b || kVar.f1558c != this.f1558c || kVar.b() != b() || kVar.f1560e != this.f1560e || kVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(k.class, Integer.valueOf(this.f1557b), Integer.valueOf(this.f1558c), Integer.valueOf(this.f1559d), this.f1560e, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.f1560e);
        sb.append(", hashType: ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.f1559d);
        sb.append("-byte tags, and ");
        sb.append(this.f1557b);
        sb.append("-byte AES key, and ");
        return AbstractC0059i.B(sb, this.f1558c, "-byte HMAC key)");
    }
}
