package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* renamed from: io.flutter.plugins.googlemaps.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170d0 {

    /* renamed from: a  reason: collision with root package name */
    public String f12124a;

    /* renamed from: b  reason: collision with root package name */
    public String f12125b;

    /* renamed from: c  reason: collision with root package name */
    public Z f12126c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1170d0.class != obj.getClass()) {
            return false;
        }
        C1170d0 c1170d0 = (C1170d0) obj;
        if (Objects.equals(this.f12124a, c1170d0.f12124a) && Objects.equals(this.f12125b, c1170d0.f12125b) && this.f12126c.equals(c1170d0.f12126c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12124a, this.f12125b, this.f12126c);
    }
}
