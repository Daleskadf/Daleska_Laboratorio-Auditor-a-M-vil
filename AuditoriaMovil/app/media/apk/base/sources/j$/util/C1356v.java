package j$.util;

import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1356v extends C1222p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C1222p, java.util.List
    public final java.util.List subList(int i7, int i8) {
        return new C1222p(this.f13002b.subList(i7, i8));
    }

    private Object writeReplace() {
        return new C1222p(this.f13002b);
    }
}
