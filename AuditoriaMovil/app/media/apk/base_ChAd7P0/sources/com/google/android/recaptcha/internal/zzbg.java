package com.google.android.recaptcha.internal;

import F6.D;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbg extends i implements p {
    public zzbg(d dVar) {
        super(2, dVar);
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzbg(dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        org.slf4j.helpers.i.M(obj);
        Thread.currentThread().setPriority(8);
        return j.f13876a;
    }
}
