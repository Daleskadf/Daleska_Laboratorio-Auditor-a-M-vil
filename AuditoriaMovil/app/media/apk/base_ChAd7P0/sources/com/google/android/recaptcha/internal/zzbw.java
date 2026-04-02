package com.google.android.recaptcha.internal;

import A.m;
import F6.C0093i0;
import F6.C0106t;
import F6.C0108v;
import F6.InterfaceC0085e0;
import F6.InterfaceC0091h0;
import F6.InterfaceC0103p;
import F6.InterfaceC0105s;
import F6.K;
import F6.S;
import F6.o0;
import F6.r;
import F6.r0;
import F6.s0;
import F6.t0;
import F6.u0;
import N6.a;
import N6.b;
import h3.AbstractC1079a;
import j6.C1372c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import n6.d;
import n6.g;
import n6.h;
import n6.i;
import o6.EnumC1565a;
import w6.l;
import w6.p;
/* loaded from: classes.dex */
public final class zzbw implements K {
    private final /* synthetic */ InterfaceC0105s zza;

    public zzbw(InterfaceC0105s interfaceC0105s) {
        this.zza = interfaceC0105s;
    }

    @Override // F6.InterfaceC0091h0
    public final InterfaceC0103p attachChild(r rVar) {
        return this.zza.attachChild(rVar);
    }

    @Override // F6.K
    public final Object await(d dVar) {
        Object j = ((C0106t) this.zza).j(dVar);
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        return j;
    }

    @Override // F6.InterfaceC0091h0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // n6.i
    public final Object fold(Object obj, p operation) {
        u0 u0Var = (u0) this.zza;
        u0Var.getClass();
        j.e(operation, "operation");
        return operation.invoke(obj, u0Var);
    }

    @Override // n6.i
    public final g get(h hVar) {
        u0 u0Var = (u0) this.zza;
        u0Var.getClass();
        return AbstractC1079a.j(u0Var, hVar);
    }

    @Override // F6.InterfaceC0091h0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // F6.InterfaceC0091h0
    public final D6.d getChildren() {
        return this.zza.getChildren();
    }

    @Override // F6.K
    public final Object getCompleted() {
        return ((C0106t) this.zza).s();
    }

    @Override // F6.K
    public final Throwable getCompletionExceptionOrNull() {
        return ((u0) this.zza).getCompletionExceptionOrNull();
    }

    @Override // n6.g
    public final h getKey() {
        return this.zza.getKey();
    }

    public final b getOnAwait() {
        C0106t c0106t = (C0106t) this.zza;
        c0106t.getClass();
        u.b(3, r0.f1305a);
        u.b(3, s0.f1306a);
        return new m(c0106t, 13);
    }

    public final a getOnJoin() {
        u0 u0Var = (u0) this.zza;
        u0Var.getClass();
        u.b(3, t0.f1307a);
        return new C1372c(u0Var, 7);
    }

    @Override // F6.InterfaceC0091h0
    public final InterfaceC0091h0 getParent() {
        return ((u0) this.zza).getParent();
    }

    @Override // F6.InterfaceC0091h0
    public final S invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // F6.InterfaceC0091h0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        Object x7 = ((u0) this.zza).x();
        if (!(x7 instanceof C0108v) && (!(x7 instanceof o0) || !((o0) x7).d())) {
            return false;
        }
        return true;
    }

    public final boolean isCompleted() {
        return !(((u0) this.zza).x() instanceof InterfaceC0085e0);
    }

    @Override // F6.InterfaceC0091h0
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // n6.i
    public final i minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    public final InterfaceC0091h0 plus(InterfaceC0091h0 interfaceC0091h0) {
        this.zza.getClass();
        return interfaceC0091h0;
    }

    @Override // F6.InterfaceC0091h0
    public final boolean start() {
        return this.zza.start();
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException c0093i0;
        u0 u0Var = (u0) this.zza;
        u0Var.getClass();
        if (th != null) {
            c0093i0 = u0.M(u0Var, th);
        } else {
            c0093i0 = new C0093i0(u0Var.n(), null, u0Var);
        }
        u0Var.l(c0093i0);
        return true;
    }

    @Override // F6.InterfaceC0091h0
    public final S invokeOnCompletion(boolean z7, boolean z8, l lVar) {
        return this.zza.invokeOnCompletion(z7, z8, lVar);
    }

    @Override // n6.i
    public final i plus(i iVar) {
        return this.zza.plus(iVar);
    }

    public final /* synthetic */ void cancel() {
        ((u0) this.zza).cancel(null);
    }
}
