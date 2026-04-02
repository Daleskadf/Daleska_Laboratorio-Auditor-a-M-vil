package H0;

import android.text.TextUtils;
import r3.AbstractC1740d;
/* renamed from: H0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129i {

    /* renamed from: a  reason: collision with root package name */
    public int f1805a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f1806b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f1807c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1808d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1809e = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v2, types: [H0.i, java.lang.Object] */
    public static C0129i c(String str) {
        char c8;
        K0.a.e(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String A7 = AbstractC1740d.A(split[i11].trim());
            A7.getClass();
            switch (A7.hashCode()) {
                case 100571:
                    if (A7.equals("end")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3556653:
                    if (A7.equals("text")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109757538:
                    if (A7.equals("start")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109780401:
                    if (A7.equals("style")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    i8 = i11;
                    break;
                case 1:
                    i9 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i10 = i11;
                    break;
            }
        }
        if (i7 != -1 && i8 != -1 && i9 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f1805a = i7;
            obj.f1806b = i8;
            obj.f1807c = i10;
            obj.f1808d = i9;
            obj.f1809e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i7;
        int i8;
        int i9;
        int i10 = this.f1805a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f1808d;
            int i13 = this.f1806b;
            if (i12 > i13) {
                i9 = 1;
            } else if (i12 == i13) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if ((i9 & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f1808d;
            int i15 = this.f1807c;
            if (i14 > i15) {
                i8 = 1;
            } else if (i14 == i15) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            if (((i8 << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f1809e;
            int i17 = this.f1806b;
            if (i16 > i17) {
                i7 = 1;
            } else if (i16 == i17) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            if (((i7 << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f1809e;
            int i19 = this.f1807c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public C0130j b() {
        return new C0130j(this.f1805a, this.f1806b, this.f1807c, this.f1808d, this.f1809e, null);
    }

    public void d(int i7) {
        this.f1809e = i7;
    }

    public void e(int i7) {
        this.f1806b = i7;
    }

    public void f(int i7) {
        this.f1805a = i7;
    }

    public void g(int i7) {
        this.f1807c = i7;
    }

    public void h(int i7) {
        this.f1808d = i7;
    }
}
