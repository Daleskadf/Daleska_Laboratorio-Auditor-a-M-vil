package t4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t4.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1816D {
    private static final /* synthetic */ EnumC1816D[] $VALUES;
    public static final EnumC1816D Added;
    public static final EnumC1816D Current;
    public static final EnumC1816D NoChange;
    public static final EnumC1816D Removed;
    public static final EnumC1816D Reset;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [t4.D, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [t4.D, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [t4.D, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [t4.D, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [t4.D, java.lang.Enum] */
    static {
        ?? r52 = new Enum("NoChange", 0);
        NoChange = r52;
        ?? r62 = new Enum("Added", 1);
        Added = r62;
        ?? r7 = new Enum("Removed", 2);
        Removed = r7;
        ?? r8 = new Enum("Current", 3);
        Current = r8;
        ?? r9 = new Enum("Reset", 4);
        Reset = r9;
        $VALUES = new EnumC1816D[]{r52, r62, r7, r8, r9};
    }

    public static EnumC1816D valueOf(String str) {
        return (EnumC1816D) Enum.valueOf(EnumC1816D.class, str);
    }

    public static EnumC1816D[] values() {
        return (EnumC1816D[]) $VALUES.clone();
    }
}
