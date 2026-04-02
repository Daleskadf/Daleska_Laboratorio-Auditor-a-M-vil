package L5;

import android.util.Log;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3026a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3028c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f3026a = i7;
        this.f3028c = obj;
        this.f3027b = obj2;
    }

    @Override // L5.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f3026a) {
            case 0:
                E.e eVar = (E.e) this.f3028c;
                try {
                    ((c) this.f3027b).h(((n) eVar.f922d).b(byteBuffer));
                    return;
                } catch (RuntimeException e7) {
                    Log.e("BasicMessageChannel#" + ((String) eVar.f921c), "Failed to handle message reply", e7);
                    return;
                }
            default:
                r rVar = (r) this.f3028c;
                q qVar = (q) this.f3027b;
                try {
                    if (byteBuffer == null) {
                        qVar.c();
                    } else {
                        try {
                            qVar.a(rVar.f3042c.f(byteBuffer));
                        } catch (k e8) {
                            qVar.b(e8.f3035b, e8.f3034a, e8.getMessage());
                        }
                    }
                    return;
                } catch (RuntimeException e9) {
                    Log.e("MethodChannel#" + rVar.f3041b, "Failed to handle method call result", e9);
                    return;
                }
        }
    }
}
