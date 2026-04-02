package io.flutter.plugins.firebase.auth;

import D.AbstractC0055e;
import a4.AbstractC0467p;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final /* synthetic */ class P {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f11827a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f11828b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L5.h f11829c;

    public /* synthetic */ P(AtomicBoolean atomicBoolean, HashMap hashMap, L5.h hVar) {
        this.f11827a = atomicBoolean;
        this.f11828b = hashMap;
        this.f11829c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f11827a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        AbstractC0467p abstractC0467p = firebaseAuth.f;
        HashMap hashMap = this.f11828b;
        if (abstractC0467p == null) {
            hashMap.put("user", null);
        } else {
            hashMap.put("user", AbstractC0055e.p(AbstractC0055e.t(abstractC0467p)));
        }
        this.f11829c.c(hashMap);
    }
}
