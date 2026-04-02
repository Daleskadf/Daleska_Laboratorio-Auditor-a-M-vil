package G3;

import D.AbstractC0059i;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class w extends AbstractC0115c {

    /* renamed from: b  reason: collision with root package name */
    public final int f1585b;

    /* renamed from: c  reason: collision with root package name */
    public final j f1586c;

    public w(int i7, j jVar) {
        this.f1585b = i7;
        this.f1586c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f1585b != this.f1585b || wVar.f1586c != this.f1586c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(w.class, Integer.valueOf(this.f1585b), this.f1586c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f1586c);
        sb.append(", ");
        return AbstractC0059i.B(sb, this.f1585b, "-byte key)");
    }
}
