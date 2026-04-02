package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.List;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public String f12090a;

    /* renamed from: b  reason: collision with root package name */
    public f0 f12091b;

    /* renamed from: c  reason: collision with root package name */
    public g0 f12092c;

    /* renamed from: d  reason: collision with root package name */
    public List f12093d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x7 = (X) obj;
        if (this.f12090a.equals(x7.f12090a) && this.f12091b.equals(x7.f12091b) && this.f12092c.equals(x7.f12092c) && this.f12093d.equals(x7.f12093d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12090a, this.f12091b, this.f12092c, this.f12093d);
    }
}
