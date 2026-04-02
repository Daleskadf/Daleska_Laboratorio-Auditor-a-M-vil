package V0;

import A3.AbstractC0021t;
import A3.K;
import B5.S;
import D.RunnableC0053c;
import H0.J;
import K0.x;
import M0.w;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import e1.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements i1.i {

    /* renamed from: X  reason: collision with root package name */
    public long f5793X;

    /* renamed from: Y  reason: collision with root package name */
    public long f5794Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f5795Z;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f5796a;

    /* renamed from: b  reason: collision with root package name */
    public final i1.n f5797b = new i1.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c  reason: collision with root package name */
    public final M0.h f5798c;

    /* renamed from: d  reason: collision with root package name */
    public i f5799d;

    /* renamed from: e  reason: collision with root package name */
    public long f5800e;

    /* renamed from: e0  reason: collision with root package name */
    public IOException f5801e0;
    public long f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5802f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ c f5803g0;

    public b(c cVar, Uri uri) {
        this.f5803g0 = cVar;
        this.f5796a = uri;
        this.f5798c = ((M0.g) cVar.f5808a.f4b).a();
    }

    public static boolean a(b bVar, long j) {
        bVar.f5794Y = SystemClock.elapsedRealtime() + j;
        c cVar = bVar.f5803g0;
        if (!bVar.f5796a.equals(cVar.f5814f0)) {
            return false;
        }
        List list = cVar.f5813e0.f5867e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) cVar.f5811d.get(((k) list.get(i7)).f5860a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f5794Y) {
                Uri uri = bVar2.f5796a;
                cVar.f5814f0 = uri;
                bVar2.e(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    @Override // i1.i
    public final void E(i1.k kVar, long j, long j8, boolean z7) {
        i1.q qVar = (i1.q) kVar;
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        c cVar = this.f5803g0;
        cVar.f5810c.getClass();
        cVar.f.c(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        i iVar = this.f5799d;
        Uri uri = this.f5796a;
        if (iVar != null) {
            h hVar = iVar.f5856v;
            if (hVar.f5835a != -9223372036854775807L || hVar.f5839e) {
                Uri.Builder buildUpon = uri.buildUpon();
                i iVar2 = this.f5799d;
                if (iVar2.f5856v.f5839e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar2.f5845k + iVar2.f5852r.size()));
                    i iVar3 = this.f5799d;
                    if (iVar3.f5848n != -9223372036854775807L) {
                        K k2 = iVar3.f5853s;
                        int size = k2.size();
                        if (!k2.isEmpty() && ((d) AbstractC0021t.l(k2)).f5819h0) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                h hVar2 = this.f5799d.f5856v;
                if (hVar2.f5835a != -9223372036854775807L) {
                    if (hVar2.f5836b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z7) {
        Uri uri;
        if (z7) {
            uri = b();
        } else {
            uri = this.f5796a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f5803g0;
        i1.q qVar = new i1.q(this.f5798c, uri, 4, cVar.f5809b.k(cVar.f5813e0, this.f5799d));
        Z z7 = cVar.f5810c;
        int i7 = qVar.f11434c;
        cVar.f.k(new r(qVar.f11432a, qVar.f11433b, this.f5797b.f(qVar, this, z7.w(i7))), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f5794Y = 0L;
        if (!this.f5795Z) {
            i1.n nVar = this.f5797b;
            if (!nVar.d() && !nVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f5793X;
                if (elapsedRealtime < j) {
                    this.f5795Z = true;
                    this.f5803g0.f5806Y.postDelayed(new RunnableC0053c(18, this, uri), j - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(V0.i r65, e1.r r66) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.f(V0.i, e1.r):void");
    }

    @Override // i1.i
    public final void j(i1.k kVar, long j, long j8) {
        i1.q qVar = (i1.q) kVar;
        m mVar = (m) qVar.f;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        if (mVar instanceof i) {
            f((i) mVar, rVar);
            this.f5803g0.f.e(rVar, 4);
        } else {
            J b5 = J.b("Loaded playlist has unexpected type.", null);
            this.f5801e0 = b5;
            this.f5803g0.f.i(rVar, 4, b5, true);
        }
        this.f5803g0.f5810c.getClass();
    }

    @Override // i1.i
    public final T1.e y(i1.k kVar, long j, long j8, IOException iOException, int i7) {
        boolean z7;
        int i8;
        i1.q qVar = (i1.q) kVar;
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z8 = iOException instanceof n;
        T1.e eVar = i1.n.f11428e;
        c cVar = this.f5803g0;
        int i9 = qVar.f11434c;
        if (z7 || z8) {
            if (iOException instanceof w) {
                i8 = ((w) iOException).f3207d;
            } else {
                i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            if (z8 || i8 == 400 || i8 == 503) {
                this.f5793X = SystemClock.elapsedRealtime();
                c(false);
                T0.d dVar = cVar.f;
                int i10 = x.f2529a;
                dVar.i(rVar, i9, iOException, true);
                return eVar;
            }
        }
        S s7 = new S(iOException, i7, 9);
        Iterator it = cVar.f5812e.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= !((q) it.next()).a(this.f5796a, s7, false);
        }
        Z z10 = cVar.f5810c;
        if (z9) {
            z10.getClass();
            long y2 = Z.y(s7);
            if (y2 != -9223372036854775807L) {
                eVar = new T1.e(0, y2, false);
            } else {
                eVar = i1.n.f;
            }
        }
        boolean a7 = eVar.a();
        cVar.f.i(rVar, i9, iOException, true ^ a7);
        if (!a7) {
            z10.getClass();
        }
        return eVar;
    }
}
