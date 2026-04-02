package A2;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f79a;

    public b(String str) {
        if (str != null) {
            this.f79a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f79a.equals(((b) obj).f79a);
    }

    public final int hashCode() {
        return this.f79a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0059i.D(new StringBuilder("Encoding{name=\""), this.f79a, "\"}");
    }
}
