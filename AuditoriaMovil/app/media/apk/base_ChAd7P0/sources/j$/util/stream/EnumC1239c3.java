package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC1239c3 {
    public static final EnumC1239c3 DISTINCT;
    public static final EnumC1239c3 ORDERED;
    public static final EnumC1239c3 SHORT_CIRCUIT;
    public static final EnumC1239c3 SIZED;
    public static final EnumC1239c3 SORTED;
    static final int f;

    /* renamed from: g  reason: collision with root package name */
    static final int f13213g;

    /* renamed from: h  reason: collision with root package name */
    static final int f13214h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f13215i;
    private static final int j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f13216k;

    /* renamed from: l  reason: collision with root package name */
    static final int f13217l;

    /* renamed from: m  reason: collision with root package name */
    static final int f13218m;

    /* renamed from: n  reason: collision with root package name */
    static final int f13219n;

    /* renamed from: o  reason: collision with root package name */
    static final int f13220o;

    /* renamed from: p  reason: collision with root package name */
    static final int f13221p;

    /* renamed from: q  reason: collision with root package name */
    static final int f13222q;

    /* renamed from: r  reason: collision with root package name */
    static final int f13223r;

    /* renamed from: s  reason: collision with root package name */
    static final int f13224s;

    /* renamed from: t  reason: collision with root package name */
    static final int f13225t;

    /* renamed from: u  reason: collision with root package name */
    static final int f13226u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ EnumC1239c3[] f13227v;

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f13228a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13229b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13230c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13231d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13232e;

    public static EnumC1239c3 valueOf(String str) {
        return (EnumC1239c3) Enum.valueOf(EnumC1239c3.class, str);
    }

    public static EnumC1239c3[] values() {
        return (EnumC1239c3[]) f13227v.clone();
    }

    static {
        EnumC1234b3 enumC1234b3 = EnumC1234b3.SPLITERATOR;
        C1229a3 B7 = B(enumC1234b3);
        EnumC1234b3 enumC1234b32 = EnumC1234b3.STREAM;
        B7.a(enumC1234b32);
        EnumC1234b3 enumC1234b33 = EnumC1234b3.OP;
        B7.f13194a.put((EnumMap) enumC1234b33, (EnumC1234b3) 3);
        EnumC1239c3 enumC1239c3 = new EnumC1239c3("DISTINCT", 0, 0, B7);
        DISTINCT = enumC1239c3;
        C1229a3 B8 = B(enumC1234b3);
        B8.a(enumC1234b32);
        B8.f13194a.put((EnumMap) enumC1234b33, (EnumC1234b3) 3);
        EnumC1239c3 enumC1239c32 = new EnumC1239c3("SORTED", 1, 1, B8);
        SORTED = enumC1239c32;
        C1229a3 B9 = B(enumC1234b3);
        B9.a(enumC1234b32);
        EnumMap enumMap = B9.f13194a;
        enumMap.put((EnumMap) enumC1234b33, (EnumC1234b3) 3);
        EnumC1234b3 enumC1234b34 = EnumC1234b3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC1234b34, (EnumC1234b3) 2);
        EnumC1234b3 enumC1234b35 = EnumC1234b3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC1234b35, (EnumC1234b3) 2);
        EnumC1239c3 enumC1239c33 = new EnumC1239c3("ORDERED", 2, 2, B9);
        ORDERED = enumC1239c33;
        C1229a3 B10 = B(enumC1234b3);
        B10.a(enumC1234b32);
        B10.f13194a.put((EnumMap) enumC1234b33, (EnumC1234b3) 2);
        EnumC1239c3 enumC1239c34 = new EnumC1239c3("SIZED", 3, 3, B10);
        SIZED = enumC1239c34;
        C1229a3 B11 = B(enumC1234b33);
        B11.a(enumC1234b34);
        EnumC1239c3 enumC1239c35 = new EnumC1239c3("SHORT_CIRCUIT", 4, 12, B11);
        SHORT_CIRCUIT = enumC1239c35;
        f13227v = new EnumC1239c3[]{enumC1239c3, enumC1239c32, enumC1239c33, enumC1239c34, enumC1239c35};
        f = q(enumC1234b3);
        f13213g = q(enumC1234b32);
        f13214h = q(enumC1234b33);
        q(enumC1234b34);
        q(enumC1234b35);
        int i7 = 0;
        for (EnumC1239c3 enumC1239c36 : values()) {
            i7 |= enumC1239c36.f13232e;
        }
        f13215i = i7;
        int i8 = f13213g;
        j = i8;
        int i9 = i8 << 1;
        f13216k = i9;
        f13217l = i8 | i9;
        EnumC1239c3 enumC1239c37 = DISTINCT;
        f13218m = enumC1239c37.f13230c;
        f13219n = enumC1239c37.f13231d;
        EnumC1239c3 enumC1239c38 = SORTED;
        f13220o = enumC1239c38.f13230c;
        f13221p = enumC1239c38.f13231d;
        EnumC1239c3 enumC1239c39 = ORDERED;
        f13222q = enumC1239c39.f13230c;
        f13223r = enumC1239c39.f13231d;
        EnumC1239c3 enumC1239c310 = SIZED;
        f13224s = enumC1239c310.f13230c;
        f13225t = enumC1239c310.f13231d;
        f13226u = SHORT_CIRCUIT.f13230c;
    }

    private static C1229a3 B(EnumC1234b3 enumC1234b3) {
        C1229a3 c1229a3 = new C1229a3(new EnumMap(EnumC1234b3.class));
        c1229a3.a(enumC1234b3);
        return c1229a3;
    }

    private EnumC1239c3(String str, int i7, int i8, C1229a3 c1229a3) {
        EnumC1234b3[] values = EnumC1234b3.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            EnumMap enumMap = c1229a3.f13194a;
            if (i9 < length) {
                Map.EL.b(enumMap, values[i9], 0);
                i9++;
            } else {
                this.f13228a = enumMap;
                int i10 = i8 * 2;
                this.f13229b = i10;
                this.f13230c = 1 << i10;
                this.f13231d = 2 << i10;
                this.f13232e = 3 << i10;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(int i7) {
        return (i7 & this.f13232e) == this.f13230c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i7) {
        int i8 = this.f13232e;
        return (i7 & i8) == i8;
    }

    private static int q(EnumC1234b3 enumC1234b3) {
        EnumC1239c3[] values;
        int i7 = 0;
        for (EnumC1239c3 enumC1239c3 : values()) {
            i7 |= ((Integer) enumC1239c3.f13228a.get(enumC1234b3)).intValue() << enumC1239c3.f13229b;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i7, int i8) {
        int i9;
        if (i7 == 0) {
            i9 = f13215i;
        } else {
            i9 = ~(((j & i7) << 1) | i7 | ((f13216k & i7) >> 1));
        }
        return i7 | (i8 & i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i7) {
        return i7 & ((~i7) >> 1) & j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i7 = characteristics & 4;
        int i8 = f;
        return (i7 == 0 || spliterator.getComparator() == null) ? characteristics & i8 : characteristics & i8 & (-5);
    }
}
