package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public Object f12031a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            return this.f12031a.equals(((B) obj).f12031a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12031a);
    }
}
