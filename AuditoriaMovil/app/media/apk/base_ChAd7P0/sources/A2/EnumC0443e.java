package a2;

import F3.j;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0443e {
    private static final /* synthetic */ EnumC0443e[] $VALUES;
    public static final EnumC0443e AES256_GCM;
    private final String mAeadKeyTemplateName = "AES256_GCM";

    static {
        EnumC0443e enumC0443e = new EnumC0443e();
        AES256_GCM = enumC0443e;
        $VALUES = new EnumC0443e[]{enumC0443e};
    }

    public static EnumC0443e valueOf(String str) {
        return (EnumC0443e) Enum.valueOf(EnumC0443e.class, str);
    }

    public static EnumC0443e[] values() {
        return (EnumC0443e[]) $VALUES.clone();
    }

    public final j a() {
        return F3.c.a(this.mAeadKeyTemplateName);
    }
}
