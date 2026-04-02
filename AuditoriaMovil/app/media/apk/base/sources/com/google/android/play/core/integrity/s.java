package com.google.android.play.core.integrity;

import android.content.Context;
import u0.C1855k;
/* loaded from: classes.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final s f9580a = this;

    /* renamed from: b  reason: collision with root package name */
    private final w3.i f9581b;

    /* renamed from: c  reason: collision with root package name */
    private final w3.i f9582c;

    /* renamed from: d  reason: collision with root package name */
    private final w3.i f9583d;

    /* renamed from: e  reason: collision with root package name */
    private final w3.i f9584e;
    private final w3.i f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context != null) {
            C1855k c1855k = new C1855k(context, 1);
            this.f9581b = c1855k;
            adVar = ac.f9474a;
            w3.g b5 = w3.g.b(adVar);
            this.f9582c = b5;
            mVar = l.f9573a;
            au auVar = new au(c1855k, mVar);
            this.f9583d = auVar;
            mVar2 = l.f9573a;
            w3.g b7 = w3.g.b(new al(c1855k, b5, auVar, mVar2));
            this.f9584e = b7;
            this.f = w3.g.b(new ab(b7));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
