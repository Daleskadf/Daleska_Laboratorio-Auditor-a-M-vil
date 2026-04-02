package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public Double f12095a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12096b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z7 = (Z) obj;
        if (this.f12095a.equals(z7.f12095a) && this.f12096b.equals(z7.f12096b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12095a, this.f12096b);
    }
}
