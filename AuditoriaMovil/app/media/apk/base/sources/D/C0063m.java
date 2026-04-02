package D;

import android.view.Surface;
/* renamed from: D.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063m {

    /* renamed from: a  reason: collision with root package name */
    public final int f743a;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f744b;

    public C0063m(int i7, Surface surface) {
        this.f743a = i7;
        this.f744b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0063m)) {
            return false;
        }
        C0063m c0063m = (C0063m) obj;
        if (this.f743a == c0063m.f743a && this.f744b.equals(c0063m.f744b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f744b.hashCode() ^ ((this.f743a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f743a + ", surface=" + this.f744b + "}";
    }
}
