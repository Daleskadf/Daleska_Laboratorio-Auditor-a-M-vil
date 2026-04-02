package k7;

import F6.H;
import F6.P;
import a6.t0;
import android.media.SoundPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m6.AbstractC1447h;
/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: X  reason: collision with root package name */
    public m f13757X;

    /* renamed from: Y  reason: collision with root package name */
    public l7.d f13758Y;

    /* renamed from: a  reason: collision with root package name */
    public final o f13759a;

    /* renamed from: b  reason: collision with root package name */
    public final t0 f13760b;

    /* renamed from: c  reason: collision with root package name */
    public final K6.e f13761c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f13762d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f13763e;
    public j7.a f;

    public l(o wrappedPlayer, t0 soundPoolManager) {
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f13759a = wrappedPlayer;
        this.f13760b = soundPoolManager;
        M6.f fVar = P.f1237a;
        this.f13761c = H.b(K6.o.f2797a);
        j7.a aVar = wrappedPlayer.f13770c;
        this.f = aVar;
        soundPoolManager.s(aVar);
        j7.a audioContext = this.f;
        kotlin.jvm.internal.j.e(audioContext, "audioContext");
        m mVar = (m) ((HashMap) soundPoolManager.f7210c).get(audioContext.a());
        if (mVar != null) {
            this.f13757X = mVar;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.f).toString());
    }

    @Override // k7.h
    public final void c() {
        Integer num = this.f13763e;
        if (num != null) {
            this.f13757X.f13764a.pause(num.intValue());
        }
    }

    @Override // k7.h
    public final void d(boolean z7) {
        int i7;
        Integer num = this.f13763e;
        if (num != null) {
            int intValue = num.intValue();
            SoundPool soundPool = this.f13757X.f13764a;
            if (z7) {
                i7 = -1;
            } else {
                i7 = 0;
            }
            soundPool.setLoop(intValue, i7);
        }
    }

    @Override // k7.h
    public final void e(l7.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        source.a(this);
    }

    @Override // k7.h
    public final /* bridge */ /* synthetic */ Integer f() {
        return null;
    }

    @Override // k7.h
    public final boolean g() {
        return false;
    }

    @Override // k7.h
    public final void h(float f) {
        Integer num = this.f13763e;
        if (num != null) {
            this.f13757X.f13764a.setRate(num.intValue(), f);
        }
    }

    @Override // k7.h
    public final void i(int i7) {
        if (i7 == 0) {
            Integer num = this.f13763e;
            if (num != null) {
                int intValue = num.intValue();
                stop();
                if (this.f13759a.f13779n) {
                    this.f13757X.f13764a.resume(intValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
    }

    @Override // k7.h
    public final void j(j7.a aVar) {
        if (!this.f.a().equals(aVar.a())) {
            release();
            t0 t0Var = this.f13760b;
            t0Var.s(aVar);
            m mVar = (m) ((HashMap) t0Var.f7210c).get(aVar.a());
            if (mVar != null) {
                this.f13757X = mVar;
            } else {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
        }
        this.f = aVar;
    }

    @Override // k7.h
    public final void k(float f, float f4) {
        Integer num = this.f13763e;
        if (num != null) {
            this.f13757X.f13764a.setVolume(num.intValue(), f, f4);
        }
    }

    @Override // k7.h
    public final /* bridge */ /* synthetic */ Integer l() {
        return null;
    }

    public final void m(l7.d dVar) {
        if (dVar != null) {
            synchronized (this.f13757X.f13766c) {
                try {
                    Map map = this.f13757X.f13766c;
                    Object obj = map.get(dVar);
                    if (obj == null) {
                        obj = new ArrayList();
                        map.put(dVar, obj);
                    }
                    List list = (List) obj;
                    l lVar = (l) AbstractC1447h.P(list);
                    if (lVar != null) {
                        boolean z7 = lVar.f13759a.f13778m;
                        this.f13759a.h(z7);
                        this.f13762d = lVar.f13762d;
                        o oVar = this.f13759a;
                        oVar.c("Reusing soundId " + this.f13762d + " for " + dVar + " is prepared=" + z7 + ' ' + this);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f13759a.h(false);
                        o oVar2 = this.f13759a;
                        oVar2.c("Fetching actual URL for " + dVar);
                        H.q(this.f13761c, P.f1238b, new k(dVar, this, this, currentTimeMillis, null), 2);
                    }
                    list.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13758Y = dVar;
    }

    @Override // k7.h
    public final void release() {
        Object obj;
        stop();
        Integer num = this.f13762d;
        if (num != null) {
            int intValue = num.intValue();
            l7.d dVar = this.f13758Y;
            if (dVar == null) {
                return;
            }
            synchronized (this.f13757X.f13766c) {
                try {
                    List list = (List) this.f13757X.f13766c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if (list.size() == 1) {
                        obj = list.get(0);
                    } else {
                        obj = null;
                    }
                    if (obj == this) {
                        this.f13757X.f13766c.remove(dVar);
                        this.f13757X.f13764a.unload(intValue);
                        this.f13757X.f13765b.remove(num);
                        this.f13759a.c("unloaded soundId " + intValue);
                    } else {
                        list.remove(this);
                    }
                    this.f13762d = null;
                    m(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // k7.h
    public final void start() {
        boolean z7;
        int i7;
        Integer num = this.f13763e;
        Integer num2 = this.f13762d;
        if (num != null) {
            this.f13757X.f13764a.resume(num.intValue());
        } else if (num2 != null) {
            SoundPool soundPool = this.f13757X.f13764a;
            int intValue = num2.intValue();
            o oVar = this.f13759a;
            float f = oVar.f13773g;
            if (oVar.j == j7.g.LOOP) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i7 = -1;
            } else {
                i7 = 0;
            }
            this.f13763e = Integer.valueOf(soundPool.play(intValue, f, f, 0, i7, oVar.f13775i));
        }
    }

    @Override // k7.h
    public final void stop() {
        Integer num = this.f13763e;
        if (num != null) {
            this.f13757X.f13764a.stop(num.intValue());
            this.f13763e = null;
        }
    }

    @Override // k7.h
    public final void a() {
    }

    @Override // k7.h
    public final void b() {
    }
}
