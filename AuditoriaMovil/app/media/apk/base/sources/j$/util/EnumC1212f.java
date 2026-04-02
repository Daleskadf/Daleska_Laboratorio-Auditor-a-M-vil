package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1212f implements Comparator, InterfaceC1211e {
    public static final EnumC1212f INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC1212f[] f12951a;

    public static EnumC1212f valueOf(String str) {
        return (EnumC1212f) Enum.valueOf(EnumC1212f.class, str);
    }

    public static EnumC1212f[] values() {
        return (EnumC1212f[]) f12951a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.util.f] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        INSTANCE = r12;
        f12951a = new EnumC1212f[]{r12};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C1208c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return AbstractC1210d.s(this, new C1208c(comparator, function, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return AbstractC1210d.s(this, new C1207b(2, function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return AbstractC1210d.s(this, new C1207b(0, toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return AbstractC1210d.s(this, new C1207b(3, toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC1210d.s(this, new C1207b(1, toDoubleFunction));
    }
}
