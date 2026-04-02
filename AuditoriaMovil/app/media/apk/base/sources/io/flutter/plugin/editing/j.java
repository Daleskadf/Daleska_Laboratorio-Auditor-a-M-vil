package io.flutter.plugin.editing;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j FRAMEWORK_CLIENT;
    public static final j NO_TARGET;
    public static final j PHYSICAL_DISPLAY_PLATFORM_VIEW;
    public static final j VIRTUAL_DISPLAY_PLATFORM_VIEW;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, io.flutter.plugin.editing.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.flutter.plugin.editing.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, io.flutter.plugin.editing.j] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, io.flutter.plugin.editing.j] */
    static {
        ?? r42 = new Enum("NO_TARGET", 0);
        NO_TARGET = r42;
        ?? r52 = new Enum("FRAMEWORK_CLIENT", 1);
        FRAMEWORK_CLIENT = r52;
        ?? r62 = new Enum("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2);
        VIRTUAL_DISPLAY_PLATFORM_VIEW = r62;
        ?? r7 = new Enum("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
        PHYSICAL_DISPLAY_PLATFORM_VIEW = r7;
        $VALUES = new j[]{r42, r52, r62, r7};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
