package androidx.camera.core.impl;

import g0.InterfaceC1003a;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public static final Object f7658Y = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final G.a f7660a;

    /* renamed from: b  reason: collision with root package name */
    public final C5.i f7661b;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f7663d;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f7662c = new AtomicBoolean(true);

    /* renamed from: e  reason: collision with root package name */
    public Object f7664e = f7658Y;
    public int f = -1;

    /* renamed from: X  reason: collision with root package name */
    public boolean f7659X = false;

    public q0(AtomicReference atomicReference, G.a aVar, C5.i iVar) {
        this.f7663d = atomicReference;
        this.f7660a = aVar;
        this.f7661b = iVar;
    }

    public final void a(int i7) {
        synchronized (this) {
            try {
                if (!this.f7662c.get()) {
                    return;
                }
                if (i7 <= this.f) {
                    return;
                }
                this.f = i7;
                if (this.f7659X) {
                    return;
                }
                this.f7659X = true;
                try {
                    this.f7660a.getClass();
                    run();
                } finally {
                    synchronized (this) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f7662c.get()) {
                    this.f7659X = false;
                    return;
                }
                Object obj = this.f7663d.get();
                int i7 = this.f;
                while (true) {
                    if (!Objects.equals(this.f7664e, obj)) {
                        this.f7664e = obj;
                        if (obj instanceof AbstractC0504f) {
                            C5.i iVar = this.f7661b;
                            ((AbstractC0504f) obj).getClass();
                            iVar.getClass();
                            org.slf4j.helpers.i.u("ObserverToConsumerAdapter", "Unexpected error in Observable", null);
                        } else {
                            ((InterfaceC1003a) this.f7661b.f593b).accept(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i7 == this.f || !this.f7662c.get()) {
                                break;
                            }
                            obj = this.f7663d.get();
                            i7 = this.f;
                        } finally {
                        }
                    }
                }
                this.f7659X = false;
            } finally {
            }
        }
    }
}
