package q3;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15323a = false;

    /* renamed from: b  reason: collision with root package name */
    public static g f15324b = g.LEGACY;

    /* JADX WARN: Can't wrap try/catch for region: R(15:14|15|(1:17)(1:40)|18|19|(10:21|(1:(1:24))|25|26|(1:28)|29|30|(1:32)|33|34)|39|25|26|(0)|29|30|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        android.util.Log.e("h", "Failed to retrieve renderer type or log initialization.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x0024, RemoteException -> 0x007f, TryCatch #1 {RemoteException -> 0x007f, blocks: (B:26:0x0067, B:28:0x007a, B:31:0x0081), top: B:49:0x0067, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:13:0x0029, B:14:0x002d, B:19:0x0057, B:21:0x005c, B:26:0x0067, B:28:0x007a, B:31:0x0081, B:34:0x009d, B:36:0x00b0, B:33:0x0096, B:17:0x004f, B:40:0x00b8, B:41:0x00bd, B:43:0x00bf), top: B:48:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int a(android.content.Context r6, q3.g r7, A.l r8) {
        /*
            java.lang.Class<q3.h> r0 = q3.h.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.I.j(r6, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "h"
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L24
            boolean r1 = q3.h.f15323a     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L29
            if (r8 == 0) goto L27
            q3.g r6 = q3.h.f15324b     // Catch: java.lang.Throwable -> L24
            r8.j(r6)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r6 = move-exception
            goto Lc3
        L27:
            monitor-exit(r0)
            return r2
        L29:
            r3.e r1 = r3.AbstractC1740d.E(r6, r7)     // Catch: java.lang.Throwable -> L24 W2.g -> Lbe
            r3.a r3 = r1.b()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            com.google.android.gms.common.internal.I.i(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            f7.a.f11074c = r3     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            android.os.Parcel r3 = r1.zza()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            r4 = 5
            android.os.Parcel r3 = r1.zzJ(r4, r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            android.os.IBinder r4 = r3.readStrongBinder()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            com.google.android.gms.internal.maps.zzi r4 = com.google.android.gms.internal.maps.zzh.zzb(r4)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            r3.recycle()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            com.google.android.gms.internal.maps.zzi r3 = F.f.f1098Y     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            if (r3 == 0) goto L4f
            goto L56
        L4f:
            java.lang.String r3 = "delegate must not be null"
            com.google.android.gms.common.internal.I.j(r4, r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
            F.f.f1098Y = r4     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> Lb7
        L56:
            r3 = 1
            q3.h.f15323a = r3     // Catch: java.lang.Throwable -> L24
            r4 = 2
            if (r7 == 0) goto L64
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L67
            if (r7 == r3) goto L66
        L64:
            r3 = r2
            goto L67
        L66:
            r3 = r4
        L67:
            android.os.Parcel r7 = r1.zza()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r5 = 9
            android.os.Parcel r7 = r1.zzJ(r5, r7)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            int r5 = r7.readInt()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r7.recycle()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            if (r5 != r4) goto L81
            q3.g r7 = q3.g.LATEST     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            q3.h.f15324b = r7     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            goto L81
        L7f:
            r6 = move-exception
            goto L96
        L81:
            i3.b r7 = new i3.b     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            android.os.Parcel r6 = r1.zza()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            com.google.android.gms.internal.maps.zzc.zze(r6, r7)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r6.writeInt(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r7 = 10
            r1.zzc(r7, r6)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            goto L9d
        L96:
            java.lang.String r7 = "h"
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r7, r1, r6)     // Catch: java.lang.Throwable -> L24
        L9d:
            java.lang.String r6 = "h"
            q3.g r7 = q3.h.f15324b     // Catch: java.lang.Throwable -> L24
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r7 = r1.concat(r7)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r8 == 0) goto Lb5
            q3.g r6 = q3.h.f15324b     // Catch: java.lang.Throwable -> L24
            r8.j(r6)     // Catch: java.lang.Throwable -> L24
        Lb5:
            monitor-exit(r0)
            return r2
        Lb7:
            r6 = move-exception
            F6.x r7 = new F6.x     // Catch: java.lang.Throwable -> L24
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L24
            throw r7     // Catch: java.lang.Throwable -> L24
        Lbe:
            r6 = move-exception
            int r6 = r6.f6173a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r6
        Lc3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.h.a(android.content.Context, q3.g, A.l):int");
    }
}
