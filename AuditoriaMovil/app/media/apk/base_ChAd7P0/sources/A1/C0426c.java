package a1;

import A3.AbstractC0021t;
import A3.j0;
/* renamed from: a1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6797a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6798b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6799c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6800d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6801e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6802g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6803h;

    /* renamed from: i  reason: collision with root package name */
    public final j0 f6804i;
    public final C0425b j;

    public C0426c(C0424a c0424a, j0 j0Var, C0425b c0425b) {
        this.f6797a = c0424a.f6785a;
        this.f6798b = c0424a.f6786b;
        this.f6799c = c0424a.f6787c;
        this.f6800d = c0424a.f6788d;
        this.f = c0424a.f6790g;
        this.f6802g = c0424a.f6791h;
        this.f6801e = c0424a.f;
        this.f6803h = c0424a.f6792i;
        this.f6804i = j0Var;
        this.j = c0425b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0426c.class != obj.getClass()) {
            return false;
        }
        C0426c c0426c = (C0426c) obj;
        if (this.f6797a.equals(c0426c.f6797a) && this.f6798b == c0426c.f6798b && this.f6799c.equals(c0426c.f6799c) && this.f6800d == c0426c.f6800d && this.f6801e == c0426c.f6801e) {
            j0 j0Var = this.f6804i;
            j0Var.getClass();
            if (AbstractC0021t.h(j0Var, c0426c.f6804i) && this.j.equals(c0426c.j) && K0.x.a(this.f, c0426c.f) && K0.x.a(this.f6802g, c0426c.f6802g) && K0.x.a(this.f6803h, c0426c.f6803h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f6799c.hashCode();
        int hashCode4 = (this.j.hashCode() + ((this.f6804i.hashCode() + ((((((hashCode3 + ((((this.f6797a.hashCode() + 217) * 31) + this.f6798b) * 31)) * 31) + this.f6800d) * 31) + this.f6801e) * 31)) * 31)) * 31;
        int i7 = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode4 + hashCode) * 31;
        String str2 = this.f6802g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        String str3 = this.f6803h;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i9 + i7;
    }
}
