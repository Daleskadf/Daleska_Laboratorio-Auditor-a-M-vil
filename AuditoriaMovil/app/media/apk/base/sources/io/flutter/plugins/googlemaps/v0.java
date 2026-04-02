package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public Double f12291a;

    /* renamed from: b  reason: collision with root package name */
    public Double f12292b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (Objects.equals(this.f12291a, v0Var.f12291a) && Objects.equals(this.f12292b, v0Var.f12292b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12291a, this.f12292b);
    }
}
