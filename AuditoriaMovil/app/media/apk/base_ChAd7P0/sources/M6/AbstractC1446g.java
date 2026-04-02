package m6;

import H4.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: m6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1446g extends F.f {
    public static List H(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }

    public static boolean I(Object[] objArr, Object obj) {
        int i7;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    break;
                }
                i7++;
            }
            i7 = -1;
        } else {
            int length2 = objArr.length;
            for (int i8 = 0; i8 < length2; i8++) {
                if (obj.equals(objArr[i8])) {
                    i7 = i8;
                    break;
                }
            }
            i7 = -1;
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    public static void J(int i7, int i8, int i9, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(iArr, i8, destination, i7, i9 - i8);
    }

    public static void K(byte[] bArr, int i7, byte[] destination, int i8, int i9) {
        kotlin.jvm.internal.j.e(bArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(bArr, i8, destination, i7, i9 - i8);
    }

    public static void L(Object[] objArr, int i7, Object[] destination, int i8, int i9) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i8, destination, i7, i9 - i8);
    }

    public static /* synthetic */ void M(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        L(objArr, 0, objArr2, i7, i8);
    }

    public static final void N(Object[] objArr, int i7, int i8) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static ArrayList O(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String P(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) ",");
            }
            W.a(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static List Q(long[] jArr) {
        kotlin.jvm.internal.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return G.i.A(Long.valueOf(jArr[0]));
        }
        return p.f14074a;
    }

    public static List R(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C1444e(objArr, false));
            }
            return G.i.A(objArr[0]);
        }
        return p.f14074a;
    }
}
