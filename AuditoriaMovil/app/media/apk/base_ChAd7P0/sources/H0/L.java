package H0;

import java.util.Locale;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: d  reason: collision with root package name */
    public static final L f1700d = new L(1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f1701a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1702b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1703c;

    static {
        K0.x.H(0);
        K0.x.H(1);
    }

    public L(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l8 = (L) obj;
        if (this.f1701a == l8.f1701a && this.f1702b == l8.f1702b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1702b) + ((Float.floatToRawIntBits(this.f1701a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1701a), Float.valueOf(this.f1702b)};
        int i7 = K0.x.f2529a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public L(float f, float f4) {
        K0.a.e(f > 0.0f);
        K0.a.e(f4 > 0.0f);
        this.f1701a = f;
        this.f1702b = f4;
        this.f1703c = Math.round(f * 1000.0f);
    }
}
