package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public Long f12272a;

    /* renamed from: b  reason: collision with root package name */
    public Long f12273b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f12274c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f12272a.equals(s0Var.f12272a) && this.f12273b.equals(s0Var.f12273b) && Arrays.equals(this.f12274c, s0Var.f12274c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12274c) + (Objects.hash(this.f12272a, this.f12273b) * 31);
    }
}
