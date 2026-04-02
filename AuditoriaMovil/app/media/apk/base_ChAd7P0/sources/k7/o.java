package k7;

import a6.t0;
import android.os.Build;
import m6.s;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final j7.d f13768a;

    /* renamed from: b  reason: collision with root package name */
    public final j7.e f13769b;

    /* renamed from: c  reason: collision with root package name */
    public j7.a f13770c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f13771d;

    /* renamed from: e  reason: collision with root package name */
    public h f13772e;
    public l7.c f;

    /* renamed from: g  reason: collision with root package name */
    public float f13773g;

    /* renamed from: h  reason: collision with root package name */
    public float f13774h;

    /* renamed from: i  reason: collision with root package name */
    public float f13775i;
    public j7.g j;

    /* renamed from: k  reason: collision with root package name */
    public j7.f f13776k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13777l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13778m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13779n;

    /* renamed from: o  reason: collision with root package name */
    public int f13780o;

    /* renamed from: p  reason: collision with root package name */
    public final f7.a f13781p;

    public o(j7.d ref, j7.e eVar, j7.a aVar, t0 soundPoolManager) {
        b bVar;
        kotlin.jvm.internal.j.e(ref, "ref");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f13768a = ref;
        this.f13769b = eVar;
        this.f13770c = aVar;
        this.f13771d = soundPoolManager;
        this.f13773g = 1.0f;
        this.f13775i = 1.0f;
        this.j = j7.g.RELEASE;
        this.f13776k = j7.f.MEDIA_PLAYER;
        this.f13777l = true;
        this.f13780o = -1;
        R6.d dVar = new R6.d(this, 3);
        E6.l lVar = new E6.l(this, 6);
        if (Build.VERSION.SDK_INT >= 26) {
            bVar = new b(this, dVar, lVar, 1);
        } else {
            bVar = new b(this, dVar, lVar, 0);
        }
        this.f13781p = bVar;
    }

    public static void j(h hVar, float f, float f4) {
        hVar.k(Math.min(1.0f, 1.0f - f4) * f, Math.min(1.0f, f4 + 1.0f) * f);
    }

    public final void a(h hVar) {
        boolean z7;
        j(hVar, this.f13773g, this.f13774h);
        if (this.j == j7.g.LOOP) {
            z7 = true;
        } else {
            z7 = false;
        }
        hVar.d(z7);
        hVar.b();
    }

    public final h b() {
        int i7 = n.f13767a[this.f13776k.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return new l(this, this.f13771d);
            }
            throw new RuntimeException();
        }
        return new t0(this);
    }

    public final void c(String message) {
        kotlin.jvm.internal.j.e(message, "message");
        this.f13768a.getClass();
        this.f13769b.d("audio.onLog", s.N(new l6.d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, message)));
    }

    public final void d() {
        h hVar;
        if (this.f13779n) {
            this.f13779n = false;
            if (this.f13778m && (hVar = this.f13772e) != null) {
                hVar.c();
            }
        }
    }

    public final void e() {
        h hVar;
        this.f13781p.Y();
        if (this.f13777l) {
            return;
        }
        if (this.f13779n && (hVar = this.f13772e) != null) {
            hVar.stop();
        }
        i(null);
        this.f13772e = null;
    }

    public final void f() {
        f7.a aVar = this.f13781p;
        if (!kotlin.jvm.internal.j.a(aVar.Q(), aVar.V().f13770c)) {
            aVar.m0(aVar.V().f13770c);
            aVar.q0();
        }
        if (aVar.Z()) {
            aVar.k0();
        } else {
            aVar.T().invoke();
        }
    }

    public final void g(j7.f fVar) {
        Object obj;
        int i7;
        if (this.f13776k != fVar) {
            this.f13776k = fVar;
            h hVar = this.f13772e;
            if (hVar != null) {
                Object obj2 = null;
                try {
                    Integer l8 = hVar.l();
                    if (l8 == null) {
                        obj = l8;
                    } else {
                        int intValue = l8.intValue();
                        obj = l8;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = org.slf4j.helpers.i.j(th);
                }
                if (!(obj instanceof l6.e)) {
                    obj2 = obj;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = -1;
                }
                this.f13780o = i7;
                h(false);
                hVar.release();
            }
            h b5 = b();
            this.f13772e = b5;
            l7.c cVar = this.f;
            if (cVar != null) {
                b5.e(cVar);
                a(b5);
            }
        }
    }

    public final void h(boolean z7) {
        if (this.f13778m != z7) {
            this.f13778m = z7;
            this.f13768a.getClass();
            j7.d.c(this, z7);
        }
    }

    public final void i(l7.c cVar) {
        if (!kotlin.jvm.internal.j.a(this.f, cVar)) {
            if (cVar != null) {
                h hVar = this.f13772e;
                if (!this.f13777l && hVar != null) {
                    if (this.f13778m) {
                        hVar.a();
                        h(false);
                    }
                } else {
                    hVar = b();
                    this.f13772e = hVar;
                    this.f13777l = false;
                }
                hVar.e(cVar);
                a(hVar);
            } else {
                this.f13777l = true;
                h(false);
                this.f13779n = false;
                h hVar2 = this.f13772e;
                if (hVar2 != null) {
                    hVar2.release();
                }
            }
            this.f = cVar;
            return;
        }
        this.f13768a.getClass();
        j7.d.c(this, true);
    }

    public final void k() {
        h hVar;
        this.f13781p.Y();
        if (this.f13777l) {
            return;
        }
        if (this.j != j7.g.RELEASE) {
            d();
            if (this.f13778m) {
                h hVar2 = this.f13772e;
                int i7 = 0;
                if (hVar2 != null && hVar2.g()) {
                    h hVar3 = this.f13772e;
                    if (hVar3 != null) {
                        hVar3.stop();
                    }
                    h(false);
                    h hVar4 = this.f13772e;
                    if (hVar4 != null) {
                        hVar4.b();
                        return;
                    }
                    return;
                }
                if (this.f13778m && ((hVar = this.f13772e) == null || !hVar.g())) {
                    h hVar5 = this.f13772e;
                    if (hVar5 != null) {
                        hVar5.i(0);
                    }
                    i7 = -1;
                }
                this.f13780o = i7;
                return;
            }
            return;
        }
        e();
    }

    public final void l(j7.a aVar) {
        if (this.f13770c.equals(aVar)) {
            return;
        }
        if (this.f13770c.f13465e != 0 && aVar.f13465e == 0) {
            this.f13781p.Y();
        }
        this.f13770c = j7.a.b(aVar);
        j7.d dVar = this.f13768a;
        dVar.a().setMode(this.f13770c.f);
        dVar.a().setSpeakerphoneOn(this.f13770c.f13461a);
        h hVar = this.f13772e;
        if (hVar != null) {
            hVar.stop();
            h(false);
            hVar.j(this.f13770c);
            l7.c cVar = this.f;
            if (cVar != null) {
                hVar.e(cVar);
                a(hVar);
            }
        }
    }
}
