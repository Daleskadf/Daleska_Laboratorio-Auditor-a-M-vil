package A;

import a.AbstractC0412a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import t4.RunnableC1822b;
import w.C1900J;
/* loaded from: classes.dex */
public final class k extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f21b;

    /* renamed from: c  reason: collision with root package name */
    public Object f22c;

    public k(int i7) {
        this.f20a = i7;
        switch (i7) {
            case 2:
                this.f22c = null;
                this.f21b = new HashMap();
                return;
            default:
                this.f21b = AbstractC0412a.s(new j(this, 0));
                return;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.f21b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void b() {
        U.i iVar = (U.i) this.f22c;
        if (iVar != null) {
            iVar.a(null);
            this.f22c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f21b).get(captureRequest);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
        switch (this.f20a) {
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new Runnable() { // from class: x.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) A.k.this.f21b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                    }
                });
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f20a) {
            case 0:
                b();
                return;
            case 1:
                ((G.k) this.f22c).execute(new RunnableC1822b(12, this, totalCaptureResult));
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                ((G.k) this.f22c).execute(new M.d(this, cameraCaptureSession, captureRequest, totalCaptureResult, 18));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f20a) {
            case 0:
                b();
                return;
            case 1:
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new M.d(this, cameraCaptureSession, captureRequest, captureFailure, 20));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f20a) {
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new M.d(this, cameraCaptureSession, captureRequest, captureResult, 19));
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        switch (this.f20a) {
            case 0:
                b();
                return;
            case 1:
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i7);
                return;
            case 2:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f21b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i7);
                    }
                }
                C1900J c1900j = (C1900J) this.f22c;
                if (c1900j != null) {
                    c1900j.a();
                    return;
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new K0.g(this, cameraCaptureSession, i7, 7));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i7, final long j) {
        switch (this.f20a) {
            case 0:
                b();
                return;
            case 1:
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i7, j);
                return;
            case 2:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f21b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i7, j);
                    }
                }
                C1900J c1900j = (C1900J) this.f22c;
                if (c1900j != null) {
                    c1900j.a();
                    return;
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new Runnable() { // from class: x.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) A.k.this.f21b).onCaptureSequenceCompleted(cameraCaptureSession, i7, j);
                    }
                });
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j8) {
        switch (this.f20a) {
            case 0:
                b();
                return;
            case 1:
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                return;
            case 2:
                for (CameraCaptureSession.CaptureCallback captureCallback : c(captureRequest)) {
                    captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                }
                return;
            case 3:
                ((G.k) this.f22c).execute(new Runnable() { // from class: x.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) A.k.this.f21b).onCaptureStarted(cameraCaptureSession, captureRequest, j, j8);
                    }
                });
                return;
        }
    }

    public k(G.k kVar, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f20a = 3;
        this.f22c = kVar;
        this.f21b = captureCallback;
    }

    public k(G.k kVar) {
        this.f20a = 1;
        this.f21b = new HashSet();
        this.f22c = kVar;
    }
}
