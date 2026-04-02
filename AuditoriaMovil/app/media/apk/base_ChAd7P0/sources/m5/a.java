package M5;

import A.f;
import A4.c;
import L5.r;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3269b;

    public a(Context context, f fVar) {
        c cVar = new c(this, 18);
        this.f3269b = context;
        this.f3268a = fVar;
        fVar.f11c = cVar;
    }

    public static Locale a(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        int length = split.length;
        String str4 = StringUtils.EMPTY;
        int i7 = 1;
        if (length > 1 && split[1].length() == 4) {
            str2 = split[1];
            i7 = 2;
        } else {
            str2 = StringUtils.EMPTY;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            str4 = split[i7];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i7 = 0; i7 < size; i7++) {
                locale = locales.get(i7);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        f fVar = this.f3268a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            locale2.getLanguage();
            locale2.getCountry();
            locale2.getVariant();
            arrayList2.add(locale2.getLanguage());
            arrayList2.add(locale2.getCountry());
            arrayList2.add(locale2.getScript());
            arrayList2.add(locale2.getVariant());
        }
        ((r) fVar.f10b).a("setLocale", arrayList2, null);
    }
}
