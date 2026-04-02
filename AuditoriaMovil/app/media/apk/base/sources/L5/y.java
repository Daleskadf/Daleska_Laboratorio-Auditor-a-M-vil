package L5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class y implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final y f3047b = new y(x.f3044a);

    /* renamed from: a  reason: collision with root package name */
    public final x f3048a;

    public y(x xVar) {
        this.f3048a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, L5.w, java.io.ByteArrayOutputStream] */
    @Override // L5.s
    public final ByteBuffer a(Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        this.f3048a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L5.w, java.io.ByteArrayOutputStream] */
    @Override // L5.s
    public final ByteBuffer b(o oVar) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        x xVar = this.f3048a;
        xVar.k(byteArrayOutputStream, oVar.f3038a);
        xVar.k(byteArrayOutputStream, oVar.f3039b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, L5.w, java.io.ByteArrayOutputStream] */
    @Override // L5.s
    public final ByteBuffer c(String str, String str2) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        x xVar = this.f3048a;
        xVar.k(byteArrayOutputStream, "error");
        xVar.k(byteArrayOutputStream, str);
        xVar.k(byteArrayOutputStream, null);
        xVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, L5.w, java.io.ByteArrayOutputStream] */
    @Override // L5.s
    public final ByteBuffer d(Object obj, String str, String str2) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        x xVar = this.f3048a;
        xVar.k(byteArrayOutputStream, str);
        xVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            xVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            xVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // L5.s
    public final o e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        x xVar = this.f3048a;
        Object e7 = xVar.e(byteBuffer);
        Object e8 = xVar.e(byteBuffer);
        if ((e7 instanceof String) && !byteBuffer.hasRemaining()) {
            return new o((String) e7, e8);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // L5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            L5.x r1 = r4.f3048a
            if (r0 == 0) goto L13
            r2 = 1
            if (r0 != r2) goto L44
            goto L1e
        L13:
            java.lang.Object r0 = r1.e(r5)
            boolean r2 = r5.hasRemaining()
            if (r2 != 0) goto L1e
            return r0
        L1e:
            java.lang.Object r0 = r1.e(r5)
            java.lang.Object r2 = r1.e(r5)
            java.lang.Object r1 = r1.e(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L44
            if (r2 == 0) goto L34
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L44
        L34:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L44
            L5.k r5 = new L5.k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r0, r2)
            throw r5
        L44:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.y.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
