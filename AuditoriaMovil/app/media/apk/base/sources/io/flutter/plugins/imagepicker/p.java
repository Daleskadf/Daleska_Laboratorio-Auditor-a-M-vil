package io.flutter.plugins.imagepicker;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f12374a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f12375b;

    /* renamed from: c  reason: collision with root package name */
    public Long f12376c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12374a.equals(pVar.f12374a) && this.f12375b.equals(pVar.f12375b) && Objects.equals(this.f12376c, pVar.f12376c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12374a, this.f12375b, this.f12376c);
    }
}
