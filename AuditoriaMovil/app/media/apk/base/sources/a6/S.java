package a6;

import D.AbstractC0055e;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
/* loaded from: classes.dex */
public abstract class S {
    public abstract String a();

    public abstract int b();

    public abstract boolean c();

    public abstract Q d(AbstractC0478g abstractC0478g);

    public abstract h0 e(Map map);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(a(), "policy");
        C7.d(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, String.valueOf(b()));
        C7.c("available", c());
        return C7.toString();
    }
}
