package io.flutter.plugins.firebase.storage;

import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f12018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L5.h f12019b;

    public /* synthetic */ r(v vVar, L5.h hVar) {
        this.f12018a = vVar;
        this.f12019b = hVar;
    }

    public final void a(Object obj) {
        v vVar = this.f12018a;
        L5.h hVar = this.f12019b;
        com.google.firebase.storage.u uVar = (com.google.firebase.storage.u) obj;
        if (!vVar.f12026a.f11991k.booleanValue()) {
            HashMap c8 = vVar.c(uVar, null);
            c8.put("taskState", Integer.valueOf(p.PAUSED.index));
            hVar.c(c8);
            e eVar = vVar.f12026a;
            synchronized (eVar.f11988g) {
                eVar.f11988g.notifyAll();
            }
        }
    }
}
