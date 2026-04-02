package com.google.crypto.tink.shaded.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class J extends L {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f9602c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, Object obj, int i7) {
        H h8;
        List arrayList;
        List list = (List) s0.f9691c.i(obj, j);
        if (list.isEmpty()) {
            if (list instanceof I) {
                arrayList = new H(i7);
            } else if ((list instanceof b0) && (list instanceof C)) {
                arrayList = ((C) list).a(i7);
            } else {
                arrayList = new ArrayList(i7);
            }
            s0.v(obj, j, arrayList);
            return arrayList;
        }
        if (f9602c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i7);
            arrayList2.addAll(list);
            s0.v(obj, j, arrayList2);
            h8 = arrayList2;
        } else if (list instanceof n0) {
            H h9 = new H(list.size() + i7);
            h9.addAll((n0) list);
            s0.v(obj, j, h9);
            h8 = h9;
        } else if ((list instanceof b0) && (list instanceof C)) {
            C c8 = (C) list;
            if (!((AbstractC0775b) c8).f9632a) {
                C a7 = c8.a(list.size() + i7);
                s0.v(obj, j, a7);
                return a7;
            }
            return list;
        } else {
            return list;
        }
        return h8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) s0.f9691c.i(obj, j);
        if (list instanceof I) {
            unmodifiableList = ((I) list).b();
        } else {
            if (f9602c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b0) && (list instanceof C)) {
                AbstractC0775b abstractC0775b = (AbstractC0775b) ((C) list);
                if (abstractC0775b.f9632a) {
                    abstractC0775b.f9632a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        s0.v(obj, j, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) s0.f9691c.i(obj2, j);
        List d7 = d(j, obj, list.size());
        int size = d7.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d7.addAll(list);
        }
        if (size > 0) {
            list = d7;
        }
        s0.v(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final List c(Object obj, long j) {
        return d(j, obj, 10);
    }
}
