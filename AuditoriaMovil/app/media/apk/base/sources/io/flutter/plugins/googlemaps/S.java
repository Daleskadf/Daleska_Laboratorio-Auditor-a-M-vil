package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public Double f12076a;

    /* renamed from: b  reason: collision with root package name */
    public Z f12077b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s7 = (S) obj;
        if (this.f12076a.equals(s7.f12076a) && Objects.equals(this.f12077b, s7.f12077b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12076a, this.f12077b);
    }
}
