package Q6;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4455a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final x f4456b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4457c;

    public c(OutputStream outputStream, x xVar) {
        this.f4457c = outputStream;
        this.f4456b = xVar;
    }

    @Override // Q6.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4455a) {
            case 0:
                c cVar = (c) this.f4457c;
                x xVar = this.f4456b;
                try {
                    cVar.close();
                    if (!xVar.b()) {
                        return;
                    }
                    throw xVar.c(null);
                } catch (IOException e7) {
                    if (!xVar.b()) {
                        throw e7;
                    }
                    throw xVar.c(e7);
                } finally {
                    xVar.b();
                }
            default:
                ((OutputStream) this.f4457c).close();
                return;
        }
    }

    @Override // Q6.w, java.io.Flushable
    public final void flush() {
        switch (this.f4455a) {
            case 0:
                c cVar = (c) this.f4457c;
                x xVar = this.f4456b;
                try {
                    cVar.flush();
                    if (!xVar.b()) {
                        return;
                    }
                    throw xVar.c(null);
                } catch (IOException e7) {
                    if (!xVar.b()) {
                        throw e7;
                    }
                    throw xVar.c(e7);
                } finally {
                    xVar.b();
                }
            default:
                ((OutputStream) this.f4457c).flush();
                return;
        }
    }

    @Override // Q6.w
    public final void l(e eVar, long j) {
        switch (this.f4455a) {
            case 0:
                AbstractC0281b.c(eVar.f4462b, 0L, j);
                while (true) {
                    long j8 = 0;
                    if (j > 0) {
                        t tVar = eVar.f4461a;
                        kotlin.jvm.internal.j.b(tVar);
                        while (true) {
                            if (j8 < 65536) {
                                j8 += tVar.f4493c - tVar.f4492b;
                                if (j8 >= j) {
                                    j8 = j;
                                } else {
                                    tVar = tVar.f;
                                    kotlin.jvm.internal.j.b(tVar);
                                }
                            }
                        }
                        c cVar = (c) this.f4457c;
                        x xVar = this.f4456b;
                        try {
                            cVar.l(eVar, j8);
                            if (!xVar.b()) {
                                j -= j8;
                            } else {
                                throw xVar.c(null);
                            }
                        } catch (IOException e7) {
                            if (!xVar.b()) {
                                throw e7;
                            }
                            throw xVar.c(e7);
                        } finally {
                            xVar.b();
                        }
                    } else {
                        return;
                    }
                }
            default:
                AbstractC0281b.c(eVar.f4462b, 0L, j);
                while (j > 0) {
                    this.f4456b.a();
                    t tVar2 = eVar.f4461a;
                    kotlin.jvm.internal.j.b(tVar2);
                    int min = (int) Math.min(j, tVar2.f4493c - tVar2.f4492b);
                    ((OutputStream) this.f4457c).write(tVar2.f4491a, tVar2.f4492b, min);
                    int i7 = tVar2.f4492b + min;
                    tVar2.f4492b = i7;
                    long j9 = min;
                    j -= j9;
                    eVar.f4462b -= j9;
                    if (i7 == tVar2.f4493c) {
                        eVar.f4461a = tVar2.a();
                        u.a(tVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f4455a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f4457c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4457c) + ')';
        }
    }

    public c(x xVar, c cVar) {
        this.f4456b = xVar;
        this.f4457c = cVar;
    }
}
