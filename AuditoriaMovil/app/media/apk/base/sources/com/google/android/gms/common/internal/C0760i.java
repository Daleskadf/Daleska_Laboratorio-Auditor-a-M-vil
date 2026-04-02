package com.google.android.gms.common.internal;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u3.C1869a;
/* renamed from: com.google.android.gms.common.internal.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760i {

    /* renamed from: a  reason: collision with root package name */
    public final Set f9354a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f9355b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f9356c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9357d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9358e;
    public final C1869a f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f9359g;

    public C0760i(Set set, String str, String str2) {
        Set unmodifiableSet;
        C1869a c1869a = C1869a.f15978a;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.f9354a = unmodifiableSet;
        Map emptyMap = Collections.emptyMap();
        this.f9356c = emptyMap;
        this.f9357d = str;
        this.f9358e = str2;
        this.f = c1869a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f9355b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
