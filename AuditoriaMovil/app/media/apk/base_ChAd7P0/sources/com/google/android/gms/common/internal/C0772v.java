package com.google.android.gms.common.internal;
/* renamed from: com.google.android.gms.common.internal.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772v implements InterfaceC0755d, InterfaceC0753b, InterfaceC0754c {

    /* renamed from: b  reason: collision with root package name */
    public static C0772v f9397b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0773w f9398c = new C0773w(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public Object f9399a;

    public /* synthetic */ C0772v(Object obj) {
        this.f9399a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.common.internal.v, java.lang.Object] */
    public static synchronized C0772v b() {
        C0772v c0772v;
        synchronized (C0772v.class) {
            try {
                if (f9397b == null) {
                    f9397b = new Object();
                }
                c0772v = f9397b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0772v;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0755d
    public void a(W2.b bVar) {
        boolean z7;
        if (bVar.f6160b == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0757f abstractC0757f = (AbstractC0757f) this.f9399a;
        if (z7) {
            abstractC0757f.getRemoteService(null, abstractC0757f.getScopes());
        } else if (AbstractC0757f.zzc(abstractC0757f) != null) {
            ((com.google.android.gms.common.api.internal.r) ((C0772v) AbstractC0757f.zzc(abstractC0757f)).f9399a).b(bVar);
        }
    }
}
