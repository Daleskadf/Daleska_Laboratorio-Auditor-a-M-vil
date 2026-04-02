package i1;

import K0.x;
import M0.B;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: a  reason: collision with root package name */
    public final long f11432a;

    /* renamed from: b  reason: collision with root package name */
    public final M0.l f11433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11434c;

    /* renamed from: d  reason: collision with root package name */
    public final B f11435d;

    /* renamed from: e  reason: collision with root package name */
    public final p f11436e;
    public volatile Object f;

    public q(M0.h hVar, Uri uri, int i7, p pVar) {
        Map emptyMap = Collections.emptyMap();
        K0.a.l(uri, "The uri must be set.");
        M0.l lVar = new M0.l(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f11435d = new B(hVar);
        this.f11433b = lVar;
        this.f11434c = i7;
        this.f11436e = pVar;
        this.f11432a = e1.r.f10832b.getAndIncrement();
    }

    @Override // i1.k
    public final void b() {
        this.f11435d.f3132b = 0L;
        M0.j jVar = new M0.j(this.f11435d, this.f11433b);
        try {
            jVar.a();
            Uri p7 = this.f11435d.f3131a.p();
            p7.getClass();
            this.f = this.f11436e.j(p7, jVar);
        } finally {
            x.h(jVar);
        }
    }

    @Override // i1.k
    public final void k() {
    }
}
