package e6;

import Q6.AbstractC0281b;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
/* renamed from: e6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0969d {

    /* renamed from: a  reason: collision with root package name */
    public static final Q6.g f10935a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0967b[] f10936b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map f10937c;

    static {
        Q6.g gVar = Q6.g.f4463d;
        f10935a = AbstractC0281b.d(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        C0967b c0967b = new C0967b(C0967b.f10924h, StringUtils.EMPTY);
        Q6.g gVar2 = C0967b.f10922e;
        C0967b c0967b2 = new C0967b(gVar2, "GET");
        C0967b c0967b3 = new C0967b(gVar2, "POST");
        Q6.g gVar3 = C0967b.f;
        C0967b c0967b4 = new C0967b(gVar3, "/");
        C0967b c0967b5 = new C0967b(gVar3, "/index.html");
        Q6.g gVar4 = C0967b.f10923g;
        C0967b c0967b6 = new C0967b(gVar4, "http");
        C0967b c0967b7 = new C0967b(gVar4, "https");
        Q6.g gVar5 = C0967b.f10921d;
        C0967b[] c0967bArr = {c0967b, c0967b2, c0967b3, c0967b4, c0967b5, c0967b6, c0967b7, new C0967b(gVar5, "200"), new C0967b(gVar5, "204"), new C0967b(gVar5, "206"), new C0967b(gVar5, "304"), new C0967b(gVar5, "400"), new C0967b(gVar5, "404"), new C0967b(gVar5, "500"), new C0967b("accept-charset", StringUtils.EMPTY), new C0967b("accept-encoding", "gzip, deflate"), new C0967b("accept-language", StringUtils.EMPTY), new C0967b("accept-ranges", StringUtils.EMPTY), new C0967b("accept", StringUtils.EMPTY), new C0967b("access-control-allow-origin", StringUtils.EMPTY), new C0967b("age", StringUtils.EMPTY), new C0967b("allow", StringUtils.EMPTY), new C0967b("authorization", StringUtils.EMPTY), new C0967b("cache-control", StringUtils.EMPTY), new C0967b("content-disposition", StringUtils.EMPTY), new C0967b("content-encoding", StringUtils.EMPTY), new C0967b("content-language", StringUtils.EMPTY), new C0967b("content-length", StringUtils.EMPTY), new C0967b("content-location", StringUtils.EMPTY), new C0967b("content-range", StringUtils.EMPTY), new C0967b("content-type", StringUtils.EMPTY), new C0967b("cookie", StringUtils.EMPTY), new C0967b("date", StringUtils.EMPTY), new C0967b("etag", StringUtils.EMPTY), new C0967b("expect", StringUtils.EMPTY), new C0967b("expires", StringUtils.EMPTY), new C0967b("from", StringUtils.EMPTY), new C0967b("host", StringUtils.EMPTY), new C0967b("if-match", StringUtils.EMPTY), new C0967b("if-modified-since", StringUtils.EMPTY), new C0967b("if-none-match", StringUtils.EMPTY), new C0967b("if-range", StringUtils.EMPTY), new C0967b("if-unmodified-since", StringUtils.EMPTY), new C0967b("last-modified", StringUtils.EMPTY), new C0967b("link", StringUtils.EMPTY), new C0967b("location", StringUtils.EMPTY), new C0967b("max-forwards", StringUtils.EMPTY), new C0967b("proxy-authenticate", StringUtils.EMPTY), new C0967b("proxy-authorization", StringUtils.EMPTY), new C0967b("range", StringUtils.EMPTY), new C0967b("referer", StringUtils.EMPTY), new C0967b("refresh", StringUtils.EMPTY), new C0967b("retry-after", StringUtils.EMPTY), new C0967b("server", StringUtils.EMPTY), new C0967b("set-cookie", StringUtils.EMPTY), new C0967b("strict-transport-security", StringUtils.EMPTY), new C0967b("transfer-encoding", StringUtils.EMPTY), new C0967b("user-agent", StringUtils.EMPTY), new C0967b("vary", StringUtils.EMPTY), new C0967b("via", StringUtils.EMPTY), new C0967b("www-authenticate", StringUtils.EMPTY)};
        f10936b = c0967bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c0967bArr[i7].f10925a)) {
                linkedHashMap.put(c0967bArr[i7].f10925a, Integer.valueOf(i7));
            }
        }
        f10937c = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void a(Q6.g gVar) {
        int c8 = gVar.c();
        for (int i7 = 0; i7 < c8; i7++) {
            byte h8 = gVar.h(i7);
            if (h8 >= 65 && h8 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(gVar.r()));
            }
        }
    }
}
