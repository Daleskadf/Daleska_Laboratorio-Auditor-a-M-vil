package e5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    public static final i BASE;
    public static final i CUSTOM;
    public static final i DIGITAL_INK;
    public static final i DIGITAL_INK_SEGMENTATION;
    public static final i ENTITY_EXTRACTION;
    public static final i IMAGE_CAPTIONING;
    public static final i TOXICITY_DETECTION;
    public static final i TRANSLATE;
    public static final i UNKNOWN;
    private static final /* synthetic */ i[] zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, e5.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, e5.i] */
    static {
        ?? r9 = new Enum("UNKNOWN", 0);
        UNKNOWN = r9;
        ?? r10 = new Enum("BASE", 1);
        BASE = r10;
        ?? r11 = new Enum("TRANSLATE", 2);
        TRANSLATE = r11;
        ?? r12 = new Enum("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = r12;
        ?? r13 = new Enum("CUSTOM", 4);
        CUSTOM = r13;
        ?? r14 = new Enum("DIGITAL_INK", 5);
        DIGITAL_INK = r14;
        ?? r15 = new Enum("DIGITAL_INK_SEGMENTATION", 6);
        DIGITAL_INK_SEGMENTATION = r15;
        ?? r32 = new Enum("TOXICITY_DETECTION", 7);
        TOXICITY_DETECTION = r32;
        ?? r22 = new Enum("IMAGE_CAPTIONING", 8);
        IMAGE_CAPTIONING = r22;
        zza = new i[]{r9, r10, r11, r12, r13, r14, r15, r32, r22};
    }

    public static i[] values() {
        return (i[]) zza.clone();
    }
}
