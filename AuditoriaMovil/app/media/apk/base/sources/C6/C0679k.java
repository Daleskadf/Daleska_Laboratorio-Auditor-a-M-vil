package c6;

import d6.C0912i;
import java.io.Closeable;
/* renamed from: c6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679k implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final C0912i f8874a;

    /* renamed from: b  reason: collision with root package name */
    public final P0 f8875b;

    public C0679k(C0912i c0912i, P0 p02) {
        this.f8874a = c0912i;
        this.f8875b = p02;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8874a.close();
    }
}
