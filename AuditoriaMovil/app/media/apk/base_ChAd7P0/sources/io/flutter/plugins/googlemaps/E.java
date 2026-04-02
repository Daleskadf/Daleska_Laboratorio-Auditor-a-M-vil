package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public String f12043a;

    /* renamed from: b  reason: collision with root package name */
    public h0 f12044b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12045c;

    /* renamed from: d  reason: collision with root package name */
    public Double f12046d;

    /* renamed from: e  reason: collision with root package name */
    public Double f12047e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e7 = (E) obj;
        if (this.f12043a.equals(e7.f12043a) && this.f12044b.equals(e7.f12044b) && this.f12045c.equals(e7.f12045c) && Objects.equals(this.f12046d, e7.f12046d) && Objects.equals(this.f12047e, e7.f12047e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12043a, this.f12044b, this.f12045c, this.f12046d, this.f12047e);
    }
}
