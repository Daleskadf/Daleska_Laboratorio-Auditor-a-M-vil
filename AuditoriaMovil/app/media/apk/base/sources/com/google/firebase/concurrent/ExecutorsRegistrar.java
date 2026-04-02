package com.google.firebase.concurrent;

import H4.W;
import V3.a;
import V3.b;
import V3.c;
import Y1.y;
import c4.C0632a;
import c4.C0637f;
import c4.n;
import c4.r;
import com.google.firebase.components.ComponentRegistrar;
import com.it_nomads.fluttersecurestorage.ciphers.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final n f9733a = new n(new C0637f(2));

    /* renamed from: b  reason: collision with root package name */
    public static final n f9734b = new n(new C0637f(3));

    /* renamed from: c  reason: collision with root package name */
    public static final n f9735c = new n(new C0637f(4));

    /* renamed from: d  reason: collision with root package name */
    public static final n f9736d = new n(new C0637f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            W.f(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        C0632a c0632a = new C0632a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new d(1), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            W.f(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        C0632a c0632a2 = new C0632a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new d(2), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            W.f(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        C0632a c0632a3 = new C0632a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new d(3), hashSet9);
        y a7 = C0632a.a(new r(V3.d.class, Executor.class));
        a7.f = new d(4);
        return Arrays.asList(c0632a, c0632a2, c0632a3, a7.d());
    }
}
