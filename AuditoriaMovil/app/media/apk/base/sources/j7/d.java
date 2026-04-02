package j7;

import L5.h;
import L5.p;
import L5.q;
import L5.r;
import a6.t0;
import android.content.Context;
import android.media.AudioManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import k7.m;
import k7.o;
import kotlin.jvm.internal.j;
import m6.s;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public final class d implements H5.b {

    /* renamed from: a  reason: collision with root package name */
    public e f13469a;

    /* renamed from: b  reason: collision with root package name */
    public Context f13470b;

    /* renamed from: c  reason: collision with root package name */
    public L5.f f13471c;

    /* renamed from: d  reason: collision with root package name */
    public t0 f13472d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentHashMap f13473e = new ConcurrentHashMap();
    public a f = new a(false, false, 2, 1, 1, 0);

    public static void c(o player, boolean z7) {
        j.e(player, "player");
        player.f13769b.d("audio.onPrepared", s.N(new l6.d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Boolean.valueOf(z7))));
    }

    public final AudioManager a() {
        Context context = this.f13470b;
        if (context != null) {
            Object systemService = context.getApplicationContext().getSystemService("audio");
            j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
        j.g("context");
        throw null;
    }

    public final void b(String message) {
        j.e(message, "message");
        e eVar = this.f13469a;
        if (eVar != null) {
            eVar.d("audio.onLog", s.N(new l6.d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, message)));
        } else {
            j.g("globalEvents");
            throw null;
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        j.e(binding, "binding");
        Context context = binding.f2029a;
        j.d(context, "binding.applicationContext");
        this.f13470b = context;
        L5.f fVar = binding.f2030b;
        j.d(fVar, "binding.binaryMessenger");
        this.f13471c = fVar;
        this.f13472d = new t0(this);
        new r(fVar, "xyz.luan/audioplayers").b(new p(this) { // from class: j7.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f13467b;

            {
                this.f13467b = this;
            }

            @Override // L5.p
            public final void onMethodCall(L5.o call, q qVar) {
                switch (r2) {
                    case 0:
                        d this$0 = this.f13467b;
                        j.e(this$0, "this$0");
                        j.e(call, "call");
                        K5.r rVar = (K5.r) qVar;
                        try {
                            new c(2, this$0, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0).invoke(call, rVar);
                            return;
                        } catch (Throwable th) {
                            rVar.b(th, "Unexpected AndroidAudioError", th.getMessage());
                            return;
                        }
                    default:
                        d this$02 = this.f13467b;
                        j.e(this$02, "this$0");
                        j.e(call, "call");
                        K5.r rVar2 = (K5.r) qVar;
                        try {
                            new c(2, this$02, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1).invoke(call, rVar2);
                            return;
                        } catch (Throwable th2) {
                            rVar2.b(th2, "Unexpected AndroidAudioError", th2.getMessage());
                            return;
                        }
                }
            }
        });
        new r(fVar, "xyz.luan/audioplayers.global").b(new p(this) { // from class: j7.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f13467b;

            {
                this.f13467b = this;
            }

            @Override // L5.p
            public final void onMethodCall(L5.o call, q qVar) {
                switch (r2) {
                    case 0:
                        d this$0 = this.f13467b;
                        j.e(this$0, "this$0");
                        j.e(call, "call");
                        K5.r rVar = (K5.r) qVar;
                        try {
                            new c(2, this$0, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0).invoke(call, rVar);
                            return;
                        } catch (Throwable th) {
                            rVar.b(th, "Unexpected AndroidAudioError", th.getMessage());
                            return;
                        }
                    default:
                        d this$02 = this.f13467b;
                        j.e(this$02, "this$0");
                        j.e(call, "call");
                        K5.r rVar2 = (K5.r) qVar;
                        try {
                            new c(2, this$02, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1).invoke(call, rVar2);
                            return;
                        } catch (Throwable th2) {
                            rVar2.b(th2, "Unexpected AndroidAudioError", th2.getMessage());
                            return;
                        }
                }
            }
        });
        this.f13469a = new e(new L5.j(fVar, "xyz.luan/audioplayers.global/events"));
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        j.e(binding, "binding");
        ConcurrentHashMap concurrentHashMap = this.f13473e;
        Collection<o> values = concurrentHashMap.values();
        j.d(values, "players.values");
        for (o oVar : values) {
            oVar.e();
            e eVar = oVar.f13769b;
            h hVar = eVar.f13475b;
            if (hVar != null) {
                hVar.a();
                eVar.f13475b = null;
            }
            eVar.f13476c.a(null);
        }
        concurrentHashMap.clear();
        t0 t0Var = this.f13472d;
        if (t0Var != null) {
            HashMap hashMap = (HashMap) t0Var.f7210c;
            for (Map.Entry entry : hashMap.entrySet()) {
                m mVar = (m) entry.getValue();
                mVar.f13764a.release();
                mVar.f13765b.clear();
                mVar.f13766c.clear();
            }
            hashMap.clear();
            e eVar2 = this.f13469a;
            if (eVar2 != null) {
                h hVar2 = eVar2.f13475b;
                if (hVar2 != null) {
                    hVar2.a();
                    eVar2.f13475b = null;
                }
                eVar2.f13476c.a(null);
                return;
            }
            j.g("globalEvents");
            throw null;
        }
        j.g("soundPoolManager");
        throw null;
    }
}
