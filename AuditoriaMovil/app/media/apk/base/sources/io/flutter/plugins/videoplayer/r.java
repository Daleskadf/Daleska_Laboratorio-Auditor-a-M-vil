package io.flutter.plugins.videoplayer;

import D.AbstractC0059i;
import H0.L;
import K0.t;
import K0.u;
import K0.x;
import O0.C0261x;
import O0.H;
import O0.e0;
import X5.E;
import a1.C0415A;
import a4.AbstractC0452a;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import j$.util.Objects;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes.dex */
public class r implements H5.b {

    /* renamed from: b  reason: collision with root package name */
    public F3.o f12427b;

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray f12426a = new LongSparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final A.n f12428c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public Long f12429d = Long.MAX_VALUE;

    /* JADX WARN: Type inference failed for: r2v14, types: [io.flutter.plugins.videoplayer.o, io.flutter.view.t, W5.b] */
    public final Long a(g gVar) {
        AbstractC0452a dVar;
        o oVar;
        long j;
        String b5;
        boolean z7 = true;
        String str = gVar.f12407a;
        if (str != null) {
            String str2 = gVar.f12409c;
            if (str2 != null) {
                F5.d dVar2 = ((q) this.f12427b.f1181e).f12425a;
                StringBuilder sb = new StringBuilder("packages");
                String str3 = File.separator;
                sb.append(str3);
                sb.append(str2);
                sb.append(str3);
                sb.append(str);
                b5 = dVar2.b(sb.toString());
            } else {
                b5 = ((q) this.f12427b.f1180d).f12425a.b(str);
            }
            String h8 = io.flutter.plugins.pathprovider.b.h("asset:///", b5);
            if (h8.startsWith("asset:///")) {
                dVar = new e(h8, 0);
            } else {
                throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
            }
        } else if (gVar.f12408b.startsWith("rtsp://")) {
            String str4 = gVar.f12408b;
            if (str4.startsWith("rtsp://")) {
                dVar = new e(str4, 1);
            } else {
                throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
            }
        } else {
            n nVar = n.UNKNOWN;
            String str5 = gVar.f12410d;
            if (str5 != null) {
                char c8 = 65535;
                switch (str5.hashCode()) {
                    case 3680:
                        if (str5.equals("ss")) {
                            c8 = 0;
                            break;
                        }
                        break;
                    case 103407:
                        if (str5.equals("hls")) {
                            c8 = 1;
                            break;
                        }
                        break;
                    case 3075986:
                        if (str5.equals("dash")) {
                            c8 = 2;
                            break;
                        }
                        break;
                }
                switch (c8) {
                    case 0:
                        nVar = n.SMOOTH;
                        break;
                    case 1:
                        nVar = n.HTTP_LIVE;
                        break;
                    case 2:
                        nVar = n.DYNAMIC_ADAPTIVE;
                        break;
                }
            }
            dVar = new d(gVar.f12408b, nVar, new HashMap(gVar.f12411e));
        }
        if (gVar.f == j.PLATFORM_VIEW) {
            Long l8 = this.f12429d;
            this.f12429d = Long.valueOf(l8.longValue() - 1);
            j = l8.longValue();
            F3.o oVar2 = this.f12427b;
            L5.j jVar = new L5.j((L5.f) oVar2.f1179c, io.flutter.plugins.pathprovider.b.g("flutter.io/videoPlayer/videoEvents", j));
            m mVar = new m();
            jVar.a(new p(mVar, 0));
            oVar = new o(new C0415A(mVar), dVar.b(), this.f12428c, null, new V5.d((Context) oVar2.f1178b, dVar, 0));
        } else {
            TextureRegistry$SurfaceProducer c9 = ((io.flutter.embedding.engine.renderer.m) this.f12427b.f).c();
            long id = c9.id();
            F3.o oVar3 = this.f12427b;
            L5.j jVar2 = new L5.j((L5.f) oVar3.f1179c, io.flutter.plugins.pathprovider.b.g("flutter.io/videoPlayer/videoEvents", id));
            m mVar2 = new m();
            jVar2.a(new p(mVar2, 0));
            ?? oVar4 = new o(new C0415A(mVar2), dVar.b(), this.f12428c, c9, new V5.d((Context) oVar3.f1178b, dVar, 1));
            oVar4.f6222d = true;
            c9.setCallback(oVar4);
            Surface surface = c9.getSurface();
            ((H) oVar4.f12422c).U(surface);
            if (surface != null) {
                z7 = false;
            }
            oVar4.f6222d = z7;
            oVar = oVar4;
            j = id;
        }
        this.f12426a.put(j, oVar);
        return Long.valueOf(j);
    }

    public final o b(long j) {
        LongSparseArray longSparseArray = this.f12426a;
        o oVar = (o) longSparseArray.get(j);
        if (oVar == null) {
            String str = "No player found with playerId <" + j + ">";
            if (longSparseArray.size() == 0) {
                str = AbstractC0059i.z(str, " and no active players created by the plugin.");
            }
            throw new IllegalStateException(str);
        }
        return oVar;
    }

    public final void c(Long l8, Boolean bool) {
        int i7;
        o b5 = b(l8.longValue());
        if (bool.booleanValue()) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        H h8 = (H) b5.f12422c;
        h8.Z();
        if (h8.f3539x0 != i7) {
            h8.f3539x0 = i7;
            u uVar = h8.f3522f0.f3576Y;
            uVar.getClass();
            t b7 = u.b();
            b7.f2520a = uVar.f2522a.obtainMessage(11, i7, 0);
            b7.b();
            C0261x c0261x = new C0261x(i7);
            K0.k kVar = h8.f3523g0;
            kVar.c(8, c0261x);
            h8.V();
            kVar.b();
        }
    }

    public final void d(Long l8, Double d7) {
        o b5 = b(l8.longValue());
        L l9 = new L((float) d7.doubleValue());
        H h8 = (H) b5.f12422c;
        h8.Z();
        if (!h8.f3513Y0.f3725o.equals(l9)) {
            e0 f = h8.f3513Y0.f(l9);
            h8.f3540y0++;
            h8.f3522f0.f3576Y.a(4, l9).b();
            h8.X(f, 0, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void e(Long l8, Double d7) {
        H h8 = (H) b(l8.longValue()).f12422c;
        h8.Z();
        final float i7 = x.i((float) Math.max(0.0d, Math.min(1.0d, d7.doubleValue())), 0.0f, 1.0f);
        if (h8.f3503Q0 != i7) {
            h8.f3503Q0 = i7;
            h8.S(1, Float.valueOf(h8.f3535t0.f3684g * i7), 2);
            h8.f3523g0.e(22, new K0.h() { // from class: O0.u
                @Override // K0.h
                public final void invoke(Object obj) {
                    ((H0.N) obj).r(i7);
                }
            });
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        V2.k A7 = V2.k.A();
        Context context = aVar.f2029a;
        F5.d dVar = (F5.d) A7.f5965b;
        q qVar = new q(dVar);
        q qVar2 = new q(dVar);
        io.flutter.embedding.engine.renderer.m mVar = aVar.f2031c;
        L5.f fVar = aVar.f2030b;
        this.f12427b = new F3.o(context, fVar, qVar, qVar2, mVar, 11);
        io.flutter.plugins.pathprovider.b.o(fVar, this);
        LongSparseArray longSparseArray = this.f12426a;
        Objects.requireNonNull(longSparseArray);
        aVar.f2032d.i("plugins.flutter.dev/video_player_android", new V5.b(new E(longSparseArray, 15)));
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        if (this.f12427b == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        F3.o oVar = this.f12427b;
        L5.f fVar = aVar.f2030b;
        oVar.getClass();
        io.flutter.plugins.pathprovider.b.o(fVar, null);
        this.f12427b = null;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f12426a;
            if (i7 < longSparseArray.size()) {
                ((o) longSparseArray.valueAt(i7)).d();
                i7++;
            } else {
                longSparseArray.clear();
                return;
            }
        }
    }
}
