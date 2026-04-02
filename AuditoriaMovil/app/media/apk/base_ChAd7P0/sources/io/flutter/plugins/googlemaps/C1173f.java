package io.flutter.plugins.googlemaps;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.C1608t;
import q3.InterfaceC1707a;
/* renamed from: io.flutter.plugins.googlemaps.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173f implements InterfaceC1707a {

    /* renamed from: X  reason: collision with root package name */
    public C1177j f12128X;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12129a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12130b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final a6.t0 f12131c;

    /* renamed from: d  reason: collision with root package name */
    public U4.b f12132d;

    /* renamed from: e  reason: collision with root package name */
    public C1608t f12133e;
    public C1177j f;

    public C1173f(a6.t0 t0Var, Context context) {
        this.f12129a = context;
        this.f12131c = t0Var;
    }

    @Override // q3.InterfaceC1707a
    public final void A() {
        for (Map.Entry entry : this.f12130b.entrySet()) {
            ((R4.c) entry.getValue()).A();
        }
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Y) it.next()).f12094a;
            C1608t c1608t = this.f12133e;
            U4.b bVar = this.f12132d;
            Context context = this.f12129a;
            R4.c cVar = new R4.c(context, c1608t, bVar);
            C1171e c1171e = new C1171e(context, this.f12133e, cVar, this);
            T4.h hVar = cVar.f4775e;
            hVar.f5380p = null;
            hVar.f5381q = null;
            cVar.f4773c.b();
            cVar.f4772b.b();
            R4.c cVar2 = cVar.f4775e.f5369c;
            U4.a aVar = cVar2.f4772b;
            aVar.f5771e = null;
            aVar.f5769c = null;
            aVar.f5770d = null;
            U4.a aVar2 = cVar2.f4773c;
            aVar2.f5771e = null;
            aVar2.f5769c = null;
            aVar2.f5770d = null;
            cVar.f4775e = c1171e;
            c1171e.c();
            T4.h hVar2 = cVar.f4775e;
            hVar2.f5380p = cVar.f4777f0;
            hVar2.getClass();
            cVar.f4775e.getClass();
            T4.h hVar3 = cVar.f4775e;
            hVar3.f5381q = cVar.f4776e0;
            hVar3.getClass();
            cVar.f4775e.getClass();
            cVar.a();
            C1177j c1177j = this.f;
            cVar.f4777f0 = this;
            T4.h hVar4 = cVar.f4775e;
            hVar4.f5380p = this;
            cVar.f4776e0 = c1177j;
            hVar4.f5381q = c1177j;
            this.f12130b.put(str, cVar);
        }
    }
}
