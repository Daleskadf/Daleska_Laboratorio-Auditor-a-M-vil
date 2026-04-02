package androidx.camera.core.impl;

import D.AbstractC0055e;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public interface Q extends f0 {

    /* renamed from: A  reason: collision with root package name */
    public static final C0501c f7577A;

    /* renamed from: B  reason: collision with root package name */
    public static final C0501c f7578B;

    /* renamed from: C  reason: collision with root package name */
    public static final C0501c f7579C;

    /* renamed from: D  reason: collision with root package name */
    public static final C0501c f7580D;

    /* renamed from: E  reason: collision with root package name */
    public static final C0501c f7581E;

    /* renamed from: F  reason: collision with root package name */
    public static final C0501c f7582F;

    /* renamed from: G  reason: collision with root package name */
    public static final C0501c f7583G;

    /* renamed from: H  reason: collision with root package name */
    public static final C0501c f7584H;

    /* renamed from: y  reason: collision with root package name */
    public static final C0501c f7585y = new C0501c("camerax.core.imageOutput.targetAspectRatio", AbstractC0055e.class, null);

    /* renamed from: z  reason: collision with root package name */
    public static final C0501c f7586z;

    static {
        Class cls = Integer.TYPE;
        f7586z = new C0501c("camerax.core.imageOutput.targetRotation", cls, null);
        f7577A = new C0501c("camerax.core.imageOutput.appTargetRotation", cls, null);
        f7578B = new C0501c("camerax.core.imageOutput.mirrorMode", cls, null);
        f7579C = new C0501c("camerax.core.imageOutput.targetResolution", Size.class, null);
        f7580D = new C0501c("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f7581E = new C0501c("camerax.core.imageOutput.maxResolution", Size.class, null);
        f7582F = new C0501c("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f7583G = new C0501c("camerax.core.imageOutput.resolutionSelector", P.b.class, null);
        f7584H = new C0501c("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    int F();

    ArrayList P();

    P.b Q();

    Size V();

    Size Z();

    int d();

    int d0();

    Size e();

    boolean p();

    List q();

    int s();

    P.b t();
}
