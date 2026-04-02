package Q6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public class l extends j {
    @Override // Q6.j
    public C.e b(o path) {
        kotlin.jvm.internal.j.e(path, "path");
        File e7 = path.e();
        boolean isFile = e7.isFile();
        boolean isDirectory = e7.isDirectory();
        long lastModified = e7.lastModified();
        long length = e7.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e7.exists()) {
            return null;
        }
        return new C.e(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    public void c(o oVar, o target) {
        kotlin.jvm.internal.j.e(target, "target");
        if (oVar.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + oVar + " to " + target);
    }

    public final void d(o oVar) {
        if (!Thread.interrupted()) {
            File e7 = oVar.e();
            if (!e7.delete() && e7.exists()) {
                throw new IOException("failed to delete " + oVar);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public final k e(o oVar) {
        return new k(false, new RandomAccessFile(oVar.e(), "r"));
    }

    public final y f(o file) {
        kotlin.jvm.internal.j.e(file, "file");
        File e7 = file.e();
        int i7 = n.f4479a;
        return new d(1, new FileInputStream(e7), A.f4449a);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
