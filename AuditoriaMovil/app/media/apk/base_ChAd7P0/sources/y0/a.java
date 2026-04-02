package Y0;

import A1.h;
import C1.c;
import H0.r;
import a.AbstractC0412a;
import w1.C1950b;
import z1.C2066a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6585a = new Object();

    public final AbstractC0412a a(r rVar) {
        String str = rVar.f1886m;
        if (str != null) {
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    return new C1950b(0);
                case 1:
                    return new C2066a();
                case 2:
                    return new h(null);
                case 3:
                    return new C1950b(1);
                case 4:
                    return new c();
            }
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(r rVar) {
        String str = rVar.f1886m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
