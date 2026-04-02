package X0;

import A3.e0;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.C0746u;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.internal.I;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6247a;

    /* renamed from: b  reason: collision with root package name */
    public int f6248b;

    /* renamed from: c  reason: collision with root package name */
    public Object f6249c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6250d;

    /* renamed from: e  reason: collision with root package name */
    public Object f6251e;

    public c(Context context) {
        Context applicationContext;
        String B7;
        TelephonyManager telephonyManager;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f6249c = applicationContext;
        int i7 = K0.x.f2529a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                B7 = AbstractC1740d.B(networkCountryIso);
                int[] a7 = i1.g.a(B7);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                e0 e0Var = i1.g.f11396n;
                hashMap.put(2, (Long) e0Var.get(a7[0]));
                hashMap.put(3, (Long) i1.g.f11397o.get(a7[1]));
                hashMap.put(4, (Long) i1.g.f11398p.get(a7[2]));
                hashMap.put(5, (Long) i1.g.f11399q.get(a7[3]));
                hashMap.put(10, (Long) i1.g.f11400r.get(a7[4]));
                hashMap.put(9, (Long) i1.g.f11401s.get(a7[5]));
                hashMap.put(7, (Long) e0Var.get(a7[0]));
                this.f6250d = hashMap;
                this.f6248b = 2000;
                this.f6251e = K0.s.f2519a;
                this.f6247a = true;
            }
        }
        B7 = AbstractC1740d.B(Locale.getDefault().getCountry());
        int[] a72 = i1.g.a(B7);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        e0 e0Var2 = i1.g.f11396n;
        hashMap2.put(2, (Long) e0Var2.get(a72[0]));
        hashMap2.put(3, (Long) i1.g.f11397o.get(a72[1]));
        hashMap2.put(4, (Long) i1.g.f11398p.get(a72[2]));
        hashMap2.put(5, (Long) i1.g.f11399q.get(a72[3]));
        hashMap2.put(10, (Long) i1.g.f11400r.get(a72[4]));
        hashMap2.put(9, (Long) i1.g.f11401s.get(a72[5]));
        hashMap2.put(7, (Long) e0Var2.get(a72[0]));
        this.f6250d = hashMap2;
        this.f6248b = 2000;
        this.f6251e = K0.s.f2519a;
        this.f6247a = true;
    }

    public static void b(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z7;
        f fVar = (f) cVar.f6250d;
        if (fVar.f6266c == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        HandlerThread handlerThread = fVar.f6265b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) cVar.f6249c;
        mediaCodec.setCallback(fVar, handler);
        fVar.f6266c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        ((k) cVar.f6251e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        cVar.f6248b = 1;
    }

    public static String g(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // X0.j
    public MediaFormat A() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f6250d;
        synchronized (fVar.f6264a) {
            try {
                mediaFormat = fVar.f6270h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // X0.j
    public ByteBuffer E(int i7) {
        return ((MediaCodec) this.f6249c).getInputBuffer(i7);
    }

    @Override // X0.j
    public void F(Surface surface) {
        ((MediaCodec) this.f6249c).setOutputSurface(surface);
    }

    @Override // X0.j
    public ByteBuffer K(int i7) {
        return ((MediaCodec) this.f6249c).getOutputBuffer(i7);
    }

    @Override // X0.j
    public void T(int i7, long j) {
        ((MediaCodec) this.f6249c).releaseOutputBuffer(i7, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x004e, B:29:0x0042, B:32:0x0050, B:33:0x0055, B:34:0x0056, B:35:0x0058, B:36:0x0059, B:37:0x005b, B:38:0x005c, B:39:0x005e), top: B:42:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x004e, B:29:0x0042, B:32:0x0050, B:33:0x0055, B:34:0x0056, B:35:0x0058, B:36:0x0059, B:37:0x005b, B:38:0x005c, B:39:0x005e), top: B:42:0x000e }] */
    @Override // X0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int V() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6251e
            X0.k r0 = (X0.k) r0
            r0.c()
            java.lang.Object r0 = r7.f6250d
            X0.f r0 = (X0.f) r0
            java.lang.Object r1 = r0.f6264a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f6275n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L5c
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L59
            android.media.MediaCodec$CryptoException r2 = r0.f6272k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L56
            long r2 = r0.f6273l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f6274m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L4f
        L32:
            r0 = move-exception
            goto L5f
        L34:
            K0.l r0 = r0.f6267d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.f2494b     // Catch: java.lang.Throwable -> L32
            int r6 = r0.f2495c     // Catch: java.lang.Throwable -> L32
            if (r2 != r6) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            goto L4e
        L40:
            if (r2 == r6) goto L50
            java.lang.Object r3 = r0.f2497e     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + r4
            int r3 = r0.f2496d     // Catch: java.lang.Throwable -> L32
            r2 = r2 & r3
            r0.f2494b = r2     // Catch: java.lang.Throwable -> L32
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L4f:
            return r5
        L50:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f6272k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L59:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5c:
            r0.f6275n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.c.V():int");
    }

    @Override // X0.j
    public void a(Bundle bundle) {
        ((k) this.f6251e).a(bundle);
    }

    @Override // X0.j
    public boolean b0(r rVar) {
        f fVar = (f) this.f6250d;
        synchronized (fVar.f6264a) {
            fVar.f6276o = rVar;
        }
        return true;
    }

    public C0746u c() {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (((InterfaceC0747v) this.f6249c) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("Must set register function", z7);
        if (((InterfaceC0747v) this.f6250d) != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        I.a("Must set unregister function", z8);
        if (((C0742p) this.f6251e) != null) {
            z9 = true;
        }
        I.a("Must set holder", z9);
        C0740n c0740n = ((C0742p) this.f6251e).f9271c;
        I.j(c0740n, "Key must not be null");
        return new C0746u(new Q(this, (C0742p) this.f6251e, this.f6247a, this.f6248b), new S(this, c0740n));
    }

    @Override // X0.j
    public void d(int i7, N0.b bVar, long j, int i8) {
        ((k) this.f6251e).d(i7, bVar, j, i8);
    }

    @Override // X0.j
    public void d0(k1.j jVar, Handler handler) {
        ((MediaCodec) this.f6249c).setOnFrameRenderedListener(new a(this, jVar, 0), handler);
    }

    @Override // X0.j
    public void e(int i7, int i8, long j, int i9) {
        ((k) this.f6251e).e(i7, i8, j, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:27:0x003f, B:30:0x0043, B:32:0x0051, B:36:0x0078, B:35:0x006e, B:38:0x007a, B:39:0x007f, B:40:0x0080, B:41:0x0082, B:42:0x0083, B:43:0x0085, B:44:0x0086, B:45:0x0088), top: B:48:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:27:0x003f, B:30:0x0043, B:32:0x0051, B:36:0x0078, B:35:0x006e, B:38:0x007a, B:39:0x007f, B:40:0x0080, B:41:0x0082, B:42:0x0083, B:43:0x0085, B:44:0x0086, B:45:0x0088), top: B:48:0x000e }] */
    @Override // X0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(android.media.MediaCodec.BufferInfo r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f6251e
            X0.k r0 = (X0.k) r0
            r0.c()
            java.lang.Object r0 = r12.f6250d
            X0.f r0 = (X0.f) r0
            java.lang.Object r1 = r0.f6264a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f6275n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L86
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L83
            android.media.MediaCodec$CryptoException r2 = r0.f6272k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L80
            long r2 = r0.f6273l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f6274m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L32:
            r13 = move-exception
            goto L89
        L34:
            K0.l r2 = r0.f6268e     // Catch: java.lang.Throwable -> L32
            int r6 = r2.f2494b     // Catch: java.lang.Throwable -> L32
            int r7 = r2.f2495c     // Catch: java.lang.Throwable -> L32
            if (r6 != r7) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L41:
            if (r6 == r7) goto L7a
            java.lang.Object r3 = r2.f2497e     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r6]     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + r4
            int r3 = r2.f2496d     // Catch: java.lang.Throwable -> L32
            r3 = r3 & r6
            r2.f2494b = r3     // Catch: java.lang.Throwable -> L32
            if (r5 < 0) goto L6b
            android.media.MediaFormat r2 = r0.f6270h     // Catch: java.lang.Throwable -> L32
            K0.a.k(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L32
            int r7 = r0.offset     // Catch: java.lang.Throwable -> L32
            int r8 = r0.size     // Catch: java.lang.Throwable -> L32
            long r9 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L32
            int r11 = r0.flags     // Catch: java.lang.Throwable -> L32
            r6 = r13
            r6.set(r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L32
            goto L78
        L6b:
            r13 = -2
            if (r5 != r13) goto L78
            java.util.ArrayDeque r13 = r0.f6269g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r13 = r13.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r13 = (android.media.MediaFormat) r13     // Catch: java.lang.Throwable -> L32
            r0.f6270h = r13     // Catch: java.lang.Throwable -> L32
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L79:
            return r5
        L7a:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r13.<init>()     // Catch: java.lang.Throwable -> L32
            throw r13     // Catch: java.lang.Throwable -> L32
        L80:
            r0.f6272k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L83:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L86:
            r0.f6275n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // X0.j
    public void flush() {
        ((k) this.f6251e).flush();
        ((MediaCodec) this.f6249c).flush();
        f fVar = (f) this.f6250d;
        synchronized (fVar.f6264a) {
            fVar.f6273l++;
            Handler handler = fVar.f6266c;
            int i7 = K0.x.f2529a;
            handler.post(new C.b(fVar, 21));
        }
        ((MediaCodec) this.f6249c).start();
    }

    @Override // X0.j
    public void o(int i7, boolean z7) {
        ((MediaCodec) this.f6249c).releaseOutputBuffer(i7, z7);
    }

    @Override // X0.j
    public void release() {
        try {
            if (this.f6248b == 1) {
                ((k) this.f6251e).shutdown();
                f fVar = (f) this.f6250d;
                synchronized (fVar.f6264a) {
                    fVar.f6274m = true;
                    fVar.f6265b.quit();
                    fVar.a();
                }
            }
            this.f6248b = 2;
            if (!this.f6247a) {
                try {
                    int i7 = K0.x.f2529a;
                    if (i7 >= 30 && i7 < 33) {
                        ((MediaCodec) this.f6249c).stop();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.f6247a) {
                try {
                    int i8 = K0.x.f2529a;
                    if (i8 >= 30 && i8 < 33) {
                        ((MediaCodec) this.f6249c).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // X0.j
    public void u(int i7) {
        ((MediaCodec) this.f6249c).setVideoScalingMode(i7);
    }
}
