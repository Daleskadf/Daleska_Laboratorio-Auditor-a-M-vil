package a1;

import A3.j0;
import H0.J;
import java.util.HashMap;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* renamed from: a1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424a {

    /* renamed from: a  reason: collision with root package name */
    public final String f6785a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6786b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6787c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6788d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f6789e = new HashMap();
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f6790g;

    /* renamed from: h  reason: collision with root package name */
    public String f6791h;

    /* renamed from: i  reason: collision with root package name */
    public String f6792i;

    public C0424a(String str, int i7, int i8, String str2) {
        this.f6785a = str;
        this.f6786b = i7;
        this.f6787c = str2;
        this.f6788d = i8;
    }

    public static String b(int i7, int i8, int i9, String str) {
        int i10 = K0.x.f2529a;
        Locale locale = Locale.US;
        return i7 + StringUtils.SPACE + str + "/" + i8 + "/" + i9;
    }

    public final C0426c a() {
        boolean z7;
        String b5;
        C0425b a7;
        HashMap hashMap = this.f6789e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                int i7 = K0.x.f2529a;
                a7 = C0425b.a((String) hashMap.get("rtpmap"));
            } else {
                int i8 = this.f6788d;
                if (i8 < 96) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.e(z7);
                if (i8 != 0) {
                    if (i8 != 8) {
                        if (i8 != 10) {
                            if (i8 == 11) {
                                b5 = b(11, 44100, 1, "L16");
                            } else {
                                throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i8, "Unsupported static paylod type "));
                            }
                        } else {
                            b5 = b(10, 44100, 2, "L16");
                        }
                    } else {
                        b5 = b(8, 8000, 1, "PCMA");
                    }
                } else {
                    b5 = b(0, 8000, 1, "PCMU");
                }
                a7 = C0425b.a(b5);
            }
            return new C0426c(this, j0.a(hashMap), a7);
        } catch (J e7) {
            throw new IllegalStateException(e7);
        }
    }
}
