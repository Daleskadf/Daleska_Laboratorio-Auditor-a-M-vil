package Q6;

import com.google.firebase.firestore.Z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
/* loaded from: classes.dex */
public final class m extends l {
    public static Long g(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // Q6.l, Q6.j
    public final C.e b(o path) {
        Path path2;
        Long l8;
        Long l9;
        kotlin.jvm.internal.j.e(path, "path");
        Path f = path.f();
        Long l10 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(f, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(f);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = o.f4480b;
                Z.s(path2.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l8 = g(creationTime);
            } else {
                l8 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l9 = g(lastModifiedTime);
            } else {
                l9 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l10 = g(lastAccessTime);
            }
            return new C.e(isRegularFile, isDirectory, valueOf, l8, l9, l10);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // Q6.l
    public final void c(o oVar, o target) {
        kotlin.jvm.internal.j.e(target, "target");
        try {
            Files.move(oVar.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e7) {
            throw new FileNotFoundException(e7.getMessage());
        }
    }

    @Override // Q6.l
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
