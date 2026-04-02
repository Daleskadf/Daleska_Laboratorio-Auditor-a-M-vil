package V0;

import H0.C0137q;
import H0.I;
import K0.x;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import e1.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class c implements i1.i {

    /* renamed from: j0  reason: collision with root package name */
    public static final P0.b f5804j0 = new P0.b(25);

    /* renamed from: X  reason: collision with root package name */
    public i1.n f5805X;

    /* renamed from: Y  reason: collision with root package name */
    public Handler f5806Y;

    /* renamed from: Z  reason: collision with root package name */
    public U0.m f5807Z;

    /* renamed from: a  reason: collision with root package name */
    public final A.c f5808a;

    /* renamed from: b  reason: collision with root package name */
    public final p f5809b;

    /* renamed from: c  reason: collision with root package name */
    public final Z f5810c;

    /* renamed from: e0  reason: collision with root package name */
    public l f5813e0;
    public T0.d f;

    /* renamed from: f0  reason: collision with root package name */
    public Uri f5814f0;

    /* renamed from: g0  reason: collision with root package name */
    public i f5815g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5816h0;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList f5812e = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5811d = new HashMap();

    /* renamed from: i0  reason: collision with root package name */
    public long f5817i0 = -9223372036854775807L;

    public c(A.c cVar, Z z7, p pVar) {
        this.f5808a = cVar;
        this.f5809b = pVar;
        this.f5810c = z7;
    }

    @Override // i1.i
    public final void E(i1.k kVar, long j, long j8, boolean z7) {
        i1.q qVar = (i1.q) kVar;
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        this.f5810c.getClass();
        this.f.c(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final i a(boolean z7, Uri uri) {
        HashMap hashMap = this.f5811d;
        i iVar = ((b) hashMap.get(uri)).f5799d;
        if (iVar != null && z7) {
            if (!uri.equals(this.f5814f0)) {
                List list = this.f5813e0.f5867e;
                int i7 = 0;
                while (true) {
                    if (i7 >= list.size()) {
                        break;
                    } else if (uri.equals(((k) list.get(i7)).f5860a)) {
                        i iVar2 = this.f5815g0;
                        if (iVar2 == null || !iVar2.f5849o) {
                            this.f5814f0 = uri;
                            b bVar = (b) hashMap.get(uri);
                            i iVar3 = bVar.f5799d;
                            if (iVar3 != null && iVar3.f5849o) {
                                this.f5815g0 = iVar3;
                                this.f5807Z.v(iVar3);
                            } else {
                                bVar.e(b(uri));
                            }
                        }
                    } else {
                        i7++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            i iVar4 = bVar2.f5799d;
            if (!bVar2.f5802f0) {
                bVar2.f5802f0 = true;
                if (iVar4 != null && !iVar4.f5849o) {
                    bVar2.c(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f5815g0;
        if (iVar != null && iVar.f5856v.f5839e && (eVar = (e) iVar.f5854t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f5821b));
            int i7 = eVar.f5822c;
            if (i7 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i7;
        b bVar = (b) this.f5811d.get(uri);
        if (bVar.f5799d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, x.Z(bVar.f5799d.f5855u));
        i iVar = bVar.f5799d;
        if (!iVar.f5849o && (i7 = iVar.f5840d) != 2 && i7 != 1 && bVar.f5800e + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    @Override // i1.i
    public final void j(i1.k kVar, long j, long j8) {
        l lVar;
        i1.q qVar = (i1.q) kVar;
        m mVar = (m) qVar.f;
        boolean z7 = mVar instanceof i;
        if (z7) {
            String str = mVar.f5874a;
            l lVar2 = l.f5865n;
            Uri parse = Uri.parse(str);
            C0137q c0137q = new C0137q();
            c0137q.f1841a = "0";
            c0137q.f1849k = I.l("application/x-mpegURL");
            lVar = new l(StringUtils.EMPTY, Collections.emptyList(), Collections.singletonList(new k(parse, new H0.r(c0137q), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f5813e0 = lVar;
        this.f5814f0 = ((k) lVar.f5867e.get(0)).f5860a;
        this.f5812e.add(new a(this));
        List list = lVar.f5866d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f5811d.put(uri, new b(this, uri));
        }
        Uri uri2 = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        b bVar = (b) this.f5811d.get(this.f5814f0);
        if (z7) {
            bVar.f((i) mVar, rVar);
        } else {
            bVar.c(false);
        }
        this.f5810c.getClass();
        this.f.e(rVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // i1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T1.e y(i1.k r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            i1.q r5 = (i1.q) r5
            e1.r r7 = new e1.r
            long r0 = r5.f11432a
            M0.B r0 = r5.f11435d
            android.net.Uri r0 = r0.f3133c
            r7.<init>(r8)
            com.google.firebase.firestore.Z r8 = r4.f5810c
            r8.getClass()
            boolean r8 = r10 instanceof H0.J
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof M0.t
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof i1.m
            if (r8 != 0) goto L4c
            int r8 = M0.i.f3158b
            r8 = r10
        L2c:
            if (r8 == 0) goto L41
            boolean r2 = r8 instanceof M0.i
            if (r2 == 0) goto L3c
            r2 = r8
            M0.i r2 = (M0.i) r2
            int r2 = r2.f3159a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3c
            goto L4c
        L3c:
            java.lang.Throwable r8 = r8.getCause()
            goto L2c
        L41:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L4d
        L4c:
            r2 = r0
        L4d:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L53
        L52:
            r9 = r6
        L53:
            T0.d r8 = r4.f
            int r5 = r5.f11434c
            r8.i(r7, r5, r10, r9)
            if (r9 == 0) goto L5f
            T1.e r5 = i1.n.f
            goto L64
        L5f:
            T1.e r5 = new T1.e
            r5.<init>(r6, r2, r6)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.c.y(i1.k, long, long, java.io.IOException, int):T1.e");
    }
}
