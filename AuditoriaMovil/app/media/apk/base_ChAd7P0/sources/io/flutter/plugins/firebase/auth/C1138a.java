package io.flutter.plugins.firebase.auth;

import D.AbstractC0055e;
import a4.AbstractC0467p;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.flutter.plugins.firebase.auth.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1138a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f11841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f11842b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L5.h f11843c;

    public /* synthetic */ C1138a(AtomicBoolean atomicBoolean, HashMap hashMap, L5.h hVar) {
        this.f11841a = atomicBoolean;
        this.f11842b = hashMap;
        this.f11843c = hVar;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f11841a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        AbstractC0467p abstractC0467p = firebaseAuth.f;
        HashMap hashMap = this.f11842b;
        if (abstractC0467p == null) {
            hashMap.put("user", null);
        } else {
            hashMap.put("user", AbstractC0055e.p(AbstractC0055e.t(abstractC0467p)));
        }
        this.f11843c.c(hashMap);
    }
}
