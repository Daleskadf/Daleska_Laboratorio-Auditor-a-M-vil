package e6;

import D.AbstractC0059i;
import Q6.AbstractC0281b;
/* renamed from: e6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0967b {

    /* renamed from: d  reason: collision with root package name */
    public static final Q6.g f10921d;

    /* renamed from: e  reason: collision with root package name */
    public static final Q6.g f10922e;
    public static final Q6.g f;

    /* renamed from: g  reason: collision with root package name */
    public static final Q6.g f10923g;

    /* renamed from: h  reason: collision with root package name */
    public static final Q6.g f10924h;

    /* renamed from: a  reason: collision with root package name */
    public final Q6.g f10925a;

    /* renamed from: b  reason: collision with root package name */
    public final Q6.g f10926b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10927c;

    static {
        Q6.g gVar = Q6.g.f4463d;
        f10921d = AbstractC0281b.d(":status");
        f10922e = AbstractC0281b.d(":method");
        f = AbstractC0281b.d(":path");
        f10923g = AbstractC0281b.d(":scheme");
        f10924h = AbstractC0281b.d(":authority");
        AbstractC0281b.d(":host");
        AbstractC0281b.d(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0967b(Q6.g gVar, String str) {
        this(gVar, AbstractC0281b.d(str));
        Q6.g gVar2 = Q6.g.f4463d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0967b)) {
            return false;
        }
        C0967b c0967b = (C0967b) obj;
        if (!this.f10925a.equals(c0967b.f10925a) || !this.f10926b.equals(c0967b.f10926b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10926b.hashCode() + ((this.f10925a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return AbstractC0059i.A(this.f10925a.r(), ": ", this.f10926b.r());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0967b(String str, String str2) {
        this(AbstractC0281b.d(str), AbstractC0281b.d(str2));
        Q6.g gVar = Q6.g.f4463d;
    }

    public C0967b(Q6.g gVar, Q6.g gVar2) {
        this.f10925a = gVar;
        this.f10926b = gVar2;
        this.f10927c = gVar2.c() + gVar.c() + 32;
    }
}
