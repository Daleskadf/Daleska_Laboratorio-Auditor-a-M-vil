package Z;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final android.support.v4.media.session.a f6716a;

    /* renamed from: b  reason: collision with root package name */
    public static final S.j f6717b;

    static {
        Trace.beginSection(F.f.D("TypefaceCompat static init"));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f6716a = new android.support.v4.media.session.a();
        } else if (i7 >= 28) {
            f6716a = new i();
        } else if (i7 >= 26) {
            f6716a = new i();
        } else {
            if (i7 >= 24) {
                Method method = h.f;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f6716a = new android.support.v4.media.session.a();
                }
            }
            f6716a = new android.support.v4.media.session.a();
        }
        f6717b = new S.j(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r9.equals(r11) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r15, Y.d r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, G1.g r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.f.a(android.content.Context, Y.d, android.content.res.Resources, int, java.lang.String, int, int, G1.g):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
