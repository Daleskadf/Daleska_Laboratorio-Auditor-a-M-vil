package com.google.android.play.core.integrity;

import android.content.Context;
import u0.C1855k;
/* loaded from: classes.dex */
final class w implements aw {

    /* renamed from: a  reason: collision with root package name */
    private final w f9586a = this;

    /* renamed from: b  reason: collision with root package name */
    private final w3.i f9587b;

    /* renamed from: c  reason: collision with root package name */
    private final w3.i f9588c;

    /* renamed from: d  reason: collision with root package name */
    private final w3.i f9589d;

    /* renamed from: e  reason: collision with root package name */
    private final w3.i f9590e;
    private final w3.i f;

    /* renamed from: g  reason: collision with root package name */
    private final w3.i f9591g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context != null) {
            C1855k c1855k = new C1855k(context, 1);
            this.f9587b = c1855k;
            bcVar = bb.f9526a;
            w3.g b5 = w3.g.b(bcVar);
            this.f9588c = b5;
            oVar = n.f9578a;
            au auVar = new au(c1855k, oVar);
            this.f9589d = auVar;
            oVar2 = n.f9578a;
            w3.g b7 = w3.g.b(new bp(c1855k, b5, auVar, oVar2));
            this.f9590e = b7;
            w3.g b8 = w3.g.b(new bu(b7));
            this.f = b8;
            this.f9591g = w3.g.b(new ba(b7, b8));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f9591g.a();
    }
}
