package Z;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f6708e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f6709a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6710b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6711c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6712d;

    public c(int i7, int i8, int i9, int i10) {
        this.f6709a = i7;
        this.f6710b = i8;
        this.f6711c = i9;
        this.f6712d = i10;
    }

    public static c a(int i7, int i8, int i9, int i10) {
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return f6708e;
        }
        return new c(i7, i8, i9, i10);
    }

    public final Insets b() {
        return b.a(this.f6709a, this.f6710b, this.f6711c, this.f6712d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6712d == cVar.f6712d && this.f6709a == cVar.f6709a && this.f6711c == cVar.f6711c && this.f6710b == cVar.f6710b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f6709a * 31) + this.f6710b) * 31) + this.f6711c) * 31) + this.f6712d;
    }

    public final String toString() {
        return "Insets{left=" + this.f6709a + ", top=" + this.f6710b + ", right=" + this.f6711c + ", bottom=" + this.f6712d + '}';
    }
}
