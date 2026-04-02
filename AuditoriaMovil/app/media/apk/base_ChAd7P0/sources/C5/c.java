package C5;

import H4.W;
import K5.s;
import K5.v;
import L5.r;
import L5.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.o;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f553a;

    /* renamed from: b  reason: collision with root package name */
    public final m f554b;

    /* renamed from: c  reason: collision with root package name */
    public final D5.b f555c;

    /* renamed from: d  reason: collision with root package name */
    public final e f556d;

    /* renamed from: e  reason: collision with root package name */
    public final M5.a f557e;
    public final V2.k f;

    /* renamed from: g  reason: collision with root package name */
    public final K5.d f558g;

    /* renamed from: h  reason: collision with root package name */
    public final A.c f559h;

    /* renamed from: i  reason: collision with root package name */
    public final A4.c f560i;
    public final i j;

    /* renamed from: k  reason: collision with root package name */
    public final s f561k;

    /* renamed from: l  reason: collision with root package name */
    public final A.f f562l;

    /* renamed from: m  reason: collision with root package name */
    public final A.m f563m;

    /* renamed from: n  reason: collision with root package name */
    public final v f564n;

    /* renamed from: o  reason: collision with root package name */
    public final A4.c f565o;

    /* renamed from: p  reason: collision with root package name */
    public final i f566p;

    /* renamed from: q  reason: collision with root package name */
    public final A.f f567q;

    /* renamed from: r  reason: collision with root package name */
    public final o f568r;

    /* renamed from: s  reason: collision with root package name */
    public final HashSet f569s = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    public final a f570t = new a(this);

    /* JADX WARN: Type inference failed for: r2v0, types: [L5.f, java.lang.Object, D5.b] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, K5.s] */
    public c(Context context, FlutterJNI flutterJNI, o oVar, boolean z7, boolean z8) {
        AssetManager assets;
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        V2.k A7 = V2.k.A();
        if (flutterJNI == null) {
            Object obj = A7.f5966c;
            flutterJNI = new FlutterJNI();
        }
        this.f553a = flutterJNI;
        ?? obj2 = new Object();
        obj2.f867a = false;
        A.c cVar = new A.c(obj2, 3);
        obj2.f868b = flutterJNI;
        obj2.f869c = assets;
        D5.i iVar = new D5.i(flutterJNI);
        obj2.f870d = iVar;
        iVar.i("flutter/isolate", cVar, null);
        obj2.f871e = new A4.c(iVar, 8);
        if (flutterJNI.isAttached()) {
            obj2.f867a = true;
        }
        this.f555c = obj2;
        flutterJNI.setPlatformMessageHandler((D5.i) obj2.f870d);
        V2.k.A().getClass();
        this.f = new V2.k((D5.b) obj2, flutterJNI);
        new r(obj2, "flutter/deferredcomponent", y.f3047b, null).b(new A.m(new Object(), 8));
        V2.k.A().getClass();
        new HashMap();
        this.f558g = new K5.d((D5.b) obj2);
        A.f fVar = new A.f((D5.b) obj2, 19);
        this.f559h = new A.c((D5.b) obj2);
        this.f560i = new A4.c((D5.b) obj2, 15);
        this.j = new i((D5.b) obj2, 12);
        this.f562l = new A.f((D5.b) obj2, 20);
        A.f fVar2 = new A.f((D5.b) obj2, context.getPackageManager());
        r rVar = new r(obj2, "flutter/restoration", y.f3047b, null);
        ?? obj3 = new Object();
        obj3.f2736b = false;
        obj3.f2737c = false;
        A4.c cVar2 = new A4.c((Object) obj3, 16);
        obj3.f2739e = rVar;
        obj3.f2735a = z8;
        rVar.b(cVar2);
        this.f561k = obj3;
        this.f563m = new A.m((D5.b) obj2);
        this.f564n = new v(obj2);
        this.f565o = new A4.c((D5.b) obj2, 17);
        this.f566p = new i((D5.b) obj2, 16);
        this.f567q = new A.f((D5.b) obj2, 24);
        M5.a aVar = new M5.a(context, fVar);
        this.f557e = aVar;
        F5.d dVar = (F5.d) A7.f5965b;
        if (!flutterJNI.isAttached()) {
            dVar.c(context.getApplicationContext());
            dVar.a(context, null);
        }
        flutterJNI.addEngineLifecycleListener(this.f570t);
        flutterJNI.setPlatformViewsController(oVar);
        flutterJNI.setLocalizationPlugin(aVar);
        A7.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f554b = new m(flutterJNI);
        this.f568r = oVar;
        e eVar = new e(context.getApplicationContext(), this, dVar);
        this.f556d = eVar;
        aVar.b(context.getResources().getConfiguration());
        if (z7 && ((D5.b) dVar.f1209d).f867a) {
            W.E(this);
        }
        W.b(context, this);
        eVar.a(new O5.a(fVar2));
    }
}
