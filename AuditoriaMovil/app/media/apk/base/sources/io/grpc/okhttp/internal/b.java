package io.grpc.okhttp.internal;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12534a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f12535b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f12536c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12537d;

    public b(boolean z7) {
        this.f12534a = z7;
    }

    public final void a(a... aVarArr) {
        if (this.f12534a) {
            String[] strArr = new String[aVarArr.length];
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                strArr[i7] = aVarArr[i7].javaName;
            }
            this.f12535b = strArr;
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void b(n... nVarArr) {
        if (this.f12534a) {
            if (nVarArr.length != 0) {
                String[] strArr = new String[nVarArr.length];
                for (int i7 = 0; i7 < nVarArr.length; i7++) {
                    strArr[i7] = nVarArr[i7].javaName;
                }
                this.f12536c = strArr;
                return;
            }
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public b(c cVar) {
        this.f12534a = cVar.f12539a;
        this.f12535b = cVar.f12540b;
        this.f12536c = cVar.f12541c;
        this.f12537d = cVar.f12542d;
    }
}
