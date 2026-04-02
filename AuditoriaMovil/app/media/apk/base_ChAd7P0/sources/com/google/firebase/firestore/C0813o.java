package com.google.firebase.firestore;

import n4.C1516b;
import n4.C1533t;
import n4.RunnableC1532s;
/* renamed from: com.google.firebase.firestore.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0813o implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9834a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1516b f9835b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1533t f9836c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n4.E f9837d;

    public /* synthetic */ C0813o(C1516b c1516b, C1533t c1533t, n4.E e7, int i7) {
        this.f9834a = i7;
        this.f9835b = c1516b;
        this.f9836c = c1533t;
        this.f9837d = e7;
    }

    @Override // com.google.firebase.firestore.Q
    public final void remove() {
        switch (this.f9834a) {
            case 0:
                C1516b c1516b = this.f9835b;
                C1533t c1533t = this.f9836c;
                n4.E e7 = this.f9837d;
                c1516b.f14332c = true;
                c1533t.getClass();
                c1533t.f14363d.a(new RunnableC1532s(c1533t, e7, 0));
                return;
            default:
                C1516b c1516b2 = this.f9835b;
                C1533t c1533t2 = this.f9836c;
                n4.E e8 = this.f9837d;
                c1516b2.f14332c = true;
                c1533t2.getClass();
                c1533t2.f14363d.a(new RunnableC1532s(c1533t2, e8, 0));
                return;
        }
    }
}
