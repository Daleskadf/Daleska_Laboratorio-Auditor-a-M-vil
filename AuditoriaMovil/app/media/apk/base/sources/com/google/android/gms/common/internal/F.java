package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f9307a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9308b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0757f f9309c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9310d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9311e;
    public final /* synthetic */ AbstractC0757f f;

    public F(AbstractC0757f abstractC0757f, int i7, Bundle bundle) {
        this.f = abstractC0757f;
        Boolean bool = Boolean.TRUE;
        this.f9309c = abstractC0757f;
        this.f9307a = bool;
        this.f9308b = false;
        this.f9310d = i7;
        this.f9311e = bundle;
    }

    public abstract void a(W2.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f9307a = null;
        }
    }

    public final void d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        c();
        arrayList = this.f9309c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f9309c.zzt;
            arrayList2.remove(this);
        }
    }
}
