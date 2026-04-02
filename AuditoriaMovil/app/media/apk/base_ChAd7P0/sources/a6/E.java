package a6;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f7073d = Logger.getLogger(E.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final E f7074e = new E();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentSkipListMap f7075a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f7076b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap f7077c;

    public E() {
        new ConcurrentSkipListMap();
        this.f7075a = new ConcurrentSkipListMap();
        this.f7076b = new ConcurrentHashMap();
        this.f7077c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
