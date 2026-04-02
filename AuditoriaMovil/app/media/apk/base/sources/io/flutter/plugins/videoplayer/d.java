package io.flutter.plugins.videoplayer;

import A3.e0;
import H0.A;
import H0.C;
import H0.C0140u;
import H0.C0141v;
import H0.C0143x;
import H0.C0144y;
import H0.C0145z;
import H0.F;
import M0.x;
import a4.AbstractC0452a;
import android.content.Context;
import android.net.Uri;
import e1.C0949n;
import e1.InterfaceC0959y;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class d extends AbstractC0452a {

    /* renamed from: b  reason: collision with root package name */
    public final n f12402b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f12403c;

    public d(String str, n nVar, HashMap hashMap) {
        super(str);
        this.f12402b = nVar;
        this.f12403c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [H0.w, H0.v] */
    @Override // a4.AbstractC0452a
    public final C b() {
        Uri parse;
        String str;
        C0145z c0145z;
        C0140u c0140u = new C0140u();
        new t2.i();
        List emptyList = Collections.emptyList();
        e0 e0Var = e0.f138e;
        C0143x c0143x = new C0143x();
        A a7 = A.f1640a;
        String str2 = this.f7007a;
        if (str2 == null) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        int i7 = c.f12401a[this.f12402b.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    str = null;
                } else {
                    str = "application/x-mpegURL";
                }
            } else {
                str = "application/dash+xml";
            }
        } else {
            str = "application/vnd.ms-sstr+xml";
        }
        if (str == null) {
            str = null;
        }
        if (parse != null) {
            c0145z = new C0145z(parse, str, null, emptyList, e0Var, -9223372036854775807L);
        } else {
            c0145z = null;
        }
        return new C(StringUtils.EMPTY, new C0141v(c0140u), c0145z, new C0144y(c0143x), F.f1669y, a7);
    }

    @Override // a4.AbstractC0452a
    public final InterfaceC0959y c(Context context) {
        H1.e eVar = new H1.e(1);
        String str = "ExoPlayer";
        if (!this.f12403c.isEmpty() && this.f12403c.containsKey("User-Agent")) {
            str = (String) this.f12403c.get("User-Agent");
        }
        HashMap hashMap = this.f12403c;
        eVar.f1940e = str;
        eVar.f1938c = true;
        if (!hashMap.isEmpty()) {
            x xVar = (x) eVar.f1939d;
            synchronized (xVar) {
                xVar.f3211c = null;
                ((HashMap) xVar.f3210b).clear();
                ((HashMap) xVar.f3210b).putAll(hashMap);
            }
        }
        A.f fVar = new A.f(context, eVar);
        C0949n c0949n = new C0949n(context);
        c0949n.f10820b = fVar;
        Q0.A a7 = c0949n.f10819a;
        if (fVar != ((A.f) a7.f)) {
            a7.f = fVar;
            ((HashMap) a7.f4138d).clear();
            ((HashMap) a7.f4139e).clear();
        }
        return c0949n;
    }
}
