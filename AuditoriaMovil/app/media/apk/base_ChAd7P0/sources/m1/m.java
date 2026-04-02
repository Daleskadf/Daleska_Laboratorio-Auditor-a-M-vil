package m1;

import A3.I;
import A3.K;
import A3.e0;
import H4.e1;
import H4.p1;
import S1.C0333a;
import S1.C0335c;
import S1.C0336d;
import S1.C0338f;
import a6.t0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f5.C0993a;
import java.util.ArrayList;
import l4.C1418b;
import n1.C1461a;
import org.apache.tika.utils.XMLReaderUtils;
import r1.C1731a;
import s1.C1762b;
/* loaded from: classes.dex */
public final class m implements r {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13976e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final t0 f = new t0(new C1418b(1));

    /* renamed from: g  reason: collision with root package name */
    public static final t0 f13977g = new t0(new C1418b(2));

    /* renamed from: a  reason: collision with root package name */
    public e0 f13978a;

    /* renamed from: d  reason: collision with root package name */
    public int f13981d;

    /* renamed from: c  reason: collision with root package name */
    public C0993a f13980c = new C0993a(6);

    /* renamed from: b  reason: collision with root package name */
    public boolean f13979b = true;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    @Override // m1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized m1.o[] a(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            int[] r1 = m1.m.f13976e     // Catch: java.lang.Throwable -> L48
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L48
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L48
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = org.slf4j.helpers.i.A(r8)     // Catch: java.lang.Throwable -> L48
            r4 = -1
            if (r8 == r4) goto L2e
            r6.b(r8, r0)     // Catch: java.lang.Throwable -> L48
        L2e:
            int r7 = org.slf4j.helpers.i.B(r7)     // Catch: java.lang.Throwable -> L48
            if (r7 == r4) goto L39
            if (r7 == r8) goto L39
            r6.b(r7, r0)     // Catch: java.lang.Throwable -> L48
        L39:
            r4 = r3
        L3a:
            if (r4 >= r2) goto L4a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L48
            if (r5 == r8) goto L45
            if (r5 == r7) goto L45
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> L48
        L45:
            int r4 = r4 + 1
            goto L3a
        L48:
            r7 = move-exception
            goto L97
        L4a:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L48
            m1.o[] r7 = new m1.o[r7]     // Catch: java.lang.Throwable -> L48
        L50:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L48
            if (r3 >= r8) goto L95
            java.lang.Object r8 = r0.get(r3)     // Catch: java.lang.Throwable -> L48
            m1.o r8 = (m1.o) r8     // Catch: java.lang.Throwable -> L48
            boolean r1 = r6.f13979b     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L90
            m1.o r1 = r8.c()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof G1.n     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            m1.o r1 = r8.c()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof G1.q     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            m1.o r1 = r8.c()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof S1.F     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            m1.o r1 = r8.c()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof o1.b     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            m1.o r1 = r8.c()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof E1.d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            J1.m r1 = new J1.m     // Catch: java.lang.Throwable -> L48
            f5.a r2 = r6.f13980c     // Catch: java.lang.Throwable -> L48
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L48
            r8 = r1
        L90:
            r7[r3] = r8     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + 1
            goto L50
        L95:
            monitor-exit(r6)
            return r7
        L97:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.m.a(android.net.Uri, java.util.Map):m1.o[]");
    }

    /* JADX WARN: Type inference failed for: r11v20, types: [T1.d, java.lang.Object] */
    public final void b(int i7, ArrayList arrayList) {
        int i8;
        int i9 = 2;
        int i10 = 0;
        switch (i7) {
            case 0:
                arrayList.add(new C0333a());
                return;
            case 1:
                arrayList.add(new C0335c());
                return;
            case 2:
                arrayList.add(new C0336d());
                return;
            case 3:
                arrayList.add(new C1461a());
                return;
            case 4:
                o F7 = f.F(0);
                if (F7 != null) {
                    arrayList.add(F7);
                    return;
                } else {
                    arrayList.add(new C1731a());
                    return;
                }
            case 5:
                arrayList.add(new C1762b());
                return;
            case 6:
                C0993a c0993a = this.f13980c;
                if (this.f13979b) {
                    i9 = 0;
                }
                arrayList.add(new E1.d(c0993a, i9));
                return;
            case 7:
                arrayList.add(new F1.d());
                return;
            case 8:
                C0993a c0993a2 = this.f13980c;
                if (this.f13979b) {
                    i8 = 0;
                } else {
                    i8 = 32;
                }
                I i11 = K.f98b;
                arrayList.add(new G1.n(c0993a2, i8, null, null, e0.f138e, null));
                C0993a c0993a3 = this.f13980c;
                if (!this.f13979b) {
                    i10 = 16;
                }
                arrayList.add(new G1.q(c0993a3, i10));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new S1.B());
                return;
            case 11:
                if (this.f13978a == null) {
                    I i12 = K.f98b;
                    this.f13978a = e0.f138e;
                }
                arrayList.add(new S1.F(1, !this.f13979b ? 1 : 0, this.f13980c, new K0.v(0L), new C0338f(0, this.f13978a)));
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                ?? obj = new Object();
                obj.f5314c = 0;
                obj.f5315d = -1L;
                obj.f = -1;
                obj.f5317g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new I1.a(this.f13981d));
                return;
            case 15:
                o F8 = f13977g.F(new Object[0]);
                if (F8 != null) {
                    arrayList.add(F8);
                    return;
                }
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                arrayList.add(new o1.b(!this.f13979b ? 1 : 0, this.f13980c));
                return;
            case 17:
                arrayList.add(new I1.a(0, (byte) 0));
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                arrayList.add(new U1.a(0));
                return;
            case 19:
                arrayList.add(new I1.a(1, (byte) 0));
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                arrayList.add(new U1.a(2));
                return;
            case 21:
                arrayList.add(new U1.a(1));
                return;
        }
    }
}
