package a1;

import A3.AbstractC0021t;
import A3.C0023v;
import A3.C0025x;
import A3.K;
import A3.L;
import A3.N;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.HttpHeaders;
import r3.AbstractC1740d;
/* renamed from: a1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437n {

    /* renamed from: a  reason: collision with root package name */
    public final L f6867a;

    static {
        new A4.c(29).p();
    }

    public C0437n(A4.c cVar) {
        L l8;
        Set entrySet = ((C0025x) ((A.c) cVar.f218b).f4b).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            l8 = A3.D.f85e;
        } else {
            C0023v c0023v = (C0023v) entrySet;
            N n7 = new N(c0023v.f198b.size(), 0);
            Iterator it = c0023v.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                K p7 = K.p((Collection) entry.getValue());
                if (!p7.isEmpty()) {
                    n7.m(key, p7);
                    i7 = p7.size() + i7;
                }
            }
            l8 = new L(n7.d(), i7);
        }
        this.f6867a = l8;
    }

    public static String b(String str) {
        if (AbstractC1740d.m(str, "Accept")) {
            return "Accept";
        }
        if (AbstractC1740d.m(str, "Allow")) {
            return "Allow";
        }
        if (AbstractC1740d.m(str, "Authorization")) {
            return "Authorization";
        }
        if (AbstractC1740d.m(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (AbstractC1740d.m(str, "Blocksize")) {
            return "Blocksize";
        }
        if (AbstractC1740d.m(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (AbstractC1740d.m(str, "Connection")) {
            return "Connection";
        }
        if (AbstractC1740d.m(str, "Content-Base")) {
            return "Content-Base";
        }
        if (AbstractC1740d.m(str, HttpHeaders.CONTENT_ENCODING)) {
            return HttpHeaders.CONTENT_ENCODING;
        }
        if (AbstractC1740d.m(str, HttpHeaders.CONTENT_LANGUAGE)) {
            return HttpHeaders.CONTENT_LANGUAGE;
        }
        if (AbstractC1740d.m(str, HttpHeaders.CONTENT_LENGTH)) {
            return HttpHeaders.CONTENT_LENGTH;
        }
        if (AbstractC1740d.m(str, HttpHeaders.CONTENT_LOCATION)) {
            return HttpHeaders.CONTENT_LOCATION;
        }
        if (AbstractC1740d.m(str, HttpHeaders.CONTENT_TYPE)) {
            return HttpHeaders.CONTENT_TYPE;
        }
        if (AbstractC1740d.m(str, "CSeq")) {
            return "CSeq";
        }
        if (AbstractC1740d.m(str, "Date")) {
            return "Date";
        }
        if (AbstractC1740d.m(str, "Expires")) {
            return "Expires";
        }
        if (AbstractC1740d.m(str, HttpHeaders.LOCATION)) {
            return HttpHeaders.LOCATION;
        }
        if (AbstractC1740d.m(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (AbstractC1740d.m(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (AbstractC1740d.m(str, "Public")) {
            return "Public";
        }
        if (AbstractC1740d.m(str, "Range")) {
            return "Range";
        }
        if (AbstractC1740d.m(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (AbstractC1740d.m(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (AbstractC1740d.m(str, "Scale")) {
            return "Scale";
        }
        if (AbstractC1740d.m(str, "Session")) {
            return "Session";
        }
        if (AbstractC1740d.m(str, "Speed")) {
            return "Speed";
        }
        if (AbstractC1740d.m(str, "Supported")) {
            return "Supported";
        }
        if (AbstractC1740d.m(str, "Timestamp")) {
            return "Timestamp";
        }
        if (AbstractC1740d.m(str, "Transport")) {
            return "Transport";
        }
        if (AbstractC1740d.m(str, "User-Agent")) {
            return "User-Agent";
        }
        if (AbstractC1740d.m(str, "Via")) {
            return "Via";
        }
        if (AbstractC1740d.m(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final L a() {
        return this.f6867a;
    }

    public final String c(String str) {
        K d7 = this.f6867a.d(b(str));
        if (d7.isEmpty()) {
            return null;
        }
        return (String) AbstractC0021t.l(d7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0437n)) {
            return false;
        }
        return this.f6867a.equals(((C0437n) obj).f6867a);
    }

    public final int hashCode() {
        return this.f6867a.hashCode();
    }
}
