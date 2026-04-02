package e0;

import S.k;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final S.j f10605a = new S.j(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f10606b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10607c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f10608d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new G.f(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f10606b = threadPoolExecutor;
        f10607c = new Object();
        f10608d = new k(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((C0930e) list.get(i8)).f10597e);
            sb.append("-");
            sb.append(i7);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:33:0x0054, B:36:0x005d, B:38:0x0063, B:40:0x0069, B:42:0x007a, B:50:0x009f, B:53:0x00ab, B:46:0x0083, B:48:0x009a, B:17:0x0032, B:19:0x003a, B:22:0x003e, B:24:0x0042, B:29:0x004d, B:59:0x00b9, B:47:0x0094, B:41:0x0074), top: B:66:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x0020, B:11:0x0024, B:33:0x0054, B:36:0x005d, B:38:0x0063, B:40:0x0069, B:42:0x007a, B:50:0x009f, B:53:0x00ab, B:46:0x0083, B:48:0x009a, B:17:0x0032, B:19:0x003a, B:22:0x003e, B:24:0x0042, B:29:0x004d, B:59:0x00b9, B:47:0x0094, B:41:0x0074), top: B:66:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = F.f.D(r1)
            android.os.Trace.beginSection(r1)
            S.j r1 = e0.h.f10605a
            java.lang.Object r2 = r1.get(r8)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L20
            e0.g r8 = new e0.g     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L1d:
            r8 = move-exception
            goto Lc3
        L20:
            S1.f r10 = e0.AbstractC0929d.a(r9, r10)     // Catch: java.lang.Throwable -> L1d android.content.pm.PackageManager.NameNotFoundException -> Lb9
            int r2 = r10.f5011a     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            java.util.List r10 = r10.f5012b
            r4 = -3
            if (r2 == 0) goto L32
            if (r2 == r0) goto L30
        L2e:
            r2 = r4
            goto L52
        L30:
            r2 = -2
            goto L52
        L32:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            e0.i[] r2 = (e0.i[]) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L51
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L3e
            goto L51
        L3e:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1d
            r6 = r3
        L40:
            if (r6 >= r5) goto L4f
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L1d
            int r7 = r7.f10613e     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L4d
            if (r7 >= 0) goto L4b
            goto L2e
        L4b:
            r2 = r7
            goto L52
        L4d:
            int r6 = r6 + r0
            goto L40
        L4f:
            r2 = r3
            goto L52
        L51:
            r2 = r0
        L52:
            if (r2 == 0) goto L5d
            e0.g r8 = new e0.g     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        L5d:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L1d
            if (r2 <= r0) goto L83
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r2 = 29
            if (r0 < r2) goto L83
            android.support.v4.media.session.a r0 = Z.f.f6716a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r0 = F.f.D(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            android.support.v4.media.session.a r0 = Z.f.f6716a     // Catch: java.lang.Throwable -> L7e
            android.graphics.Typeface r9 = r0.e(r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            goto L9d
        L7e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L83:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L1d
            e0.i[] r10 = (e0.i[]) r10     // Catch: java.lang.Throwable -> L1d
            android.support.v4.media.session.a r0 = Z.f.f6716a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r0 = F.f.D(r0)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1d
            android.support.v4.media.session.a r0 = Z.f.f6716a     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r9 = r0.d(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
        L9d:
            if (r9 == 0) goto Lab
            r1.put(r8, r9)     // Catch: java.lang.Throwable -> L1d
            e0.g r8 = new e0.g     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lab:
            e0.g r8 = new e0.g     // Catch: java.lang.Throwable -> L1d
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        Lb9:
            e0.g r8 = new e0.g     // Catch: java.lang.Throwable -> L1d
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1d
            android.os.Trace.endSection()
            return r8
        Lc3:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h.b(java.lang.String, android.content.Context, java.util.List, int):e0.g");
    }
}
