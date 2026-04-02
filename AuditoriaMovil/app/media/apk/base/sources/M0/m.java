package M0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: X  reason: collision with root package name */
    public h f3179X;

    /* renamed from: Y  reason: collision with root package name */
    public E f3180Y;

    /* renamed from: Z  reason: collision with root package name */
    public f f3181Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3182a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3183b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3184c;

    /* renamed from: d  reason: collision with root package name */
    public s f3185d;

    /* renamed from: e  reason: collision with root package name */
    public C0235b f3186e;

    /* renamed from: e0  reason: collision with root package name */
    public A f3187e0;
    public C0238e f;

    /* renamed from: f0  reason: collision with root package name */
    public h f3188f0;

    public m(Context context, h hVar) {
        this.f3182a = context.getApplicationContext();
        hVar.getClass();
        this.f3184c = hVar;
        this.f3183b = new ArrayList();
    }

    public static void c(h hVar, C c8) {
        if (hVar != null) {
            hVar.n(c8);
        }
    }

    public final void b(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3183b;
            if (i7 < arrayList.size()) {
                hVar.n((C) arrayList.get(i7));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // M0.h
    public final void close() {
        h hVar = this.f3188f0;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f3188f0 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [M0.f, M0.c, M0.h] */
    /* JADX WARN: Type inference failed for: r0v8, types: [M0.c, M0.s, M0.h] */
    @Override // M0.h
    public final long e(l lVar) {
        boolean z7;
        if (this.f3188f0 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        String scheme = lVar.f3172a.getScheme();
        int i7 = K0.x.f2529a;
        Uri uri = lVar.f3172a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f3182a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f3186e == null) {
                    C0235b c0235b = new C0235b(context);
                    this.f3186e = c0235b;
                    b(c0235b);
                }
                this.f3188f0 = this.f3186e;
            } else if ("content".equals(scheme)) {
                if (this.f == null) {
                    C0238e c0238e = new C0238e(context);
                    this.f = c0238e;
                    b(c0238e);
                }
                this.f3188f0 = this.f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f3184c;
                if (equals) {
                    if (this.f3179X == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f3179X = hVar2;
                            b(hVar2);
                        } catch (ClassNotFoundException unused) {
                            K0.a.A("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e7) {
                            throw new RuntimeException("Error instantiating RTMP extension", e7);
                        }
                        if (this.f3179X == null) {
                            this.f3179X = hVar;
                        }
                    }
                    this.f3188f0 = this.f3179X;
                } else if ("udp".equals(scheme)) {
                    if (this.f3180Y == null) {
                        E e8 = new E(8000);
                        this.f3180Y = e8;
                        b(e8);
                    }
                    this.f3188f0 = this.f3180Y;
                } else if ("data".equals(scheme)) {
                    if (this.f3181Z == null) {
                        ?? abstractC0236c = new AbstractC0236c(false);
                        this.f3181Z = abstractC0236c;
                        b(abstractC0236c);
                    }
                    this.f3188f0 = this.f3181Z;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f3188f0 = hVar;
                } else {
                    if (this.f3187e0 == null) {
                        A a7 = new A(context);
                        this.f3187e0 = a7;
                        b(a7);
                    }
                    this.f3188f0 = this.f3187e0;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f3186e == null) {
                    C0235b c0235b2 = new C0235b(context);
                    this.f3186e = c0235b2;
                    b(c0235b2);
                }
                this.f3188f0 = this.f3186e;
            } else {
                if (this.f3185d == null) {
                    ?? abstractC0236c2 = new AbstractC0236c(false);
                    this.f3185d = abstractC0236c2;
                    b(abstractC0236c2);
                }
                this.f3188f0 = this.f3185d;
            }
        }
        return this.f3188f0.e(lVar);
    }

    @Override // M0.h
    public final Map j() {
        h hVar = this.f3188f0;
        if (hVar == null) {
            return Collections.emptyMap();
        }
        return hVar.j();
    }

    @Override // M0.h
    public final void n(C c8) {
        c8.getClass();
        this.f3184c.n(c8);
        this.f3183b.add(c8);
        c(this.f3185d, c8);
        c(this.f3186e, c8);
        c(this.f, c8);
        c(this.f3179X, c8);
        c(this.f3180Y, c8);
        c(this.f3181Z, c8);
        c(this.f3187e0, c8);
    }

    @Override // M0.h
    public final Uri p() {
        h hVar = this.f3188f0;
        if (hVar == null) {
            return null;
        }
        return hVar.p();
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        h hVar = this.f3188f0;
        hVar.getClass();
        return hVar.read(bArr, i7, i8);
    }
}
