package androidx.camera.core.impl;

import android.util.Range;
import w.C1891A;
import w.C1892B;
/* loaded from: classes.dex */
public interface y0 extends I.l, O {

    /* renamed from: I  reason: collision with root package name */
    public static final C0501c f7683I = new C0501c("camerax.core.useCase.defaultSessionConfig", o0.class, null);

    /* renamed from: J  reason: collision with root package name */
    public static final C0501c f7684J = new C0501c("camerax.core.useCase.defaultCaptureConfig", E.class, null);

    /* renamed from: K  reason: collision with root package name */
    public static final C0501c f7685K = new C0501c("camerax.core.useCase.sessionConfigUnpacker", C1892B.class, null);

    /* renamed from: L  reason: collision with root package name */
    public static final C0501c f7686L = new C0501c("camerax.core.useCase.captureConfigUnpacker", C1891A.class, null);

    /* renamed from: M  reason: collision with root package name */
    public static final C0501c f7687M;

    /* renamed from: N  reason: collision with root package name */
    public static final C0501c f7688N;

    /* renamed from: O  reason: collision with root package name */
    public static final C0501c f7689O;

    /* renamed from: P  reason: collision with root package name */
    public static final C0501c f7690P;

    /* renamed from: Q  reason: collision with root package name */
    public static final C0501c f7691Q;

    /* renamed from: R  reason: collision with root package name */
    public static final C0501c f7692R;

    /* renamed from: S  reason: collision with root package name */
    public static final C0501c f7693S;

    static {
        Class cls = Integer.TYPE;
        f7687M = new C0501c("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f7688N = new C0501c("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        f7689O = new C0501c("camerax.core.useCase.zslDisabled", cls2, null);
        f7690P = new C0501c("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f7691Q = new C0501c("camerax.core.useCase.captureType", A0.class, null);
        f7692R = new C0501c("camerax.core.useCase.previewStabilizationMode", cls, null);
        f7693S = new C0501c("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    int A();

    o0 J();

    int K();

    C1892B L();

    boolean O();

    o0 S();

    boolean Y();

    A0 f();

    int g();

    Range v();
}
