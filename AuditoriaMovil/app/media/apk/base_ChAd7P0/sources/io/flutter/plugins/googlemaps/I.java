package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public Double f12061a;

    /* renamed from: b  reason: collision with root package name */
    public f0 f12062b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12063c;

    /* renamed from: d  reason: collision with root package name */
    public Double f12064d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I.class != obj.getClass()) {
            return false;
        }
        I i7 = (I) obj;
        if (this.f12061a.equals(i7.f12061a) && this.f12062b.equals(i7.f12062b) && this.f12063c.equals(i7.f12063c) && this.f12064d.equals(i7.f12064d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12061a, this.f12062b, this.f12063c, this.f12064d);
    }
}
