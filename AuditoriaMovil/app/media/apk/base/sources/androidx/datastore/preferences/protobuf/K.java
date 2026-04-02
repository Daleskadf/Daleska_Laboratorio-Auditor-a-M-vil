package androidx.datastore.preferences.protobuf;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import s0.C1760k;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final J f7759a;

    public K(v0 v0Var, v0 v0Var2, C1760k c1760k) {
        this.f7759a = new J(v0Var, v0Var2, c1760k);
    }

    public static int a(J j, Object obj, Object obj2) {
        int k02;
        int a7;
        int i02;
        int a8;
        int i03;
        int i7 = 1;
        int i8 = C0540q.f7862c;
        int g02 = C0534k.g0(1);
        v0 v0Var = v0.GROUP;
        v0 v0Var2 = j.f7756a;
        if (v0Var2 == v0Var) {
            g02 *= 2;
        }
        int[] iArr = AbstractC0539p.f7861b;
        switch (iArr[v0Var2.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                k02 = 8;
                break;
            case 2:
                ((Float) obj).getClass();
                k02 = 4;
                break;
            case 3:
                k02 = C0534k.k0(((Long) obj).longValue());
                break;
            case 4:
                k02 = C0534k.k0(((Long) obj).longValue());
                break;
            case 5:
                k02 = C0534k.k0(((Integer) obj).intValue());
                break;
            case 6:
                ((Long) obj).getClass();
                k02 = 8;
                break;
            case 7:
                ((Integer) obj).getClass();
                k02 = 4;
                break;
            case 8:
                ((Boolean) obj).getClass();
                k02 = 1;
                break;
            case 9:
                k02 = ((AbstractC0547y) ((AbstractC0524a) obj)).a(null);
                break;
            case 10:
                a7 = ((AbstractC0547y) ((AbstractC0524a) obj)).a(null);
                i02 = C0534k.i0(a7);
                k02 = a7 + i02;
                break;
            case 11:
                if (obj instanceof C0530g) {
                    a7 = ((C0530g) obj).size();
                    i02 = C0534k.i0(a7);
                    k02 = a7 + i02;
                    break;
                } else {
                    k02 = C0534k.f0((String) obj);
                    break;
                }
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj instanceof C0530g) {
                    a7 = ((C0530g) obj).size();
                    i02 = C0534k.i0(a7);
                } else {
                    a7 = ((byte[]) obj).length;
                    i02 = C0534k.i0(a7);
                }
                k02 = a7 + i02;
                break;
            case 13:
                k02 = C0534k.i0(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                k02 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                k02 = 8;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue = ((Integer) obj).intValue();
                k02 = C0534k.i0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                k02 = C0534k.k0((longValue << 1) ^ (longValue >> 63));
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                k02 = C0534k.k0(((Integer) obj).intValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int i9 = k02 + g02;
        int g03 = C0534k.g0(2);
        v0 v0Var3 = j.f7757b;
        if (v0Var3 == v0Var) {
            g03 *= 2;
        }
        switch (iArr[v0Var3.ordinal()]) {
            case 1:
                ((Double) obj2).getClass();
                i7 = 8;
                break;
            case 2:
                ((Float) obj2).getClass();
                i7 = 4;
                break;
            case 3:
                i7 = C0534k.k0(((Long) obj2).longValue());
                break;
            case 4:
                i7 = C0534k.k0(((Long) obj2).longValue());
                break;
            case 5:
                i7 = C0534k.k0(((Integer) obj2).intValue());
                break;
            case 6:
                ((Long) obj2).getClass();
                i7 = 8;
                break;
            case 7:
                ((Integer) obj2).getClass();
                i7 = 4;
                break;
            case 8:
                ((Boolean) obj2).getClass();
                break;
            case 9:
                i7 = ((AbstractC0547y) ((AbstractC0524a) obj2)).a(null);
                break;
            case 10:
                a8 = ((AbstractC0547y) ((AbstractC0524a) obj2)).a(null);
                i03 = C0534k.i0(a8);
                i7 = i03 + a8;
                break;
            case 11:
                if (obj2 instanceof C0530g) {
                    a8 = ((C0530g) obj2).size();
                    i03 = C0534k.i0(a8);
                    i7 = i03 + a8;
                    break;
                } else {
                    i7 = C0534k.f0((String) obj2);
                    break;
                }
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj2 instanceof C0530g) {
                    a8 = ((C0530g) obj2).size();
                    i03 = C0534k.i0(a8);
                } else {
                    a8 = ((byte[]) obj2).length;
                    i03 = C0534k.i0(a8);
                }
                i7 = i03 + a8;
                break;
            case 13:
                i7 = C0534k.i0(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                i7 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                i7 = 8;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue2 = ((Integer) obj2).intValue();
                i7 = C0534k.i0((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i7 = C0534k.k0((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                i7 = C0534k.k0(((Integer) obj2).intValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i7 + g03 + i9;
    }
}
