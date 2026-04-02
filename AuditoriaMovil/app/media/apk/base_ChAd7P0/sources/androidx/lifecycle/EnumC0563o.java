package androidx.lifecycle;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0563o {
    private static final /* synthetic */ EnumC0563o[] $VALUES;
    public static final EnumC0563o CREATED;
    public static final EnumC0563o DESTROYED;
    public static final EnumC0563o INITIALIZED;
    public static final EnumC0563o RESUMED;
    public static final EnumC0563o STARTED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r52 = new Enum("DESTROYED", 0);
        DESTROYED = r52;
        ?? r62 = new Enum("INITIALIZED", 1);
        INITIALIZED = r62;
        ?? r7 = new Enum("CREATED", 2);
        CREATED = r7;
        ?? r8 = new Enum("STARTED", 3);
        STARTED = r8;
        ?? r9 = new Enum("RESUMED", 4);
        RESUMED = r9;
        $VALUES = new EnumC0563o[]{r52, r62, r7, r8, r9};
    }

    public static EnumC0563o valueOf(String str) {
        return (EnumC0563o) Enum.valueOf(EnumC0563o.class, str);
    }

    public static EnumC0563o[] values() {
        return (EnumC0563o[]) $VALUES.clone();
    }

    public final boolean a(EnumC0563o state) {
        kotlin.jvm.internal.j.e(state, "state");
        if (compareTo(state) >= 0) {
            return true;
        }
        return false;
    }
}
