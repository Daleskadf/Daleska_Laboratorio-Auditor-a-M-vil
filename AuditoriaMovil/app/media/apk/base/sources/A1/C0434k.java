package a1;

import A3.AbstractC0021t;
import A3.j0;
/* renamed from: a1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434k {

    /* renamed from: a  reason: collision with root package name */
    public final int f6840a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6841b;

    /* renamed from: c  reason: collision with root package name */
    public final H0.r f6842c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f6843d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6844e;

    public C0434k(H0.r rVar, int i7, int i8, j0 j0Var, String str) {
        this.f6840a = i7;
        this.f6841b = i8;
        this.f6842c = rVar;
        this.f6843d = j0.a(j0Var);
        this.f6844e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0434k.class != obj.getClass()) {
            return false;
        }
        C0434k c0434k = (C0434k) obj;
        if (this.f6840a == c0434k.f6840a && this.f6841b == c0434k.f6841b && this.f6842c.equals(c0434k.f6842c)) {
            j0 j0Var = this.f6843d;
            j0Var.getClass();
            if (AbstractC0021t.h(j0Var, c0434k.f6843d) && this.f6844e.equals(c0434k.f6844e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6842c.hashCode();
        int hashCode2 = this.f6843d.hashCode();
        return this.f6844e.hashCode() + ((hashCode2 + ((hashCode + ((((217 + this.f6840a) * 31) + this.f6841b) * 31)) * 31)) * 31);
    }
}
