package com.google.crypto.tink.shaded.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f9635c = new d0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f9637b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final O f9636a = new O();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.X] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.X] */
    public final g0 a(Class cls) {
        W B7;
        W w2;
        Class cls2;
        D.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9637b;
        g0 g0Var = (g0) concurrentHashMap.get(cls);
        if (g0Var == null) {
            O o7 = this.f9636a;
            o7.getClass();
            Class cls3 = h0.f9651a;
            if (!AbstractC0797y.class.isAssignableFrom(cls) && (cls2 = h0.f9651a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            f0 a7 = ((N) o7.f9607a).a(cls);
            if ((a7.f9646d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0797y.class.isAssignableFrom(cls);
                AbstractC0774a abstractC0774a = a7.f9643a;
                if (isAssignableFrom) {
                    w2 = new X(h0.f9654d, AbstractC0789p.f9683a, abstractC0774a);
                } else {
                    k0 k0Var = h0.f9652b;
                    C0788o c0788o = AbstractC0789p.f9684b;
                    if (c0788o != null) {
                        w2 = new X(k0Var, c0788o, abstractC0774a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                B7 = w2;
            } else if (AbstractC0797y.class.isAssignableFrom(cls)) {
                if (a7.d() == c0.PROTO2) {
                    B7 = W.B(a7, Z.f9631b, L.f9604b, h0.f9654d, AbstractC0789p.f9683a, S.f9611b);
                } else {
                    B7 = W.B(a7, Z.f9631b, L.f9604b, h0.f9654d, null, S.f9611b);
                }
            } else if (a7.d() == c0.PROTO2) {
                Y y2 = Z.f9630a;
                J j = L.f9603a;
                k0 k0Var2 = h0.f9652b;
                C0788o c0788o2 = AbstractC0789p.f9684b;
                if (c0788o2 != null) {
                    B7 = W.B(a7, y2, j, k0Var2, c0788o2, S.f9610a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                B7 = W.B(a7, Z.f9630a, L.f9603a, h0.f9653c, null, S.f9610a);
            }
            g0 g0Var2 = (g0) concurrentHashMap.putIfAbsent(cls, B7);
            if (g0Var2 != null) {
                return g0Var2;
            }
            return B7;
        }
        return g0Var;
    }
}
