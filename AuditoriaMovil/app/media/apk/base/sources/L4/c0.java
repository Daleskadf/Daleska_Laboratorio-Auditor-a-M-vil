package L4;

import java.util.Locale;
import java.util.StringTokenizer;
/* loaded from: classes.dex */
public class c0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.B(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        cVar.x(locale);
    }
}
