package g5;

import com.google.android.gms.common.internal.I;
import java.util.Arrays;
/* renamed from: g5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11128a;

    /* renamed from: b  reason: collision with root package name */
    public final C1011c f11129b;

    public /* synthetic */ C1010b(int i7, C1011c c1011c) {
        this.f11128a = i7;
        this.f11129b = c1011c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1010b)) {
            return false;
        }
        C1010b c1010b = (C1010b) obj;
        if (this.f11128a == c1010b.f11128a && I.m(null, null) && I.m(this.f11129b, c1010b.f11129b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11128a), Boolean.FALSE, null, this.f11129b});
    }
}
