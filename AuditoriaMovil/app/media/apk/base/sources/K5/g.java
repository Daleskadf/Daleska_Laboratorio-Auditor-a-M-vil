package K5;

import org.apache.tika.mime.MimeTypes;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g PLAIN_TEXT;
    private String encodedName;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [K5.g, java.lang.Enum] */
    static {
        ?? r12 = new Enum("PLAIN_TEXT", 0);
        ((g) r12).encodedName = MimeTypes.PLAIN_TEXT;
        PLAIN_TEXT = r12;
        $VALUES = new g[]{r12};
    }

    public static g a(String str) {
        g[] values;
        for (g gVar : values()) {
            if (gVar.encodedName.equals(str)) {
                return gVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such ClipboardContentFormat: ", str));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
