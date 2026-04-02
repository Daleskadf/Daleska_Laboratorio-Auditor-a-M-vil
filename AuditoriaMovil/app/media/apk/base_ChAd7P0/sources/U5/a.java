package U5;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f5775a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return this.f5775a.equals(((a) obj).f5775a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5775a);
    }
}
