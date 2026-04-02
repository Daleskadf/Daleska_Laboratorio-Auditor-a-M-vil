package F0;

import A.f;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Looper looper, int i7) {
        super(looper);
        this.f1105a = i7;
        this.f1106b = obj;
    }

    private final void a(Message message) {
        int size;
        f[] fVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        c cVar = (c) this.f1106b;
        while (true) {
            synchronized (cVar.f1113b) {
                try {
                    size = cVar.f1115d.size();
                    if (size <= 0) {
                        return;
                    }
                    fVarArr = new f[size];
                    cVar.f1115d.toArray(fVarArr);
                    cVar.f1115d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = fVarArr[i7];
                int size2 = ((ArrayList) fVar.f11c).size();
                for (int i8 = 0; i8 < size2; i8++) {
                    b bVar = (b) ((ArrayList) fVar.f11c).get(i8);
                    if (!bVar.f1110d) {
                        bVar.f1108b.onReceive(cVar.f1112a, (Intent) fVar.f10b);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r0 = r11.f1105a
            switch(r0) {
                case 0: goto Lb4;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f1106b
            X0.e r0 = (X0.e) r0
            r0.getClass()
            int r1 = r12.what
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L88
            r2 = 2
            if (r1 == r2) goto L5a
            r2 = 3
            if (r1 == r2) goto L54
            r2 = 4
            if (r1 == r2) goto L38
            java.util.concurrent.atomic.AtomicReference r1 = r0.f6262d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r12 = r12.what
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.<init>(r12)
        L28:
            boolean r12 = r1.compareAndSet(r3, r2)
            if (r12 == 0) goto L30
            goto Lae
        L30:
            java.lang.Object r12 = r1.get()
            if (r12 == 0) goto L28
            goto Lae
        L38:
            java.lang.Object r12 = r12.obj
            android.os.Bundle r12 = (android.os.Bundle) r12
            android.media.MediaCodec r1 = r0.f6259a     // Catch: java.lang.RuntimeException -> L43
            r1.setParameters(r12)     // Catch: java.lang.RuntimeException -> L43
            goto Lae
        L43:
            r12 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r0.f6262d
        L46:
            boolean r0 = r1.compareAndSet(r3, r12)
            if (r0 == 0) goto L4d
            goto Lae
        L4d:
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L46
            goto Lae
        L54:
            A.n r12 = r0.f6263e
            r12.d()
            goto Lae
        L5a:
            java.lang.Object r12 = r12.obj
            r1 = r12
            X0.d r1 = (X0.d) r1
            int r5 = r1.f6252a
            android.media.MediaCodec$CryptoInfo r7 = r1.f6254c
            long r8 = r1.f6255d
            int r10 = r1.f6256e
            java.lang.Object r12 = X0.e.f6258Y     // Catch: java.lang.RuntimeException -> L75
            monitor-enter(r12)     // Catch: java.lang.RuntimeException -> L75
            android.media.MediaCodec r4 = r0.f6259a     // Catch: java.lang.Throwable -> L72
            r6 = 0
            r4.queueSecureInputBuffer(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L72
            goto L86
        L72:
            r2 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L72
            throw r2     // Catch: java.lang.RuntimeException -> L75
        L75:
            r12 = move-exception
            r2 = r12
            java.util.concurrent.atomic.AtomicReference r4 = r0.f6262d
        L79:
            boolean r12 = r4.compareAndSet(r3, r2)
            if (r12 == 0) goto L80
            goto L86
        L80:
            java.lang.Object r12 = r4.get()
            if (r12 == 0) goto L79
        L86:
            r3 = r1
            goto Lae
        L88:
            java.lang.Object r12 = r12.obj
            r1 = r12
            X0.d r1 = (X0.d) r1
            int r5 = r1.f6252a
            int r7 = r1.f6253b
            long r8 = r1.f6255d
            int r10 = r1.f6256e
            android.media.MediaCodec r4 = r0.f6259a     // Catch: java.lang.RuntimeException -> L9c
            r6 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch: java.lang.RuntimeException -> L9c
            goto Lad
        L9c:
            r12 = move-exception
            r2 = r12
            java.util.concurrent.atomic.AtomicReference r0 = r0.f6262d
        La0:
            boolean r12 = r0.compareAndSet(r3, r2)
            if (r12 == 0) goto La7
            goto Lad
        La7:
            java.lang.Object r12 = r0.get()
            if (r12 == 0) goto La0
        Lad:
            goto L86
        Lae:
            if (r3 == 0) goto Lb3
            X0.e.f(r3)
        Lb3:
            return
        Lb4:
            r11.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.a.handleMessage(android.os.Message):void");
    }
}
