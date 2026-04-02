package a1;

import H0.J;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* renamed from: a1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425b {

    /* renamed from: a  reason: collision with root package name */
    public final int f6793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6794b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6795c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6796d;

    public C0425b(int i7, int i8, int i9, String str) {
        this.f6793a = i7;
        this.f6794b = str;
        this.f6795c = i8;
        this.f6796d = i9;
    }

    public static C0425b a(String str) {
        boolean z7;
        boolean z8;
        int i7 = K0.x.f2529a;
        String[] split = str.split(StringUtils.SPACE, 2);
        if (split.length == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        String str2 = split[0];
        Pattern pattern = z.f6925a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i8 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            if (split2.length >= 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            K0.a.e(z8);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i8 = Integer.parseInt(str4);
                    } catch (NumberFormatException e7) {
                        throw J.b(str4, e7);
                    }
                }
                return new C0425b(parseInt, parseInt2, i8, split2[0]);
            } catch (NumberFormatException e8) {
                throw J.b(str3, e8);
            }
        } catch (NumberFormatException e9) {
            throw J.b(str2, e9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0425b.class != obj.getClass()) {
            return false;
        }
        C0425b c0425b = (C0425b) obj;
        if (this.f6793a == c0425b.f6793a && this.f6794b.equals(c0425b.f6794b) && this.f6795c == c0425b.f6795c && this.f6796d == c0425b.f6796d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6794b.hashCode() + ((217 + this.f6793a) * 31)) * 31) + this.f6795c) * 31) + this.f6796d;
    }
}
