package O0;

import D.AbstractC0059i;
import android.os.Bundle;
import e1.C0960z;
/* renamed from: O0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250l extends H0.K {

    /* renamed from: X  reason: collision with root package name */
    public final int f3791X;

    /* renamed from: Y  reason: collision with root package name */
    public final C0960z f3792Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f3793Z;

    /* renamed from: c  reason: collision with root package name */
    public final int f3794c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3795d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3796e;
    public final H0.r f;

    static {
        AbstractC0059i.F(1001, 1002, 1003, 1004, 1005);
        K0.x.H(1006);
    }

    public C0250l(int i7, Exception exc, int i8) {
        this(i7, exc, i8, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250l(String str, Throwable th, int i7, int i8, String str2, int i9, H0.r rVar, int i10, C0960z c0960z, long j, boolean z7) {
        super(str, th, i7, j);
        Bundle bundle = Bundle.EMPTY;
        boolean z8 = false;
        K0.a.e(!z7 || i8 == 1);
        K0.a.e((th != null || i8 == 3) ? true : z8);
        this.f3794c = i8;
        this.f3795d = str2;
        this.f3796e = i9;
        this.f = rVar;
        this.f3791X = i10;
        this.f3792Y = c0960z;
        this.f3793Z = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0250l(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, H0.r r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto L14
            java.lang.String r0 = "Unexpected runtime error"
        Ld:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L14:
            java.lang.String r0 = "Remote error"
            goto Ld
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = K0.x.f2529a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = D.AbstractC0059i.z(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C0250l.<init>(int, java.lang.Exception, int, java.lang.String, int, H0.r, int, boolean):void");
    }
}
