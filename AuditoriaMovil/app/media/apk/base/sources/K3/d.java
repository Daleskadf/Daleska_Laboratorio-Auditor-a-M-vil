package K3;

import A.i;
import M3.k;
import M3.l;
import M3.v;
import R3.X0;
import j$.util.DesugarCollections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final l f2633a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f2634b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f2635c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f2636d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map f2637e;

    static {
        T3.a b5 = v.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        f2633a = new l(c.class);
        f2634b = new k(b5);
        f2635c = new M3.b(a.class);
        f2636d = new M3.a(b5, new i(15));
        HashMap hashMap = new HashMap();
        b bVar = b.f2629d;
        X0 x02 = X0.RAW;
        hashMap.put(bVar, x02);
        b bVar2 = b.f2627b;
        X0 x03 = X0.TINK;
        hashMap.put(bVar2, x03);
        b bVar3 = b.f2628c;
        X0 x04 = X0.CRUNCHY;
        hashMap.put(bVar3, x04);
        DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(X0.class);
        enumMap.put((EnumMap) x02, (X0) bVar);
        enumMap.put((EnumMap) x03, (X0) bVar2);
        enumMap.put((EnumMap) x04, (X0) bVar3);
        enumMap.put((EnumMap) X0.LEGACY, (X0) bVar3);
        f2637e = DesugarCollections.unmodifiableMap(enumMap);
    }
}
