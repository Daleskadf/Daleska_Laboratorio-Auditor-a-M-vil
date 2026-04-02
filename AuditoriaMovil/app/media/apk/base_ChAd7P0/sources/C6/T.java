package c6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class T {
    private static final /* synthetic */ T[] $VALUES;
    public static final T INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, c6.T] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        INSTANCE = r12;
        $VALUES = new T[]{r12};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) $VALUES.clone();
    }
}
