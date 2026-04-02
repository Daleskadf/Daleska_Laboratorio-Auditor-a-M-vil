package M6;

import F6.B;
/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: d  reason: collision with root package name */
    public static final f f3291d;

    /* JADX WARN: Type inference failed for: r0v0, types: [M6.f, F6.B, M6.i] */
    static {
        int i7 = l.f3299c;
        int i8 = l.f3300d;
        long j = l.f3301e;
        String str = l.f3297a;
        ?? b5 = new B();
        b5.f3293c = new d(i7, i8, j, str);
        f3291d = b5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // F6.B
    public final String toString() {
        return "Dispatchers.Default";
    }
}
