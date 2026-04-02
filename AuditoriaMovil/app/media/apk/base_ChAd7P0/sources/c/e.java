package C;

import D.J;
import G.k;
import androidx.camera.core.impl.C0501c;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.W;
import java.util.ArrayList;
import java.util.Map;
import m6.AbstractC1447h;
import m6.q;
import w.C1925j;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f420b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f421c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f422d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f423e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f424g;

    /* renamed from: h  reason: collision with root package name */
    public Object f425h;

    public e(boolean z7, boolean z8, Long l8, Long l9, Long l10, Long l11) {
        this.f419a = 1;
        this.f420b = z7;
        this.f421c = z8;
        this.f422d = l8;
        this.f423e = l9;
        this.f = l10;
        this.f424g = l11;
        this.f425h = q.f14075a;
    }

    public void a(J j) {
        synchronized (this.f) {
            W w2 = ((J) this.f424g).f620b;
            F f = F.ALWAYS_OVERRIDE;
            for (C0501c c0501c : w2.H()) {
                j.f620b.i(c0501c, f, w2.G(c0501c));
            }
        }
    }

    public String toString() {
        switch (this.f419a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f420b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f421c) {
                    arrayList.add("isDirectory");
                }
                Long l8 = (Long) this.f422d;
                if (l8 != null) {
                    arrayList.add("byteCount=" + l8);
                }
                Long l9 = (Long) this.f423e;
                if (l9 != null) {
                    arrayList.add("createdAt=" + l9);
                }
                Long l10 = (Long) this.f;
                if (l10 != null) {
                    arrayList.add("lastModifiedAt=" + l10);
                }
                Long l11 = (Long) this.f424g;
                if (l11 != null) {
                    arrayList.add("lastAccessedAt=" + l11);
                }
                Map map = (Map) this.f425h;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC1447h.R(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(C1925j c1925j, k kVar) {
        this.f419a = 0;
        this.f420b = false;
        this.f421c = false;
        this.f = new Object();
        this.f424g = new J(2);
        this.f422d = c1925j;
        this.f423e = kVar;
    }
}
