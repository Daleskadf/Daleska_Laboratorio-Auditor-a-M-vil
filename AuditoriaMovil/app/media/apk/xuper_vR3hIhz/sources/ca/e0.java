package ca;

import kotlin.coroutines.Continuation;
/* loaded from: classes3.dex */
public enum e0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5748a;

        static {
            int[] iArr = new int[e0.values().length];
            iArr[e0.DEFAULT.ordinal()] = 1;
            iArr[e0.ATOMIC.ordinal()] = 2;
            iArr[e0.UNDISPATCHED.ordinal()] = 3;
            iArr[e0.LAZY.ordinal()] = 4;
            f5748a = iArr;
        }
    }

    public final void b(s9.p pVar, Object obj, Continuation continuation) {
        int i10 = a.f5748a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new h9.j();
                    }
                    return;
                }
                ea.b.a(pVar, obj, continuation);
                return;
            }
            k9.e.a(pVar, obj, continuation);
            return;
        }
        ea.a.d(pVar, obj, continuation, null, 4, null);
    }

    public final boolean c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
