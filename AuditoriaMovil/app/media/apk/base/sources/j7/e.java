package j7;

import L5.h;
import L5.i;
import L5.j;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;
import m6.s;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13474a = 1;

    /* renamed from: b  reason: collision with root package name */
    public h f13475b;

    /* renamed from: c  reason: collision with root package name */
    public final j f13476c;

    public e(L5.f binaryMessenger) {
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        j jVar = new j(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/event");
        this.f13476c = jVar;
        jVar.a(this);
    }

    @Override // L5.i
    public final void a(Object obj, h hVar) {
        switch (this.f13474a) {
            case 0:
                this.f13475b = hVar;
                return;
            default:
                this.f13475b = hVar;
                return;
        }
    }

    @Override // L5.i
    public final void b() {
        switch (this.f13474a) {
            case 0:
                this.f13475b = null;
                return;
            default:
                this.f13475b = null;
                return;
        }
    }

    public void c(Map map) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1822b(17, this, map));
    }

    public void d(String str, Map arguments) {
        Map map;
        kotlin.jvm.internal.j.e(arguments, "arguments");
        h hVar = this.f13475b;
        if (hVar != null) {
            l6.d dVar = new l6.d("event", str);
            if (arguments.isEmpty()) {
                map = s.P(dVar);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(arguments);
                linkedHashMap.put("event", str);
                map = linkedHashMap;
            }
            hVar.c(map);
        }
    }

    public e(j jVar) {
        this.f13476c = jVar;
        jVar.a(this);
    }
}
