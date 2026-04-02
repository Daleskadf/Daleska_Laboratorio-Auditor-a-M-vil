package P0;

import H0.T;
import H0.U;
import H0.V;
import O0.C0253o;
import e1.C0960z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final C0253o f3917h = new C0253o(1);

    /* renamed from: i  reason: collision with root package name */
    public static final Random f3918i = new Random();

    /* renamed from: d  reason: collision with root package name */
    public i f3922d;
    public String f;

    /* renamed from: a  reason: collision with root package name */
    public final U f3919a = new U();

    /* renamed from: b  reason: collision with root package name */
    public final T f3920b = new T();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f3921c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public V f3923e = V.f1738a;

    /* renamed from: g  reason: collision with root package name */
    public long f3924g = -1;

    public final void a(e eVar) {
        long j = eVar.f3913c;
        if (j != -1) {
            this.f3924g = j;
        }
        this.f = null;
    }

    public final synchronized void b(a aVar) {
        i iVar;
        try {
            String str = this.f;
            if (str != null) {
                e eVar = (e) this.f3921c.get(str);
                eVar.getClass();
                a(eVar);
            }
            Iterator it = this.f3921c.values().iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                it.remove();
                if (eVar2.f3915e && (iVar = this.f3922d) != null) {
                    iVar.d(aVar, eVar2.f3911a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r13 != (-1)) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P0.e c(int r16, e1.C0960z r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f3921c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            P0.e r8 = (P0.e) r8
            long r9 = r8.f3913c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f3912b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            P0.f r9 = r8.f3916g
            java.util.HashMap r10 = r9.f3921c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            P0.e r10 = (P0.e) r10
            if (r10 == 0) goto L44
            long r13 = r10.f3913c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f3924g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f10855d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f3913c = r9
        L51:
            e1.z r9 = r8.f3914d
            if (r2 != 0) goto L5a
            int r10 = r8.f3912b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.f10855d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L15
            long r11 = r8.f3913c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.f10855d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f10853b
            int r11 = r9.f10853b
            if (r10 != r11) goto L15
            int r10 = r2.f10854c
            int r11 = r9.f10854c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f3913c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = K0.x.f2529a
            e1.z r10 = r5.f3914d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            O0.o r4 = P0.f.f3917h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            P0.e r5 = new P0.e
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.f.c(int, e1.z):P0.e");
    }

    public final synchronized String d(V v6, C0960z c0960z) {
        return c(v6.g(c0960z.f10852a, this.f3920b).f1718c, c0960z).f3911a;
    }

    public final void e(a aVar) {
        C0960z c0960z;
        boolean p7 = aVar.f3894b.p();
        HashMap hashMap = this.f3921c;
        if (p7) {
            String str = this.f;
            if (str != null) {
                e eVar = (e) hashMap.get(str);
                eVar.getClass();
                a(eVar);
                return;
            }
            return;
        }
        e eVar2 = (e) hashMap.get(this.f);
        int i7 = aVar.f3895c;
        C0960z c0960z2 = aVar.f3896d;
        this.f = c(i7, c0960z2).f3911a;
        f(aVar);
        if (c0960z2 != null && c0960z2.b()) {
            long j = c0960z2.f10855d;
            if (eVar2 == null || eVar2.f3913c != j || (c0960z = eVar2.f3914d) == null || c0960z.f10853b != c0960z2.f10853b || c0960z.f10854c != c0960z2.f10854c) {
                c(i7, new C0960z(c0960z2.f10852a, j));
                this.f3922d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(P0.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.f.f(P0.a):void");
    }

    public final synchronized void g(a aVar, int i7) {
        boolean z7;
        try {
            this.f3922d.getClass();
            if (i7 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            Iterator it = this.f3921c.values().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a(aVar)) {
                    it.remove();
                    if (eVar.f3915e) {
                        boolean equals = eVar.f3911a.equals(this.f);
                        if (z7 && equals) {
                            boolean z8 = eVar.f;
                        }
                        if (equals) {
                            a(eVar);
                        }
                        this.f3922d.d(aVar, eVar.f3911a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
