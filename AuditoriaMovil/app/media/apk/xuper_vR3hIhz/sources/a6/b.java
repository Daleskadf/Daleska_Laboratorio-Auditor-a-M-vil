package a6;

import ba.t;
import w6.i;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f248a = new b();

    public final String a(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return "";
        }
        if (t.o(str, "_Recommended", false, 2, null)) {
            return i.f19214g.v() + "_1";
        } else if (t.o(str, "_movies", false, 2, null)) {
            return i.f19214g.v() + "_2";
        } else if (t.o(str, "_series", false, 2, null)) {
            return i.f19214g.v() + "_3";
        } else if (t.o(str, "_kids", false, 2, null)) {
            return i.f19214g.v() + "_4";
        } else if (!t.o(str, "_animes", false, 2, null)) {
            return "";
        } else {
            return i.f19214g.v() + "_5";
        }
    }
}
