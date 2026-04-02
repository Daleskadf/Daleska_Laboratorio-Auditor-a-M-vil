package o6;

import m5.d;
import q6.InterfaceC1714a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1565a {
    private static final /* synthetic */ InterfaceC1714a $ENTRIES;
    private static final /* synthetic */ EnumC1565a[] $VALUES;
    public static final EnumC1565a COROUTINE_SUSPENDED;
    public static final EnumC1565a RESUMED;
    public static final EnumC1565a UNDECIDED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, o6.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, o6.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, o6.a] */
    static {
        ?? r32 = new Enum("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = r32;
        ?? r42 = new Enum("UNDECIDED", 1);
        UNDECIDED = r42;
        ?? r52 = new Enum("RESUMED", 2);
        RESUMED = r52;
        EnumC1565a[] enumC1565aArr = {r32, r42, r52};
        $VALUES = enumC1565aArr;
        $ENTRIES = d.f(enumC1565aArr);
    }

    public static EnumC1565a valueOf(String str) {
        return (EnumC1565a) Enum.valueOf(EnumC1565a.class, str);
    }

    public static EnumC1565a[] values() {
        return (EnumC1565a[]) $VALUES.clone();
    }
}
