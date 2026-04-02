package Q0;

import A3.e0;
import H0.C0126f;
import H0.C0127g;
import H0.C0137q;
import O0.C0245g;
import O0.S;
import O0.k0;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class L extends X0.t implements S {

    /* renamed from: A1  reason: collision with root package name */
    public final C0276m f4229A1;

    /* renamed from: B1  reason: collision with root package name */
    public final I f4230B1;

    /* renamed from: C1  reason: collision with root package name */
    public int f4231C1;

    /* renamed from: D1  reason: collision with root package name */
    public boolean f4232D1;

    /* renamed from: E1  reason: collision with root package name */
    public boolean f4233E1;

    /* renamed from: F1  reason: collision with root package name */
    public H0.r f4234F1;

    /* renamed from: G1  reason: collision with root package name */
    public H0.r f4235G1;

    /* renamed from: H1  reason: collision with root package name */
    public long f4236H1;

    /* renamed from: I1  reason: collision with root package name */
    public boolean f4237I1;

    /* renamed from: J1  reason: collision with root package name */
    public boolean f4238J1;

    /* renamed from: K1  reason: collision with root package name */
    public boolean f4239K1;

    /* renamed from: L1  reason: collision with root package name */
    public int f4240L1;

    /* renamed from: z1  reason: collision with root package name */
    public final Context f4241z1;

    public L(Context context, X0.i iVar, Handler handler, O0.E e7, I i7) {
        super(1, iVar, 44100.0f);
        this.f4241z1 = context.getApplicationContext();
        this.f4230B1 = i7;
        this.f4240L1 = -1000;
        this.f4229A1 = new C0276m(handler, e7, 0);
        i7.f4220s = new A.m(this, 14);
    }

    @Override // X0.t
    public final C0245g C(X0.m mVar, H0.r rVar, H0.r rVar2) {
        boolean z7;
        C0245g b5 = mVar.b(rVar, rVar2);
        int i7 = 0;
        if (this.f6363z0 == null && p0(rVar2)) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = b5.f3745e;
        if (z7) {
            i8 |= RecognitionOptions.TEZ_CODE;
        }
        if (v0(mVar, rVar2) > this.f4231C1) {
            i8 |= 64;
        }
        int i9 = i8;
        if (i9 == 0) {
            i7 = b5.f3744d;
        }
        return new C0245g(mVar.f6286a, rVar, rVar2, i7, i9);
    }

    @Override // X0.t
    public final float N(float f, H0.r[] rVarArr) {
        int i7 = -1;
        for (H0.r rVar : rVarArr) {
            int i8 = rVar.f1866B;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f * i7;
    }

    @Override // X0.t
    public final ArrayList O(X0.u uVar, H0.r rVar, boolean z7) {
        e0 g3;
        X0.m mVar;
        if (rVar.f1886m == null) {
            g3 = e0.f138e;
        } else {
            if (this.f4230B1.f(rVar) != 0) {
                List e7 = X0.z.e("audio/raw", false, false);
                if (e7.isEmpty()) {
                    mVar = null;
                } else {
                    mVar = (X0.m) e7.get(0);
                }
                if (mVar != null) {
                    g3 = A3.K.u(mVar);
                }
            }
            g3 = X0.z.g(uVar, rVar, z7, false);
        }
        Pattern pattern = X0.z.f6369a;
        ArrayList arrayList = new ArrayList(g3);
        Collections.sort(arrayList, new K.a(new A.j(rVar, 28), 1));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // X0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X0.h P(X0.m r12, H0.r r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.L.P(X0.m, H0.r, android.media.MediaCrypto, float):X0.h");
    }

    @Override // X0.t
    public final void Q(N0.f fVar) {
        H0.r rVar;
        B b5;
        if (K0.x.f2529a >= 29 && (rVar = fVar.f3348c) != null && Objects.equals(rVar.f1886m, "audio/opus") && this.f6333d1) {
            ByteBuffer byteBuffer = fVar.f3346Y;
            byteBuffer.getClass();
            H0.r rVar2 = fVar.f3348c;
            rVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                int i7 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                I i8 = this.f4230B1;
                AudioTrack audioTrack = i8.f4224w;
                if (audioTrack != null && I.m(audioTrack) && (b5 = i8.f4222u) != null && b5.f4149k) {
                    i8.f4224w.setOffloadDelayPadding(rVar2.f1868D, i7);
                }
            }
        }
    }

    @Override // X0.t
    public final void V(Exception exc) {
        K0.a.o("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0276m c0276m = this.f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, exc, 4));
        }
    }

    @Override // X0.t
    public final void W(long j, long j8, String str) {
        C0276m c0276m = this.f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, str, j, j8));
        }
    }

    @Override // X0.t
    public final void X(String str) {
        C0276m c0276m = this.f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, str, 8));
        }
    }

    @Override // X0.t
    public final C0245g Y(M0.x xVar) {
        H0.r rVar = (H0.r) xVar.f3211c;
        rVar.getClass();
        this.f4234F1 = rVar;
        C0245g Y3 = super.Y(xVar);
        C0276m c0276m = this.f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, rVar, Y3));
        }
        return Y3;
    }

    @Override // X0.t
    public final void Z(H0.r rVar, MediaFormat mediaFormat) {
        int i7;
        int i8;
        H0.r rVar2 = this.f4235G1;
        boolean z7 = true;
        int[] iArr = null;
        if (rVar2 != null) {
            rVar = rVar2;
        } else if (this.f6309F0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(rVar.f1886m)) {
                i7 = rVar.f1867C;
            } else if (K0.x.f2529a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i7 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i7 = K0.x.A(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i7 = 2;
            }
            C0137q c0137q = new C0137q();
            c0137q.f1850l = H0.I.l("audio/raw");
            c0137q.f1833B = i7;
            c0137q.f1834C = rVar.f1868D;
            c0137q.f1835D = rVar.f1869E;
            c0137q.j = rVar.f1884k;
            c0137q.f1841a = rVar.f1876a;
            c0137q.f1842b = rVar.f1877b;
            c0137q.f1843c = A3.K.p(rVar.f1878c);
            c0137q.f1844d = rVar.f1879d;
            c0137q.f1845e = rVar.f1880e;
            c0137q.f = rVar.f;
            c0137q.f1864z = mediaFormat.getInteger("channel-count");
            c0137q.f1832A = mediaFormat.getInteger("sample-rate");
            H0.r rVar3 = new H0.r(c0137q);
            boolean z8 = this.f4232D1;
            int i9 = rVar3.f1865A;
            if (z8 && i9 == 6 && (i8 = rVar.f1865A) < 6) {
                iArr = new int[i8];
                for (int i10 = 0; i10 < i8; i10++) {
                    iArr[i10] = i10;
                }
            } else if (this.f4233E1) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        if (i9 != 6) {
                            if (i9 != 7) {
                                if (i9 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
            rVar = rVar3;
        }
        try {
            int i11 = K0.x.f2529a;
            I i12 = this.f4230B1;
            if (i11 >= 29) {
                if (this.f6333d1) {
                    k0 k0Var = this.f3702d;
                    k0Var.getClass();
                    if (k0Var.f3789a != 0) {
                        k0 k0Var2 = this.f3702d;
                        k0Var2.getClass();
                        int i13 = k0Var2.f3789a;
                        i12.getClass();
                        if (i11 < 29) {
                            z7 = false;
                        }
                        K0.a.j(z7);
                        i12.f4212l = i13;
                    }
                }
                i12.getClass();
                if (i11 < 29) {
                    z7 = false;
                }
                K0.a.j(z7);
                i12.f4212l = 0;
            }
            i12.b(rVar, iArr);
        } catch (C0277n e7) {
            throw f(e7, e7.f4298a, false, 5001);
        }
    }

    @Override // O0.S
    public final boolean a() {
        boolean z7 = this.f4239K1;
        this.f4239K1 = false;
        return z7;
    }

    @Override // X0.t
    public final void a0() {
        this.f4230B1.getClass();
    }

    @Override // O0.AbstractC0243e, O0.g0
    public final void b(int i7, Object obj) {
        H0.L l8;
        I i8 = this.f4230B1;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 6) {
                    if (i7 != 12) {
                        boolean z7 = false;
                        if (i7 != 16) {
                            if (i7 != 9) {
                                if (i7 != 10) {
                                    if (i7 == 11) {
                                        this.f6304A0 = (O0.I) obj;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                if (i8.f4194a0 != intValue) {
                                    i8.f4194a0 = intValue;
                                    if (intValue != 0) {
                                        z7 = true;
                                    }
                                    i8.f4192Z = z7;
                                    i8.d();
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            i8.f4171E = ((Boolean) obj).booleanValue();
                            if (i8.t()) {
                                l8 = H0.L.f1700d;
                            } else {
                                l8 = i8.f4170D;
                            }
                            C c8 = new C(l8, -9223372036854775807L, -9223372036854775807L);
                            if (i8.l()) {
                                i8.f4168B = c8;
                                return;
                            } else {
                                i8.f4169C = c8;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f4240L1 = ((Integer) obj).intValue();
                        X0.j jVar = this.f6309F0;
                        if (jVar != null && K0.x.f2529a >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f4240L1));
                            jVar.a(bundle);
                            return;
                        }
                        return;
                    } else if (K0.x.f2529a >= 23) {
                        K.a(i8, obj);
                        return;
                    } else {
                        return;
                    }
                }
                C0127g c0127g = (C0127g) obj;
                c0127g.getClass();
                if (!i8.b0.equals(c0127g)) {
                    if (i8.f4224w != null) {
                        i8.b0.getClass();
                    }
                    i8.b0 = c0127g;
                    return;
                }
                return;
            }
            C0126f c0126f = (C0126f) obj;
            c0126f.getClass();
            if (!i8.f4167A.equals(c0126f)) {
                i8.f4167A = c0126f;
                if (!i8.f4199d0) {
                    C0272i c0272i = i8.f4226y;
                    if (c0272i != null) {
                        c0272i.f4287i = c0126f;
                        c0272i.a(C0268e.b(c0272i.f4280a, c0126f, c0272i.f4286h));
                    }
                    i8.d();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (i8.f4182P != floatValue) {
            i8.f4182P = floatValue;
            if (i8.l()) {
                if (K0.x.f2529a >= 21) {
                    i8.f4224w.setVolume(i8.f4182P);
                    return;
                }
                AudioTrack audioTrack = i8.f4224w;
                float f = i8.f4182P;
                audioTrack.setStereoVolume(f, f);
            }
        }
    }

    @Override // O0.S
    public final H0.L c() {
        return this.f4230B1.f4170D;
    }

    @Override // X0.t
    public final void c0() {
        this.f4230B1.f4179M = true;
    }

    @Override // O0.S
    public final long d() {
        if (this.f3697Y == 2) {
            w0();
        }
        return this.f4236H1;
    }

    @Override // O0.S
    public final void e(H0.L l8) {
        I i7 = this.f4230B1;
        i7.getClass();
        i7.f4170D = new H0.L(K0.x.i(l8.f1701a, 0.1f, 8.0f), K0.x.i(l8.f1702b, 0.1f, 8.0f));
        if (i7.t()) {
            i7.s();
            return;
        }
        C c8 = new C(l8, -9223372036854775807L, -9223372036854775807L);
        if (i7.l()) {
            i7.f4168B = c8;
        } else {
            i7.f4169C = c8;
        }
    }

    @Override // X0.t
    public final boolean g0(long j, long j8, X0.j jVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, H0.r rVar) {
        int i10;
        int i11;
        byteBuffer.getClass();
        if (this.f4235G1 != null && (i8 & 2) != 0) {
            jVar.getClass();
            jVar.o(i7, false);
            return true;
        }
        I i12 = this.f4230B1;
        if (z7) {
            if (jVar != null) {
                jVar.o(i7, false);
            }
            this.f6355u1.f += i9;
            i12.f4179M = true;
            return true;
        }
        try {
            if (!i12.i(j9, byteBuffer, i9)) {
                return false;
            }
            if (jVar != null) {
                jVar.o(i7, false);
            }
            this.f6355u1.f3735e += i9;
            return true;
        } catch (C0278o e7) {
            H0.r rVar2 = this.f4234F1;
            if (this.f6333d1) {
                k0 k0Var = this.f3702d;
                k0Var.getClass();
                if (k0Var.f3789a != 0) {
                    i11 = 5004;
                    throw f(e7, rVar2, e7.f4300b, i11);
                }
            }
            i11 = 5001;
            throw f(e7, rVar2, e7.f4300b, i11);
        } catch (C0279p e8) {
            if (this.f6333d1) {
                k0 k0Var2 = this.f3702d;
                k0Var2.getClass();
                if (k0Var2.f3789a != 0) {
                    i10 = 5003;
                    throw f(e8, rVar, e8.f4302b, i10);
                }
            }
            i10 = 5002;
            throw f(e8, rVar, e8.f4302b, i10);
        }
    }

    @Override // O0.AbstractC0243e
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // X0.t
    public final void j0() {
        int i7;
        try {
            I i8 = this.f4230B1;
            if (!i8.f4188V && i8.l() && i8.c()) {
                i8.p();
                i8.f4188V = true;
            }
        } catch (C0279p e7) {
            if (this.f6333d1) {
                i7 = 5003;
            } else {
                i7 = 5002;
            }
            throw f(e7, e7.f4303c, e7.f4302b, i7);
        }
    }

    @Override // O0.AbstractC0243e
    public final boolean k() {
        if (this.q1) {
            I i7 = this.f4230B1;
            if (!i7.l() || (i7.f4188V && !i7.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final boolean l() {
        if (!this.f4230B1.j() && !super.l()) {
            return false;
        }
        return true;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void m() {
        C0276m c0276m = this.f4229A1;
        this.f4238J1 = true;
        this.f4234F1 = null;
        try {
            this.f4230B1.d();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, O0.f] */
    @Override // O0.AbstractC0243e
    public final void n(boolean z7, boolean z8) {
        ?? obj = new Object();
        this.f6355u1 = obj;
        C0276m c0276m = this.f4229A1;
        Handler handler = c0276m.f4296b;
        if (handler != null) {
            handler.post(new RunnableC0275l(c0276m, (Object) obj, 3));
        }
        k0 k0Var = this.f3702d;
        k0Var.getClass();
        boolean z9 = k0Var.f3790b;
        boolean z10 = false;
        I i7 = this.f4230B1;
        if (z9) {
            i7.getClass();
            if (K0.x.f2529a >= 21) {
                z10 = true;
            }
            K0.a.j(z10);
            K0.a.j(i7.f4192Z);
            if (!i7.f4199d0) {
                i7.f4199d0 = true;
                i7.d();
            }
        } else if (i7.f4199d0) {
            i7.f4199d0 = false;
            i7.d();
        }
        P0.k kVar = this.f;
        kVar.getClass();
        i7.f4219r = kVar;
        K0.s sVar = this.f3696X;
        sVar.getClass();
        i7.f4207i.f4324J = sVar;
    }

    @Override // X0.t, O0.AbstractC0243e
    public final void o(long j, boolean z7) {
        super.o(j, z7);
        this.f4230B1.d();
        this.f4236H1 = j;
        this.f4239K1 = false;
        this.f4237I1 = true;
    }

    @Override // O0.AbstractC0243e
    public final void p() {
        C0270g c0270g;
        C0272i c0272i = this.f4230B1.f4226y;
        if (c0272i != null && c0272i.j) {
            c0272i.f4285g = null;
            int i7 = K0.x.f2529a;
            Context context = c0272i.f4280a;
            if (i7 >= 23 && (c0270g = c0272i.f4283d) != null) {
                AbstractC0269f.b(context, c0270g);
            }
            K0.n nVar = c0272i.f4284e;
            if (nVar != null) {
                context.unregisterReceiver(nVar);
            }
            C0271h c0271h = c0272i.f;
            if (c0271h != null) {
                c0271h.f4277a.unregisterContentObserver(c0271h);
            }
            c0272i.j = false;
        }
    }

    @Override // X0.t
    public final boolean p0(H0.r rVar) {
        k0 k0Var = this.f3702d;
        k0Var.getClass();
        if (k0Var.f3789a != 0) {
            int u02 = u0(rVar);
            if ((u02 & RecognitionOptions.UPC_A) != 0) {
                k0 k0Var2 = this.f3702d;
                k0Var2.getClass();
                if (k0Var2.f3789a == 2 || (u02 & RecognitionOptions.UPC_E) != 0 || (rVar.f1868D == 0 && rVar.f1869E == 0)) {
                    return true;
                }
            }
        }
        if (this.f4230B1.f(rVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // O0.AbstractC0243e
    public final void q() {
        I i7 = this.f4230B1;
        this.f4239K1 = false;
        try {
            E();
            i0();
            A.m mVar = this.f6363z0;
            if (mVar != null) {
                mVar.k0(null);
            }
            this.f6363z0 = null;
        } finally {
            if (this.f4238J1) {
                this.f4238J1 = false;
                i7.r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    @Override // X0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q0(X0.u r17, H0.r r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.L.q0(X0.u, H0.r):int");
    }

    @Override // O0.AbstractC0243e
    public final void r() {
        this.f4230B1.o();
    }

    @Override // O0.AbstractC0243e
    public final void s() {
        w0();
        I i7 = this.f4230B1;
        i7.f4191Y = false;
        if (i7.l()) {
            t tVar = i7.f4207i;
            tVar.d();
            if (tVar.f4347y == -9223372036854775807L) {
                s sVar = tVar.f;
                sVar.getClass();
                sVar.a();
            } else {
                tVar.f4315A = tVar.b();
                if (!I.m(i7.f4224w)) {
                    return;
                }
            }
            i7.f4224w.pause();
        }
    }

    public final int u0(H0.r rVar) {
        int i7;
        C0274k e7 = this.f4230B1.e(rVar);
        if (!e7.f4290a) {
            return 0;
        }
        if (e7.f4291b) {
            i7 = 1536;
        } else {
            i7 = RecognitionOptions.UPC_A;
        }
        if (e7.f4292c) {
            return i7 | RecognitionOptions.PDF417;
        }
        return i7;
    }

    public final int v0(X0.m mVar, H0.r rVar) {
        int i7;
        if ("OMX.google.raw.decoder".equals(mVar.f6286a) && (i7 = K0.x.f2529a) < 24 && (i7 != 23 || !K0.x.L(this.f4241z1))) {
            return -1;
        }
        return rVar.f1887n;
    }

    public final void w0() {
        long j;
        ArrayDeque arrayDeque;
        long y2;
        long j8;
        I0.f fVar;
        boolean k2 = k();
        I i7 = this.f4230B1;
        if (i7.l() && !i7.f4180N) {
            long min = Math.min(i7.f4207i.a(k2), K0.x.S(i7.f4222u.f4145e, i7.h()));
            while (true) {
                arrayDeque = i7.j;
                if (arrayDeque.isEmpty() || min < ((C) arrayDeque.getFirst()).f4153c) {
                    break;
                }
                i7.f4169C = (C) arrayDeque.remove();
            }
            long j9 = min - i7.f4169C.f4153c;
            boolean isEmpty = arrayDeque.isEmpty();
            V2.k kVar = i7.f4195b;
            if (isEmpty) {
                I0.g gVar = (I0.g) kVar.f5967d;
                if (gVar.isActive()) {
                    if (gVar.f2170o >= 1024) {
                        long j10 = gVar.f2169n;
                        gVar.j.getClass();
                        long j11 = j10 - ((fVar.f2147k * fVar.f2140b) * 2);
                        int i8 = gVar.f2164h.f2128a;
                        int i9 = gVar.f2163g.f2128a;
                        if (i8 == i9) {
                            j8 = K0.x.U(j9, j11, gVar.f2170o, RoundingMode.FLOOR);
                        } else {
                            j8 = K0.x.U(j9, j11 * i8, gVar.f2170o * i9, RoundingMode.FLOOR);
                        }
                    } else {
                        j8 = (long) (gVar.f2160c * j9);
                    }
                    j9 = j8;
                }
                y2 = i7.f4169C.f4152b + j9;
            } else {
                C c8 = (C) arrayDeque.getFirst();
                y2 = c8.f4152b - K0.x.y(c8.f4153c - min, i7.f4169C.f4151a.f1701a);
            }
            long j12 = ((N) kVar.f5966c).f4254q;
            j = K0.x.S(i7.f4222u.f4145e, j12) + y2;
            long j13 = i7.f4209j0;
            if (j12 > j13) {
                long S7 = K0.x.S(i7.f4222u.f4145e, j12 - j13);
                i7.f4209j0 = j12;
                i7.f4211k0 += S7;
                if (i7.f4213l0 == null) {
                    i7.f4213l0 = new Handler(Looper.myLooper());
                }
                i7.f4213l0.removeCallbacksAndMessages(null);
                i7.f4213l0.postDelayed(new C.b(i7, 17), 100L);
            }
        } else {
            j = Long.MIN_VALUE;
        }
        if (j != Long.MIN_VALUE) {
            if (!this.f4237I1) {
                j = Math.max(this.f4236H1, j);
            }
            this.f4236H1 = j;
            this.f4237I1 = false;
        }
    }

    @Override // O0.AbstractC0243e
    public final S h() {
        return this;
    }
}
