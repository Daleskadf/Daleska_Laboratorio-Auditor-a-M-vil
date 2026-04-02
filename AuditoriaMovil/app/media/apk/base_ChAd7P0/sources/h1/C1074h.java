package h1;

import A3.B;
import D.AbstractC0059i;
/* renamed from: h1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074h implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11261a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11262b;

    public C1074h(H0.r rVar, int i7) {
        this.f11261a = (rVar.f1880e & 1) != 0;
        this.f11262b = AbstractC0059i.v(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1074h c1074h = (C1074h) obj;
        return B.f81a.c(this.f11262b, c1074h.f11262b).c(this.f11261a, c1074h.f11261a).e();
    }
}
