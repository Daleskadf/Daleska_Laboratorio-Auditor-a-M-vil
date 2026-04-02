package p;

import android.os.LocaleList;
import android.widget.TextView;
/* renamed from: p.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1614w {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
