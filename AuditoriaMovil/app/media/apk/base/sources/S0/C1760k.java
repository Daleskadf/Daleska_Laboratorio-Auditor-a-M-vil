package s0;

import androidx.datastore.preferences.protobuf.AbstractC0544v;
import androidx.datastore.preferences.protobuf.AbstractC0547y;
import androidx.datastore.preferences.protobuf.C0530g;
import androidx.datastore.preferences.protobuf.EnumC0546x;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.a0;
import org.apache.tika.utils.StringUtils;
/* renamed from: s0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1760k extends AbstractC0547y {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C1760k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile V PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C1760k c1760k = new C1760k();
        DEFAULT_INSTANCE = c1760k;
        AbstractC0547y.l(C1760k.class, c1760k);
    }

    public static C1758i F() {
        return (C1758i) ((AbstractC0544v) DEFAULT_INSTANCE.e(EnumC0546x.NEW_BUILDER));
    }

    public static void n(C1760k c1760k, long j) {
        c1760k.valueCase_ = 4;
        c1760k.value_ = Long.valueOf(j);
    }

    public static void o(C1760k c1760k, String str) {
        c1760k.getClass();
        str.getClass();
        c1760k.valueCase_ = 5;
        c1760k.value_ = str;
    }

    public static void p(C1760k c1760k, C1757h c1757h) {
        c1760k.getClass();
        c1760k.value_ = c1757h;
        c1760k.valueCase_ = 6;
    }

    public static void q(C1760k c1760k, double d7) {
        c1760k.valueCase_ = 7;
        c1760k.value_ = Double.valueOf(d7);
    }

    public static void r(C1760k c1760k, C0530g c0530g) {
        c1760k.getClass();
        c1760k.valueCase_ = 8;
        c1760k.value_ = c0530g;
    }

    public static void s(C1760k c1760k, boolean z7) {
        c1760k.valueCase_ = 1;
        c1760k.value_ = Boolean.valueOf(z7);
    }

    public static void t(C1760k c1760k, float f) {
        c1760k.valueCase_ = 2;
        c1760k.value_ = Float.valueOf(f);
    }

    public static void u(C1760k c1760k, int i7) {
        c1760k.valueCase_ = 3;
        c1760k.value_ = Integer.valueOf(i7);
    }

    public static C1760k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return StringUtils.EMPTY;
    }

    public final C1757h D() {
        if (this.valueCase_ == 6) {
            return (C1757h) this.value_;
        }
        return C1757h.o();
    }

    public final EnumC1759j E() {
        switch (this.valueCase_) {
            case 0:
                return EnumC1759j.VALUE_NOT_SET;
            case 1:
                return EnumC1759j.BOOLEAN;
            case 2:
                return EnumC1759j.FLOAT;
            case 3:
                return EnumC1759j.INTEGER;
            case 4:
                return EnumC1759j.LONG;
            case 5:
                return EnumC1759j.STRING;
            case 6:
                return EnumC1759j.STRING_SET;
            case 7:
                return EnumC1759j.DOUBLE;
            case 8:
                return EnumC1759j.BYTES;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, androidx.datastore.preferences.protobuf.V] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0547y
    public final Object e(EnumC0546x enumC0546x) {
        switch (AbstractC1752c.f15547a[enumC0546x.ordinal()]) {
            case 1:
                return new C1760k();
            case 2:
                return new AbstractC0544v(DEFAULT_INSTANCE);
            case 3:
                return new a0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C1757h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                V v6 = PARSER;
                V v7 = v6;
                if (v6 == null) {
                    synchronized (C1760k.class) {
                        try {
                            V v8 = PARSER;
                            V v9 = v8;
                            if (v8 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                v9 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return v7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0530g w() {
        if (this.valueCase_ == 8) {
            return (C0530g) this.value_;
        }
        return C0530g.f7818c;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
