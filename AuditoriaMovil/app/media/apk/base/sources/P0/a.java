package P0;

import H0.V;
import e1.C0960z;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3893a;

    /* renamed from: b  reason: collision with root package name */
    public final V f3894b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3895c;

    /* renamed from: d  reason: collision with root package name */
    public final C0960z f3896d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3897e;
    public final V f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3898g;

    /* renamed from: h  reason: collision with root package name */
    public final C0960z f3899h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3900i;
    public final long j;

    public a(long j, V v6, int i7, C0960z c0960z, long j8, V v7, int i8, C0960z c0960z2, long j9, long j10) {
        this.f3893a = j;
        this.f3894b = v6;
        this.f3895c = i7;
        this.f3896d = c0960z;
        this.f3897e = j8;
        this.f = v7;
        this.f3898g = i8;
        this.f3899h = c0960z2;
        this.f3900i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3893a == aVar.f3893a && this.f3895c == aVar.f3895c && this.f3897e == aVar.f3897e && this.f3898g == aVar.f3898g && this.f3900i == aVar.f3900i && this.j == aVar.j && F.f.l(this.f3894b, aVar.f3894b) && F.f.l(this.f3896d, aVar.f3896d) && F.f.l(this.f, aVar.f) && F.f.l(this.f3899h, aVar.f3899h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3893a), this.f3894b, Integer.valueOf(this.f3895c), this.f3896d, Long.valueOf(this.f3897e), this.f, Integer.valueOf(this.f3898g), this.f3899h, Long.valueOf(this.f3900i), Long.valueOf(this.j)});
    }
}
