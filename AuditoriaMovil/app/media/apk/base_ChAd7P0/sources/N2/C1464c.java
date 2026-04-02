package n2;

import B5.C0050x;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import h2.C1078b;
import i2.C1105e;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s;
import l6.j;
import m2.InterfaceC1435a;
import m6.p;
/* renamed from: n2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464c implements InterfaceC1435a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f14154a;

    /* renamed from: b  reason: collision with root package name */
    public final C1078b f14155b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f14156c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f14157d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f14158e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public C1464c(WindowLayoutComponent windowLayoutComponent, C1078b c1078b) {
        this.f14154a = windowLayoutComponent;
        this.f14155b = c1078b;
    }

    @Override // m2.InterfaceC1435a
    public final void a(C0050x c0050x) {
        ReentrantLock reentrantLock = this.f14156c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f14158e;
        try {
            Context context = (Context) linkedHashMap.get(c0050x);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f14157d;
            C1467f c1467f = (C1467f) linkedHashMap2.get(context);
            if (c1467f == null) {
                return;
            }
            c1467f.d(c0050x);
            linkedHashMap.remove(c0050x);
            if (c1467f.f14166d.isEmpty()) {
                linkedHashMap2.remove(context);
                C1105e c1105e = (C1105e) this.f.remove(c1467f);
                if (c1105e != null) {
                    c1105e.f11456a.invoke(c1105e.f11457b, c1105e.f11458c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // m2.InterfaceC1435a
    public final void b(Context context, W1.c cVar, C0050x c0050x) {
        j jVar;
        ReentrantLock reentrantLock = this.f14156c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f14157d;
        try {
            C1467f c1467f = (C1467f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f14158e;
            if (c1467f != null) {
                c1467f.b(c0050x);
                linkedHashMap2.put(c0050x, context);
                jVar = j.f13876a;
            } else {
                jVar = null;
            }
            if (jVar == null) {
                C1467f c1467f2 = new C1467f(context);
                linkedHashMap.put(context, c1467f2);
                linkedHashMap2.put(c0050x, context);
                c1467f2.b(c0050x);
                if (context instanceof Activity) {
                    this.f.put(c1467f2, this.f14155b.a(this.f14154a, s.a(WindowLayoutInfo.class), (Activity) context, new C1463b(c1467f2)));
                } else {
                    c1467f2.accept(new WindowLayoutInfo(p.f14074a));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
