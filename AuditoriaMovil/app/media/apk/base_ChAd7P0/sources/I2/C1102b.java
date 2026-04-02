package i2;

import D.AbstractC0059i;
import android.graphics.Rect;
/* renamed from: i2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102b {

    /* renamed from: a  reason: collision with root package name */
    public final int f11449a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11450b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11451c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11452d;

    public C1102b(Rect rect) {
        int i7 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        this.f11449a = i7;
        this.f11450b = i8;
        this.f11451c = i9;
        this.f11452d = i10;
        if (i7 <= i9) {
            if (i8 <= i10) {
                return;
            }
            throw new IllegalArgumentException(AbstractC0059i.x("top must be less than or equal to bottom, top: ", i8, i10, ", bottom: ").toString());
        }
        throw new IllegalArgumentException(AbstractC0059i.x("Left must be less than or equal to right, left: ", i7, i9, ", right: ").toString());
    }

    public final int a() {
        return this.f11452d - this.f11450b;
    }

    public final int b() {
        return this.f11451c - this.f11449a;
    }

    public final Rect c() {
        return new Rect(this.f11449a, this.f11450b, this.f11451c, this.f11452d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C1102b.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C1102b c1102b = (C1102b) obj;
        if (this.f11449a == c1102b.f11449a && this.f11450b == c1102b.f11450b && this.f11451c == c1102b.f11451c && this.f11452d == c1102b.f11452d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11449a * 31) + this.f11450b) * 31) + this.f11451c) * 31) + this.f11452d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1102b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f11449a);
        sb.append(',');
        sb.append(this.f11450b);
        sb.append(',');
        sb.append(this.f11451c);
        sb.append(',');
        return AbstractC0059i.B(sb, this.f11452d, "] }");
    }
}
