package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public Double f12073a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12074b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p7 = (P) obj;
        if (this.f12073a.equals(p7.f12073a) && this.f12074b.equals(p7.f12074b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12073a, this.f12074b);
    }
}
