package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.Map;
/* renamed from: io.flutter.plugins.googlemaps.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168c0 {

    /* renamed from: a  reason: collision with root package name */
    public Map f12118a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1168c0.class == obj.getClass()) {
            return this.f12118a.equals(((C1168c0) obj).f12118a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12118a);
    }
}
