package Q6;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/* renamed from: Q6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281b {
    public static final boolean a(byte[] a7, int i7, byte[] b5, int i8, int i9) {
        kotlin.jvm.internal.j.e(a7, "a");
        kotlin.jvm.internal.j.e(b5, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a7[i10 + i7] != b5[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final s b(y yVar) {
        kotlin.jvm.internal.j.e(yVar, "<this>");
        return new s(yVar);
    }

    public static final void c(long j, long j8, long j9) {
        if ((j8 | j9) >= 0 && j8 <= j && j - j8 >= j9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j8 + " byteCount=" + j9);
    }

    public static g d(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        byte[] bytes = str.getBytes(E6.a.f1074a);
        kotlin.jvm.internal.j.d(bytes, "this as java.lang.String).getBytes(charset)");
        g gVar = new g(bytes);
        gVar.f4466c = str;
        return gVar;
    }

    public static final c e(Socket socket) {
        int i7 = n.f4479a;
        x xVar = new x(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.j.d(outputStream, "getOutputStream()");
        return new c(xVar, new c(outputStream, xVar));
    }

    public static final d f(Socket socket) {
        int i7 = n.f4479a;
        x xVar = new x(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.j.d(inputStream, "getInputStream()");
        return new d(0, xVar, new d(1, inputStream, xVar));
    }
}
