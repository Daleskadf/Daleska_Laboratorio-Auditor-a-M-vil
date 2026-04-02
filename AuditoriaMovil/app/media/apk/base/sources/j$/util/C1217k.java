package j$.util;

import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1217k extends C1215i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C1215i, java.util.List
    public final java.util.List subList(int i7, int i8) {
        C1215i c1215i;
        synchronized (this.f12971b) {
            c1215i = new C1215i(this.f12975c.subList(i7, i8), this.f12971b);
        }
        return c1215i;
    }

    private Object writeReplace() {
        return new C1215i(this.f12975c);
    }
}
