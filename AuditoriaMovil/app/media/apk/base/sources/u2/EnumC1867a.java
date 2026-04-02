package u2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1867a {
    private static final /* synthetic */ EnumC1867a[] $VALUES;
    public static final EnumC1867a always;
    public static final EnumC1867a denied;
    public static final EnumC1867a deniedForever;
    public static final EnumC1867a whileInUse;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, u2.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, u2.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, u2.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, u2.a] */
    static {
        ?? r42 = new Enum("denied", 0);
        denied = r42;
        ?? r52 = new Enum("deniedForever", 1);
        deniedForever = r52;
        ?? r62 = new Enum("whileInUse", 2);
        whileInUse = r62;
        ?? r7 = new Enum("always", 3);
        always = r7;
        $VALUES = new EnumC1867a[]{r42, r52, r62, r7};
    }

    public static EnumC1867a valueOf(String str) {
        return (EnumC1867a) Enum.valueOf(EnumC1867a.class, str);
    }

    public static EnumC1867a[] values() {
        return (EnumC1867a[]) $VALUES.clone();
    }
}
