package com.google.android.gms.common.api.internal;

import android.os.Looper;
import d0.ExecutorC0885c;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.common.api.internal.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742p {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9269a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9270b;

    /* renamed from: c  reason: collision with root package name */
    public volatile C0740n f9271c;

    public C0742p(Looper looper, Object obj, String str) {
        this.f9269a = new ExecutorC0885c(looper);
        com.google.android.gms.common.internal.I.j(obj, "Listener must not be null");
        this.f9270b = obj;
        com.google.android.gms.common.internal.I.e(str);
        this.f9271c = new C0740n(obj, str);
    }

    public final void a() {
        this.f9270b = null;
        this.f9271c = null;
    }

    public final void b(InterfaceC0741o interfaceC0741o) {
        this.f9269a.execute(new d0(this, interfaceC0741o));
    }

    public C0742p(Object obj, String str, Executor executor) {
        com.google.android.gms.common.internal.I.j(executor, "Executor must not be null");
        this.f9269a = executor;
        com.google.android.gms.common.internal.I.j(obj, "Listener must not be null");
        this.f9270b = obj;
        com.google.android.gms.common.internal.I.e(str);
        this.f9271c = new C0740n(obj, str);
    }
}
