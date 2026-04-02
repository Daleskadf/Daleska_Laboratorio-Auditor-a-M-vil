package com.google.protobuf;

import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* renamed from: com.google.protobuf.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849k0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0847j0 f10080a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10081b;

    public C0849k0(g1 g1Var, g1 g1Var2, Object obj) {
        this.f10080a = new C0847j0(g1Var, g1Var2, obj);
        this.f10081b = obj;
    }

    public static int a(C0847j0 c0847j0, Object obj, Object obj2) {
        int t02;
        int c8;
        int r02;
        int c9;
        int r03;
        int i7 = 1;
        int i8 = A.f9981c;
        int p02 = AbstractC0865t.p0(1);
        g1 g1Var = g1.GROUP;
        g1 g1Var2 = c0847j0.f10076a;
        if (g1Var2 == g1Var) {
            p02 *= 2;
        }
        int[] iArr = AbstractC0877z.f10147b;
        switch (iArr[g1Var2.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                t02 = 8;
                break;
            case 2:
                ((Float) obj).getClass();
                t02 = 4;
                break;
            case 3:
                t02 = AbstractC0865t.t0(((Long) obj).longValue());
                break;
            case 4:
                t02 = AbstractC0865t.t0(((Long) obj).longValue());
                break;
            case 5:
                t02 = AbstractC0865t.h0(((Integer) obj).intValue());
                break;
            case 6:
                ((Long) obj).getClass();
                t02 = 8;
                break;
            case 7:
                ((Integer) obj).getClass();
                t02 = 4;
                break;
            case 8:
                ((Boolean) obj).getClass();
                t02 = 1;
                break;
            case 9:
                t02 = ((J) ((AbstractC0828a) obj)).c(null);
                break;
            case 10:
                c8 = ((J) ((AbstractC0828a) obj)).c(null);
                r02 = AbstractC0865t.r0(c8);
                t02 = c8 + r02;
                break;
            case 11:
                if (obj instanceof AbstractC0852m) {
                    t02 = AbstractC0865t.Z((AbstractC0852m) obj);
                    break;
                } else {
                    t02 = AbstractC0865t.o0((String) obj);
                    break;
                }
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj instanceof AbstractC0852m) {
                    t02 = AbstractC0865t.Z((AbstractC0852m) obj);
                    break;
                } else {
                    c8 = ((byte[]) obj).length;
                    r02 = AbstractC0865t.r0(c8);
                    t02 = c8 + r02;
                    break;
                }
            case 13:
                t02 = AbstractC0865t.r0(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                t02 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                t02 = 8;
                break;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue = ((Integer) obj).intValue();
                t02 = AbstractC0865t.r0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                t02 = AbstractC0865t.t0((longValue << 1) ^ (longValue >> 63));
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (obj instanceof Q) {
                    t02 = AbstractC0865t.h0(((Q) obj).a());
                    break;
                } else {
                    t02 = AbstractC0865t.h0(((Integer) obj).intValue());
                    break;
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int i9 = t02 + p02;
        int p03 = AbstractC0865t.p0(2);
        g1 g1Var3 = c0847j0.f10077b;
        if (g1Var3 == g1Var) {
            p03 *= 2;
        }
        switch (iArr[g1Var3.ordinal()]) {
            case 1:
                ((Double) obj2).getClass();
                i7 = 8;
                break;
            case 2:
                ((Float) obj2).getClass();
                i7 = 4;
                break;
            case 3:
                i7 = AbstractC0865t.t0(((Long) obj2).longValue());
                break;
            case 4:
                i7 = AbstractC0865t.t0(((Long) obj2).longValue());
                break;
            case 5:
                i7 = AbstractC0865t.h0(((Integer) obj2).intValue());
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
                i7 = ((J) ((AbstractC0828a) obj2)).c(null);
                break;
            case 10:
                c9 = ((J) ((AbstractC0828a) obj2)).c(null);
                r03 = AbstractC0865t.r0(c9);
                i7 = r03 + c9;
                break;
            case 11:
                if (obj2 instanceof AbstractC0852m) {
                    i7 = AbstractC0865t.Z((AbstractC0852m) obj2);
                    break;
                } else {
                    i7 = AbstractC0865t.o0((String) obj2);
                    break;
                }
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj2 instanceof AbstractC0852m) {
                    i7 = AbstractC0865t.Z((AbstractC0852m) obj2);
                    break;
                } else {
                    c9 = ((byte[]) obj2).length;
                    r03 = AbstractC0865t.r0(c9);
                    i7 = r03 + c9;
                    break;
                }
            case 13:
                i7 = AbstractC0865t.r0(((Integer) obj2).intValue());
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
                i7 = AbstractC0865t.r0((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i7 = AbstractC0865t.t0((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (obj2 instanceof Q) {
                    i7 = AbstractC0865t.h0(((Q) obj2).a());
                    break;
                } else {
                    i7 = AbstractC0865t.h0(((Integer) obj2).intValue());
                    break;
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i7 + p03 + i9;
    }
}
