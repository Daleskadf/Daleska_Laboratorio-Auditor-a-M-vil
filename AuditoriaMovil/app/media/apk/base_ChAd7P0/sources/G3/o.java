package G3;

import D.AbstractC0059i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class o extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1567b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1568c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1569d;

    /* renamed from: e  reason: collision with root package name */
    public final j f1570e;

    public o(int i7, int i8, int i9, j jVar) {
        this.f1567b = i7;
        this.f1568c = i8;
        this.f1569d = i9;
        this.f1570e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f1567b != this.f1567b || oVar.f1568c != this.f1568c || oVar.f1569d != this.f1569d || oVar.f1570e != this.f1570e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(o.class, Integer.valueOf(this.f1567b), Integer.valueOf(this.f1568c), Integer.valueOf(this.f1569d), this.f1570e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f1570e);
        sb.append(", ");
        sb.append(this.f1568c);
        sb.append("-byte IV, ");
        sb.append(this.f1569d);
        sb.append("-byte tag, and ");
        return AbstractC0059i.B(sb, this.f1567b, "-byte key)");
    }
}
