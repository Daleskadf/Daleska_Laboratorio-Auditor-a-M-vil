package Z2;

import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f6734a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6735b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6736c;

    public a(String str, String... strArr) {
        String sb;
        int i7 = 2;
        if (strArr.length == 0) {
            sb = StringUtils.EMPTY;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f6735b = sb;
        this.f6734a = str;
        I.b("tag \"%s\" is longer than the %d character maximum", str.length() <= 23, str, 23);
        while (i7 <= 7 && !Log.isLoggable(this.f6734a, i7)) {
            i7++;
        }
        this.f6736c = i7;
    }

    public final void a(String str, Object... objArr) {
        if (this.f6736c <= 3) {
            Log.d(this.f6734a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f6734a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f6734a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f6735b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f6736c <= 2) {
            Log.v(this.f6734a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f6734a, d(str, objArr));
    }
}
