package I4;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0206h {
    private static final /* synthetic */ EnumC0206h[] $VALUES;
    public static final EnumC0206h IDENTITY;
    public static final EnumC0206h LOWER_CASE_WITH_DASHES;
    public static final EnumC0206h LOWER_CASE_WITH_DOTS;
    public static final EnumC0206h LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC0206h UPPER_CAMEL_CASE;
    public static final EnumC0206h UPPER_CAMEL_CASE_WITH_SPACES;
    public static final EnumC0206h UPPER_CASE_WITH_UNDERSCORES;

    static {
        EnumC0206h enumC0206h = new EnumC0206h() { // from class: I4.a
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return field.getName();
            }
        };
        IDENTITY = enumC0206h;
        EnumC0206h enumC0206h2 = new EnumC0206h() { // from class: I4.b
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.c(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC0206h2;
        EnumC0206h enumC0206h3 = new EnumC0206h() { // from class: I4.c
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.c(EnumC0206h.a(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC0206h3;
        EnumC0206h enumC0206h4 = new EnumC0206h() { // from class: I4.d
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = enumC0206h4;
        EnumC0206h enumC0206h5 = new EnumC0206h() { // from class: I4.e
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC0206h5;
        EnumC0206h enumC0206h6 = new EnumC0206h() { // from class: I4.f
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC0206h6;
        EnumC0206h enumC0206h7 = new EnumC0206h() { // from class: I4.g
            @Override // I4.EnumC0206h
            public final String b(Field field) {
                return EnumC0206h.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC0206h7;
        $VALUES = new EnumC0206h[]{enumC0206h, enumC0206h2, enumC0206h3, enumC0206h4, enumC0206h5, enumC0206h6, enumC0206h7};
    }

    public static String a(String str, char c8) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c8);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static EnumC0206h valueOf(String str) {
        return (EnumC0206h) Enum.valueOf(EnumC0206h.class, str);
    }

    public static EnumC0206h[] values() {
        return (EnumC0206h[]) $VALUES.clone();
    }

    public abstract String b(Field field);
}
