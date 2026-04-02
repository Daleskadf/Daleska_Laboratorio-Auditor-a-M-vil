package w;

import O0.RunnableC0240b;
import android.util.ArrayMap;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.InterfaceC0515q;
import j6.C1372c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: w.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923h extends AbstractC0508j {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f16206a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayMap f16207b;

    @Override // androidx.camera.core.impl.AbstractC0508j
    public final void a(int i7) {
        Iterator it = this.f16206a.iterator();
        while (it.hasNext()) {
            AbstractC0508j abstractC0508j = (AbstractC0508j) it.next();
            try {
                ((Executor) this.f16207b.get(abstractC0508j)).execute(new RunnableC0240b(abstractC0508j, i7, 3));
            } catch (RejectedExecutionException e7) {
                org.slf4j.helpers.i.u("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e7);
            }
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0508j
    public final void b(int i7, InterfaceC0515q interfaceC0515q) {
        Iterator it = this.f16206a.iterator();
        while (it.hasNext()) {
            AbstractC0508j abstractC0508j = (AbstractC0508j) it.next();
            try {
                ((Executor) this.f16207b.get(abstractC0508j)).execute(new K0.g(abstractC0508j, i7, 6, interfaceC0515q));
            } catch (RejectedExecutionException e7) {
                org.slf4j.helpers.i.u("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e7);
            }
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0508j
    public final void c(int i7, C1372c c1372c) {
        Iterator it = this.f16206a.iterator();
        while (it.hasNext()) {
            AbstractC0508j abstractC0508j = (AbstractC0508j) it.next();
            try {
                ((Executor) this.f16207b.get(abstractC0508j)).execute(new K0.g(abstractC0508j, i7, 5, c1372c));
            } catch (RejectedExecutionException e7) {
                org.slf4j.helpers.i.u("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e7);
            }
        }
    }
}
