package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f12075a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class == obj.getClass()) {
            return this.f12075a.equals(((Q) obj).f12075a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12075a);
    }
}
