package androidx.datastore.preferences.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x0 {
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 ASCENDING;
    public static final x0 DESCENDING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.x0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.x0] */
    static {
        ?? r22 = new Enum("ASCENDING", 0);
        ASCENDING = r22;
        ?? r32 = new Enum("DESCENDING", 1);
        DESCENDING = r32;
        $VALUES = new x0[]{r22, r32};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}
