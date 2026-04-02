package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public n0 f12238a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12239b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f12238a.equals(m0Var.f12238a) && Objects.equals(this.f12239b, m0Var.f12239b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12238a, this.f12239b);
    }
}
