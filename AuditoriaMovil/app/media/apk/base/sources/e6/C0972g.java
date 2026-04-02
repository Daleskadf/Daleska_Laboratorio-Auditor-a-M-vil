package e6;

import Q6.s;
import a6.n0;
import a6.o0;
import a6.t0;
import c6.C0689n0;
import c6.EnumC0668g0;
import c6.EnumC0714w;
import d6.m;
import d6.o;
import d6.p;
import d6.q;
import j6.AbstractC1371b;
import j6.C1372c;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.fork.ForkServer;
/* renamed from: e6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972g implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final s f10946a;

    /* renamed from: b  reason: collision with root package name */
    public final C0970e f10947b;

    /* renamed from: c  reason: collision with root package name */
    public final C0968c f10948c;

    public C0972g(s sVar) {
        this.f10946a = sVar;
        C0970e c0970e = new C0970e(sVar);
        this.f10947b = c0970e;
        this.f10948c = new C0968c(c0970e);
    }

    public final boolean a(o oVar) {
        EnumC0966a enumC0966a;
        boolean z7 = false;
        try {
            this.f10946a.n(9L);
            int a7 = C0974i.a(this.f10946a);
            if (a7 >= 0 && a7 <= 16384) {
                byte a8 = (byte) (this.f10946a.a() & ForkServer.ERROR);
                byte a9 = (byte) (this.f10946a.a() & ForkServer.ERROR);
                int c8 = this.f10946a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                Logger logger = C0974i.f10954a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC0971f.a(true, c8, a7, a8, a9));
                }
                switch (a8) {
                    case 0:
                        b(oVar, a7, a9, c8);
                        break;
                    case 1:
                        d(oVar, a7, a9, c8);
                        break;
                    case 2:
                        if (a7 == 5) {
                            if (c8 != 0) {
                                s sVar = this.f10946a;
                                sVar.c();
                                sVar.a();
                                oVar.getClass();
                                break;
                            } else {
                                C0974i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                                throw null;
                            }
                        } else {
                            C0974i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a7));
                            throw null;
                        }
                    case 3:
                        m(oVar, a7, c8);
                        break;
                    case 4:
                        n(oVar, a7, a9, c8);
                        break;
                    case 5:
                        j(oVar, a7, a9, c8);
                        break;
                    case 6:
                        g(oVar, a7, a9, c8);
                        break;
                    case 7:
                        if (a7 >= 8) {
                            if (c8 == 0) {
                                s sVar2 = this.f10946a;
                                int c9 = sVar2.c();
                                int c10 = sVar2.c();
                                int i7 = a7 - 8;
                                EnumC0966a[] values = EnumC0966a.values();
                                int length = values.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        enumC0966a = values[i8];
                                        if (enumC0966a.httpCode != c10) {
                                            i8++;
                                        }
                                    } else {
                                        enumC0966a = null;
                                    }
                                }
                                if (enumC0966a != null) {
                                    Q6.g gVar = Q6.g.f4463d;
                                    if (i7 > 0) {
                                        gVar = sVar2.b(i7);
                                    }
                                    oVar.f10433a.N(q.INBOUND, c9, enumC0966a, gVar);
                                    EnumC0966a enumC0966a2 = EnumC0966a.ENHANCE_YOUR_CALM;
                                    p pVar = oVar.f10436d;
                                    if (enumC0966a == enumC0966a2) {
                                        String r7 = gVar.r();
                                        p.f10438Q.log(Level.WARNING, oVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + r7);
                                        if ("too_many_pings".equals(r7)) {
                                            pVar.f10448J.run();
                                        }
                                    }
                                    o0 a10 = EnumC0668g0.a(enumC0966a.httpCode).a("Received Goaway");
                                    if (gVar.c() > 0) {
                                        a10 = a10.a(gVar.r());
                                    }
                                    Map map = p.f10437P;
                                    pVar.u(c9, null, a10);
                                    break;
                                } else {
                                    C0974i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(c10));
                                    throw null;
                                }
                            } else {
                                C0974i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                                throw null;
                            }
                        } else {
                            C0974i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a7));
                            throw null;
                        }
                    case 8:
                        if (a7 == 4) {
                            long c11 = this.f10946a.c() & 2147483647L;
                            int i9 = (c11 > 0L ? 1 : (c11 == 0L ? 0 : -1));
                            if (i9 != 0) {
                                oVar.f10433a.R(q.INBOUND, c8, c11);
                                if (i9 == 0) {
                                    if (c8 == 0) {
                                        p.g(oVar.f10436d, EnumC0966a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                                        break;
                                    } else {
                                        oVar.f10436d.j(c8, o0.f7179m.g("Received 0 flow control window increment."), EnumC0714w.PROCESSED, false, EnumC0966a.PROTOCOL_ERROR, null);
                                        break;
                                    }
                                } else {
                                    synchronized (oVar.f10436d.f10462k) {
                                        try {
                                            if (c8 == 0) {
                                                oVar.f10436d.j.g(null, (int) c11);
                                                break;
                                            } else {
                                                m mVar = (m) oVar.f10436d.f10465n.get(Integer.valueOf(c8));
                                                if (mVar != null) {
                                                    oVar.f10436d.j.g(mVar.f10429n.o(), (int) c11);
                                                } else if (!oVar.f10436d.o(c8)) {
                                                    z7 = true;
                                                }
                                                if (z7) {
                                                    p.g(oVar.f10436d, EnumC0966a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + c8);
                                                    break;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                C0974i.c("windowSizeIncrement was 0", new Object[0]);
                                throw null;
                            }
                        } else {
                            C0974i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a7));
                            throw null;
                        }
                        break;
                    default:
                        this.f10946a.o(a7);
                        break;
                }
                return true;
            }
            C0974i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a7));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [Q6.e, java.lang.Object] */
    public final void b(o oVar, int i7, byte b5, int i8) {
        boolean z7;
        short s7;
        p pVar;
        if ((b5 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((b5 & 32) == 0) {
            if ((b5 & 8) != 0) {
                s7 = (short) (this.f10946a.a() & ForkServer.ERROR);
            } else {
                s7 = 0;
            }
            int b7 = C0974i.b(i7, b5, s7);
            s sVar = this.f10946a;
            oVar.f10433a.M(q.INBOUND, i8, sVar.f4489b, b7, z7);
            m n7 = oVar.f10436d.n(i8);
            if (n7 == null) {
                if (oVar.f10436d.o(i8)) {
                    synchronized (oVar.f10436d.f10462k) {
                        oVar.f10436d.f10461i.g(i8, EnumC0966a.STREAM_CLOSED);
                    }
                    sVar.o(b7);
                } else {
                    p.g(oVar.f10436d, EnumC0966a.PROTOCOL_ERROR, "Received data for unknown stream: " + i8);
                    this.f10946a.o(s7);
                    return;
                }
            } else {
                long j = b7;
                sVar.n(j);
                ?? obj = new Object();
                obj.l(sVar.f4489b, j);
                C1372c c1372c = n7.f10429n.f10416I;
                AbstractC1371b.f13458a.getClass();
                synchronized (oVar.f10436d.f10462k) {
                    n7.f10429n.p(i7 - b7, obj, z7);
                }
            }
            p pVar2 = oVar.f10436d;
            int i9 = pVar2.f10470s + i7;
            pVar2.f10470s = i9;
            if (i9 >= pVar2.f * 0.5f) {
                synchronized (pVar2.f10462k) {
                    oVar.f10436d.f10461i.m(0, pVar.f10470s);
                }
                oVar.f10436d.f10470s = 0;
            }
            this.f10946a.o(s7);
            return;
        }
        C0974i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f10931d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(int r3, short r4, byte r5, int r6) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.C0972g.c(int, short, byte, int):java.util.ArrayList");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10946a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [a6.e0, java.lang.Object] */
    public final void d(o oVar, int i7, byte b5, int i8) {
        boolean z7;
        short s7;
        String str;
        o0 o0Var = null;
        boolean z8 = false;
        if (i8 != 0) {
            if ((b5 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((b5 & 8) != 0) {
                s7 = (short) (this.f10946a.a() & ForkServer.ERROR);
            } else {
                s7 = 0;
            }
            if ((b5 & 32) != 0) {
                s sVar = this.f10946a;
                sVar.c();
                sVar.a();
                oVar.getClass();
                i7 -= 5;
            }
            ArrayList c8 = c(C0974i.b(i7, b5, s7), s7, b5, i8);
            t0 t0Var = oVar.f10433a;
            q qVar = q.INBOUND;
            if (t0Var.K()) {
                ((Logger) t0Var.f7209b).log((Level) t0Var.f7210c, qVar + " HEADERS: streamId=" + i8 + " headers=" + c8 + " endStream=" + z7);
            }
            if (oVar.f10436d.f10449K != Integer.MAX_VALUE) {
                long j = 0;
                for (int i9 = 0; i9 < c8.size(); i9++) {
                    C0967b c0967b = (C0967b) c8.get(i9);
                    j += c0967b.f10926b.c() + c0967b.f10925a.c() + 32;
                }
                int min = (int) Math.min(j, 2147483647L);
                int i10 = oVar.f10436d.f10449K;
                if (min > i10) {
                    o0 o0Var2 = o0.f7177k;
                    Locale locale = Locale.US;
                    if (z7) {
                        str = "trailer";
                    } else {
                        str = "header";
                    }
                    o0Var = o0Var2.g("Response " + str + " metadata larger than " + i10 + ": " + min);
                }
            }
            synchronized (oVar.f10436d.f10462k) {
                try {
                    m mVar = (m) oVar.f10436d.f10465n.get(Integer.valueOf(i8));
                    if (mVar == null) {
                        if (oVar.f10436d.o(i8)) {
                            oVar.f10436d.f10461i.g(i8, EnumC0966a.STREAM_CLOSED);
                        } else {
                            z8 = true;
                        }
                    } else if (o0Var == null) {
                        C1372c c1372c = mVar.f10429n.f10416I;
                        AbstractC1371b.f13458a.getClass();
                        mVar.f10429n.q(c8, z7);
                    } else {
                        if (!z7) {
                            oVar.f10436d.f10461i.g(i8, EnumC0966a.CANCEL);
                        }
                        mVar.f10429n.h(o0Var, false, new Object());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z8) {
                p.g(oVar.f10436d, EnumC0966a.PROTOCOL_ERROR, "Received header for unknown stream: " + i8);
                return;
            }
            return;
        }
        C0974i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void g(o oVar, int i7, byte b5, int i8) {
        boolean z7 = false;
        C0689n0 c0689n0 = null;
        if (i7 == 8) {
            if (i8 == 0) {
                int c8 = this.f10946a.c();
                int c9 = this.f10946a.c();
                if ((b5 & 1) != 0) {
                    z7 = true;
                }
                long j = (c8 << 32) | (c9 & 4294967295L);
                oVar.f10433a.O(q.INBOUND, j);
                if (!z7) {
                    synchronized (oVar.f10436d.f10462k) {
                        oVar.f10436d.f10461i.d(c8, c9, true);
                    }
                    return;
                }
                synchronized (oVar.f10436d.f10462k) {
                    try {
                        p pVar = oVar.f10436d;
                        C0689n0 c0689n02 = pVar.f10475x;
                        if (c0689n02 != null) {
                            long j8 = c0689n02.f8915a;
                            if (j8 == j) {
                                pVar.f10475x = null;
                                c0689n0 = c0689n02;
                            } else {
                                Logger logger = p.f10438Q;
                                Level level = Level.WARNING;
                                Locale locale = Locale.US;
                                logger.log(level, "Received unexpected ping ack. Expecting " + j8 + ", got " + j);
                            }
                        } else {
                            p.f10438Q.warning("Received unexpected ping ack. No ping outstanding");
                        }
                    } finally {
                    }
                }
                if (c0689n0 != null) {
                    c0689n0.b();
                    return;
                }
                return;
            }
            C0974i.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        C0974i.c("TYPE_PING length != 8: %s", Integer.valueOf(i7));
        throw null;
    }

    public final void j(o oVar, int i7, byte b5, int i8) {
        short s7 = 0;
        if (i8 != 0) {
            if ((b5 & 8) != 0) {
                s7 = (short) (this.f10946a.a() & ForkServer.ERROR);
            }
            int c8 = this.f10946a.c() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            ArrayList c9 = c(C0974i.b(i7 - 4, b5, s7), s7, b5, i8);
            t0 t0Var = oVar.f10433a;
            q qVar = q.INBOUND;
            if (t0Var.K()) {
                ((Logger) t0Var.f7209b).log((Level) t0Var.f7210c, qVar + " PUSH_PROMISE: streamId=" + i8 + " promisedStreamId=" + c8 + " headers=" + c9);
            }
            synchronized (oVar.f10436d.f10462k) {
                oVar.f10436d.f10461i.g(i8, EnumC0966a.PROTOCOL_ERROR);
            }
            return;
        }
        C0974i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    public final void m(o oVar, int i7, int i8) {
        EnumC0966a enumC0966a;
        boolean z7;
        EnumC0714w enumC0714w;
        if (i7 == 4) {
            if (i8 != 0) {
                int c8 = this.f10946a.c();
                EnumC0966a[] values = EnumC0966a.values();
                int length = values.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        enumC0966a = values[i9];
                        if (enumC0966a.httpCode == c8) {
                            break;
                        }
                        i9++;
                    } else {
                        enumC0966a = null;
                        break;
                    }
                }
                if (enumC0966a != null) {
                    oVar.f10433a.P(q.INBOUND, i8, enumC0966a);
                    o0 a7 = p.y(enumC0966a).a("Rst Stream");
                    n0 n0Var = a7.f7183a;
                    if (n0Var != n0.CANCELLED && n0Var != n0.DEADLINE_EXCEEDED) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    synchronized (oVar.f10436d.f10462k) {
                        try {
                            m mVar = (m) oVar.f10436d.f10465n.get(Integer.valueOf(i8));
                            if (mVar != null) {
                                C1372c c1372c = mVar.f10429n.f10416I;
                                AbstractC1371b.f13458a.getClass();
                                p pVar = oVar.f10436d;
                                if (enumC0966a == EnumC0966a.REFUSED_STREAM) {
                                    enumC0714w = EnumC0714w.REFUSED;
                                } else {
                                    enumC0714w = EnumC0714w.PROCESSED;
                                }
                                pVar.j(i8, a7, enumC0714w, z7, null, null);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                C0974i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(c8));
                throw null;
            }
            C0974i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        C0974i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i7));
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:40:0x0080, B:42:0x0086, B:45:0x0094, B:47:0x009a, B:49:0x00a6, B:51:0x00b8, B:57:0x00d3, B:59:0x00d7, B:61:0x00ed, B:62:0x010d, B:63:0x0119, B:64:0x011a, B:66:0x0123, B:67:0x012a, B:68:0x012f, B:54:0x00c3, B:55:0x00d1), top: B:89:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:40:0x0080, B:42:0x0086, B:45:0x0094, B:47:0x009a, B:49:0x00a6, B:51:0x00b8, B:57:0x00d3, B:59:0x00d7, B:61:0x00ed, B:62:0x010d, B:63:0x0119, B:64:0x011a, B:66:0x0123, B:67:0x012a, B:68:0x012f, B:54:0x00c3, B:55:0x00d1), top: B:89:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(d6.o r9, int r10, byte r11, int r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.C0972g.n(d6.o, int, byte, int):void");
    }
}
