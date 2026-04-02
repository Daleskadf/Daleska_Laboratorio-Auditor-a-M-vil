package m4;

import q4.q;
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14030a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14031b;

    /* renamed from: c  reason: collision with root package name */
    public final q f14032c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14033d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14034e;

    public e(String str, int i7, q qVar, int i8, long j) {
        this.f14030a = str;
        this.f14031b = i7;
        this.f14032c = qVar;
        this.f14033d = i8;
        this.f14034e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14031b != eVar.f14031b || this.f14033d != eVar.f14033d || this.f14034e != eVar.f14034e || !this.f14030a.equals(eVar.f14030a)) {
            return false;
        }
        return this.f14032c.equals(eVar.f14032c);
    }

    public final int hashCode() {
        long j = this.f14034e;
        return this.f14032c.f15371a.hashCode() + (((((((this.f14030a.hashCode() * 31) + this.f14031b) * 31) + this.f14033d) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }
}
