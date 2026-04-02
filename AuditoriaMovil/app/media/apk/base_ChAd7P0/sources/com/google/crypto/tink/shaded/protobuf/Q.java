package com.google.crypto.tink.shaded.protobuf;

import D.AbstractC0059i;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class Q {
    public static void a(Object obj) {
        AbstractC0059i.I(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        P p7 = (P) obj;
        if (obj2 == null) {
            if (!p7.isEmpty()) {
                Iterator it = p7.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        throw new ClassCastException();
    }

    public static boolean c(Object obj) {
        return !((P) obj).f9609a;
    }

    public static P d(Object obj, Object obj2) {
        P p7 = (P) obj;
        P p8 = (P) obj2;
        if (!p8.isEmpty()) {
            if (!p7.f9609a) {
                p7 = p7.c();
            }
            p7.b();
            if (!p8.isEmpty()) {
                p7.putAll(p8);
            }
        }
        return p7;
    }

    public static P e() {
        return P.f9608b.c();
    }

    public static void f(Object obj) {
        ((P) obj).f9609a = false;
    }
}
