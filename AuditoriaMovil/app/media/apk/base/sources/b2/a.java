package B2;

import G.i;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a implements D2.d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f241c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f242d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f243e;

    /* renamed from: a  reason: collision with root package name */
    public final String f244a;

    /* renamed from: b  reason: collision with root package name */
    public final String f245b;

    static {
        String B7 = i.B("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f241c = B7;
        i.B("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        i.B("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f242d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new A2.b("proto"), new A2.b("json"))));
        f243e = new a(B7, null);
    }

    public a(String str, String str2) {
        this.f244a = str;
        this.f245b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
