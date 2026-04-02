package n2;

import B5.C0050x;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l6.j;
import m2.InterfaceC1435a;
/* renamed from: n2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465d implements InterfaceC1435a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f14159a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f14160b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f14161c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f14162d = new LinkedHashMap();

    public C1465d(WindowLayoutComponent windowLayoutComponent) {
        this.f14159a = windowLayoutComponent;
    }

    @Override // m2.InterfaceC1435a
    public final void a(C0050x c0050x) {
        ReentrantLock reentrantLock = this.f14160b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f14162d;
        try {
            Context context = (Context) linkedHashMap.get(c0050x);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f14161c;
            C1467f c1467f = (C1467f) linkedHashMap2.get(context);
            if (c1467f == null) {
                return;
            }
            c1467f.d(c0050x);
            linkedHashMap.remove(c0050x);
            if (c1467f.c()) {
                linkedHashMap2.remove(context);
                this.f14159a.removeWindowLayoutInfoListener(c1467f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // m2.InterfaceC1435a
    public final void b(Context context, W1.c cVar, C0050x c0050x) {
        j jVar;
        ReentrantLock reentrantLock = this.f14160b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f14161c;
        try {
            C1467f c1467f = (C1467f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f14162d;
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
                this.f14159a.addWindowLayoutInfoListener(context, c1467f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
