package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public Double f12060a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H.class == obj.getClass()) {
            return Objects.equals(this.f12060a, ((H) obj).f12060a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12060a);
    }
}
