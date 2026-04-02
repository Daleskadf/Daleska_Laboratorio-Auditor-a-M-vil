package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0514p {
    private static final /* synthetic */ EnumC0514p[] $VALUES;
    public static final EnumC0514p CONVERGED;
    public static final EnumC0514p INACTIVE;
    public static final EnumC0514p LOCKED;
    public static final EnumC0514p METERING;
    public static final EnumC0514p UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.core.impl.p, java.lang.Enum] */
    static {
        ?? r52 = new Enum("UNKNOWN", 0);
        UNKNOWN = r52;
        ?? r62 = new Enum("INACTIVE", 1);
        INACTIVE = r62;
        ?? r7 = new Enum("METERING", 2);
        METERING = r7;
        ?? r8 = new Enum("CONVERGED", 3);
        CONVERGED = r8;
        ?? r9 = new Enum("LOCKED", 4);
        LOCKED = r9;
        $VALUES = new EnumC0514p[]{r52, r62, r7, r8, r9};
    }

    public static EnumC0514p valueOf(String str) {
        return (EnumC0514p) Enum.valueOf(EnumC0514p.class, str);
    }

    public static EnumC0514p[] values() {
        return (EnumC0514p[]) $VALUES.clone();
    }
}
