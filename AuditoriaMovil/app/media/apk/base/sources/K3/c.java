package K3;

import D.AbstractC0059i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class c extends F3.c {

    /* renamed from: b  reason: collision with root package name */
    public final int f2631b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2632c;

    public c(int i7, b bVar) {
        this.f2631b = i7;
        this.f2632c = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.f2631b != this.f2631b || cVar.f2632c != this.f2632c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(c.class, Integer.valueOf(this.f2631b), this.f2632c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.f2632c);
        sb.append(", ");
        return AbstractC0059i.B(sb, this.f2631b, "-byte key)");
    }
}
