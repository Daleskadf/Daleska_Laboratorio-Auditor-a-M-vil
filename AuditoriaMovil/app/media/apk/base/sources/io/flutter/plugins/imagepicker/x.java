package io.flutter.plugins.imagepicker;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public Long f12386a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            return Objects.equals(this.f12386a, ((x) obj).f12386a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12386a);
    }
}
