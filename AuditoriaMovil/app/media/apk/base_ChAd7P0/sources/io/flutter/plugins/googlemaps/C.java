package io.flutter.plugins.googlemaps;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public String f12037a;

    /* renamed from: b  reason: collision with root package name */
    public String f12038b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c8 = (C) obj;
        if (this.f12037a.equals(c8.f12037a) && Objects.equals(this.f12038b, c8.f12038b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12037a, this.f12038b);
    }
}
