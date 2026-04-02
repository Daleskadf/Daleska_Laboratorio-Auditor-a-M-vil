package D2;

import V2.k;
import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static volatile c f852e;

    /* renamed from: a  reason: collision with root package name */
    public final L2.a f853a;

    /* renamed from: b  reason: collision with root package name */
    public final L2.a f854b;

    /* renamed from: c  reason: collision with root package name */
    public final H2.c f855c;

    /* renamed from: d  reason: collision with root package name */
    public final I2.g f856d;

    public i(L2.a aVar, L2.a aVar2, H2.c cVar, I2.g gVar, I2.h hVar) {
        this.f853a = aVar;
        this.f854b = aVar2;
        this.f855c = cVar;
        this.f856d = gVar;
        hVar.getClass();
        hVar.f2193a.execute(new G.c(hVar, 4));
    }

    public static i a() {
        c cVar = f852e;
        if (cVar != null) {
            return (i) cVar.f842e.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, W2.j] */
    public static void b(Context context) {
        if (f852e == null) {
            synchronized (i.class) {
                try {
                    if (f852e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f6181a = context;
                        f852e = obj.a();
                    }
                } finally {
                }
            }
        }
    }

    public final k c(B2.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof d) {
            aVar.getClass();
            singleton = DesugarCollections.unmodifiableSet(B2.a.f242d);
        } else {
            singleton = Collections.singleton(new A2.b("proto"));
        }
        k a7 = b.a();
        aVar.getClass();
        a7.f5965b = "cct";
        String str = aVar.f244a;
        String str2 = aVar.f245b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = StringUtils.EMPTY;
            }
            bytes = io.flutter.plugins.pathprovider.b.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a7.f5966c = bytes;
        return new k(singleton, a7.a(), this, 7);
    }
}
