package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public f0 f12071a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12072b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o7 = (O) obj;
        if (this.f12071a.equals(o7.f12071a) && this.f12072b.equals(o7.f12072b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12071a, this.f12072b);
    }
}
