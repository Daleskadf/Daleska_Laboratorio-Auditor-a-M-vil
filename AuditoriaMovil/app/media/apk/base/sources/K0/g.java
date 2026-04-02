package K0;

import A3.N;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.AbstractC0508j;
import androidx.camera.core.impl.InterfaceC0515q;
import com.google.protobuf.AbstractC0828a;
import g.C0998c;
import g.InterfaceC0997b;
import j6.C1372c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import t4.AbstractC1823c;
import w.C1930o;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2478b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2479c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2480d;

    public /* synthetic */ g(Object obj, int i7, int i8, Object obj2) {
        this.f2477a = i8;
        this.f2479c = obj;
        this.f2478b = i7;
        this.f2480d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0997b interfaceC0997b;
        int i7 = this.f2478b;
        Object obj = this.f2480d;
        Object obj2 = this.f2479c;
        switch (this.f2477a) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (!jVar.f2484d) {
                        if (i7 != -1) {
                            jVar.f2482b.a(i7);
                        }
                        jVar.f2483c = true;
                        ((h) obj).invoke(jVar.f2481a);
                    }
                }
                return;
            case 1:
                ((W1.a) obj2).f6128b.i(i7, (Serializable) obj);
                return;
            case 2:
                e.l this$0 = (e.l) obj2;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                Object obj3 = ((F2.c) obj).f1160a;
                String str = (String) this$0.f10538a.get(Integer.valueOf(i7));
                if (str != null) {
                    C0998c c0998c = (C0998c) this$0.f10542e.get(str);
                    if (c0998c != null) {
                        interfaceC0997b = c0998c.f11077a;
                    } else {
                        interfaceC0997b = null;
                    }
                    if (interfaceC0997b == null) {
                        this$0.f10543g.remove(str);
                        this$0.f.put(str, obj3);
                        return;
                    }
                    InterfaceC0997b interfaceC0997b2 = c0998c.f11077a;
                    if (this$0.f10541d.remove(str)) {
                        interfaceC0997b2.i(obj3);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                e.l this$02 = (e.l) obj2;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                IntentSender.SendIntentException e7 = (IntentSender.SendIntentException) obj;
                kotlin.jvm.internal.j.e(e7, "$e");
                this$02.a(i7, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e7));
                return;
            case 4:
                boolean c8 = u4.q.c();
                AbstractC0828a abstractC0828a = (AbstractC0828a) obj;
                AbstractC1823c abstractC1823c = (AbstractC1823c) ((N) obj2).f106d;
                if (c8) {
                    u4.q.a(abstractC1823c.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(abstractC1823c)), Integer.valueOf(i7), abstractC0828a);
                }
                if (i7 == 1) {
                    abstractC1823c.e(abstractC0828a);
                    return;
                } else {
                    abstractC1823c.f(abstractC0828a);
                    return;
                }
            case 5:
                ((AbstractC0508j) obj2).c(i7, (C1372c) obj);
                return;
            case 6:
                ((AbstractC0508j) obj2).b(i7, (InterfaceC0515q) obj);
                return;
            case 7:
                ((CameraCaptureSession.CaptureCallback) ((A.k) obj2).f21b).onCaptureSequenceAborted((CameraCaptureSession) obj, i7);
                return;
            default:
                ((CameraDevice.StateCallback) ((C1930o) obj2).f16252b).onError((CameraDevice) obj, i7);
                return;
        }
    }

    public /* synthetic */ g(Object obj, AutoCloseable autoCloseable, int i7, int i8) {
        this.f2477a = i8;
        this.f2479c = obj;
        this.f2480d = autoCloseable;
        this.f2478b = i7;
    }
}
