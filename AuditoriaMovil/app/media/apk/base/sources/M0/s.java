package M0;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class s extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public long f3203X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f3204Y;

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f3205e;
    public Uri f;

    @Override // M0.h
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3205e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new i(e7, 2000);
            }
        } finally {
            this.f3205e = null;
            if (this.f3204Y) {
                this.f3204Y = false;
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r1 != false) goto L32;
     */
    @Override // M0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(M0.l r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f3172a
            long r1 = r9.f3176e
            r8.f = r0
            r8.h()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f3205e = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f3205e     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f3203X = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r0 = 1
            r8.f3204Y = r0
            r8.k(r9)
            long r0 = r8.f3203X
            return r0
        L43:
            M0.r r9 = new M0.r
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r0, r1)
            throw r9
        L4c:
            M0.r r0 = new M0.r
            r0.<init>(r9, r3)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            M0.r r0 = new M0.r
            r0.<init>(r9, r3)
            throw r0
        L5e:
            M0.r r0 = new M0.r
            r0.<init>(r9, r4)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            M0.r r0 = new M0.r
            int r1 = K0.x.f2529a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = M0.q.a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r9, r4)
            throw r0
        L91:
            M0.r r1 = new M0.r
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.String r4 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path="
            java.lang.String r5 = ",query="
            java.lang.String r6 = ",fragment="
            java.lang.StringBuilder r2 = io.flutter.plugins.pathprovider.b.l(r4, r2, r5, r3, r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r9, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.s.e(M0.l):long");
    }

    @Override // M0.h
    public final Uri p() {
        return this.f;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f3203X;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f3205e;
            int i9 = K0.x.f2529a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j, i8));
            if (read > 0) {
                this.f3203X -= read;
                b(read);
            }
            return read;
        } catch (IOException e7) {
            throw new i(e7, 2000);
        }
    }
}
