package t;

import android.os.LocaleList;
/* renamed from: t.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1800b {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
