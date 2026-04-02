package O0;

import android.util.Base64;
/* renamed from: O0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0253o implements z3.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3809a;

    @Override // z3.o
    public final Object get() {
        switch (this.f3809a) {
            case 0:
                return new C0248j();
            case 1:
                byte[] bArr = new byte[12];
                P0.f.f3918i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (H0.d0) invoke;
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
