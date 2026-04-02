package M0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class B implements h {

    /* renamed from: a  reason: collision with root package name */
    public final h f3131a;

    /* renamed from: b  reason: collision with root package name */
    public long f3132b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f3133c;

    public B(h hVar) {
        hVar.getClass();
        this.f3131a = hVar;
        this.f3133c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // M0.h
    public final void close() {
        this.f3131a.close();
    }

    @Override // M0.h
    public final long e(l lVar) {
        this.f3133c = lVar.f3172a;
        Collections.emptyMap();
        h hVar = this.f3131a;
        long e7 = hVar.e(lVar);
        Uri p7 = hVar.p();
        p7.getClass();
        this.f3133c = p7;
        hVar.j();
        return e7;
    }

    @Override // M0.h
    public final Map j() {
        return this.f3131a.j();
    }

    @Override // M0.h
    public final void n(C c8) {
        c8.getClass();
        this.f3131a.n(c8);
    }

    @Override // M0.h
    public final Uri p() {
        return this.f3131a.p();
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f3131a.read(bArr, i7, i8);
        if (read != -1) {
            this.f3132b += read;
        }
        return read;
    }
}
