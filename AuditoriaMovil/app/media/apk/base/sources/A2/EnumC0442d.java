package a2;

import F3.j;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0442d {
    private static final /* synthetic */ EnumC0442d[] $VALUES;
    public static final EnumC0442d AES256_SIV;
    private final String mDeterministicAeadKeyTemplateName = "AES256_SIV";

    static {
        EnumC0442d enumC0442d = new EnumC0442d();
        AES256_SIV = enumC0442d;
        $VALUES = new EnumC0442d[]{enumC0442d};
    }

    public static EnumC0442d valueOf(String str) {
        return (EnumC0442d) Enum.valueOf(EnumC0442d.class, str);
    }

    public static EnumC0442d[] values() {
        return (EnumC0442d[]) $VALUES.clone();
    }

    public final j a() {
        return F3.c.a(this.mDeterministicAeadKeyTemplateName);
    }
}
