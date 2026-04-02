package w;

import j$.util.Objects;
import java.util.LinkedHashSet;
/* renamed from: w.W  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1912W implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16142a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1914Y f16143b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1914Y f16144c;

    public /* synthetic */ RunnableC1912W(C1914Y c1914y, C1914Y c1914y2, int i7) {
        this.f16142a = i7;
        this.f16143b = c1914y;
        this.f16144c = c1914y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16142a) {
            case 0:
                C1914Y c1914y = this.f16143b;
                Objects.requireNonNull(c1914y.f);
                c1914y.f.g(this.f16144c);
                return;
            default:
                C1914Y c1914y2 = this.f16143b;
                C1914Y c1914y3 = this.f16144c;
                M3.q qVar = c1914y2.f16148b;
                synchronized (qVar.f3254c) {
                    ((LinkedHashSet) qVar.f3255d).remove(c1914y2);
                    ((LinkedHashSet) qVar.f3256e).remove(c1914y2);
                }
                c1914y2.g(c1914y3);
                if (c1914y2.f16152g != null) {
                    Objects.requireNonNull(c1914y2.f);
                    c1914y2.f.c(c1914y3);
                    return;
                }
                org.slf4j.helpers.i.O("SyncCaptureSessionBase", "[" + c1914y2 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                return;
        }
    }
}
