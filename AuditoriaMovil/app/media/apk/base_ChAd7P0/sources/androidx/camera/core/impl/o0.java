package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: i  reason: collision with root package name */
    public static final List f7650i = Arrays.asList(1, 5, 3);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7651a;

    /* renamed from: b  reason: collision with root package name */
    public final C0503e f7652b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7653c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7654d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7655e;
    public final l0 f;

    /* renamed from: g  reason: collision with root package name */
    public final E f7656g;

    /* renamed from: h  reason: collision with root package name */
    public final InputConfiguration f7657h;

    public o0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, E e7, l0 l0Var, InputConfiguration inputConfiguration, C0503e c0503e) {
        this.f7651a = arrayList;
        this.f7653c = DesugarCollections.unmodifiableList(arrayList2);
        this.f7654d = DesugarCollections.unmodifiableList(arrayList3);
        this.f7655e = DesugarCollections.unmodifiableList(arrayList4);
        this.f = l0Var;
        this.f7656g = e7;
        this.f7657h = inputConfiguration;
        this.f7652b = c0503e;
    }

    public static o0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        W b5 = W.b();
        ArrayList arrayList5 = new ArrayList();
        Y a7 = Y.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        Z a8 = Z.a(b5);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        u0 u0Var = u0.f7673b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a7.f7674a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new o0(arrayList, arrayList2, arrayList3, arrayList4, new E(arrayList6, a8, -1, arrayList7, false, new u0(arrayMap), null), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7651a.iterator();
        while (it.hasNext()) {
            C0503e c0503e = (C0503e) it.next();
            arrayList.add(c0503e.f7616a);
            for (J j : c0503e.f7617b) {
                arrayList.add(j);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
