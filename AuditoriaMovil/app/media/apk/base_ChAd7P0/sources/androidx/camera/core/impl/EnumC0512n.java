package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0512n {
    private static final /* synthetic */ EnumC0512n[] $VALUES;
    public static final EnumC0512n CONVERGED;
    public static final EnumC0512n FLASH_REQUIRED;
    public static final EnumC0512n INACTIVE;
    public static final EnumC0512n LOCKED;
    public static final EnumC0512n SEARCHING;
    public static final EnumC0512n UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.n] */
    static {
        ?? r62 = new Enum("UNKNOWN", 0);
        UNKNOWN = r62;
        ?? r7 = new Enum("INACTIVE", 1);
        INACTIVE = r7;
        ?? r8 = new Enum("SEARCHING", 2);
        SEARCHING = r8;
        ?? r9 = new Enum("FLASH_REQUIRED", 3);
        FLASH_REQUIRED = r9;
        ?? r10 = new Enum("CONVERGED", 4);
        CONVERGED = r10;
        ?? r11 = new Enum("LOCKED", 5);
        LOCKED = r11;
        $VALUES = new EnumC0512n[]{r62, r7, r8, r9, r10, r11};
    }

    public static EnumC0512n valueOf(String str) {
        return (EnumC0512n) Enum.valueOf(EnumC0512n.class, str);
    }

    public static EnumC0512n[] values() {
        return (EnumC0512n[]) $VALUES.clone();
    }
}
