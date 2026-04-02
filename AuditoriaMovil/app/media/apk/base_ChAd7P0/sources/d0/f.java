package d0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final Locale[] f10167b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f10168a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f10168a = f10167b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(io.flutter.plugins.pathprovider.b.f("list[", i7, "] is null"));
            }
        }
        this.f10168a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // d0.g
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f10168a;
        Locale[] localeArr2 = this.f10168a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // d0.g
    public final Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f10168a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f10168a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override // d0.g
    public final boolean isEmpty() {
        if (this.f10168a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // d0.g
    public final int size() {
        return this.f10168a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f10168a;
            if (i7 < localeArr.length) {
                sb.append(localeArr[i7]);
                if (i7 < localeArr.length - 1) {
                    sb.append(',');
                }
                i7++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
