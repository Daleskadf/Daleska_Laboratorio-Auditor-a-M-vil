package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m implements f {
    public static final m INSENSITIVE;
    public static final m LENIENT;
    public static final m SENSITIVE;
    public static final m STRICT;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ m[] f12689a;

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb) {
        return true;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f12689a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.time.format.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.m] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.m] */
    static {
        ?? r42 = new Enum("SENSITIVE", 0);
        SENSITIVE = r42;
        ?? r52 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r52;
        ?? r62 = new Enum("STRICT", 2);
        STRICT = r62;
        ?? r7 = new Enum("LENIENT", 3);
        LENIENT = r7;
        f12689a = new m[]{r42, r52, r62, r7};
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i7) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            qVar.l(true);
        } else if (ordinal == 1) {
            qVar.l(false);
        } else if (ordinal == 2) {
            qVar.p(true);
        } else if (ordinal == 3) {
            qVar.p(false);
        }
        return i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
