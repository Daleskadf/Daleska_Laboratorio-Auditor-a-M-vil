package b1;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4412a = a1.k.f("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f4413b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static File c(Context context, String str) {
        File noBackupFilesDir;
        noBackupFilesDir = context.getNoBackupFilesDir();
        return new File(noBackupFilesDir, str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        String format;
        File b10 = b(context);
        if (Build.VERSION.SDK_INT >= 23 && b10.exists()) {
            a1.k.c().a(f4412a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map f10 = f(context);
            for (File file : f10.keySet()) {
                File file2 = (File) f10.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        a1.k.c().h(f4412a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    if (file.renameTo(file2)) {
                        format = String.format("Migrated %s to %s", file, file2);
                    } else {
                        format = String.format("Renaming %s to %s failed", file, file2);
                    }
                    a1.k.c().a(f4412a, format, new Throwable[0]);
                }
            }
        }
    }

    public static Map f(Context context) {
        File b10;
        File a10;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : f4413b) {
                hashMap.put(new File(b10.getPath() + str), new File(a10.getPath() + str));
            }
        }
        return hashMap;
    }
}
