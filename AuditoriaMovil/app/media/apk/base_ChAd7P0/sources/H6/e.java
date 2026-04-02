package H6;

import F6.InterfaceC0098l;
import K6.AbstractC0208a;
import K6.w;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2048a = new k(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f2049b = AbstractC0208a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f2050c = AbstractC0208a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final w f2051d = new w("BUFFERED", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final w f2052e = new w("SHOULD_BUFFER", 0);
    public static final w f = new w("S_RESUMING_BY_RCV", 0);

    /* renamed from: g  reason: collision with root package name */
    public static final w f2053g = new w("RESUMING_BY_EB", 0);

    /* renamed from: h  reason: collision with root package name */
    public static final w f2054h = new w("POISONED", 0);

    /* renamed from: i  reason: collision with root package name */
    public static final w f2055i = new w("DONE_RCV", 0);
    public static final w j = new w("INTERRUPTED_SEND", 0);

    /* renamed from: k  reason: collision with root package name */
    public static final w f2056k = new w("INTERRUPTED_RCV", 0);

    /* renamed from: l  reason: collision with root package name */
    public static final w f2057l = new w("CHANNEL_CLOSED", 0);

    /* renamed from: m  reason: collision with root package name */
    public static final w f2058m = new w("SUSPEND", 0);

    /* renamed from: n  reason: collision with root package name */
    public static final w f2059n = new w("SUSPEND_NO_WAITER", 0);

    /* renamed from: o  reason: collision with root package name */
    public static final w f2060o = new w("FAILED", 0);

    /* renamed from: p  reason: collision with root package name */
    public static final w f2061p = new w("NO_RECEIVE_RESULT", 0);

    /* renamed from: q  reason: collision with root package name */
    public static final w f2062q = new w("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r  reason: collision with root package name */
    public static final w f2063r = new w("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s  reason: collision with root package name */
    public static final w f2064s = new w("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0098l interfaceC0098l, Object obj, w6.l lVar) {
        w d7 = interfaceC0098l.d(obj, lVar);
        if (d7 != null) {
            interfaceC0098l.f(d7);
            return true;
        }
        return false;
    }
}
