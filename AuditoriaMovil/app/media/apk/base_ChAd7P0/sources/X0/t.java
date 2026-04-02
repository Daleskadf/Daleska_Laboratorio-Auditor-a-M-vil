package X0;

import O0.AbstractC0243e;
import O0.C0244f;
import O0.C0245g;
import O0.C0250l;
import O0.I;
import Q0.M;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import e1.U;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public abstract class t extends AbstractC0243e {

    /* renamed from: y1  reason: collision with root package name */
    public static final byte[] f6303y1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0  reason: collision with root package name */
    public I f6304A0;

    /* renamed from: B0  reason: collision with root package name */
    public MediaCrypto f6305B0;

    /* renamed from: C0  reason: collision with root package name */
    public final long f6306C0;

    /* renamed from: D0  reason: collision with root package name */
    public float f6307D0;

    /* renamed from: E0  reason: collision with root package name */
    public float f6308E0;

    /* renamed from: F0  reason: collision with root package name */
    public j f6309F0;

    /* renamed from: G0  reason: collision with root package name */
    public H0.r f6310G0;

    /* renamed from: H0  reason: collision with root package name */
    public MediaFormat f6311H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f6312I0;

    /* renamed from: J0  reason: collision with root package name */
    public float f6313J0;

    /* renamed from: K0  reason: collision with root package name */
    public ArrayDeque f6314K0;

    /* renamed from: L0  reason: collision with root package name */
    public q f6315L0;

    /* renamed from: M0  reason: collision with root package name */
    public m f6316M0;

    /* renamed from: N0  reason: collision with root package name */
    public int f6317N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f6318O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f6319P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f6320Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f6321R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f6322S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f6323T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f6324U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f6325V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f6326W0;

    /* renamed from: X0  reason: collision with root package name */
    public long f6327X0;

    /* renamed from: Y0  reason: collision with root package name */
    public int f6328Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int f6329Z0;

    /* renamed from: a1  reason: collision with root package name */
    public ByteBuffer f6330a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f6331b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f6332c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f6333d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f6334e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f6335f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f6336g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f6337h1;

    /* renamed from: i1  reason: collision with root package name */
    public int f6338i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f6339j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f6340k1;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f6341l1;

    /* renamed from: m0  reason: collision with root package name */
    public final i f6342m0;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f6343m1;

    /* renamed from: n0  reason: collision with root package name */
    public final u f6344n0;

    /* renamed from: n1  reason: collision with root package name */
    public long f6345n1;

    /* renamed from: o0  reason: collision with root package name */
    public final float f6346o0;

    /* renamed from: o1  reason: collision with root package name */
    public long f6347o1;

    /* renamed from: p0  reason: collision with root package name */
    public final N0.f f6348p0;
    public boolean p1;
    public final N0.f q0;
    public boolean q1;

    /* renamed from: r0  reason: collision with root package name */
    public final N0.f f6349r0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f6350r1;

    /* renamed from: s0  reason: collision with root package name */
    public final g f6351s0;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f6352s1;

    /* renamed from: t0  reason: collision with root package name */
    public final MediaCodec.BufferInfo f6353t0;
    public C0250l t1;

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayDeque f6354u0;

    /* renamed from: u1  reason: collision with root package name */
    public C0244f f6355u1;

    /* renamed from: v0  reason: collision with root package name */
    public final M f6356v0;

    /* renamed from: v1  reason: collision with root package name */
    public s f6357v1;

    /* renamed from: w0  reason: collision with root package name */
    public H0.r f6358w0;

    /* renamed from: w1  reason: collision with root package name */
    public long f6359w1;

    /* renamed from: x0  reason: collision with root package name */
    public H0.r f6360x0;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f6361x1;

    /* renamed from: y0  reason: collision with root package name */
    public A.m f6362y0;

    /* renamed from: z0  reason: collision with root package name */
    public A.m f6363z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [X0.g, N0.f] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, Q0.M] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, O0.f] */
    public t(int i7, i iVar, float f) {
        super(i7);
        u uVar = u.f6364b;
        this.f6342m0 = iVar;
        this.f6344n0 = uVar;
        this.f6346o0 = f;
        this.f6348p0 = new N0.f(0);
        this.q0 = new N0.f(0);
        this.f6349r0 = new N0.f(2);
        ?? fVar = new N0.f(2);
        fVar.f6279g0 = 32;
        this.f6351s0 = fVar;
        this.f6353t0 = new MediaCodec.BufferInfo();
        this.f6307D0 = 1.0f;
        this.f6308E0 = 1.0f;
        this.f6306C0 = -9223372036854775807L;
        this.f6354u0 = new ArrayDeque();
        this.f6357v1 = s.f6298e;
        fVar.h(0);
        fVar.f3350e.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f4244a = I0.d.f2132a;
        obj.f4246c = 0;
        obj.f4245b = 2;
        this.f6356v0 = obj;
        this.f6313J0 = -1.0f;
        this.f6317N0 = 0;
        this.f6337h1 = 0;
        this.f6328Y0 = -1;
        this.f6329Z0 = -1;
        this.f6327X0 = -9223372036854775807L;
        this.f6345n1 = -9223372036854775807L;
        this.f6347o1 = -9223372036854775807L;
        this.f6359w1 = -9223372036854775807L;
        this.f6338i1 = 0;
        this.f6339j1 = 0;
        this.f6355u1 = new Object();
    }

    @Override // O0.AbstractC0243e
    public final int A() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0320, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0326, code lost:
        r26.f6334e1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0322 A[LOOP:0: B:26:0x0096->B:125:0x0322, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0320 A[EDGE_INSN: B:142:0x0320->B:124:0x0320 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.B(long, long):boolean");
    }

    public abstract C0245g C(m mVar, H0.r rVar, H0.r rVar2);

    public l D(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void E() {
        this.f6335f1 = false;
        this.f6351s0.e();
        this.f6349r0.e();
        this.f6334e1 = false;
        this.f6333d1 = false;
        M m7 = this.f6356v0;
        m7.getClass();
        m7.f4244a = I0.d.f2132a;
        m7.f4246c = 0;
        m7.f4245b = 2;
    }

    public final boolean F() {
        if (this.f6340k1) {
            this.f6338i1 = 1;
            if (!this.f6319P0 && !this.f6321R0) {
                this.f6339j1 = 2;
            } else {
                this.f6339j1 = 3;
                return false;
            }
        } else {
            s0();
        }
        return true;
    }

    public final boolean G(long j, long j8) {
        boolean z7;
        boolean z8;
        boolean z9;
        MediaCodec.BufferInfo bufferInfo;
        boolean g02;
        boolean z10;
        int f;
        boolean z11;
        boolean z12;
        j jVar = this.f6309F0;
        jVar.getClass();
        if (this.f6329Z0 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f6353t0;
        if (!z7) {
            if (this.f6322S0 && this.f6341l1) {
                try {
                    f = jVar.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.q1) {
                        i0();
                    }
                    return false;
                }
            } else {
                f = jVar.f(bufferInfo2);
            }
            if (f < 0) {
                if (f == -2) {
                    this.f6343m1 = true;
                    j jVar2 = this.f6309F0;
                    jVar2.getClass();
                    MediaFormat A7 = jVar2.A();
                    if (this.f6317N0 != 0 && A7.getInteger("width") == 32 && A7.getInteger("height") == 32) {
                        this.f6325V0 = true;
                    } else {
                        this.f6311H0 = A7;
                        this.f6312I0 = true;
                    }
                    return true;
                }
                if (this.f6326W0 && (this.p1 || this.f6338i1 == 2)) {
                    f0();
                }
                return false;
            } else if (this.f6325V0) {
                this.f6325V0 = false;
                jVar.o(f, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            } else {
                this.f6329Z0 = f;
                ByteBuffer K7 = jVar.K(f);
                this.f6330a1 = K7;
                if (K7 != null) {
                    K7.position(bufferInfo2.offset);
                    this.f6330a1.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f6323T0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f6345n1 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = this.f6347o1;
                }
                long j9 = bufferInfo2.presentationTimeUs;
                if (j9 < this.f3706g0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f6331b1 = z11;
                long j10 = this.f6347o1;
                if (j10 != -9223372036854775807L && j10 <= j9) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f6332c1 = z12;
                t0(j9);
            }
        }
        if (this.f6322S0 && this.f6341l1) {
            try {
                ByteBuffer byteBuffer = this.f6330a1;
                int i7 = this.f6329Z0;
                int i8 = bufferInfo2.flags;
                long j11 = bufferInfo2.presentationTimeUs;
                boolean z13 = this.f6331b1;
                boolean z14 = this.f6332c1;
                H0.r rVar = this.f6360x0;
                rVar.getClass();
                z8 = true;
                z9 = false;
                try {
                    g02 = g0(j, j8, jVar, byteBuffer, i7, i8, 1, j11, z13, z14, rVar);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    f0();
                    if (this.q1) {
                        i0();
                    }
                    return z9;
                }
            } catch (IllegalStateException unused3) {
                z9 = false;
            }
        } else {
            z8 = true;
            z9 = false;
            ByteBuffer byteBuffer2 = this.f6330a1;
            int i9 = this.f6329Z0;
            int i10 = bufferInfo2.flags;
            long j12 = bufferInfo2.presentationTimeUs;
            boolean z15 = this.f6331b1;
            boolean z16 = this.f6332c1;
            H0.r rVar2 = this.f6360x0;
            rVar2.getClass();
            bufferInfo = bufferInfo2;
            g02 = g0(j, j8, jVar, byteBuffer2, i9, i10, 1, j12, z15, z16, rVar2);
        }
        if (g02) {
            b0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z10 = z8;
            } else {
                z10 = z9;
            }
            this.f6329Z0 = -1;
            this.f6330a1 = null;
            if (!z10) {
                return z8;
            }
            f0();
        }
        return z9;
    }

    public final boolean H() {
        j jVar = this.f6309F0;
        if (jVar == null || this.f6338i1 == 2 || this.p1) {
            return false;
        }
        int i7 = this.f6328Y0;
        N0.f fVar = this.q0;
        if (i7 < 0) {
            int V7 = jVar.V();
            this.f6328Y0 = V7;
            if (V7 < 0) {
                return false;
            }
            fVar.f3350e = jVar.E(V7);
            fVar.e();
        }
        if (this.f6338i1 == 1) {
            if (!this.f6326W0) {
                this.f6341l1 = true;
                jVar.e(this.f6328Y0, 0, 0L, 4);
                this.f6328Y0 = -1;
                fVar.f3350e = null;
            }
            this.f6338i1 = 2;
            return false;
        } else if (this.f6324U0) {
            this.f6324U0 = false;
            ByteBuffer byteBuffer = fVar.f3350e;
            byteBuffer.getClass();
            byteBuffer.put(f6303y1);
            jVar.e(this.f6328Y0, 38, 0L, 0);
            this.f6328Y0 = -1;
            fVar.f3350e = null;
            this.f6340k1 = true;
            return true;
        } else {
            if (this.f6337h1 == 1) {
                int i8 = 0;
                while (true) {
                    H0.r rVar = this.f6310G0;
                    rVar.getClass();
                    if (i8 >= rVar.f1889p.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = fVar.f3350e;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f6310G0.f1889p.get(i8));
                    i8++;
                }
                this.f6337h1 = 2;
            }
            ByteBuffer byteBuffer3 = fVar.f3350e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            M0.x xVar = this.f3701c;
            xVar.t();
            try {
                int u7 = u(xVar, fVar, 0);
                if (u7 == -3) {
                    if (j()) {
                        this.f6347o1 = this.f6345n1;
                    }
                    return false;
                } else if (u7 == -5) {
                    if (this.f6337h1 == 2) {
                        fVar.e();
                        this.f6337h1 = 1;
                    }
                    Y(xVar);
                    return true;
                } else if (fVar.c(4)) {
                    this.f6347o1 = this.f6345n1;
                    if (this.f6337h1 == 2) {
                        fVar.e();
                        this.f6337h1 = 1;
                    }
                    this.p1 = true;
                    if (!this.f6340k1) {
                        f0();
                        return false;
                    }
                    try {
                        if (!this.f6326W0) {
                            this.f6341l1 = true;
                            jVar.e(this.f6328Y0, 0, 0L, 4);
                            this.f6328Y0 = -1;
                            fVar.f3350e = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e7) {
                        throw f(e7, this.f6358w0, false, K0.x.w(e7.getErrorCode()));
                    }
                } else if (!this.f6340k1 && !fVar.c(1)) {
                    fVar.e();
                    if (this.f6337h1 == 2) {
                        this.f6337h1 = 1;
                    }
                    return true;
                } else {
                    boolean c8 = fVar.c(1073741824);
                    if (c8) {
                        N0.b bVar = fVar.f3349d;
                        if (position == 0) {
                            bVar.getClass();
                        } else {
                            if (bVar.f3340d == null) {
                                int[] iArr = new int[1];
                                bVar.f3340d = iArr;
                                bVar.f3344i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = bVar.f3340d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f6318O0 && !c8) {
                        ByteBuffer byteBuffer4 = fVar.f3350e;
                        byteBuffer4.getClass();
                        int position2 = byteBuffer4.position();
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            int i11 = i9 + 1;
                            if (i11 < position2) {
                                int i12 = byteBuffer4.get(i9) & ForkServer.ERROR;
                                if (i10 == 3) {
                                    if (i12 == 1 && (byteBuffer4.get(i11) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer4.duplicate();
                                        duplicate.position(i9 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer4.position(0);
                                        byteBuffer4.put(duplicate);
                                        break;
                                    }
                                } else if (i12 == 0) {
                                    i10++;
                                }
                                if (i12 != 0) {
                                    i10 = 0;
                                }
                                i9 = i11;
                            } else {
                                byteBuffer4.clear();
                                break;
                            }
                        }
                        ByteBuffer byteBuffer5 = fVar.f3350e;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.f6318O0 = false;
                    }
                    long j = fVar.f3345X;
                    if (this.f6350r1) {
                        ArrayDeque arrayDeque = this.f6354u0;
                        if (!arrayDeque.isEmpty()) {
                            G1.g gVar = ((s) arrayDeque.peekLast()).f6302d;
                            H0.r rVar2 = this.f6358w0;
                            rVar2.getClass();
                            gVar.a(rVar2, j);
                        } else {
                            G1.g gVar2 = this.f6357v1.f6302d;
                            H0.r rVar3 = this.f6358w0;
                            rVar3.getClass();
                            gVar2.a(rVar3, j);
                        }
                        this.f6350r1 = false;
                    }
                    this.f6345n1 = Math.max(this.f6345n1, j);
                    if (j() || fVar.c(536870912)) {
                        this.f6347o1 = this.f6345n1;
                    }
                    fVar.i();
                    if (fVar.c(268435456)) {
                        Q(fVar);
                    }
                    d0(fVar);
                    int L6 = L(fVar);
                    try {
                        if (c8) {
                            jVar.d(this.f6328Y0, fVar.f3349d, j, L6);
                        } else {
                            int i13 = this.f6328Y0;
                            ByteBuffer byteBuffer6 = fVar.f3350e;
                            byteBuffer6.getClass();
                            jVar.e(i13, byteBuffer6.limit(), j, L6);
                        }
                        this.f6328Y0 = -1;
                        fVar.f3350e = null;
                        this.f6340k1 = true;
                        this.f6337h1 = 0;
                        this.f6355u1.f3733c++;
                        return true;
                    } catch (MediaCodec.CryptoException e8) {
                        throw f(e8, this.f6358w0, false, K0.x.w(e8.getErrorCode()));
                    }
                }
            } catch (N0.e e9) {
                V(e9);
                h0(0);
                I();
                return true;
            }
        }
    }

    public final void I() {
        try {
            j jVar = this.f6309F0;
            K0.a.k(jVar);
            jVar.flush();
        } finally {
            k0();
        }
    }

    public final boolean J() {
        boolean z7;
        if (this.f6309F0 == null) {
            return false;
        }
        int i7 = this.f6339j1;
        if (i7 != 3 && !this.f6319P0 && ((!this.f6320Q0 || this.f6343m1) && (!this.f6321R0 || !this.f6341l1))) {
            if (i7 == 2) {
                int i8 = K0.x.f2529a;
                if (i8 >= 23) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                if (i8 >= 23) {
                    try {
                        s0();
                    } catch (C0250l e7) {
                        K0.a.B("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                        i0();
                        return true;
                    }
                }
            }
            I();
            return false;
        }
        i0();
        return true;
    }

    public final List K(boolean z7) {
        H0.r rVar = this.f6358w0;
        rVar.getClass();
        u uVar = this.f6344n0;
        ArrayList O7 = O(uVar, rVar, z7);
        if (O7.isEmpty() && z7) {
            O7 = O(uVar, rVar, false);
            if (!O7.isEmpty()) {
                K0.a.A("MediaCodecRenderer", "Drm session requires secure decoder for " + rVar.f1886m + ", but no secure decoder available. Trying to proceed with " + O7 + ".");
            }
        }
        return O7;
    }

    public int L(N0.f fVar) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, H0.r[] rVarArr);

    public abstract ArrayList O(u uVar, H0.r rVar, boolean z7);

    public abstract h P(m mVar, H0.r rVar, MediaCrypto mediaCrypto, float f);

    public abstract void Q(N0.f fVar);

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0422, code lost:
        if ("stvm8".equals(r4) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0432, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L261;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(X0.m r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.R(X0.m, android.media.MediaCrypto):void");
    }

    public final boolean S(long j, long j8) {
        H0.r rVar;
        if (j8 < j && ((rVar = this.f6360x0) == null || !Objects.equals(rVar.f1886m, "audio/opus") || j - j8 > 80000)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
        if (r6 != 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r1.g0() != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z7) {
        String str;
        String str2;
        H0.r rVar = this.f6358w0;
        rVar.getClass();
        if (this.f6314K0 == null) {
            try {
                List K7 = K(z7);
                this.f6314K0 = new ArrayDeque();
                if (!K7.isEmpty()) {
                    this.f6314K0.add((m) K7.get(0));
                }
                this.f6315L0 = null;
            } catch (w e7) {
                throw new q(rVar, e7, z7, -49998);
            }
        }
        if (!this.f6314K0.isEmpty()) {
            ArrayDeque arrayDeque = this.f6314K0;
            arrayDeque.getClass();
            while (this.f6309F0 == null) {
                m mVar = (m) arrayDeque.peekFirst();
                mVar.getClass();
                if (!o0(mVar)) {
                    return;
                }
                try {
                    R(mVar, mediaCrypto);
                } catch (Exception e8) {
                    K0.a.B("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e8);
                    arrayDeque.removeFirst();
                    String str3 = "Decoder init failed: " + mVar.f6286a + ", " + rVar;
                    if (K0.x.f2529a >= 21) {
                        if (e8 instanceof MediaCodec.CodecException) {
                            str2 = ((MediaCodec.CodecException) e8).getDiagnosticInfo();
                        } else {
                            str2 = null;
                        }
                        str = str2;
                    } else {
                        str = null;
                    }
                    q qVar = new q(str3, e8, rVar.f1886m, z7, mVar, str);
                    V(qVar);
                    q qVar2 = this.f6315L0;
                    if (qVar2 == null) {
                        this.f6315L0 = qVar;
                    } else {
                        this.f6315L0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f6293a, qVar2.f6294b, qVar2.f6295c, qVar2.f6296d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f6315L0;
                    }
                }
            }
            this.f6314K0 = null;
            return;
        }
        throw new q(rVar, null, z7, -49999);
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, long j8, String str);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0150, code lost:
        if (F() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r4.l0(r3) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010b, code lost:
        if (F() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013e, code lost:
        if (F() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O0.C0245g Y(M0.x r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.Y(M0.x):O0.g");
    }

    public abstract void Z(H0.r rVar, MediaFormat mediaFormat);

    public void b0(long j) {
        this.f6359w1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f6354u0;
            if (!arrayDeque.isEmpty() && j >= ((s) arrayDeque.peek()).f6299a) {
                s sVar = (s) arrayDeque.poll();
                sVar.getClass();
                n0(sVar);
                c0();
            } else {
                return;
            }
        }
    }

    public abstract void c0();

    public final void f0() {
        int i7 = this.f6339j1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    this.q1 = true;
                    j0();
                    return;
                }
                i0();
                T();
                return;
            }
            I();
            s0();
            return;
        }
        I();
    }

    public abstract boolean g0(long j, long j8, j jVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, H0.r rVar);

    public final boolean h0(int i7) {
        M0.x xVar = this.f3701c;
        xVar.t();
        N0.f fVar = this.f6348p0;
        fVar.e();
        int u7 = u(xVar, fVar, i7 | 4);
        if (u7 == -5) {
            Y(xVar);
            return true;
        } else if (u7 == -4 && fVar.c(4)) {
            this.p1 = true;
            f0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [A.m, android.media.MediaCrypto] */
    public final void i0() {
        try {
            j jVar = this.f6309F0;
            if (jVar != null) {
                jVar.release();
                this.f6355u1.f3732b++;
                m mVar = this.f6316M0;
                mVar.getClass();
                X(mVar.f6286a);
            }
            this.f6309F0 = null;
            try {
                MediaCrypto mediaCrypto = this.f6305B0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f6309F0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f6305B0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void k0() {
        this.f6328Y0 = -1;
        this.q0.f3350e = null;
        this.f6329Z0 = -1;
        this.f6330a1 = null;
        this.f6327X0 = -9223372036854775807L;
        this.f6341l1 = false;
        this.f6340k1 = false;
        this.f6324U0 = false;
        this.f6325V0 = false;
        this.f6331b1 = false;
        this.f6332c1 = false;
        this.f6345n1 = -9223372036854775807L;
        this.f6347o1 = -9223372036854775807L;
        this.f6359w1 = -9223372036854775807L;
        this.f6338i1 = 0;
        this.f6339j1 = 0;
        this.f6337h1 = this.f6336g1 ? 1 : 0;
    }

    @Override // O0.AbstractC0243e
    public boolean l() {
        boolean b5;
        boolean z7;
        if (this.f6358w0 == null) {
            return false;
        }
        if (j()) {
            b5 = this.f3708i0;
        } else {
            U u7 = this.f3698Z;
            u7.getClass();
            b5 = u7.b();
        }
        if (!b5) {
            if (this.f6329Z0 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                if (this.f6327X0 == -9223372036854775807L) {
                    return false;
                }
                this.f3696X.getClass();
                if (SystemClock.elapsedRealtime() >= this.f6327X0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0() {
        k0();
        this.t1 = null;
        this.f6314K0 = null;
        this.f6316M0 = null;
        this.f6310G0 = null;
        this.f6311H0 = null;
        this.f6312I0 = false;
        this.f6343m1 = false;
        this.f6313J0 = -1.0f;
        this.f6317N0 = 0;
        this.f6318O0 = false;
        this.f6319P0 = false;
        this.f6320Q0 = false;
        this.f6321R0 = false;
        this.f6322S0 = false;
        this.f6323T0 = false;
        this.f6326W0 = false;
        this.f6336g1 = false;
        this.f6337h1 = 0;
    }

    @Override // O0.AbstractC0243e
    public void m() {
        this.f6358w0 = null;
        n0(s.f6298e);
        this.f6354u0.clear();
        J();
    }

    public final void m0(A.m mVar) {
        A.m mVar2 = this.f6362y0;
        if (mVar2 != mVar) {
            if (mVar != null) {
                mVar.R(null);
            }
            if (mVar2 != null) {
                mVar2.k0(null);
            }
        }
        this.f6362y0 = mVar;
    }

    public final void n0(s sVar) {
        this.f6357v1 = sVar;
        if (sVar.f6301c != -9223372036854775807L) {
            this.f6361x1 = true;
            a0();
        }
    }

    @Override // O0.AbstractC0243e
    public void o(long j, boolean z7) {
        this.p1 = false;
        this.q1 = false;
        this.f6352s1 = false;
        if (this.f6333d1) {
            this.f6351s0.e();
            this.f6349r0.e();
            this.f6334e1 = false;
            M m7 = this.f6356v0;
            m7.getClass();
            m7.f4244a = I0.d.f2132a;
            m7.f4246c = 0;
            m7.f4245b = 2;
        } else if (J()) {
            T();
        }
        if (this.f6357v1.f6302d.k() > 0) {
            this.f6350r1 = true;
        }
        this.f6357v1.f6302d.c();
        this.f6354u0.clear();
    }

    public boolean o0(m mVar) {
        return true;
    }

    public boolean p0(H0.r rVar) {
        return false;
    }

    public abstract int q0(u uVar, H0.r rVar);

    public final boolean r0(H0.r rVar) {
        if (K0.x.f2529a >= 23 && this.f6309F0 != null && this.f6339j1 != 3 && this.f3697Y != 0) {
            float f = this.f6308E0;
            rVar.getClass();
            H0.r[] rVarArr = this.f3704e0;
            rVarArr.getClass();
            float N7 = N(f, rVarArr);
            float f4 = this.f6313J0;
            if (f4 == N7) {
                return true;
            }
            if (N7 == -1.0f) {
                if (this.f6340k1) {
                    this.f6338i1 = 1;
                    this.f6339j1 = 3;
                    return false;
                }
                i0();
                T();
                return false;
            } else if (f4 == -1.0f && N7 <= this.f6346o0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N7);
                j jVar = this.f6309F0;
                jVar.getClass();
                jVar.a(bundle);
                this.f6313J0 = N7;
            }
        }
        return true;
    }

    public final void s0() {
        A.m mVar = this.f6363z0;
        mVar.getClass();
        N0.a b0 = mVar.b0();
        if (b0 instanceof T0.h) {
            try {
                MediaCrypto mediaCrypto = this.f6305B0;
                mediaCrypto.getClass();
                ((T0.h) b0).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e7) {
                throw f(e7, this.f6358w0, false, 6006);
            }
        }
        m0(this.f6363z0);
        this.f6338i1 = 0;
        this.f6339j1 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r7 >= r5) goto L14;
     */
    @Override // O0.AbstractC0243e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(H0.r[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            X0.s r1 = r0.f6357v1
            long r1 = r1.f6301c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            X0.s r1 = new X0.s
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.n0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.f6354u0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f6345n1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f6359w1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            X0.s r1 = new X0.s
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.n0(r1)
            X0.s r1 = r0.f6357v1
            long r1 = r1.f6301c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L63
            r12.c0()
            goto L63
        L55:
            X0.s r9 = new X0.s
            long r3 = r0.f6345n1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.t(H0.r[], long, long):void");
    }

    public final void t0(long j) {
        H0.r rVar = (H0.r) this.f6357v1.f6302d.i(j);
        if (rVar == null && this.f6361x1 && this.f6311H0 != null) {
            rVar = (H0.r) this.f6357v1.f6302d.h();
        }
        if (rVar != null) {
            this.f6360x0 = rVar;
        } else if (!this.f6312I0 || this.f6360x0 == null) {
            return;
        }
        H0.r rVar2 = this.f6360x0;
        rVar2.getClass();
        Z(rVar2, this.f6311H0);
        this.f6312I0 = false;
        this.f6361x1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[LOOP:1: B:29:0x0050->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[LOOP:2: B:40:0x0076->B:50:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[EDGE_INSN: B:87:0x0076->B:91:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[EDGE_INSN: B:89:0x0097->B:51:0x0097 ?: BREAK  , SYNTHETIC] */
    @Override // O0.AbstractC0243e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.t.v(long, long):void");
    }

    @Override // O0.AbstractC0243e
    public void y(float f, float f4) {
        this.f6307D0 = f;
        this.f6308E0 = f4;
        r0(this.f6310G0);
    }

    @Override // O0.AbstractC0243e
    public final int z(H0.r rVar) {
        try {
            return q0(this.f6344n0, rVar);
        } catch (w e7) {
            throw f(e7, rVar, false, 4002);
        }
    }

    public void a0() {
    }

    public void j0() {
    }

    public void d0(N0.f fVar) {
    }

    public void e0(H0.r rVar) {
    }
}
