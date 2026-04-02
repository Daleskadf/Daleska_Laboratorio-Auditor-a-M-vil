package f3;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* renamed from: f3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0991d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11059a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
