package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0513o {
    private static final /* synthetic */ EnumC0513o[] $VALUES;
    public static final EnumC0513o INACTIVE;
    public static final EnumC0513o LOCKED_FOCUSED;
    public static final EnumC0513o LOCKED_NOT_FOCUSED;
    public static final EnumC0513o PASSIVE_FOCUSED;
    public static final EnumC0513o PASSIVE_NOT_FOCUSED;
    public static final EnumC0513o SCANNING;
    public static final EnumC0513o UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.core.impl.o, java.lang.Enum] */
    static {
        ?? r7 = new Enum("UNKNOWN", 0);
        UNKNOWN = r7;
        ?? r8 = new Enum("INACTIVE", 1);
        INACTIVE = r8;
        ?? r9 = new Enum("SCANNING", 2);
        SCANNING = r9;
        ?? r10 = new Enum("PASSIVE_FOCUSED", 3);
        PASSIVE_FOCUSED = r10;
        ?? r11 = new Enum("PASSIVE_NOT_FOCUSED", 4);
        PASSIVE_NOT_FOCUSED = r11;
        ?? r12 = new Enum("LOCKED_FOCUSED", 5);
        LOCKED_FOCUSED = r12;
        ?? r13 = new Enum("LOCKED_NOT_FOCUSED", 6);
        LOCKED_NOT_FOCUSED = r13;
        $VALUES = new EnumC0513o[]{r7, r8, r9, r10, r11, r12, r13};
    }

    public static EnumC0513o valueOf(String str) {
        return (EnumC0513o) Enum.valueOf(EnumC0513o.class, str);
    }

    public static EnumC0513o[] values() {
        return (EnumC0513o[]) $VALUES.clone();
    }
}
