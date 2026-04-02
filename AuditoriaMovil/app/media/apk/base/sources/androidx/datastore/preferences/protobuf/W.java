package androidx.datastore.preferences.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W {
    private static final /* synthetic */ W[] $VALUES;
    public static final W EDITIONS;
    public static final W PROTO2;
    public static final W PROTO3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.W] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.W] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.W] */
    static {
        ?? r32 = new Enum("PROTO2", 0);
        PROTO2 = r32;
        ?? r42 = new Enum("PROTO3", 1);
        PROTO3 = r42;
        ?? r52 = new Enum("EDITIONS", 2);
        EDITIONS = r52;
        $VALUES = new W[]{r32, r42, r52};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) $VALUES.clone();
    }
}
