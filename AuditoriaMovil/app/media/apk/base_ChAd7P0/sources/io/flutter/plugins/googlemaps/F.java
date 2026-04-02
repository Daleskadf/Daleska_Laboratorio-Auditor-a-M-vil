package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12053a;

    /* renamed from: b  reason: collision with root package name */
    public Z f12054b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        if (Arrays.equals(this.f12053a, f.f12053a) && Objects.equals(this.f12054b, f.f12054b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12053a) + (Objects.hash(this.f12054b) * 31);
    }
}
