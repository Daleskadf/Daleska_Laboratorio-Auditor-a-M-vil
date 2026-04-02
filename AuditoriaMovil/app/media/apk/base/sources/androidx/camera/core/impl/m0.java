package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 SESSION_ERROR_SURFACE_NEEDS_RESET;
    public static final m0 SESSION_ERROR_UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, androidx.camera.core.impl.m0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, androidx.camera.core.impl.m0] */
    static {
        ?? r22 = new Enum("SESSION_ERROR_SURFACE_NEEDS_RESET", 0);
        SESSION_ERROR_SURFACE_NEEDS_RESET = r22;
        ?? r32 = new Enum("SESSION_ERROR_UNKNOWN", 1);
        SESSION_ERROR_UNKNOWN = r32;
        $VALUES = new m0[]{r22, r32};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
