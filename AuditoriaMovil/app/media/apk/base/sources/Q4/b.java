package Q4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b BEGIN_ARRAY;
    public static final b BEGIN_OBJECT;
    public static final b BOOLEAN;
    public static final b END_ARRAY;
    public static final b END_DOCUMENT;
    public static final b END_OBJECT;
    public static final b NAME;
    public static final b NULL;
    public static final b NUMBER;
    public static final b STRING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r14v1, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v1, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Q4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [Q4.b, java.lang.Enum] */
    static {
        ?? r10 = new Enum("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = r10;
        ?? r11 = new Enum("END_ARRAY", 1);
        END_ARRAY = r11;
        ?? r12 = new Enum("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = r12;
        ?? r13 = new Enum("END_OBJECT", 3);
        END_OBJECT = r13;
        ?? r14 = new Enum("NAME", 4);
        NAME = r14;
        ?? r15 = new Enum("STRING", 5);
        STRING = r15;
        ?? r52 = new Enum("NUMBER", 6);
        NUMBER = r52;
        ?? r42 = new Enum("BOOLEAN", 7);
        BOOLEAN = r42;
        ?? r32 = new Enum("NULL", 8);
        NULL = r32;
        ?? r22 = new Enum("END_DOCUMENT", 9);
        END_DOCUMENT = r22;
        $VALUES = new b[]{r10, r11, r12, r13, r14, r15, r52, r42, r32, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
