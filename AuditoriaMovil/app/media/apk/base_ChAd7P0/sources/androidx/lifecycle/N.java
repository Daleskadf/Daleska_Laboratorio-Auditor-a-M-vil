package androidx.lifecycle;

import java.io.Closeable;
/* loaded from: classes.dex */
public final class N implements InterfaceC0566s, Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final String f7905a;

    /* renamed from: b  reason: collision with root package name */
    public final M f7906b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7907c;

    public N(String str, M m7) {
        this.f7905a = str;
        this.f7906b = m7;
    }

    public final void a(K5.s registry, AbstractC0564p lifecycle) {
        kotlin.jvm.internal.j.e(registry, "registry");
        kotlin.jvm.internal.j.e(lifecycle, "lifecycle");
        if (!this.f7907c) {
            this.f7907c = true;
            lifecycle.a(this);
            registry.d(this.f7905a, this.f7906b.f7904e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0566s
    public final void j(InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n) {
        if (enumC0562n == EnumC0562n.ON_DESTROY) {
            this.f7907c = false;
            interfaceC0568u.h().b(this);
        }
    }
}
