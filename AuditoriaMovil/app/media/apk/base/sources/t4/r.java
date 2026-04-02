package t4;

import H4.EnumC0153c0;
import H4.EnumC0169k0;
import H4.G0;
import H4.I0;
import H4.K0;
import H4.P0;
import H4.Q;
import H4.V0;
import H4.g1;
import H4.s1;
import n4.EnumC1518d;
import n4.EnumC1528n;
import p4.EnumC1670A;
/* loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15836a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f15837b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f15838c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int[] f15839d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int[] f15840e;
    public static final /* synthetic */ int[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int[] f15841g;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int[] f15842h;

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int[] f15843i;
    public static final /* synthetic */ int[] j;

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int[] f15844k;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int[] f15845l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int[] f15846m;

    static {
        int[] iArr = new int[EnumC0153c0.values().length];
        f15846m = iArr;
        try {
            iArr[EnumC0153c0.TARGET_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15846m[EnumC0153c0.DOCUMENT_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15846m[EnumC0153c0.DOCUMENT_DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15846m[EnumC0153c0.DOCUMENT_REMOVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15846m[EnumC0153c0.FILTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f15846m[EnumC0153c0.RESPONSETYPE_NOT_SET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[g1.values().length];
        f15845l = iArr2;
        try {
            iArr2[g1.NO_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f15845l[g1.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f15845l[g1.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f15845l[g1.CURRENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f15845l[g1.RESET.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f15845l[g1.UNRECOGNIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[I0.values().length];
        f15844k = iArr3;
        try {
            iArr3[I0.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f15844k[I0.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr4 = new int[K0.values().length];
        j = iArr4;
        try {
            iArr4[K0.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            j[K0.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            j[K0.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            j[K0.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            j[K0.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            j[K0.GREATER_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            j[K0.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            j[K0.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            j[K0.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            j[K0.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr5 = new int[EnumC1528n.values().length];
        f15843i = iArr5;
        try {
            iArr5[EnumC1528n.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f15843i[EnumC1528n.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f15843i[EnumC1528n.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            f15843i[EnumC1528n.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            f15843i[EnumC1528n.GREATER_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            f15843i[EnumC1528n.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            f15843i[EnumC1528n.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            f15843i[EnumC1528n.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            f15843i[EnumC1528n.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            f15843i[EnumC1528n.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        int[] iArr6 = new int[V0.values().length];
        f15842h = iArr6;
        try {
            iArr6[V0.IS_NAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            f15842h[V0.IS_NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            f15842h[V0.IS_NOT_NAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            f15842h[V0.IS_NOT_NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused38) {
        }
        int[] iArr7 = new int[P0.values().length];
        f15841g = iArr7;
        try {
            iArr7[P0.COMPOSITE_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            f15841g[P0.FIELD_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            f15841g[P0.UNARY_FILTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused41) {
        }
        int[] iArr8 = new int[G0.values().length];
        f = iArr8;
        try {
            iArr8[G0.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            f[G0.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        int[] iArr9 = new int[EnumC1518d.values().length];
        f15840e = iArr9;
        try {
            iArr9[EnumC1518d.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            f15840e[EnumC1518d.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused45) {
        }
        int[] iArr10 = new int[EnumC1670A.values().length];
        f15839d = iArr10;
        try {
            iArr10[EnumC1670A.LISTEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            f15839d[EnumC1670A.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            f15839d[EnumC1670A.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            f15839d[EnumC1670A.LIMBO_RESOLUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused49) {
        }
        int[] iArr11 = new int[Q.values().length];
        f15838c = iArr11;
        try {
            iArr11[Q.SET_TO_SERVER_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            f15838c[Q.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            f15838c[Q.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            f15838c[Q.INCREMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused53) {
        }
        int[] iArr12 = new int[EnumC0169k0.values().length];
        f15837b = iArr12;
        try {
            iArr12[EnumC0169k0.UPDATE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            f15837b[EnumC0169k0.EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            f15837b[EnumC0169k0.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        int[] iArr13 = new int[s1.values().length];
        f15836a = iArr13;
        try {
            iArr13[s1.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            f15836a[s1.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            f15836a[s1.VERIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused59) {
        }
    }
}
