package R6;

import E6.m;
import G.i;
import K4.k;
import Q6.o;
import Q6.v;
import com.google.firebase.firestore.Z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.AbstractC1447h;
import m6.s;
import w6.p;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4784a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<f> H7;
        String str = o.f4480b;
        o s7 = Z.s("/", false);
        LinkedHashMap R7 = s.R(new l6.d(s7, new f(s7)));
        k kVar = new k(1);
        if (arrayList.size() <= 1) {
            H7 = AbstractC1447h.Y(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            j.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, kVar);
            }
            H7 = AbstractC1446g.H(array);
        }
        for (f fVar : H7) {
            if (((f) R7.put(fVar.f4794a, fVar)) == null) {
                while (true) {
                    o oVar = fVar.f4794a;
                    o c8 = oVar.c();
                    if (c8 != null) {
                        f fVar2 = (f) R7.get(c8);
                        if (fVar2 != null) {
                            fVar2.f.add(oVar);
                            break;
                        }
                        f fVar3 = new f(c8);
                        R7.put(c8, fVar3);
                        fVar3.f.add(oVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return R7;
    }

    public static final String b(int i7) {
        i.m(16);
        String num = Integer.toString(i7, 16);
        j.d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final f c(Q6.s sVar) {
        int d7;
        Long valueOf;
        int i7;
        long j;
        if (sVar.d() == 33639248) {
            sVar.o(4L);
            short j8 = sVar.j();
            int i8 = j8 & 65535;
            if ((j8 & 1) == 0) {
                int j9 = sVar.j() & 65535;
                short j10 = sVar.j();
                int i9 = j10 & 65535;
                short j11 = sVar.j();
                int i10 = j11 & 65535;
                if (i9 == -1) {
                    valueOf = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, j11 & 31, (i9 >> 11) & 31, (i9 >> 5) & 63, (j10 & 31) << 1);
                    valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l8 = valueOf;
                sVar.d();
                ?? obj = new Object();
                obj.f13795a = sVar.d() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f13795a = sVar.d() & 4294967295L;
                int j12 = sVar.j() & 65535;
                int j13 = sVar.j() & 65535;
                sVar.o(8L);
                ?? obj3 = new Object();
                obj3.f13795a = sVar.d() & 4294967295L;
                String m7 = sVar.m(sVar.j() & 65535);
                if (m.S(m7, (char) 0, false, 2) < 0) {
                    if (obj2.f13795a == 4294967295L) {
                        j = 8;
                        i7 = j9;
                    } else {
                        i7 = j9;
                        j = 0;
                    }
                    if (obj.f13795a == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.f13795a == 4294967295L) {
                        j += 8;
                    }
                    long j14 = j;
                    ?? obj4 = new Object();
                    d(sVar, j12, new g(obj4, j14, obj2, sVar, obj, obj3));
                    if (j14 > 0 && !obj4.f13793a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String m8 = sVar.m(j13);
                    String str = o.f4480b;
                    return new f(Z.s("/", false).d(m7), m.O(m7, "/", false), m8, obj.f13795a, obj2.f13795a, i7, l8, obj3.f13795a);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i8));
        }
        throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(d7));
    }

    public static final void d(Q6.s sVar, int i7, p pVar) {
        long j = i7;
        while (j != 0) {
            if (j >= 4) {
                int j8 = sVar.j() & 65535;
                long j9 = sVar.j() & 65535;
                long j10 = j - 4;
                if (j10 >= j9) {
                    sVar.n(j9);
                    Q6.e eVar = sVar.f4489b;
                    long j11 = eVar.f4462b;
                    pVar.invoke(Integer.valueOf(j8), Long.valueOf(j9));
                    long j12 = (eVar.f4462b + j9) - j11;
                    int i8 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    if (i8 >= 0) {
                        if (i8 > 0) {
                            eVar.r(j12);
                        }
                        j = j10 - j9;
                    } else {
                        throw new IOException(io.flutter.plugins.pathprovider.b.e(j8, "unsupported zip: too many bytes processed for "));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final int e(v vVar, int i7) {
        int i8;
        j.e(vVar, "<this>");
        int i9 = i7 + 1;
        int length = vVar.f4500e.length;
        int[] iArr = vVar.f;
        j.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 < i9) {
                    i11 = i8 + 1;
                } else if (i12 <= i9) {
                    break;
                } else {
                    i10 = i8 - 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        if (i8 < 0) {
            return ~i8;
        }
        return i8;
    }
}
