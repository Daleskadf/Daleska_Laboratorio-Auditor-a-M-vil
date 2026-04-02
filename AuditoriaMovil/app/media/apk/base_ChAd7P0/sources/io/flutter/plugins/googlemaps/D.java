package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public String f12040a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12041b;

    /* renamed from: c  reason: collision with root package name */
    public Z f12042c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d7 = (D) obj;
        if (this.f12040a.equals(d7.f12040a) && this.f12041b.equals(d7.f12041b) && Objects.equals(this.f12042c, d7.f12042c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12040a, this.f12041b, this.f12042c);
    }
}
