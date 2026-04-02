package I0;

import K0.x;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2127e = new b(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2128a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2129b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2130c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2131d;

    public b(int i7, int i8, int i9) {
        int i10;
        this.f2128a = i7;
        this.f2129b = i8;
        this.f2130c = i9;
        if (x.I(i9)) {
            i10 = x.B(i9, i8);
        } else {
            i10 = -1;
        }
        this.f2131d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2128a == bVar.f2128a && this.f2129b == bVar.f2129b && this.f2130c == bVar.f2130c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2128a), Integer.valueOf(this.f2129b), Integer.valueOf(this.f2130c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f2128a + ", channelCount=" + this.f2129b + ", encoding=" + this.f2130c + ']';
    }
}
