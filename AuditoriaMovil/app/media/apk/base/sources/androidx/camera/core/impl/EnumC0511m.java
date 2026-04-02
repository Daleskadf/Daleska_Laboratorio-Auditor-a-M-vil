package androidx.camera.core.impl;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0511m {
    private static final /* synthetic */ EnumC0511m[] $VALUES;
    public static final EnumC0511m ERROR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    static {
        ?? r12 = new Enum("ERROR", 0);
        ERROR = r12;
        $VALUES = new EnumC0511m[]{r12};
    }

    public static EnumC0511m valueOf(String str) {
        return (EnumC0511m) Enum.valueOf(EnumC0511m.class, str);
    }

    public static EnumC0511m[] values() {
        return (EnumC0511m[]) $VALUES.clone();
    }
}
