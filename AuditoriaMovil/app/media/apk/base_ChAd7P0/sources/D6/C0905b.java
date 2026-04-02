package d6;

import B5.S;
import e6.C0973h;
import e6.C0974i;
import e6.EnumC0966a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: d6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final C0973h f10357a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0906c f10358b;

    public C0905b(C0906c c0906c, C0973h c0973h) {
        this.f10358b = c0906c;
        this.f10357a = c0973h;
    }

    public final void a(S s7) {
        this.f10358b.f10369g0++;
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            if (!c0973h.f10953e) {
                int i7 = c0973h.f10952d;
                if ((s7.f335b & 32) != 0) {
                    i7 = ((int[]) s7.f336c)[5];
                }
                c0973h.f10952d = i7;
                c0973h.a(0, 0, (byte) 4, (byte) 1);
                c0973h.f10949a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void b() {
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            try {
                if (!c0973h.f10953e) {
                    Logger logger = C0974i.f10954a;
                    if (logger.isLoggable(Level.FINE)) {
                        String d7 = C0974i.f10955b.d();
                        logger.fine(">> CONNECTION " + d7);
                    }
                    c0973h.f10949a.b(C0974i.f10955b.q());
                    c0973h.f10949a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(EnumC0966a enumC0966a, byte[] bArr) {
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            try {
                if (!c0973h.f10953e) {
                    if (enumC0966a.httpCode != -1) {
                        c0973h.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                        c0973h.f10949a.d(0);
                        c0973h.f10949a.d(enumC0966a.httpCode);
                        if (bArr.length > 0) {
                            c0973h.f10949a.b(bArr);
                        }
                        c0973h.f10949a.flush();
                    } else {
                        Locale locale = Locale.US;
                        throw new IllegalArgumentException("errorCode.httpCode == -1");
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10357a.close();
    }

    public final void d(int i7, int i8, boolean z7) {
        if (z7) {
            this.f10358b.f10369g0++;
        }
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            if (!c0973h.f10953e) {
                c0973h.a(0, 8, (byte) 6, z7 ? (byte) 1 : (byte) 0);
                c0973h.f10949a.d(i7);
                c0973h.f10949a.d(i8);
                c0973h.f10949a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void flush() {
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            if (!c0973h.f10953e) {
                c0973h.f10949a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void g(int i7, EnumC0966a enumC0966a) {
        this.f10358b.f10369g0++;
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            if (!c0973h.f10953e) {
                if (enumC0966a.httpCode != -1) {
                    c0973h.a(i7, 4, (byte) 3, (byte) 0);
                    c0973h.f10949a.d(enumC0966a.httpCode);
                    c0973h.f10949a.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void j(S s7) {
        int i7;
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            try {
                if (!c0973h.f10953e) {
                    c0973h.a(0, Integer.bitCount(s7.f335b) * 6, (byte) 4, (byte) 0);
                    for (int i8 = 0; i8 < 10; i8++) {
                        if (s7.i(i8)) {
                            if (i8 == 4) {
                                i7 = 3;
                            } else if (i8 == 7) {
                                i7 = 4;
                            } else {
                                i7 = i8;
                            }
                            Q6.q qVar = c0973h.f10949a;
                            if (!qVar.f4486c) {
                                Q6.e eVar = qVar.f4485b;
                                Q6.t u7 = eVar.u(2);
                                int i9 = u7.f4493c;
                                byte[] bArr = u7.f4491a;
                                bArr[i9] = (byte) ((i7 >>> 8) & 255);
                                bArr[i9 + 1] = (byte) (i7 & 255);
                                u7.f4493c = i9 + 2;
                                eVar.f4462b += 2;
                                qVar.a();
                                c0973h.f10949a.d(((int[]) s7.f336c)[i8]);
                            } else {
                                throw new IllegalStateException("closed");
                            }
                        }
                    }
                    c0973h.f10949a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(int i7, long j) {
        C0973h c0973h = this.f10357a;
        synchronized (c0973h) {
            if (!c0973h.f10953e) {
                if (j != 0 && j <= 2147483647L) {
                    c0973h.a(i7, 4, (byte) 8, (byte) 0);
                    c0973h.f10949a.d((int) j);
                    c0973h.f10949a.flush();
                } else {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }
}
