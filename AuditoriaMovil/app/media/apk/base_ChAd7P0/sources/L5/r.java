package L5;

import com.google.firebase.firestore.Z;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final f f3040a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3041b;

    /* renamed from: c  reason: collision with root package name */
    public final s f3042c;

    /* renamed from: d  reason: collision with root package name */
    public final Z f3043d;

    public r(f fVar, String str) {
        this(fVar, str, y.f3047b, null);
    }

    public final void a(String str, Object obj, q qVar) {
        a aVar;
        ByteBuffer b5 = this.f3042c.b(new o(str, obj));
        if (qVar == null) {
            aVar = null;
        } else {
            aVar = new a(1, this, qVar);
        }
        this.f3040a.h(this.f3041b, b5, aVar);
    }

    public final void b(p pVar) {
        A.f fVar = null;
        String str = this.f3041b;
        f fVar2 = this.f3040a;
        Z z7 = this.f3043d;
        if (z7 != null) {
            if (pVar != null) {
                fVar = new A.f(this, pVar, 27, false);
            }
            fVar2.i(str, fVar, z7);
            return;
        }
        if (pVar != null) {
            fVar = new A.f(this, pVar, 27, false);
        }
        fVar2.n(str, fVar);
    }

    public r(f fVar, String str, s sVar, Z z7) {
        this.f3040a = fVar;
        this.f3041b = str;
        this.f3042c = sVar;
        this.f3043d = z7;
    }
}
