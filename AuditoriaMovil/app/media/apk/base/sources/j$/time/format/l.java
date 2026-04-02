package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes2.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    protected String f12684a;

    /* renamed from: b  reason: collision with root package name */
    protected String f12685b;

    /* renamed from: c  reason: collision with root package name */
    protected char f12686c;

    /* renamed from: d  reason: collision with root package name */
    protected l f12687d;

    /* renamed from: e  reason: collision with root package name */
    protected l f12688e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l(String str, String str2, l lVar, int i7) {
        this(str, str2, lVar);
    }

    protected boolean b(char c8, char c9) {
        return c8 == c9;
    }

    private l(String str, String str2, l lVar) {
        this.f12684a = str;
        this.f12685b = str2;
        this.f12687d = lVar;
        if (str.isEmpty()) {
            this.f12686c = (char) 65535;
        } else {
            this.f12686c = this.f12684a.charAt(0);
        }
    }

    public static l e(Set set, q qVar) {
        l lVar;
        if (qVar.j()) {
            lVar = new l(StringUtils.EMPTY, null, null);
        } else {
            lVar = new l(StringUtils.EMPTY, null, null);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lVar.a(str, str);
        }
        return lVar;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (f(charSequence, index, length)) {
            int length2 = this.f12684a.length() + index;
            l lVar = this.f12687d;
            if (lVar != null && length2 != length) {
                while (true) {
                    if (b(lVar.f12686c, charSequence.charAt(length2))) {
                        parsePosition.setIndex(length2);
                        String c8 = lVar.c(charSequence, parsePosition);
                        if (c8 != null) {
                            return c8;
                        }
                    } else {
                        lVar = lVar.f12688e;
                        if (lVar == null) {
                            break;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.f12685b;
        }
        return null;
    }

    protected l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar);
    }

    protected boolean f(CharSequence charSequence, int i7, int i8) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f12684a, i7);
        }
        int length = this.f12684a.length();
        if (length > i8 - i7) {
            return false;
        }
        int i9 = 0;
        while (true) {
            int i10 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i11 = i9 + 1;
            int i12 = i7 + 1;
            if (!b(this.f12684a.charAt(i9), charSequence.charAt(i7))) {
                return false;
            }
            i7 = i12;
            length = i10;
            i9 = i11;
        }
    }

    private boolean a(String str, String str2) {
        int i7 = 0;
        while (i7 < str.length() && i7 < this.f12684a.length() && b(str.charAt(i7), this.f12684a.charAt(i7))) {
            i7++;
        }
        if (i7 == this.f12684a.length()) {
            if (i7 < str.length()) {
                String substring = str.substring(i7);
                for (l lVar = this.f12687d; lVar != null; lVar = lVar.f12688e) {
                    if (b(lVar.f12686c, substring.charAt(0))) {
                        return lVar.a(substring, str2);
                    }
                }
                l d7 = d(substring, str2, null);
                d7.f12688e = this.f12687d;
                this.f12687d = d7;
                return true;
            }
            this.f12685b = str2;
            return true;
        }
        l d8 = d(this.f12684a.substring(i7), this.f12685b, this.f12687d);
        this.f12684a = str.substring(0, i7);
        this.f12687d = d8;
        if (i7 < str.length()) {
            this.f12687d.f12688e = d(str.substring(i7), str2, null);
            this.f12685b = null;
        } else {
            this.f12685b = str2;
        }
        return true;
    }
}
