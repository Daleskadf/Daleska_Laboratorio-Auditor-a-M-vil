package D;

import android.graphics.Rect;
import android.util.Size;
/* renamed from: D.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060j {

    /* renamed from: a  reason: collision with root package name */
    public final Size f719a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f720b;

    /* renamed from: c  reason: collision with root package name */
    public final int f721c;

    public C0060j(Size size, Rect rect, int i7) {
        this.f719a = size;
        this.f720b = rect;
        this.f721c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0060j)) {
            return false;
        }
        C0060j c0060j = (C0060j) obj;
        if (this.f719a.equals(c0060j.f719a) && this.f720b.equals(c0060j.f720b) && this.f721c == c0060j.f721c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f719a.hashCode() ^ 1000003) * 1000003) ^ this.f720b.hashCode()) * 1000003) ^ this.f721c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.f719a);
        sb.append(", cropRect=");
        sb.append(this.f720b);
        sb.append(", rotationDegrees=");
        return AbstractC0059i.B(sb, this.f721c, "}");
    }
}
