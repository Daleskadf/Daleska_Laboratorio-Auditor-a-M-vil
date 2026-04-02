package io.flutter.plugins.videoplayer;

import A3.e0;
import H0.A;
import H0.C;
import H0.C0140u;
import H0.C0141v;
import H0.C0143x;
import H0.C0144y;
import H0.C0145z;
import H0.F;
import a1.u;
import a4.AbstractC0452a;
import android.content.Context;
import android.net.Uri;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.C0949n;
import e1.InterfaceC0959y;
import f5.C0993a;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class e extends AbstractC0452a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i7) {
        super(str);
        this.f12404b = i7;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [H0.w, H0.v] */
    /* JADX WARN: Type inference failed for: r10v2, types: [H0.w, H0.v] */
    @Override // a4.AbstractC0452a
    public final C b() {
        Uri parse;
        C0145z c0145z;
        Uri parse2;
        C0145z c0145z2;
        switch (this.f12404b) {
            case 0:
                C0140u c0140u = new C0140u();
                new t2.i();
                List emptyList = Collections.emptyList();
                e0 e0Var = e0.f138e;
                C0143x c0143x = new C0143x();
                A a7 = A.f1640a;
                String str = this.f7007a;
                if (str == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(str);
                }
                Uri uri = parse;
                if (uri != null) {
                    c0145z = new C0145z(uri, null, null, emptyList, e0Var, -9223372036854775807L);
                } else {
                    c0145z = null;
                }
                return new C(StringUtils.EMPTY, new C0141v(c0140u), c0145z, new C0144y(c0143x), F.f1669y, a7);
            default:
                C0140u c0140u2 = new C0140u();
                new t2.i();
                List emptyList2 = Collections.emptyList();
                e0 e0Var2 = e0.f138e;
                C0143x c0143x2 = new C0143x();
                A a8 = A.f1640a;
                String str2 = this.f7007a;
                if (str2 == null) {
                    parse2 = null;
                } else {
                    parse2 = Uri.parse(str2);
                }
                Uri uri2 = parse2;
                if (uri2 != null) {
                    c0145z2 = new C0145z(uri2, null, null, emptyList2, e0Var2, -9223372036854775807L);
                } else {
                    c0145z2 = null;
                }
                return new C(StringUtils.EMPTY, new C0141v(c0140u2), c0145z2, new C0144y(c0143x2), F.f1669y, a8);
        }
    }

    @Override // a4.AbstractC0452a
    public final InterfaceC0959y c(Context context) {
        switch (this.f12404b) {
            case 0:
                return new C0949n(context);
            default:
                return new InterfaceC0959y() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* renamed from: a  reason: collision with root package name */
                    public final SocketFactory f7977a = SocketFactory.getDefault();

                    @Override // e1.InterfaceC0959y
                    public final InterfaceC0959y a(boolean z7) {
                        return this;
                    }

                    @Override // e1.InterfaceC0959y
                    public final AbstractC0936a b(C c8) {
                        c8.f1642b.getClass();
                        return new u(c8, new Z(14), this.f7977a);
                    }

                    @Override // e1.InterfaceC0959y
                    public final InterfaceC0959y c(C0993a c0993a) {
                        return this;
                    }
                };
        }
    }
}
