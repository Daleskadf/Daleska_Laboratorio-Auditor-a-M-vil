package com.google.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.protobuf.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833c0 extends AbstractC0837e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f10060c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(long j, Object obj, int i7) {
        C0829a0 c0829a0;
        List arrayList;
        List list = (List) Y0.f10049c.k(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC0831b0) {
                arrayList = new C0829a0(i7);
            } else if ((list instanceof InterfaceC0874x0) && (list instanceof U)) {
                arrayList = ((U) list).a(i7);
            } else {
                arrayList = new ArrayList(i7);
            }
            Y0.s(obj, j, arrayList);
            return arrayList;
        }
        if (f10060c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i7);
            arrayList2.addAll(list);
            Y0.s(obj, j, arrayList2);
            c0829a0 = arrayList2;
        } else if (list instanceof T0) {
            C0829a0 c0829a02 = new C0829a0(list.size() + i7);
            c0829a02.addAll((T0) list);
            Y0.s(obj, j, c0829a02);
            c0829a0 = c0829a02;
        } else if ((list instanceof InterfaceC0874x0) && (list instanceof U)) {
            U u7 = (U) list;
            if (!((AbstractC0830b) u7).f10056a) {
                U a7 = u7.a(list.size() + i7);
                Y0.s(obj, j, a7);
                return a7;
            }
            return list;
        } else {
            return list;
        }
        return c0829a0;
    }

    @Override // com.google.protobuf.AbstractC0837e0
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) Y0.f10049c.k(obj, j);
        if (list instanceof InterfaceC0831b0) {
            unmodifiableList = ((InterfaceC0831b0) list).b();
        } else {
            if (f10060c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0874x0) && (list instanceof U)) {
                AbstractC0830b abstractC0830b = (AbstractC0830b) ((U) list);
                boolean z7 = abstractC0830b.f10056a;
                if (z7 && z7) {
                    abstractC0830b.f10056a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        Y0.s(obj, j, unmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC0837e0
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) Y0.f10049c.k(obj2, j);
        List d7 = d(j, obj, list.size());
        int size = d7.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d7.addAll(list);
        }
        if (size > 0) {
            list = d7;
        }
        Y0.s(obj, j, list);
    }

    @Override // com.google.protobuf.AbstractC0837e0
    public final List c(Object obj, long j) {
        return d(j, obj, 10);
    }
}
