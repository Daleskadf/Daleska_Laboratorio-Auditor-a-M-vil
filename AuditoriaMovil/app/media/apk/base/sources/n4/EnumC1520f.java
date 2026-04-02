package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1520f {
    private static final /* synthetic */ EnumC1520f[] $VALUES;
    public static final EnumC1520f ADDED;
    public static final EnumC1520f METADATA;
    public static final EnumC1520f MODIFIED;
    public static final EnumC1520f REMOVED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, n4.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n4.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, n4.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, n4.f] */
    static {
        ?? r42 = new Enum("REMOVED", 0);
        REMOVED = r42;
        ?? r52 = new Enum("ADDED", 1);
        ADDED = r52;
        ?? r62 = new Enum("MODIFIED", 2);
        MODIFIED = r62;
        ?? r7 = new Enum("METADATA", 3);
        METADATA = r7;
        $VALUES = new EnumC1520f[]{r42, r52, r62, r7};
    }

    public static EnumC1520f valueOf(String str) {
        return (EnumC1520f) Enum.valueOf(EnumC1520f.class, str);
    }

    public static EnumC1520f[] values() {
        return (EnumC1520f[]) $VALUES.clone();
    }
}
