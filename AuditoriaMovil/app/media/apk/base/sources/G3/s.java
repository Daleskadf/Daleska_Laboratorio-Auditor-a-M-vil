package G3;

import D.AbstractC0059i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class s extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1576b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1577c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1578d;

    /* renamed from: e  reason: collision with root package name */
    public final j f1579e;

    public s(int i7, int i8, int i9, j jVar) {
        this.f1576b = i7;
        this.f1577c = i8;
        this.f1578d = i9;
        this.f1579e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f1576b != this.f1576b || sVar.f1577c != this.f1577c || sVar.f1578d != this.f1578d || sVar.f1579e != this.f1579e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(s.class, Integer.valueOf(this.f1576b), Integer.valueOf(this.f1577c), Integer.valueOf(this.f1578d), this.f1579e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f1579e);
        sb.append(", ");
        sb.append(this.f1577c);
        sb.append("-byte IV, ");
        sb.append(this.f1578d);
        sb.append("-byte tag, and ");
        return AbstractC0059i.B(sb, this.f1576b, "-byte key)");
    }
}
