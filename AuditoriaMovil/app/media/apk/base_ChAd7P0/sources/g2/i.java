package g2;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import f2.AbstractC0987a;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d  reason: collision with root package name */
    public final Pattern f11121d;

    public i() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f11121d = Pattern.compile("\\A\\d+");
    }

    @Override // g2.c
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // g2.c
    public final boolean b() {
        int i7;
        PackageInfo packageInfo;
        boolean b5 = super.b();
        if (b5 && (i7 = Build.VERSION.SDK_INT) < 29) {
            int i8 = AbstractC0987a.f11050a;
            if (i7 >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                try {
                    packageInfo = AbstractC0987a.a();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f11121d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b5;
    }
}
