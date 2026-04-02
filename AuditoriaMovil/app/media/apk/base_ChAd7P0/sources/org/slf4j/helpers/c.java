package org.slf4j.helpers;

import c6.Q;
import com.google.firebase.firestore.Z;
import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14625a;

    /* renamed from: b  reason: collision with root package name */
    public final g7.a f14626b;

    public c(int i7) {
        this.f14625a = i7;
        switch (i7) {
            case 1:
                this.f14626b = new Q();
                new ConcurrentHashMap();
                new ThreadLocal();
                new InheritableThreadLocal();
                return;
            default:
                this.f14626b = new Z(21);
                new ConcurrentHashMap();
                return;
        }
    }
}
