package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a6.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0486o {
    private static final /* synthetic */ EnumC0486o[] $VALUES;
    public static final EnumC0486o CONNECTING;
    public static final EnumC0486o IDLE;
    public static final EnumC0486o READY;
    public static final EnumC0486o SHUTDOWN;
    public static final EnumC0486o TRANSIENT_FAILURE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, a6.o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, a6.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, a6.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, a6.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, a6.o] */
    static {
        ?? r52 = new Enum("CONNECTING", 0);
        CONNECTING = r52;
        ?? r62 = new Enum("READY", 1);
        READY = r62;
        ?? r7 = new Enum("TRANSIENT_FAILURE", 2);
        TRANSIENT_FAILURE = r7;
        ?? r8 = new Enum("IDLE", 3);
        IDLE = r8;
        ?? r9 = new Enum("SHUTDOWN", 4);
        SHUTDOWN = r9;
        $VALUES = new EnumC0486o[]{r52, r62, r7, r8, r9};
    }

    public static EnumC0486o valueOf(String str) {
        return (EnumC0486o) Enum.valueOf(EnumC0486o.class, str);
    }

    public static EnumC0486o[] values() {
        return (EnumC0486o[]) $VALUES.clone();
    }
}
