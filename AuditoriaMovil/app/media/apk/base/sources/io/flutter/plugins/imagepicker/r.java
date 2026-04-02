package io.flutter.plugins.imagepicker;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Double f12379a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12380b;

    /* renamed from: c  reason: collision with root package name */
    public Long f12381c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (Objects.equals(this.f12379a, rVar.f12379a) && Objects.equals(this.f12380b, rVar.f12380b) && this.f12381c.equals(rVar.f12381c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12379a, this.f12380b, this.f12381c);
    }
}
