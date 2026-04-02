package g5;

import X5.E;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: g5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011c {

    /* renamed from: a  reason: collision with root package name */
    public final E f11130a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11131b;

    public /* synthetic */ C1011c(E e7, float f) {
        this.f11130a = e7;
        this.f11131b = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1011c)) {
            return false;
        }
        C1011c c1011c = (C1011c) obj;
        if (I.m(this.f11130a, c1011c.f11130a) && this.f11131b == c1011c.f11131b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11130a, Float.valueOf(this.f11131b)});
    }
}
