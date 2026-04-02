package io.flutter.plugins.imagepicker;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public w f12384a;

    /* renamed from: b  reason: collision with root package name */
    public u f12385b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f12384a.equals(vVar.f12384a) && Objects.equals(this.f12385b, vVar.f12385b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12384a, this.f12385b);
    }
}
