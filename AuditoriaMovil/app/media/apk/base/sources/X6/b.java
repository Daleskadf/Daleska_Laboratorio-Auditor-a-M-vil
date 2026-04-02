package X6;

import A.j;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final int f6537a = f.API_PRIORITY_OTHER;

    /* renamed from: b  reason: collision with root package name */
    public final V6.a f6538b;

    /* renamed from: c  reason: collision with root package name */
    public final V6.b f6539c;

    /* renamed from: d  reason: collision with root package name */
    public long f6540d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6541e;

    public b(P0.b bVar, j jVar) {
        this.f6538b = bVar;
        this.f6539c = jVar;
    }

    public final void a(int i7) {
        if (!this.f6541e && this.f6540d + i7 > this.f6537a) {
            this.f6541e = true;
            this.f6538b.accept(this);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f6539c.e(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        ((OutputStream) this.f6539c.e(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        a(bArr.length);
        ((OutputStream) this.f6539c.e(this)).write(bArr);
        this.f6540d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        a(i8);
        ((OutputStream) this.f6539c.e(this)).write(bArr, i7, i8);
        this.f6540d += i8;
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        a(1);
        ((OutputStream) this.f6539c.e(this)).write(i7);
        this.f6540d++;
    }
}
