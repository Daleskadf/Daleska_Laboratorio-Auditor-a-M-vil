package U0;

import A3.I;
import A3.K;
import A3.e0;
import H0.W;
import K0.x;
import M0.C;
import android.net.Uri;
import android.util.Pair;
import e1.C0937b;
import f1.AbstractC0983e;
import h1.AbstractC1069c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f5558a;

    /* renamed from: b  reason: collision with root package name */
    public final M0.h f5559b;

    /* renamed from: c  reason: collision with root package name */
    public final M0.h f5560c;

    /* renamed from: d  reason: collision with root package name */
    public final A.m f5561d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri[] f5562e;
    public final H0.r[] f;

    /* renamed from: g  reason: collision with root package name */
    public final V0.c f5563g;

    /* renamed from: h  reason: collision with root package name */
    public final W f5564h;

    /* renamed from: i  reason: collision with root package name */
    public final List f5565i;

    /* renamed from: k  reason: collision with root package name */
    public final P0.k f5566k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5567l;

    /* renamed from: n  reason: collision with root package name */
    public C0937b f5569n;

    /* renamed from: o  reason: collision with root package name */
    public Uri f5570o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5571p;

    /* renamed from: q  reason: collision with root package name */
    public h1.r f5572q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5574s;
    public final A4.c j = new A4.c(24);

    /* renamed from: m  reason: collision with root package name */
    public byte[] f5568m = x.f;

    /* renamed from: r  reason: collision with root package name */
    public long f5573r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [U0.g, h1.r, h1.c] */
    public i(c cVar, V0.c cVar2, Uri[] uriArr, H0.r[] rVarArr, A.c cVar3, C c8, A.m mVar, List list, P0.k kVar) {
        this.f5558a = cVar;
        this.f5563g = cVar2;
        this.f5562e = uriArr;
        this.f = rVarArr;
        this.f5561d = mVar;
        this.f5565i = list;
        this.f5566k = kVar;
        M0.h a7 = ((M0.g) cVar3.f4b).a();
        this.f5559b = a7;
        if (c8 != null) {
            a7.n(c8);
        }
        this.f5560c = ((M0.g) cVar3.f4b).a();
        this.f5564h = new W(StringUtils.EMPTY, rVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((rVarArr[i7].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        W w2 = this.f5564h;
        int[] y2 = AbstractC1740d.y(arrayList);
        ?? abstractC1069c = new AbstractC1069c(w2, y2);
        abstractC1069c.f5553g = abstractC1069c.r(w2.f1742d[y2[0]]);
        this.f5572q = abstractC1069c;
    }

    public final f1.m[] a(k kVar, long j) {
        int b5;
        boolean z7;
        int i7;
        List list;
        if (kVar == null) {
            b5 = -1;
        } else {
            b5 = this.f5564h.b(kVar.f11006d);
        }
        int length = this.f5572q.length();
        f1.m[] mVarArr = new f1.m[length];
        boolean z8 = false;
        int i8 = 0;
        while (i8 < length) {
            int f = this.f5572q.f(i8);
            Uri uri = this.f5562e[f];
            V0.c cVar = this.f5563g;
            if (!cVar.c(uri)) {
                mVarArr[i8] = f1.m.f11045V;
                i7 = i8;
            } else {
                V0.i a7 = cVar.a(z8, uri);
                a7.getClass();
                long j8 = a7.f5843h - cVar.f5817i0;
                if (f != b5) {
                    z7 = true;
                } else {
                    z7 = z8;
                }
                i7 = i8;
                Pair c8 = c(kVar, z7, a7, j8, j);
                long longValue = ((Long) c8.first).longValue();
                int intValue = ((Integer) c8.second).intValue();
                int i9 = (int) (longValue - a7.f5845k);
                if (i9 >= 0) {
                    K k2 = a7.f5852r;
                    if (k2.size() >= i9) {
                        ArrayList arrayList = new ArrayList();
                        if (i9 < k2.size()) {
                            if (intValue != -1) {
                                V0.f fVar = (V0.f) k2.get(i9);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f5824h0.size()) {
                                    K k8 = fVar.f5824h0;
                                    arrayList.addAll(k8.subList(intValue, k8.size()));
                                }
                                i9++;
                            }
                            arrayList.addAll(k2.subList(i9, k2.size()));
                            intValue = 0;
                        }
                        if (a7.f5848n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            K k9 = a7.f5853s;
                            if (intValue < k9.size()) {
                                arrayList.addAll(k9.subList(intValue, k9.size()));
                            }
                        }
                        list = DesugarCollections.unmodifiableList(arrayList);
                        mVarArr[i7] = new f(list, j8);
                    }
                }
                I i10 = K.f98b;
                list = e0.f138e;
                mVarArr[i7] = new f(list, j8);
            }
            i8 = i7 + 1;
            z8 = false;
        }
        return mVarArr;
    }

    public final int b(k kVar) {
        K k2;
        if (kVar.f5587j0 == -1) {
            return 1;
        }
        V0.i a7 = this.f5563g.a(false, this.f5562e[this.f5564h.b(kVar.f11006d)]);
        a7.getClass();
        int i7 = (int) (kVar.f11044e0 - a7.f5845k);
        if (i7 < 0) {
            return 1;
        }
        K k8 = a7.f5852r;
        if (i7 < k8.size()) {
            k2 = ((V0.f) k8.get(i7)).f5824h0;
        } else {
            k2 = a7.f5853s;
        }
        int size = k2.size();
        int i8 = kVar.f5587j0;
        if (i8 >= size) {
            return 2;
        }
        V0.d dVar = (V0.d) k2.get(i8);
        if (dVar.f5819h0) {
            return 0;
        }
        if (x.a(Uri.parse(K0.a.x(a7.f5874a, dVar.f5828a)), kVar.f11004b.f3172a)) {
            return 1;
        }
        return 2;
    }

    public final Pair c(k kVar, boolean z7, V0.i iVar, long j, long j8) {
        K k2;
        long j9;
        boolean z8 = true;
        int i7 = -1;
        if (kVar != null && !z7) {
            boolean z9 = kVar.f5579C0;
            long j10 = kVar.f11044e0;
            int i8 = kVar.f5587j0;
            if (z9) {
                if (i8 == -1) {
                    j10 = kVar.a();
                }
                Long valueOf = Long.valueOf(j10);
                if (i8 != -1) {
                    i7 = i8 + 1;
                }
                return new Pair(valueOf, Integer.valueOf(i7));
            }
            return new Pair(Long.valueOf(j10), Integer.valueOf(i8));
        }
        long j11 = iVar.f5855u + j;
        if (kVar != null && !this.f5571p) {
            j8 = kVar.f11000X;
        }
        boolean z10 = iVar.f5849o;
        long j12 = iVar.f5845k;
        K k8 = iVar.f5852r;
        if (!z10 && j8 >= j11) {
            return new Pair(Long.valueOf(j12 + k8.size()), -1);
        }
        long j13 = j8 - j;
        Long valueOf2 = Long.valueOf(j13);
        int i9 = 0;
        if (this.f5563g.f5816h0 && kVar != null) {
            z8 = false;
        }
        int c8 = x.c(k8, valueOf2, z8);
        long j14 = c8 + j12;
        if (c8 >= 0) {
            V0.f fVar = (V0.f) k8.get(c8);
            int i10 = (j13 > (fVar.f5832e + fVar.f5830c) ? 1 : (j13 == (fVar.f5832e + fVar.f5830c) ? 0 : -1));
            K k9 = iVar.f5853s;
            if (i10 < 0) {
                k2 = fVar.f5824h0;
            } else {
                k2 = k9;
            }
            while (true) {
                if (i9 >= k2.size()) {
                    break;
                }
                V0.d dVar = (V0.d) k2.get(i9);
                if (j13 < dVar.f5832e + dVar.f5830c) {
                    if (dVar.f5818g0) {
                        if (k2 == k9) {
                            j9 = 1;
                        } else {
                            j9 = 0;
                        }
                        j14 += j9;
                        i7 = i9;
                    }
                } else {
                    i9++;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i7));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [U0.e, f1.e] */
    public final e d(Uri uri, int i7, boolean z7) {
        if (uri == null) {
            return null;
        }
        A4.c cVar = this.j;
        byte[] bArr = (byte[]) ((d) cVar.f218b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) cVar.f218b).put(uri, bArr);
            return null;
        }
        M0.l lVar = new M0.l(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        H0.r rVar = this.f[i7];
        int k2 = this.f5572q.k();
        Object o7 = this.f5572q.o();
        byte[] bArr3 = this.f5568m;
        ?? abstractC0983e = new AbstractC0983e(this.f5560c, lVar, 3, rVar, k2, o7, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = x.f;
        }
        abstractC0983e.f5548e0 = bArr3;
        return abstractC0983e;
    }
}
