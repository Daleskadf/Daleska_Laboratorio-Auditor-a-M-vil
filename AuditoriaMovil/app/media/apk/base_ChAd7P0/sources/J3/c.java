package J3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALGORITHM_NOT_FIPS;
    public static final c ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        c cVar = new c() { // from class: J3.a
            @Override // J3.c
            public final boolean a() {
                return !d.f2423b.get();
            }
        };
        ALGORITHM_NOT_FIPS = cVar;
        c cVar2 = new c() { // from class: J3.b
            @Override // J3.c
            public final boolean a() {
                Boolean bool;
                if (d.f2423b.get()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        d.f2422a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        };
        ALGORITHM_REQUIRES_BORINGCRYPTO = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public abstract boolean a();
}
