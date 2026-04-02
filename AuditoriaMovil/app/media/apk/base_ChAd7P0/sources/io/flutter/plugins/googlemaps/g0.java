package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public f0 f12141a;

    /* renamed from: b  reason: collision with root package name */
    public f0 f12142b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f12141a.equals(g0Var.f12141a) && this.f12142b.equals(g0Var.f12142b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12141a, this.f12142b);
    }
}
