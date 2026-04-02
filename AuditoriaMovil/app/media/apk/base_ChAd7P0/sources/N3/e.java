package N3;

import D.AbstractC0059i;
import G3.AbstractC0115c;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class e extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f3417b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3418c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3419d;

    public e(int i7, int i8, d dVar) {
        this.f3417b = i7;
        this.f3418c = i8;
        this.f3419d = dVar;
    }

    public final int b() {
        d dVar = d.f;
        int i7 = this.f3418c;
        d dVar2 = this.f3419d;
        if (dVar2 == dVar) {
            return i7;
        }
        if (dVar2 == d.f3404c) {
            return i7 + 5;
        }
        if (dVar2 == d.f3405d) {
            return i7 + 5;
        }
        if (dVar2 == d.f3406e) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f3417b != this.f3417b || eVar.b() != b() || eVar.f3419d != this.f3419d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f3417b), Integer.valueOf(this.f3418c), this.f3419d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f3419d);
        sb.append(", ");
        sb.append(this.f3418c);
        sb.append("-byte tags, and ");
        return AbstractC0059i.B(sb, this.f3417b, "-byte key)");
    }
}
