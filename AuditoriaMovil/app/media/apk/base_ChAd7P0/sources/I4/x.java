package I4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x DEFAULT;
    public static final x STRING;

    static {
        x xVar = new x() { // from class: I4.v
        };
        DEFAULT = xVar;
        x xVar2 = new x() { // from class: I4.w
        };
        STRING = xVar2;
        $VALUES = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
