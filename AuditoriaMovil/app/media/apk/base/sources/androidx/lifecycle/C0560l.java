package androidx.lifecycle;
/* renamed from: androidx.lifecycle.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560l {
    public static EnumC0562n a(EnumC0563o state) {
        kotlin.jvm.internal.j.e(state, "state");
        int i7 = AbstractC0559k.f7939a[state.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 5) {
                    return null;
                }
                return EnumC0562n.ON_CREATE;
            }
            return EnumC0562n.ON_RESUME;
        }
        return EnumC0562n.ON_START;
    }
}
