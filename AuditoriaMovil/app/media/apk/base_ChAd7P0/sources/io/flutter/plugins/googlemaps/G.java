package io.flutter.plugins.googlemaps;

import j$.util.Objects;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12055a;

    /* renamed from: b  reason: collision with root package name */
    public h0 f12056b;

    /* renamed from: c  reason: collision with root package name */
    public Double f12057c;

    /* renamed from: d  reason: collision with root package name */
    public Double f12058d;

    /* renamed from: e  reason: collision with root package name */
    public Double f12059e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g3 = (G) obj;
        if (Arrays.equals(this.f12055a, g3.f12055a) && this.f12056b.equals(g3.f12056b) && this.f12057c.equals(g3.f12057c) && Objects.equals(this.f12058d, g3.f12058d) && Objects.equals(this.f12059e, g3.f12059e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12055a) + (Objects.hash(this.f12056b, this.f12057c, this.f12058d, this.f12059e) * 31);
    }
}
