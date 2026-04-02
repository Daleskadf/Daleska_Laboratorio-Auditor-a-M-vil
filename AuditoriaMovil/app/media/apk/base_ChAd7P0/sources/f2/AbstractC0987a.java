package f2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import org.apache.tika.utils.StringUtils;
/* renamed from: f2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0987a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11050a = 0;

    static {
        Uri.parse("*");
        Uri.parse(StringUtils.EMPTY);
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
