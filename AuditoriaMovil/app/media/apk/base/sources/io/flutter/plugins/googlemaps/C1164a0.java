package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* renamed from: io.flutter.plugins.googlemaps.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164a0 {

    /* renamed from: a  reason: collision with root package name */
    public Double f12101a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12102b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12103c;

    /* renamed from: d  reason: collision with root package name */
    public Double f12104d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1164a0.class != obj.getClass()) {
            return false;
        }
        C1164a0 c1164a0 = (C1164a0) obj;
        if (this.f12101a.equals(c1164a0.f12101a) && this.f12102b.equals(c1164a0.f12102b) && this.f12103c.equals(c1164a0.f12103c) && this.f12104d.equals(c1164a0.f12104d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12101a, this.f12102b, this.f12103c, this.f12104d);
    }
}
