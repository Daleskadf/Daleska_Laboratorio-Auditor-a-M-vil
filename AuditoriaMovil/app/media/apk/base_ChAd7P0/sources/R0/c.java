package R0;

import A3.AbstractC0021t;
import A3.I;
import A3.K;
import A3.N;
import A3.e0;
import D.AbstractC0059i;
import H0.C0137q;
import H0.W;
import H0.r;
import K0.x;
import M0.C;
import O0.Q;
import O0.l0;
import android.util.Pair;
import android.util.SparseArray;
import com.google.firebase.firestore.Z;
import e1.C0947l;
import e1.C0950o;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import e1.T;
import e1.U;
import e1.V;
import e1.b0;
import f1.C0985g;
import f1.C0986h;
import f5.C0993a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class c implements InterfaceC0958x, V {

    /* renamed from: s0  reason: collision with root package name */
    public static final Pattern f4527s0 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f4528t0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: X  reason: collision with root package name */
    public final long f4529X;

    /* renamed from: Y  reason: collision with root package name */
    public final i1.o f4530Y;

    /* renamed from: Z  reason: collision with root package name */
    public final i1.e f4531Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f4532a;

    /* renamed from: b  reason: collision with root package name */
    public final N f4533b;

    /* renamed from: c  reason: collision with root package name */
    public final C f4534c;

    /* renamed from: d  reason: collision with root package name */
    public final T0.g f4535d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f4536e;

    /* renamed from: e0  reason: collision with root package name */
    public final b0 f4537e0;
    public final E.e f;

    /* renamed from: f0  reason: collision with root package name */
    public final b[] f4538f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C0993a f4539g0;

    /* renamed from: h0  reason: collision with root package name */
    public final p f4540h0;

    /* renamed from: j0  reason: collision with root package name */
    public final T0.d f4542j0;

    /* renamed from: k0  reason: collision with root package name */
    public final T0.d f4543k0;

    /* renamed from: l0  reason: collision with root package name */
    public InterfaceC0957w f4544l0;

    /* renamed from: o0  reason: collision with root package name */
    public C0947l f4547o0;

    /* renamed from: p0  reason: collision with root package name */
    public S0.c f4548p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f4549r0;

    /* renamed from: m0  reason: collision with root package name */
    public C0986h[] f4545m0 = new C0986h[0];

    /* renamed from: n0  reason: collision with root package name */
    public m[] f4546n0 = new m[0];

    /* renamed from: i0  reason: collision with root package name */
    public final IdentityHashMap f4541i0 = new IdentityHashMap();

    public c(int i7, S0.c cVar, E.e eVar, int i8, N n7, C c8, T0.g gVar, T0.d dVar, Z z7, T0.d dVar2, long j, i1.o oVar, i1.e eVar2, C0993a c0993a, A4.c cVar2, P0.k kVar) {
        String e7;
        int i9;
        int i10;
        int i11;
        List list;
        boolean[] zArr;
        int i12;
        r[] rVarArr;
        r[] h8;
        S0.f b5;
        Integer num;
        T0.g gVar2 = gVar;
        int i13 = 0;
        this.f4532a = i7;
        this.f4548p0 = cVar;
        this.f = eVar;
        this.q0 = i8;
        this.f4533b = n7;
        this.f4534c = c8;
        this.f4535d = gVar2;
        this.f4543k0 = dVar;
        this.f4536e = z7;
        this.f4542j0 = dVar2;
        this.f4529X = j;
        this.f4530Y = oVar;
        this.f4531Z = eVar2;
        this.f4539g0 = c0993a;
        this.f4540h0 = new p(cVar, cVar2, eVar2);
        c0993a.getClass();
        I i14 = K.f98b;
        e0 e0Var = e0.f138e;
        this.f4547o0 = new C0947l(e0Var, e0Var);
        S0.h b7 = cVar.b(i8);
        List list2 = b7.f4881d;
        this.f4549r0 = list2;
        List list3 = b7.f4880c;
        int size = list3.size();
        HashMap hashMap = new HashMap(AbstractC0021t.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((S0.a) list3.get(i15)).f4838a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            S0.a aVar = (S0.a) list3.get(i16);
            S0.f b8 = b("http://dashif.org/guidelines/trickmode", aVar.f4842e);
            List list4 = aVar.f;
            b8 = b8 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b8;
            int intValue = (b8 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b8.f4872b)))) == null) ? i16 : num.intValue();
            if (intValue == i16 && (b5 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i17 = x.f2529a;
                String[] split = b5.f4872b.split(",", -1);
                int length = split.length;
                for (int i18 = i13; i18 < length; i18++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i18])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
            i16++;
            i13 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] y2 = AbstractC1740d.y((Collection) arrayList.get(i19));
            iArr[i19] = y2;
            Arrays.sort(y2);
        }
        boolean[] zArr2 = new boolean[size2];
        r[][] rVarArr2 = new r[size2];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr2 = iArr[i20];
            int length2 = iArr2.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    break;
                }
                List list7 = ((S0.a) list3.get(iArr2[i22])).f4840c;
                int[] iArr3 = iArr2;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (!((S0.m) list7.get(i23)).f4895d.isEmpty()) {
                        zArr2[i20] = true;
                        i21++;
                        break;
                    }
                }
                i22++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i20];
            int length3 = iArr4.length;
            int i24 = 0;
            while (i24 < length3) {
                int i25 = iArr4[i24];
                S0.a aVar2 = (S0.a) list3.get(i25);
                List list8 = ((S0.a) list3.get(i25)).f4841d;
                int[] iArr5 = iArr4;
                int i26 = length3;
                int i27 = 0;
                while (i27 < list8.size()) {
                    S0.f fVar = (S0.f) list8.get(i27);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f4871a)) {
                        C0137q c0137q = new C0137q();
                        c0137q.f1850l = H0.I.l("application/cea-608");
                        c0137q.f1841a = AbstractC0059i.C(new StringBuilder(), aVar2.f4838a, ":cea608");
                        h8 = h(fVar, f4527s0, new r(c0137q));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f4871a)) {
                        C0137q c0137q2 = new C0137q();
                        c0137q2.f1850l = H0.I.l("application/cea-708");
                        c0137q2.f1841a = AbstractC0059i.C(new StringBuilder(), aVar2.f4838a, ":cea708");
                        h8 = h(fVar, f4528t0, new r(c0137q2));
                    } else {
                        i27++;
                        list8 = list9;
                    }
                    rVarArr = h8;
                    i12 = 1;
                }
                i24++;
                iArr4 = iArr5;
                length3 = i26;
            }
            i12 = 1;
            rVarArr = new r[0];
            rVarArr2[i20] = rVarArr;
            if (rVarArr.length != 0) {
                i21 += i12;
            }
            i20 += i12;
        }
        int size3 = list2.size() + i21 + size2;
        W[] wArr = new W[size3];
        b[] bVarArr = new b[size3];
        int i28 = 0;
        int i29 = 0;
        while (i28 < size2) {
            int[] iArr6 = iArr[i28];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i30 = size2;
            int i31 = 0;
            while (i31 < length4) {
                arrayList3.addAll(((S0.a) list3.get(iArr6[i31])).f4840c);
                i31++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            r[] rVarArr3 = new r[size4];
            int i32 = 0;
            while (i32 < size4) {
                int i33 = size4;
                r rVar = ((S0.m) arrayList3.get(i32)).f4892a;
                ArrayList arrayList4 = arrayList3;
                C0137q a7 = rVar.a();
                a7.f1840I = gVar2.q(rVar);
                rVarArr3[i32] = new r(a7);
                i32++;
                size4 = i33;
                arrayList3 = arrayList4;
            }
            S0.a aVar3 = (S0.a) list3.get(iArr6[0]);
            long j8 = aVar3.f4838a;
            if (j8 != -1) {
                e7 = Long.toString(j8);
            } else {
                e7 = io.flutter.plugins.pathprovider.b.e(i28, "unset:");
            }
            int i34 = i29 + 1;
            if (zArr2[i28]) {
                i9 = i29 + 2;
                i10 = i34;
            } else {
                i9 = i34;
                i10 = -1;
            }
            if (rVarArr2[i28].length != 0) {
                i11 = i9;
                i9++;
            } else {
                i11 = -1;
            }
            g(n7, rVarArr3);
            List list10 = list3;
            wArr[i29] = new W(e7, rVarArr3);
            I i35 = K.f98b;
            e0 e0Var2 = e0.f138e;
            bVarArr[i29] = new b(aVar3.f4839b, 0, iArr6, i29, i10, i11, -1, e0Var2);
            int i36 = i10;
            int i37 = -1;
            if (i36 != -1) {
                String z8 = AbstractC0059i.z(e7, ":emsg");
                C0137q c0137q3 = new C0137q();
                c0137q3.f1841a = z8;
                c0137q3.f1850l = H0.I.l("application/x-emsg");
                list = list2;
                zArr = zArr2;
                wArr[i36] = new W(z8, new r(c0137q3));
                bVarArr[i36] = new b(5, 1, iArr6, i29, -1, -1, -1, e0Var2);
                i37 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i11 != i37) {
                String z9 = AbstractC0059i.z(e7, ":cc");
                bVarArr[i11] = new b(3, 1, iArr6, i29, -1, -1, -1, K.q(rVarArr2[i28]));
                g(n7, rVarArr2[i28]);
                wArr[i11] = new W(z9, rVarArr2[i28]);
            }
            i28++;
            size2 = i30;
            gVar2 = gVar;
            iArr = iArr7;
            i29 = i9;
            list3 = list10;
            zArr2 = zArr;
            list2 = list;
        }
        List list11 = list2;
        int i38 = 0;
        while (i38 < list11.size()) {
            List list12 = list11;
            S0.g gVar3 = (S0.g) list12.get(i38);
            C0137q c0137q4 = new C0137q();
            c0137q4.f1841a = gVar3.a();
            c0137q4.f1850l = H0.I.l("application/x-emsg");
            wArr[i29] = new W(gVar3.a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i38, new r(c0137q4));
            I i39 = K.f98b;
            bVarArr[i29] = new b(5, 2, new int[0], -1, -1, -1, i38, e0.f138e);
            i38++;
            list11 = list12;
            i29++;
        }
        Pair create = Pair.create(new b0(wArr), bVarArr);
        this.f4537e0 = (b0) create.first;
        this.f4538f0 = (b[]) create.second;
    }

    public static S0.f b(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            S0.f fVar = (S0.f) list.get(i7);
            if (str.equals(fVar.f4871a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void g(N n7, r[] rVarArr) {
        String str;
        for (int i7 = 0; i7 < rVarArr.length; i7++) {
            r rVar = rVarArr[i7];
            A.l lVar = (A.l) n7.f106d;
            if (lVar.f25a && ((C0993a) lVar.f26b).i(rVar)) {
                C0137q a7 = rVar.a();
                a7.f1850l = H0.I.l("application/x-media3-cues");
                a7.f1837F = ((C0993a) lVar.f26b).k(rVar);
                StringBuilder sb = new StringBuilder();
                sb.append(rVar.f1886m);
                String str2 = rVar.j;
                if (str2 != null) {
                    str = StringUtils.SPACE.concat(str2);
                } else {
                    str = StringUtils.EMPTY;
                }
                sb.append(str);
                a7.f1848i = sb.toString();
                a7.f1855q = Long.MAX_VALUE;
                rVar = new r(a7);
            }
            rVarArr[i7] = rVar;
        }
    }

    public static r[] h(S0.f fVar, Pattern pattern, r rVar) {
        String str = fVar.f4872b;
        if (str == null) {
            return new r[]{rVar};
        }
        int i7 = x.f2529a;
        String[] split = str.split(";", -1);
        r[] rVarArr = new r[split.length];
        for (int i8 = 0; i8 < split.length; i8++) {
            Matcher matcher = pattern.matcher(split[i8]);
            if (!matcher.matches()) {
                return new r[]{rVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C0137q a7 = rVar.a();
            a7.f1841a = rVar.f1876a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + parseInt;
            a7.f1836E = parseInt;
            a7.f1844d = matcher.group(2);
            rVarArr[i8] = new r(a7);
        }
        return rVarArr;
    }

    @Override // e1.V
    public final void B(e1.W w2) {
        this.f4544l0.B(this);
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        C0986h[] c0986hArr;
        for (C0986h c0986h : this.f4545m0) {
            if (c0986h.f11016a == 2) {
                return c0986h.f11020e.c(j, l0Var);
            }
        }
        return j;
    }

    @Override // e1.W
    public final boolean d() {
        return this.f4547o0.d();
    }

    public final int e(int[] iArr, int i7) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        b[] bVarArr = this.f4538f0;
        int i9 = bVarArr[i8].f4524e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && bVarArr[i11].f4522c == 0) {
                return i10;
            }
        }
        return -1;
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f4544l0 = interfaceC0957w;
        interfaceC0957w.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        int i7;
        boolean z7;
        int[] iArr;
        int i8;
        int[] iArr2;
        U[] uArr2;
        boolean z8;
        int i9;
        W w2;
        e0 s7;
        int i10;
        o oVar;
        boolean z9;
        h1.r[] rVarArr2 = rVarArr;
        U[] uArr3 = uArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i11 = 0;
        while (true) {
            i7 = -1;
            if (i11 >= rVarArr2.length) {
                break;
            }
            h1.r rVar = rVarArr2[i11];
            if (rVar != null) {
                iArr3[i11] = this.f4537e0.b(rVar.i());
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        for (int i12 = 0; i12 < rVarArr2.length; i12++) {
            if (rVarArr2[i12] == null || !zArr[i12]) {
                U u7 = uArr3[i12];
                if (u7 instanceof C0986h) {
                    ((C0986h) u7).A(this);
                } else if (u7 instanceof C0985g) {
                    ((C0985g) u7).d();
                }
                uArr3[i12] = null;
            }
        }
        int i13 = 0;
        while (true) {
            z7 = true;
            if (i13 >= rVarArr2.length) {
                break;
            }
            U u8 = uArr3[i13];
            if ((u8 instanceof C0950o) || (u8 instanceof C0985g)) {
                int e7 = e(iArr3, i13);
                if (e7 == -1) {
                    z9 = uArr3[i13] instanceof C0950o;
                } else {
                    U u9 = uArr3[i13];
                    z9 = ((u9 instanceof C0985g) && ((C0985g) u9).f11008a == uArr3[e7]) ? false : false;
                }
                if (!z9) {
                    U u10 = uArr3[i13];
                    if (u10 instanceof C0985g) {
                        ((C0985g) u10).d();
                    }
                    uArr3[i13] = null;
                }
            }
            i13++;
        }
        int i14 = 0;
        while (i14 < rVarArr2.length) {
            h1.r rVar2 = rVarArr2[i14];
            if (rVar2 == null) {
                i8 = i14;
                iArr2 = iArr3;
                uArr2 = uArr3;
            } else {
                U u11 = uArr3[i14];
                if (u11 == null) {
                    zArr2[i14] = z7;
                    b bVar = this.f4538f0[iArr3[i14]];
                    int i15 = bVar.f4522c;
                    if (i15 == 0) {
                        int i16 = bVar.f;
                        if (i16 != i7) {
                            z8 = z7;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            w2 = this.f4537e0.a(i16);
                            i9 = z7;
                        } else {
                            i9 = 0;
                            w2 = null;
                        }
                        int i17 = bVar.f4525g;
                        if (i17 != i7) {
                            s7 = this.f4538f0[i17].f4526h;
                        } else {
                            s7 = K.s();
                        }
                        int size = s7.size() + i9;
                        r[] rVarArr3 = new r[size];
                        int[] iArr4 = new int[size];
                        if (z8) {
                            rVarArr3[0] = w2.a();
                            iArr4[0] = 5;
                            i10 = z7;
                        } else {
                            i10 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i18 = 0; i18 < s7.size(); i18++) {
                            r rVar3 = (r) s7.get(i18);
                            rVarArr3[i10] = rVar3;
                            iArr4[i10] = 3;
                            arrayList.add(rVar3);
                            i10++;
                        }
                        if (this.f4548p0.f4850d && z8) {
                            p pVar = this.f4540h0;
                            oVar = new o(pVar, pVar.f4632a);
                        } else {
                            oVar = null;
                        }
                        N n7 = this.f4533b;
                        i1.o oVar2 = this.f4530Y;
                        S0.c cVar = this.f4548p0;
                        int i19 = i14;
                        E.e eVar = this.f;
                        int[] iArr5 = iArr3;
                        int i20 = this.q0;
                        int[] iArr6 = bVar.f4520a;
                        int i21 = bVar.f4521b;
                        long j8 = this.f4529X;
                        C c8 = this.f4534c;
                        M0.h a7 = ((M0.g) n7.f105c).a();
                        if (c8 != null) {
                            a7.n(c8);
                        }
                        i8 = i19;
                        o oVar3 = oVar;
                        iArr2 = iArr5;
                        C0986h c0986h = new C0986h(bVar.f4521b, iArr4, rVarArr3, new l((A.l) n7.f106d, oVar2, cVar, eVar, i20, iArr6, rVar2, i21, a7, j8, n7.f104b, z8, arrayList, oVar), this, this.f4531Z, j, this.f4535d, this.f4543k0, this.f4536e, this.f4542j0);
                        synchronized (this) {
                            this.f4541i0.put(c0986h, oVar3);
                        }
                        uArr2 = uArr;
                        uArr2[i8] = c0986h;
                    } else {
                        i8 = i14;
                        iArr2 = iArr3;
                        uArr2 = uArr3;
                        if (i15 == 2) {
                            uArr2[i8] = new m((S0.g) this.f4549r0.get(bVar.f4523d), rVar2.i().a(), this.f4548p0.f4850d);
                        }
                    }
                } else {
                    i8 = i14;
                    iArr2 = iArr3;
                    uArr2 = uArr3;
                    if (u11 instanceof C0986h) {
                        ((l) ((C0986h) u11).f11020e).j = rVar2;
                    }
                }
            }
            i14 = i8 + 1;
            uArr3 = uArr2;
            iArr3 = iArr2;
            z7 = true;
            i7 = -1;
            rVarArr2 = rVarArr;
        }
        int[] iArr7 = iArr3;
        U[] uArr4 = uArr3;
        int i22 = 0;
        while (i22 < rVarArr.length) {
            if (uArr4[i22] == 0 && rVarArr[i22] != null) {
                iArr = iArr7;
                b bVar2 = this.f4538f0[iArr[i22]];
                if (bVar2.f4522c == 1) {
                    int e8 = e(iArr, i22);
                    if (e8 == -1) {
                        uArr4[i22] = new Object();
                    } else {
                        C0986h c0986h2 = (C0986h) uArr4[e8];
                        int i23 = bVar2.f4521b;
                        int i24 = 0;
                        while (true) {
                            T[] tArr = c0986h2.f11025i0;
                            if (i24 < tArr.length) {
                                if (c0986h2.f11017b[i24] == i23) {
                                    boolean[] zArr3 = c0986h2.f11019d;
                                    K0.a.j(!zArr3[i24]);
                                    zArr3[i24] = true;
                                    tArr[i24].G(j, true);
                                    uArr4[i22] = new C0985g(c0986h2, c0986h2, tArr[i24], i24);
                                    break;
                                }
                                i24++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i22++;
                    iArr7 = iArr;
                }
            } else {
                iArr = iArr7;
            }
            i22++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (?? r52 : uArr4) {
            if (r52 instanceof C0986h) {
                arrayList2.add((C0986h) r52);
            } else if (r52 instanceof m) {
                arrayList3.add((m) r52);
            }
        }
        C0986h[] c0986hArr = new C0986h[arrayList2.size()];
        this.f4545m0 = c0986hArr;
        arrayList2.toArray(c0986hArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.f4546n0 = mVarArr;
        arrayList3.toArray(mVarArr);
        C0993a c0993a = this.f4539g0;
        AbstractList w7 = AbstractC0021t.w(arrayList2, new P0.b(18));
        c0993a.getClass();
        this.f4547o0 = new C0947l(arrayList2, w7);
        return j;
    }

    @Override // e1.W
    public final long k() {
        return this.f4547o0.k();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        return this.f4537e0;
    }

    @Override // e1.W
    public final boolean n(Q q2) {
        return this.f4547o0.n(q2);
    }

    @Override // e1.W
    public final long o() {
        return this.f4547o0.o();
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        this.f4530Y.a();
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        m[] mVarArr;
        long j8;
        for (C0986h c0986h : this.f4545m0) {
            c0986h.B(j);
        }
        for (m mVar : this.f4546n0) {
            int b5 = x.b(mVar.f4619c, j, true);
            mVar.f4615X = b5;
            if (mVar.f4620d && b5 == mVar.f4619c.length) {
                j8 = j;
            } else {
                j8 = -9223372036854775807L;
            }
            mVar.f4616Y = j8;
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        for (C0986h c0986h : this.f4545m0) {
            c0986h.r(j);
        }
    }

    @Override // e1.W
    public final void t(long j) {
        this.f4547o0.t(j);
    }
}
