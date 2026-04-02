package S6;

import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Supplier;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5279a;

    static {
        char c8 = File.separatorChar;
        f5279a = new byte[0];
        System.lineSeparator();
        d.LF.getClass();
        d.CRLF.getClass();
        final Supplier supplier = new Supplier() { // from class: S6.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (r1) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        new ThreadLocal() { // from class: S6.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (r2) {
                    case 0:
                        ((a) supplier).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier).getClass();
                        return new char[8192];
                }
            }
        };
        final Supplier supplier2 = new Supplier() { // from class: S6.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (r1) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        new ThreadLocal() { // from class: S6.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (r2) {
                    case 0:
                        ((a) supplier2).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier2).getClass();
                        return new char[8192];
                }
            }
        };
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }
}
