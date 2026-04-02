package z6;

import java.util.Random;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final G.b f16904c = new G.b(9);

    @Override // z6.a
    public final Random a() {
        Object obj = this.f16904c.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
