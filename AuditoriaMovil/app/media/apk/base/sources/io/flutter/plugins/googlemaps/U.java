package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public V f12079a;

    /* renamed from: b  reason: collision with root package name */
    public B f12080b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12081c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u7 = (U) obj;
        if (this.f12079a.equals(u7.f12079a) && Objects.equals(this.f12080b, u7.f12080b) && Objects.equals(this.f12081c, u7.f12081c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12079a, this.f12080b, this.f12081c);
    }
}
