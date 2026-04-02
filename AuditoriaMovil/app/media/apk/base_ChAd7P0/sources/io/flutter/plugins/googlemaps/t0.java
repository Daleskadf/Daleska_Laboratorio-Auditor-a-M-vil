package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f12279a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f12280b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12281c;

    /* renamed from: d  reason: collision with root package name */
    public Double f12282d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f12279a.equals(t0Var.f12279a) && this.f12280b.equals(t0Var.f12280b) && this.f12281c.equals(t0Var.f12281c) && this.f12282d.equals(t0Var.f12282d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12279a, this.f12280b, this.f12281c, this.f12282d);
    }
}
