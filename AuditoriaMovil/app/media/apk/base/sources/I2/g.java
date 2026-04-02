package I2;

import C2.j;
import C2.k;
import C2.l;
import C2.m;
import C2.o;
import C2.q;
import C2.u;
import C2.v;
import C2.x;
import D.AbstractC0059i;
import J2.i;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import p.Y0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2187a;

    /* renamed from: b  reason: collision with root package name */
    public final E2.f f2188b;

    /* renamed from: c  reason: collision with root package name */
    public final J2.c f2189c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2190d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2191e;
    public final K2.c f;

    /* renamed from: g  reason: collision with root package name */
    public final L2.a f2192g;

    public g(Context context, E2.f fVar, J2.c cVar, d dVar, Executor executor, K2.c cVar2, L2.a aVar) {
        this.f2187a = context;
        this.f2188b = fVar;
        this.f2189c = cVar;
        this.f2190d = dVar;
        this.f2191e = executor;
        this.f = cVar2;
        this.f2192g = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [p.Y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [p.Y0, java.lang.Object] */
    public final void a(D2.b bVar, int i7) {
        E2.a aVar;
        String str;
        B2.c h02;
        String str2;
        Integer num;
        Y0 y02;
        long longValue;
        String str3;
        E2.g a7 = this.f2188b.a(bVar.f835a);
        A.f fVar = new A.f(12, this, bVar);
        i iVar = (i) this.f;
        Iterable<J2.b> iterable = (Iterable) iVar.d(fVar);
        if (!iterable.iterator().hasNext()) {
            return;
        }
        if (a7 == null) {
            m5.d.c(bVar, "Uploader", "Unknown backend for %s, deleting event batch for it...");
            aVar = new E2.a(E2.c.FATAL_ERROR, -1L);
        } else {
            ArrayList arrayList = new ArrayList();
            for (J2.b bVar2 : iterable) {
                arrayList.add(bVar2.f2399c);
            }
            B2.d dVar = (B2.d) a7;
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D2.a aVar2 = (D2.a) it.next();
                String str4 = aVar2.f830a;
                if (!hashMap.containsKey(str4)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(aVar2);
                    hashMap.put(str4, arrayList2);
                } else {
                    ((List) hashMap.get(str4)).add(aVar2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                D2.a aVar3 = (D2.a) ((List) entry.getValue()).get(0);
                x xVar = x.DEFAULT;
                long o7 = dVar.f.o();
                long o8 = dVar.f256e.o();
                k kVar = new k(q.ANDROID_FIREBASE, new C2.i(Integer.valueOf(aVar3.b("sdk-version")), aVar3.a("model"), aVar3.a("hardware"), aVar3.a("device"), aVar3.a("product"), aVar3.a("os-uild"), aVar3.a("manufacturer"), aVar3.a("fingerprint"), aVar3.a("locale"), aVar3.a("country"), aVar3.a("mcc_mnc"), aVar3.a("application_build")));
                try {
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    str2 = null;
                } catch (NumberFormatException unused) {
                    str2 = (String) entry.getKey();
                    num = null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (D2.a aVar4 : (List) entry.getValue()) {
                    D2.e eVar = aVar4.f832c;
                    A2.b bVar3 = eVar.f843a;
                    Iterator it3 = it2;
                    boolean equals = bVar3.equals(new A2.b("proto"));
                    byte[] bArr = eVar.f844b;
                    if (equals) {
                        ?? obj = new Object();
                        obj.f14762d = bArr;
                        y02 = obj;
                    } else if (bVar3.equals(new A2.b("json"))) {
                        String str5 = new String(bArr, Charset.forName("UTF-8"));
                        ?? obj2 = new Object();
                        obj2.f14763e = str5;
                        y02 = obj2;
                    } else {
                        Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + bVar3 + ". Skipping...");
                        it2 = it3;
                    }
                    y02.f14759a = Long.valueOf(aVar4.f833d);
                    y02.f14761c = Long.valueOf(aVar4.f834e);
                    String str6 = (String) aVar4.f.get("tz-offset");
                    if (str6 == null) {
                        longValue = 0;
                    } else {
                        longValue = Long.valueOf(str6).longValue();
                    }
                    y02.f = Long.valueOf(longValue);
                    y02.f14758X = new o(v.a(aVar4.b("net-type")), u.a(aVar4.b("mobile-subtype")));
                    Integer num2 = aVar4.f831b;
                    if (num2 != null) {
                        y02.f14760b = num2;
                    }
                    if (((Long) y02.f14759a) == null) {
                        str3 = " eventTimeMs";
                    } else {
                        str3 = StringUtils.EMPTY;
                    }
                    if (((Long) y02.f14761c) == null) {
                        str3 = str3.concat(" eventUptimeMs");
                    }
                    if (((Long) y02.f) == null) {
                        str3 = AbstractC0059i.z(str3, " timezoneOffsetSeconds");
                    }
                    if (str3.isEmpty()) {
                        arrayList4.add(new l(((Long) y02.f14759a).longValue(), (Integer) y02.f14760b, ((Long) y02.f14761c).longValue(), (byte[]) y02.f14762d, (String) y02.f14763e, ((Long) y02.f).longValue(), (o) y02.f14758X));
                        it2 = it3;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                }
                arrayList3.add(new m(o7, o8, kVar, num, str2, arrayList4, xVar));
                it2 = it2;
            }
            j jVar = new j(arrayList3);
            byte[] bArr2 = bVar.f836b;
            URL url = dVar.f255d;
            if (bArr2 != null) {
                try {
                    B2.a a8 = B2.a.a(bArr2);
                    str = a8.f245b;
                    if (str == null) {
                        str = null;
                    }
                    String str7 = a8.f244a;
                    if (str7 != null) {
                        url = B2.d.b(str7);
                    }
                } catch (IllegalArgumentException unused2) {
                    aVar = new E2.a(E2.c.FATAL_ERROR, -1L);
                }
            } else {
                str = null;
            }
            try {
                B2.b bVar4 = new B2.b(url, jVar, str);
                C5.i iVar2 = new C5.i(dVar, 3);
                int i8 = 5;
                do {
                    h02 = iVar2.h0(bVar4);
                    URL url2 = (URL) h02.f251c;
                    if (url2 != null) {
                        m5.d.c(url2, "CctTransportBackend", "Following redirect to: %s");
                        bVar4 = new B2.b(url2, bVar4.f247b, bVar4.f248c);
                    } else {
                        bVar4 = null;
                    }
                    if (bVar4 == null) {
                        break;
                    }
                    i8--;
                } while (i8 >= 1);
                int i9 = h02.f249a;
                if (i9 == 200) {
                    aVar = new E2.a(E2.c.OK, h02.f250b);
                } else {
                    if (i9 < 500 && i9 != 404) {
                        aVar = new E2.a(E2.c.FATAL_ERROR, -1L);
                    }
                    aVar = new E2.a(E2.c.TRANSIENT_ERROR, -1L);
                }
            } catch (IOException e7) {
                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e7);
                aVar = new E2.a(E2.c.TRANSIENT_ERROR, -1L);
            }
        }
        iVar.d(new B.a(this, aVar, iterable, bVar, i7));
    }
}
