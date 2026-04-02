package B0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class c extends b {
    public /* synthetic */ c(int i7) {
        this(a.f228b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b initialExtras) {
        super(0);
        j.e(initialExtras, "initialExtras");
        ((LinkedHashMap) this.f229a).putAll((LinkedHashMap) initialExtras.f229a);
    }
}
