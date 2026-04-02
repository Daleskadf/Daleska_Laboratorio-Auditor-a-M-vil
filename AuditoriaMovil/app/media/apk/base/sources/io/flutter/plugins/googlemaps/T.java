package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public Double f12078a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T.class == obj.getClass()) {
            return this.f12078a.equals(((T) obj).f12078a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12078a);
    }
}
