package com.google.firebase.firestore;

import n4.C1516b;
import n4.C1533t;
/* loaded from: classes.dex */
public final /* synthetic */ class G implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1516b f9757a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1533t f9758b;

    public /* synthetic */ G(C1516b c1516b, C1533t c1533t) {
        this.f9757a = c1516b;
        this.f9758b = c1533t;
    }

    @Override // com.google.firebase.firestore.Q
    public final void remove() {
        C1516b c1516b = this.f9757a;
        C1533t c1533t = this.f9758b;
        c1516b.f14332c = true;
        c1533t.getClass();
        c1533t.f14363d.a(new S(21, c1533t, c1516b));
    }
}
