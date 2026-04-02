package b1;

import H0.r;
import K0.x;
import a1.C0434k;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public int f8135a;

    /* renamed from: b  reason: collision with root package name */
    public int f8136b;

    /* renamed from: c  reason: collision with root package name */
    public int f8137c;

    /* renamed from: d  reason: collision with root package name */
    public long f8138d;

    /* renamed from: e  reason: collision with root package name */
    public long f8139e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f8140g;

    public g(C0434k c0434k) {
        this.f = c0434k;
        this.f8138d = -9223372036854775807L;
        this.f8136b = -1;
    }

    @Override // b1.i
    public void a(long j, long j8) {
        this.f8138d = j;
        this.f8139e = j8;
        this.f8137c = 0;
    }

    @Override // b1.i
    public void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 2);
        this.f8140g = s7;
        int i8 = x.f2529a;
        s7.c(((C0434k) this.f).f6842c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if ((r24.e() >> 6) == 0) goto L22;
     */
    @Override // b1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(K0.q r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f8140g
            m1.G r5 = (m1.G) r5
            K0.a.k(r5)
            int r5 = r0.f8136b
            r6 = -1
            if (r5 == r6) goto L2d
            int r5 = a1.C0432i.a(r5)
            if (r2 == r5) goto L2d
            int r7 = K0.x.f2529a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = D.AbstractC0059i.y(r7, r5, r8, r2, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            K0.a.A(r7, r5)
        L2d:
            int r5 = r24.a()
            java.lang.Object r7 = r0.f8140g
            m1.G r7 = (m1.G) r7
            r7.d(r5, r1)
            int r7 = r0.f8137c
            r8 = 0
            if (r7 != 0) goto L71
            byte[] r7 = r1.f2513a
            byte[] r9 = new byte[r3]
            r9 = {x00ae: FILL_ARRAY_DATA  , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            G.i.j(r7, r10)
            r10 = r8
        L4a:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L5e
            r11 = r8
        L50:
            if (r11 >= r3) goto L5f
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L5c
            int r10 = r10 + r4
            goto L4a
        L5c:
            int r11 = r11 + r4
            goto L50
        L5e:
            r10 = r6
        L5f:
            if (r10 == r6) goto L6e
            int r10 = r10 + r3
            r1.G(r10)
            int r1 = r24.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r4 = r8
        L6f:
            r0.f8135a = r4
        L71:
            int r1 = r0.f8137c
            int r1 = r1 + r5
            r0.f8137c = r1
            if (r28 == 0) goto Lab
            long r3 = r0.f8138d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L87
            r0.f8138d = r3
        L87:
            long r9 = r0.f8139e
            long r13 = r0.f8138d
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = f7.a.p0(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f8140g
            r16 = r1
            m1.G r16 = (m1.G) r16
            int r1 = r0.f8135a
            int r3 = r0.f8137c
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.e(r17, r19, r20, r21, r22)
            r0.f8137c = r8
        Lab:
            r0.f8136b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.d(K0.q, long, int, boolean):void");
    }

    public g(int i7, int i8, r rVar, int i9, Object obj, long j, long j8) {
        this.f8135a = i7;
        this.f8136b = i8;
        this.f = rVar;
        this.f8137c = i9;
        this.f8140g = obj;
        this.f8138d = j;
        this.f8139e = j8;
    }

    @Override // b1.i
    public void b(long j) {
    }
}
