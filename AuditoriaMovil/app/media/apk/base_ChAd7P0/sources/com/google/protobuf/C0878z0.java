package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.protobuf.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C0878z0 f10148c = new C0878z0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f10150b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final C0845i0 f10149a = new C0845i0(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.protobuf.s0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.protobuf.s0] */
    public final E0 a(Class cls) {
        C0862r0 A7;
        C0862r0 c0862r0;
        Class cls2;
        V.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f10150b;
        E0 e02 = (E0) concurrentHashMap.get(cls);
        if (e02 == null) {
            C0845i0 c0845i0 = this.f10149a;
            c0845i0.getClass();
            Class cls3 = F0.f10002a;
            if (!J.class.isAssignableFrom(cls) && (cls2 = F0.f10002a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            B0 a7 = ((C0843h0) c0845i0.f10074a).a(cls);
            if ((a7.f9992d & 2) == 2) {
                boolean isAssignableFrom = J.class.isAssignableFrom(cls);
                AbstractC0828a abstractC0828a = a7.f9989a;
                if (isAssignableFrom) {
                    c0862r0 = new C0864s0(F0.f10004c, AbstractC0875y.f10144a, abstractC0828a);
                } else {
                    Q0 q0 = F0.f10003b;
                    C0873x c0873x = AbstractC0875y.f10145b;
                    if (c0873x != null) {
                        c0862r0 = new C0864s0(q0, c0873x, abstractC0828a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                A7 = c0862r0;
            } else if (J.class.isAssignableFrom(cls)) {
                if (AbstractC0841g0.f10068a[a7.d().ordinal()] != 1) {
                    A7 = C0862r0.A(a7, AbstractC0868u0.f10140b, AbstractC0837e0.f10063b, F0.f10004c, AbstractC0875y.f10144a, AbstractC0855n0.f10095b);
                } else {
                    A7 = C0862r0.A(a7, AbstractC0868u0.f10140b, AbstractC0837e0.f10063b, F0.f10004c, null, AbstractC0855n0.f10095b);
                }
            } else if (AbstractC0841g0.f10068a[a7.d().ordinal()] != 1) {
                C0866t0 c0866t0 = AbstractC0868u0.f10139a;
                C0833c0 c0833c0 = AbstractC0837e0.f10062a;
                Q0 q02 = F0.f10003b;
                C0873x c0873x2 = AbstractC0875y.f10145b;
                if (c0873x2 != null) {
                    A7 = C0862r0.A(a7, c0866t0, c0833c0, q02, c0873x2, AbstractC0855n0.f10094a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                A7 = C0862r0.A(a7, AbstractC0868u0.f10139a, AbstractC0837e0.f10062a, F0.f10003b, null, AbstractC0855n0.f10094a);
            }
            E0 e03 = (E0) concurrentHashMap.putIfAbsent(cls, A7);
            if (e03 != null) {
                return e03;
            }
            return A7;
        }
        return e02;
    }
}
