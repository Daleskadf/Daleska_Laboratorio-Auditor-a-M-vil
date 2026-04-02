package com.google.firebase.storage;

import a6.u0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r3.AbstractC1740d;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9907a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final U3.h f9908b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1956b f9909c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC1956b f9910d;

    public g(U3.h hVar, InterfaceC1956b interfaceC1956b, InterfaceC1956b interfaceC1956b2, Executor executor, Executor executor2) {
        this.f9908b = hVar;
        this.f9909c = interfaceC1956b;
        this.f9910d = interfaceC1956b2;
        AbstractC1740d.f15483c = new u0(executor, 5);
        AbstractC1740d.f15485e = new u0(executor, 3);
        AbstractC1740d.f15484d = new u0(executor, 2);
        AbstractC1740d.f = new d4.j(executor);
        AbstractC1740d.f15486g = executor2;
    }
}
