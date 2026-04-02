package I4;

import L4.C0222n;
import L4.o0;
import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes.dex */
public abstract class q {
    public boolean e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final t f() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Q4.c cVar = new Q4.c(stringWriter);
            cVar.r(z.LENIENT);
            o0.f2992z.getClass();
            C0222n.f(cVar, this);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
