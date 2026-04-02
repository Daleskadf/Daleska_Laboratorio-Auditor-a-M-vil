package k1;

import H0.c0;
import H0.d0;
/* renamed from: k1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385b {

    /* renamed from: a  reason: collision with root package name */
    public final C1384a f13570a;

    public C1385b(C1384a c1384a) {
        this.f13570a = c1384a;
    }

    public final void a() {
        try {
            ((C1385b) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(d0.class).newInstance(this.f13570a)).a();
        } catch (Exception e7) {
            int i7 = c0.f1791a;
            if (e7 instanceof c0) {
                throw ((c0) e7);
            }
            throw new Exception(e7);
        }
    }
}
