package e5;

import X5.L;
import a6.t0;
import android.content.Context;
import c4.C0632a;
import c4.C0638g;
import c4.InterfaceC0636e;
import com.google.android.gms.common.internal.I;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10895b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static g f10896c;

    /* renamed from: a  reason: collision with root package name */
    public C0638g f10897a;

    public static g c() {
        boolean z7;
        g gVar;
        synchronized (f10895b) {
            if (f10896c != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            I.k("MlKitContext has not been initialized", z7);
            gVar = f10896c;
            I.i(gVar);
        }
        return gVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e5.g, java.lang.Object] */
    public static g d(Context context, Executor executor) {
        boolean z7;
        g gVar;
        synchronized (f10895b) {
            if (f10896c == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            I.k("MlKitContext is already initialized", z7);
            ?? obj = new Object();
            f10896c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList z8 = new t0(5, context, new A.m(MlKitComponentDiscoveryService.class, 25)).z();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            L l8 = InterfaceC0636e.f8383T;
            arrayList.addAll(z8);
            arrayList2.add(C0632a.c(context, Context.class, new Class[0]));
            arrayList2.add(C0632a.c(obj, g.class, new Class[0]));
            C0638g c0638g = new C0638g(executor, arrayList, arrayList2, l8);
            obj.f10897a = c0638g;
            c0638g.i(true);
            gVar = f10896c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z7;
        if (f10896c == this) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.k("MlKitContext has been deleted", z7);
        I.i(this.f10897a);
        return this.f10897a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
