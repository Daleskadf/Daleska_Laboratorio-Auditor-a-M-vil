package I4;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final i f2201d = new i(StringUtils.EMPTY, StringUtils.EMPTY, false);

    /* renamed from: a  reason: collision with root package name */
    public final String f2202a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2203b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2204c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z7) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f2202a = str;
                this.f2203b = str2;
                this.f2204c = z7;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
