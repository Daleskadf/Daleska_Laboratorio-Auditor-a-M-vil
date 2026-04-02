package y;

import android.os.Build;
import android.view.Surface;
/* renamed from: y.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2028h {

    /* renamed from: a  reason: collision with root package name */
    public final q f16578a;

    public C2028h(int i7, Surface surface) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f16578a = new o(i7, surface);
        } else if (i8 >= 28) {
            this.f16578a = new n(i7, surface);
        } else if (i8 >= 26) {
            this.f16578a = new l(i7, surface);
        } else if (i8 >= 24) {
            this.f16578a = new C2030j(i7, surface);
        } else {
            this.f16578a = new q(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2028h)) {
            return false;
        }
        return this.f16578a.equals(((C2028h) obj).f16578a);
    }

    public final int hashCode() {
        return this.f16578a.hashCode();
    }

    public C2028h(C2030j c2030j) {
        this.f16578a = c2030j;
    }
}
