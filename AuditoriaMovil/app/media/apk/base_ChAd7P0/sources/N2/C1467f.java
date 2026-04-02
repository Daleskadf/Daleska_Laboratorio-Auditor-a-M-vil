package n2;

import B5.C0050x;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g0.InterfaceC1003a;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j;
import l2.k;
/* renamed from: n2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467f implements InterfaceC1003a, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14163a;

    /* renamed from: c  reason: collision with root package name */
    public k f14165c;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f14164b = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f14166d = new LinkedHashSet();

    public C1467f(Context context) {
        this.f14163a = context;
    }

    @Override // g0.InterfaceC1003a
    /* renamed from: a */
    public final void accept(WindowLayoutInfo value) {
        j.e(value, "value");
        ReentrantLock reentrantLock = this.f14164b;
        reentrantLock.lock();
        try {
            this.f14165c = AbstractC1466e.b(this.f14163a, value);
            for (InterfaceC1003a interfaceC1003a : this.f14166d) {
                interfaceC1003a.accept(this.f14165c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0050x c0050x) {
        ReentrantLock reentrantLock = this.f14164b;
        reentrantLock.lock();
        try {
            k kVar = this.f14165c;
            if (kVar != null) {
                c0050x.accept(kVar);
            }
            this.f14166d.add(c0050x);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f14166d.isEmpty();
    }

    public final void d(C0050x c0050x) {
        ReentrantLock reentrantLock = this.f14164b;
        reentrantLock.lock();
        try {
            this.f14166d.remove(c0050x);
        } finally {
            reentrantLock.unlock();
        }
    }
}
