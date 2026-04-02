package N1;

import D.AbstractC0059i;
import android.graphics.Color;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f3373a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3374b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f3375c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f3376d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3377e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3378g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3379h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3380i;
    public final int j;

    public d(String str, int i7, Integer num, Integer num2, float f, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.f3373a = str;
        this.f3374b = i7;
        this.f3375c = num;
        this.f3376d = num2;
        this.f3377e = f;
        this.f = z7;
        this.f3378g = z8;
        this.f3379h = z9;
        this.f3380i = z10;
        this.j = i8;
    }

    public static int a(String str) {
        boolean z7;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z7 = true;
                    break;
                default:
                    z7 = false;
                    break;
            }
            if (z7) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0059i.K("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e7) {
            K0.a.B("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z7;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.e(z7);
            int g3 = AbstractC1740d.g(((parseLong >> 24) & 255) ^ 255);
            int g4 = AbstractC1740d.g((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(g3, AbstractC1740d.g(parseLong & 255), AbstractC1740d.g((parseLong >> 8) & 255), g4));
        } catch (IllegalArgumentException e7) {
            K0.a.B("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }
}
