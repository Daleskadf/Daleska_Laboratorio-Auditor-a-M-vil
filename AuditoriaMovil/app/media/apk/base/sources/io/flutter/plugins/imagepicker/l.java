package io.flutter.plugins.imagepicker;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public String f12368a;

    /* renamed from: b  reason: collision with root package name */
    public String f12369b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f12368a.equals(lVar.f12368a) && Objects.equals(this.f12369b, lVar.f12369b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12368a, this.f12369b);
    }
}
