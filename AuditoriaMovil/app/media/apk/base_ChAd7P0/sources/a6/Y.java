package a6;

import d6.C0914k;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7109c = Logger.getLogger(Y.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static Y f7110d;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f7111a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public List f7112b = Collections.emptyList();

    public static List b() {
        Logger logger = f7109c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C0914k.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e7);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e9) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e9);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized void a(W w2) {
        G.i.f("isAvailable() returned false", w2.b());
        this.f7111a.add(w2);
    }

    public final W c() {
        List list;
        synchronized (this) {
            list = this.f7112b;
        }
        if (list.isEmpty()) {
            return null;
        }
        return (W) list.get(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    public final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.f7111a);
        Collections.sort(arrayList, Collections.reverseOrder(new Object()));
        this.f7112b = DesugarCollections.unmodifiableList(arrayList);
    }
}
