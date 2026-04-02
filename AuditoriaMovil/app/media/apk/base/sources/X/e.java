package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f6235a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6236b = new HashMap();

    public e(String str) {
        this.f6235a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf != -1) {
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f6236b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    String path = canonicalFile.getPath();
                    String path2 = file.getPath();
                    String a7 = f.a(path);
                    String a8 = f.a(path2);
                    if (a7.startsWith(a8 + '/')) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        throw new IllegalArgumentException("Unable to find path from root: " + uri);
    }
}
