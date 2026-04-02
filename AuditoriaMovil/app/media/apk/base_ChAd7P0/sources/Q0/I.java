package Q0;

import A3.e0;
import H0.C0126f;
import H0.C0127g;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class I implements q {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f4164m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public static ExecutorService f4165n0;

    /* renamed from: o0  reason: collision with root package name */
    public static int f4166o0;

    /* renamed from: A  reason: collision with root package name */
    public C0126f f4167A;

    /* renamed from: B  reason: collision with root package name */
    public C f4168B;

    /* renamed from: C  reason: collision with root package name */
    public C f4169C;

    /* renamed from: D  reason: collision with root package name */
    public H0.L f4170D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4171E;

    /* renamed from: F  reason: collision with root package name */
    public ByteBuffer f4172F;

    /* renamed from: G  reason: collision with root package name */
    public int f4173G;

    /* renamed from: H  reason: collision with root package name */
    public long f4174H;

    /* renamed from: I  reason: collision with root package name */
    public long f4175I;

    /* renamed from: J  reason: collision with root package name */
    public long f4176J;

    /* renamed from: K  reason: collision with root package name */
    public long f4177K;

    /* renamed from: L  reason: collision with root package name */
    public int f4178L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f4179M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f4180N;

    /* renamed from: O  reason: collision with root package name */
    public long f4181O;

    /* renamed from: P  reason: collision with root package name */
    public float f4182P;

    /* renamed from: Q  reason: collision with root package name */
    public ByteBuffer f4183Q;

    /* renamed from: R  reason: collision with root package name */
    public int f4184R;

    /* renamed from: S  reason: collision with root package name */
    public ByteBuffer f4185S;

    /* renamed from: T  reason: collision with root package name */
    public byte[] f4186T;

    /* renamed from: U  reason: collision with root package name */
    public int f4187U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4188V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f4189W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f4190X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4191Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4192Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4193a;

    /* renamed from: a0  reason: collision with root package name */
    public int f4194a0;

    /* renamed from: b  reason: collision with root package name */
    public final V2.k f4195b;
    public C0127g b0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4196c;

    /* renamed from: c0  reason: collision with root package name */
    public C0273j f4197c0;

    /* renamed from: d  reason: collision with root package name */
    public final u f4198d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4199d0;

    /* renamed from: e  reason: collision with root package name */
    public final P f4200e;

    /* renamed from: e0  reason: collision with root package name */
    public long f4201e0;
    public final e0 f;

    /* renamed from: f0  reason: collision with root package name */
    public long f4202f0;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f4203g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4204g0;

    /* renamed from: h  reason: collision with root package name */
    public final A.n f4205h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4206h0;

    /* renamed from: i  reason: collision with root package name */
    public final t f4207i;

    /* renamed from: i0  reason: collision with root package name */
    public Looper f4208i0;
    public final ArrayDeque j;

    /* renamed from: j0  reason: collision with root package name */
    public long f4209j0;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4210k;

    /* renamed from: k0  reason: collision with root package name */
    public long f4211k0;

    /* renamed from: l  reason: collision with root package name */
    public int f4212l;

    /* renamed from: l0  reason: collision with root package name */
    public Handler f4213l0;

    /* renamed from: m  reason: collision with root package name */
    public H f4214m;

    /* renamed from: n  reason: collision with root package name */
    public final J2.e f4215n;

    /* renamed from: o  reason: collision with root package name */
    public final J2.e f4216o;

    /* renamed from: p  reason: collision with root package name */
    public final J f4217p;

    /* renamed from: q  reason: collision with root package name */
    public final M0.x f4218q;

    /* renamed from: r  reason: collision with root package name */
    public P0.k f4219r;

    /* renamed from: s  reason: collision with root package name */
    public A.m f4220s;

    /* renamed from: t  reason: collision with root package name */
    public B f4221t;

    /* renamed from: u  reason: collision with root package name */
    public B f4222u;

    /* renamed from: v  reason: collision with root package name */
    public I0.a f4223v;

    /* renamed from: w  reason: collision with root package name */
    public AudioTrack f4224w;

    /* renamed from: x  reason: collision with root package name */
    public C0268e f4225x;

    /* renamed from: y  reason: collision with root package name */
    public C0272i f4226y;

    /* renamed from: z  reason: collision with root package name */
    public E f4227z;

    /* JADX WARN: Type inference failed for: r10v10, types: [H0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [A.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [Q0.u, java.lang.Object, I0.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Q0.P, java.lang.Object, I0.e] */
    public I(A a7) {
        C0268e c0268e;
        Context context = (Context) a7.f4137c;
        this.f4193a = context;
        C0126f c0126f = C0126f.f1797c;
        this.f4167A = c0126f;
        if (context != null) {
            C0268e c0268e2 = C0268e.f4271c;
            int i7 = K0.x.f2529a;
            c0268e = C0268e.b(context, c0126f, null);
        } else {
            c0268e = (C0268e) a7.f4138d;
        }
        this.f4225x = c0268e;
        this.f4195b = (V2.k) a7.f4139e;
        int i8 = K0.x.f2529a;
        this.f4196c = false;
        this.f4210k = false;
        this.f4212l = 0;
        this.f4217p = (J) a7.f;
        M0.x xVar = (M0.x) a7.f4140g;
        xVar.getClass();
        this.f4218q = xVar;
        ?? obj = new Object();
        this.f4205h = obj;
        obj.d();
        this.f4207i = new t(new C5.i(this, 18));
        ?? eVar = new I0.e();
        this.f4198d = eVar;
        ?? eVar2 = new I0.e();
        eVar2.f4264m = K0.x.f;
        this.f4200e = eVar2;
        this.f = A3.K.w(new I0.e(), eVar, eVar2);
        this.f4203g = A3.K.u(new I0.e());
        this.f4182P = 1.0f;
        this.f4194a0 = 0;
        this.b0 = new Object();
        H0.L l8 = H0.L.f1700d;
        this.f4169C = new C(l8, 0L, 0L);
        this.f4170D = l8;
        this.f4171E = false;
        this.j = new ArrayDeque();
        this.f4215n = new J2.e(1);
        this.f4216o = new J2.e(1);
    }

    public static boolean m(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (K0.x.f2529a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r2 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r2 != 4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            boolean r2 = r16.t()
            r3 = 4
            r4 = 1610612736(0x60000000, float:3.6893488E19)
            r5 = 22
            r6 = 1342177280(0x50000000, float:8.5899346E9)
            r7 = 21
            boolean r8 = r0.f4196c
            V2.k r9 = r0.f4195b
            if (r2 != 0) goto L5b
            boolean r2 = r0.f4199d0
            if (r2 != 0) goto L55
            Q0.B r2 = r0.f4222u
            int r10 = r2.f4143c
            if (r10 != 0) goto L55
            H0.r r2 = r2.f4141a
            int r2 = r2.f1867C
            if (r8 == 0) goto L33
            int r10 = K0.x.f2529a
            if (r2 == r7) goto L55
            if (r2 == r6) goto L55
            if (r2 == r5) goto L55
            if (r2 == r4) goto L55
            if (r2 != r3) goto L33
            goto L55
        L33:
            H0.L r2 = r0.f4170D
            r9.getClass()
            float r10 = r2.f1701a
            java.lang.Object r11 = r9.f5967d
            I0.g r11 = (I0.g) r11
            float r12 = r11.f2160c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L48
            r11.f2160c = r10
            r11.f2165i = r1
        L48:
            float r10 = r11.f2161d
            float r12 = r2.f1702b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L57
            r11.f2161d = r12
            r11.f2165i = r1
            goto L57
        L55:
            H0.L r2 = H0.L.f1700d
        L57:
            r0.f4170D = r2
        L59:
            r11 = r2
            goto L5e
        L5b:
            H0.L r2 = H0.L.f1700d
            goto L59
        L5e:
            boolean r2 = r0.f4199d0
            if (r2 != 0) goto L84
            Q0.B r2 = r0.f4222u
            int r10 = r2.f4143c
            if (r10 != 0) goto L84
            H0.r r2 = r2.f4141a
            int r2 = r2.f1867C
            if (r8 == 0) goto L7b
            int r8 = K0.x.f2529a
            if (r2 == r7) goto L84
            if (r2 == r6) goto L84
            if (r2 == r5) goto L84
            if (r2 == r4) goto L84
            if (r2 != r3) goto L7b
            goto L84
        L7b:
            boolean r2 = r0.f4171E
            java.lang.Object r3 = r9.f5966c
            Q0.N r3 = (Q0.N) r3
            r3.f4252o = r2
            goto L85
        L84:
            r2 = 0
        L85:
            r0.f4171E = r2
            java.util.ArrayDeque r2 = r0.j
            Q0.C r3 = new Q0.C
            r4 = 0
            r6 = r17
            long r12 = java.lang.Math.max(r4, r6)
            Q0.B r4 = r0.f4222u
            long r5 = r16.h()
            int r4 = r4.f4145e
            long r14 = K0.x.S(r4, r5)
            r10 = r3
            r10.<init>(r11, r12, r14)
            r2.add(r3)
            Q0.B r2 = r0.f4222u
            I0.a r2 = r2.f4148i
            r0.f4223v = r2
            r2.b()
            A.m r2 = r0.f4220s
            if (r2 == 0) goto Lc7
            boolean r3 = r0.f4171E
            java.lang.Object r2 = r2.f28b
            Q0.L r2 = (Q0.L) r2
            Q0.m r2 = r2.f4229A1
            android.os.Handler r4 = r2.f4296b
            if (r4 == 0) goto Lc7
            C.d r5 = new C.d
            r5.<init>(r2, r3, r1)
            r4.post(r5)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.a(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Type inference failed for: r13v7, types: [A3.H, A3.E] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(H0.r r24, int[] r25) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.b(H0.r, int[]):void");
    }

    public final boolean c() {
        if (!this.f4223v.e()) {
            ByteBuffer byteBuffer = this.f4185S;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            if (this.f4185S != null) {
                return false;
            }
            return true;
        }
        I0.a aVar = this.f4223v;
        if (aVar.e() && !aVar.f2126d) {
            aVar.f2126d = true;
            ((I0.d) aVar.f2124b.get(0)).c();
        }
        q(Long.MIN_VALUE);
        if (!this.f4223v.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f4185S;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void d() {
        E e7;
        if (l()) {
            this.f4174H = 0L;
            this.f4175I = 0L;
            this.f4176J = 0L;
            this.f4177K = 0L;
            this.f4206h0 = false;
            this.f4178L = 0;
            this.f4169C = new C(this.f4170D, 0L, 0L);
            this.f4181O = 0L;
            this.f4168B = null;
            this.j.clear();
            this.f4183Q = null;
            this.f4184R = 0;
            this.f4185S = null;
            this.f4189W = false;
            this.f4188V = false;
            this.f4190X = false;
            this.f4172F = null;
            this.f4173G = 0;
            this.f4200e.f4266o = 0L;
            I0.a aVar = this.f4222u.f4148i;
            this.f4223v = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f4207i.f4327c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4224w.pause();
            }
            if (m(this.f4224w)) {
                H h8 = this.f4214m;
                h8.getClass();
                h8.b(this.f4224w);
            }
            int i7 = K0.x.f2529a;
            if (i7 < 21 && !this.f4192Z) {
                this.f4194a0 = 0;
            }
            this.f4222u.getClass();
            Object obj = new Object();
            B b5 = this.f4221t;
            if (b5 != null) {
                this.f4222u = b5;
                this.f4221t = null;
            }
            t tVar = this.f4207i;
            tVar.d();
            tVar.f4327c = null;
            tVar.f = null;
            if (i7 >= 24 && (e7 = this.f4227z) != null) {
                e7.c();
                this.f4227z = null;
            }
            AudioTrack audioTrack2 = this.f4224w;
            A.n nVar = this.f4205h;
            A.m mVar = this.f4220s;
            nVar.a();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f4164m0) {
                try {
                    if (f4165n0 == null) {
                        f4165n0 = Executors.newSingleThreadExecutor(new K0.w("ExoPlayer:AudioTrackReleaseThread", 0));
                    }
                    f4166o0++;
                    f4165n0.execute(new x(audioTrack2, mVar, handler, obj, nVar, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4224w = null;
        }
        this.f4216o.f2403c = null;
        this.f4215n.f2403c = null;
        this.f4209j0 = 0L;
        this.f4211k0 = 0L;
        Handler handler2 = this.f4213l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final C0274k e(H0.r rVar) {
        int i7;
        boolean booleanValue;
        boolean z7;
        if (this.f4204g0) {
            return C0274k.f4289d;
        }
        C0126f c0126f = this.f4167A;
        M0.x xVar = this.f4218q;
        xVar.getClass();
        rVar.getClass();
        c0126f.getClass();
        int i8 = K0.x.f2529a;
        if (i8 >= 29 && (i7 = rVar.f1866B) != -1) {
            Boolean bool = (Boolean) xVar.f3211c;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = (Context) xVar.f3210b;
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        xVar.f3211c = Boolean.valueOf(z7);
                    } else {
                        xVar.f3211c = Boolean.FALSE;
                    }
                } else {
                    xVar.f3211c = Boolean.FALSE;
                }
                booleanValue = ((Boolean) xVar.f3211c).booleanValue();
            }
            String str = rVar.f1886m;
            str.getClass();
            int b5 = H0.I.b(str, rVar.j);
            if (b5 != 0 && i8 >= K0.x.q(b5)) {
                int s7 = K0.x.s(rVar.f1865A);
                if (s7 == 0) {
                    return C0274k.f4289d;
                }
                try {
                    AudioFormat r7 = K0.x.r(i7, s7, b5);
                    if (i8 >= 31) {
                        return w.a(r7, (AudioAttributes) c0126f.a().f4b, booleanValue);
                    }
                    return v.a(r7, (AudioAttributes) c0126f.a().f4b, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return C0274k.f4289d;
                }
            }
            return C0274k.f4289d;
        }
        return C0274k.f4289d;
    }

    public final int f(H0.r rVar) {
        n();
        if ("audio/raw".equals(rVar.f1886m)) {
            int i7 = rVar.f1867C;
            if (!K0.x.I(i7)) {
                K0.a.A("DefaultAudioSink", "Invalid PCM encoding: " + i7);
                return 0;
            } else if (i7 == 2 || (this.f4196c && i7 == 4)) {
                return 2;
            } else {
                return 1;
            }
        } else if (this.f4225x.d(this.f4167A, rVar) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    public final long g() {
        B b5 = this.f4222u;
        if (b5.f4143c == 0) {
            return this.f4174H / b5.f4142b;
        }
        return this.f4175I;
    }

    public final long h() {
        B b5 = this.f4222u;
        if (b5.f4143c == 0) {
            long j = this.f4176J;
            long j8 = b5.f4144d;
            int i7 = K0.x.f2529a;
            return ((j + j8) - 1) / j8;
        }
        return this.f4177K;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
        if (r9.b() == 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(long r24, java.nio.ByteBuffer r26, int r27) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.i(long, java.nio.ByteBuffer, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3.f4190X != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r3 = this;
            boolean r0 = r3.l()
            if (r0 == 0) goto L26
            int r0 = K0.x.f2529a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f4224w
            boolean r0 = B5.AbstractC0038k.w(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f4190X
            if (r0 != 0) goto L26
        L18:
            Q0.t r0 = r3.f4207i
            long r1 = r3.h()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.k():boolean");
    }

    public final boolean l() {
        if (this.f4224w != null) {
            return true;
        }
        return false;
    }

    public final void n() {
        Context context;
        C0268e c8;
        C0270g c0270g;
        if (this.f4226y == null && (context = this.f4193a) != null) {
            this.f4208i0 = Looper.myLooper();
            C0272i c0272i = new C0272i(context, new A.j(this, 23), this.f4167A, this.f4197c0);
            this.f4226y = c0272i;
            if (c0272i.j) {
                c8 = c0272i.f4285g;
                c8.getClass();
            } else {
                c0272i.j = true;
                C0271h c0271h = c0272i.f;
                if (c0271h != null) {
                    c0271h.f4277a.registerContentObserver(c0271h.f4278b, false, c0271h);
                }
                int i7 = K0.x.f2529a;
                Handler handler = c0272i.f4282c;
                Context context2 = c0272i.f4280a;
                if (i7 >= 23 && (c0270g = c0272i.f4283d) != null) {
                    AbstractC0269f.a(context2, c0270g, handler);
                }
                K0.n nVar = c0272i.f4284e;
                Intent intent = null;
                if (nVar != null) {
                    intent = context2.registerReceiver(nVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                c8 = C0268e.c(context2, intent, c0272i.f4287i, c0272i.f4286h);
                c0272i.f4285g = c8;
            }
            this.f4225x = c8;
        }
    }

    public final void o() {
        this.f4191Y = true;
        if (l()) {
            t tVar = this.f4207i;
            if (tVar.f4347y != -9223372036854775807L) {
                tVar.f4324J.getClass();
                tVar.f4347y = K0.x.M(SystemClock.elapsedRealtime());
            }
            s sVar = tVar.f;
            sVar.getClass();
            sVar.a();
            this.f4224w.play();
        }
    }

    public final void p() {
        if (!this.f4189W) {
            this.f4189W = true;
            long h8 = h();
            t tVar = this.f4207i;
            tVar.f4315A = tVar.b();
            tVar.f4324J.getClass();
            tVar.f4347y = K0.x.M(SystemClock.elapsedRealtime());
            tVar.f4316B = h8;
            if (m(this.f4224w)) {
                this.f4190X = false;
            }
            this.f4224w.stop();
            this.f4173G = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = r3.f4183Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r0.hasRemaining() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0 = r3.f4223v;
        r1 = r3.f4183Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r0.e() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r0.f2126d == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        r0.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(long r4) {
        /*
            r3 = this;
            I0.a r0 = r3.f4223v
            boolean r0 = r0.e()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r3.f4183Q
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            java.nio.ByteBuffer r0 = I0.d.f2132a
        Lf:
            r3.u(r0, r4)
            return
        L13:
            I0.a r0 = r3.f4223v
            boolean r0 = r0.d()
            if (r0 != 0) goto L71
        L1b:
            I0.a r0 = r3.f4223v
            boolean r1 = r0.e()
            if (r1 != 0) goto L26
            java.nio.ByteBuffer r0 = I0.d.f2132a
            goto L43
        L26:
            java.nio.ByteBuffer[] r1 = r0.f2125c
            int r2 = r0.c()
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto L36
            r0 = r1
            goto L43
        L36:
            java.nio.ByteBuffer r1 = I0.d.f2132a
            r0.f(r1)
            java.nio.ByteBuffer[] r1 = r0.f2125c
            int r0 = r0.c()
            r0 = r1[r0]
        L43:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L53
            r3.u(r0, r4)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L1b
            return
        L53:
            java.nio.ByteBuffer r0 = r3.f4183Q
            if (r0 == 0) goto L71
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L5e
            goto L71
        L5e:
            I0.a r0 = r3.f4223v
            java.nio.ByteBuffer r1 = r3.f4183Q
            boolean r2 = r0.e()
            if (r2 == 0) goto L13
            boolean r2 = r0.f2126d
            if (r2 == 0) goto L6d
            goto L13
        L6d:
            r0.f(r1)
            goto L13
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.q(long):void");
    }

    public final void r() {
        d();
        A3.I listIterator = this.f.listIterator(0);
        while (listIterator.hasNext()) {
            ((I0.d) listIterator.next()).a();
        }
        A3.I listIterator2 = this.f4203g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((I0.d) listIterator2.next()).a();
        }
        I0.a aVar = this.f4223v;
        if (aVar != null) {
            int i7 = 0;
            while (true) {
                e0 e0Var = aVar.f2123a;
                if (i7 >= e0Var.size()) {
                    break;
                }
                I0.d dVar = (I0.d) e0Var.get(i7);
                dVar.flush();
                dVar.a();
                i7++;
            }
            aVar.f2125c = new ByteBuffer[0];
            I0.b bVar = I0.b.f2127e;
            aVar.f2126d = false;
        }
        this.f4191Y = false;
        this.f4204g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.f4224w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f4170D.f1701a).setPitch(this.f4170D.f1702b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                K0.a.B("DefaultAudioSink", "Failed to set playback params", e7);
            }
            H0.L l8 = new H0.L(this.f4224w.getPlaybackParams().getSpeed(), this.f4224w.getPlaybackParams().getPitch());
            this.f4170D = l8;
            t tVar = this.f4207i;
            tVar.j = l8.f1701a;
            s sVar = tVar.f;
            if (sVar != null) {
                sVar.a();
            }
            tVar.d();
        }
    }

    public final boolean t() {
        B b5 = this.f4222u;
        if (b5 != null && b5.j && K0.x.f2529a >= 23) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r15 < r14) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.I.u(java.nio.ByteBuffer, long):void");
    }
}
