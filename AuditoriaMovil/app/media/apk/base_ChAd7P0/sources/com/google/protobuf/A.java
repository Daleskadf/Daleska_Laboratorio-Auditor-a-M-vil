package com.google.protobuf;

import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class A {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f9981c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final G0 f9982a = new G0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f9983b;

    static {
        new A(0);
    }

    public A() {
    }

    public static void b(AbstractC0865t abstractC0865t, g1 g1Var, int i7, Object obj) {
        if (g1Var == g1.GROUP) {
            abstractC0865t.K0(i7, 3);
            ((AbstractC0828a) obj).e(abstractC0865t);
            abstractC0865t.K0(i7, 4);
            return;
        }
        abstractC0865t.K0(i7, g1Var.b());
        switch (AbstractC0877z.f10147b[g1Var.ordinal()]) {
            case 1:
                abstractC0865t.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                abstractC0865t.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 3:
                abstractC0865t.O0(((Long) obj).longValue());
                return;
            case 4:
                abstractC0865t.O0(((Long) obj).longValue());
                return;
            case 5:
                abstractC0865t.F0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC0865t.D0(((Long) obj).longValue());
                return;
            case 7:
                abstractC0865t.B0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC0865t.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 9:
                ((AbstractC0828a) obj).e(abstractC0865t);
                return;
            case 10:
                abstractC0865t.H0((AbstractC0828a) obj);
                return;
            case 11:
                if (obj instanceof AbstractC0852m) {
                    abstractC0865t.z0((AbstractC0852m) obj);
                    return;
                } else {
                    abstractC0865t.J0((String) obj);
                    return;
                }
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (obj instanceof AbstractC0852m) {
                    abstractC0865t.z0((AbstractC0852m) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                abstractC0865t.x0(bArr, bArr.length);
                return;
            case 13:
                abstractC0865t.M0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0865t.B0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0865t.D0(((Long) obj).longValue());
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int intValue = ((Integer) obj).intValue();
                abstractC0865t.M0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC0865t.O0((longValue >> 63) ^ (longValue << 1));
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (obj instanceof Q) {
                    abstractC0865t.F0(((Q) obj).a());
                    return;
                } else {
                    abstractC0865t.F0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final void a() {
        G0 g02;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f9983b) {
            return;
        }
        int i7 = 0;
        while (true) {
            g02 = this.f9982a;
            if (i7 >= g02.f10009b.size()) {
                break;
            }
            Map.Entry c8 = g02.c(i7);
            if (c8.getValue() instanceof J) {
                J j = (J) c8.getValue();
                j.getClass();
                C0878z0 c0878z0 = C0878z0.f10148c;
                c0878z0.getClass();
                c0878z0.a(j.getClass()).b(j);
                j.o();
            }
            i7++;
        }
        if (!g02.f10011d) {
            if (g02.f10009b.size() <= 0) {
                Iterator it = g02.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                g02.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!g02.f10011d) {
            if (g02.f10010c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(g02.f10010c);
            }
            g02.f10010c = unmodifiableMap;
            if (g02.f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(g02.f);
            }
            g02.f = unmodifiableMap2;
            g02.f10011d = true;
        }
        this.f9983b = true;
    }

    public final Object clone() {
        A a7 = new A();
        G0 g02 = this.f9982a;
        if (g02.f10009b.size() <= 0) {
            Iterator it = g02.d().iterator();
            if (!it.hasNext()) {
                return a7;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c8 = g02.c(0);
        if (c8.getKey() == null) {
            c8.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        return this.f9982a.equals(((A) obj).f9982a);
    }

    public final int hashCode() {
        return this.f9982a.hashCode();
    }

    public A(int i7) {
        a();
        a();
    }
}
