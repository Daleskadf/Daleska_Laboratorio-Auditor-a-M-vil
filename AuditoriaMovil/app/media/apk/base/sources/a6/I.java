package a6;

import c6.q2;
import java.nio.charset.Charset;
import java.util.BitSet;
/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7083a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final B3.c f7084b = e0.f7141e;

    public static c0 a(String str, q2 q2Var) {
        boolean z7 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z7 = true;
        }
        BitSet bitSet = b0.f7117d;
        return new c0(str, z7, q2Var);
    }
}
