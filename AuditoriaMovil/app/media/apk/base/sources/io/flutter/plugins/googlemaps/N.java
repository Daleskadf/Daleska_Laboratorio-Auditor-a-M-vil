package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public g0 f12069a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12070b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n7 = (N) obj;
        if (this.f12069a.equals(n7.f12069a) && this.f12070b.equals(n7.f12070b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12069a, this.f12070b);
    }
}
