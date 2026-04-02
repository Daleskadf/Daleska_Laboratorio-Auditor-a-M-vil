package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class eo {
    private static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.en
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                boolean matches;
                matches = eo.a.matcher(str).matches();
                return matches;
            }
        });
        if (listFiles != null) {
            File[] fileArr2 = new File[listFiles.length];
            int i = 0;
            while (true) {
                int length = listFiles.length;
                if (i >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = listFiles[i];
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > length || fileArr2[parseInt] != null) {
                    break;
                }
                fileArr2[parseInt] = file3;
                i++;
            }
            throw new ck("Metadata folder ordering corrupt.");
        }
        fileArr = new File[0];
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    es b = new bw(fileInputStream).b();
                    if (b.c() != null) {
                        File file5 = new File(file, b.c());
                        if (!file5.exists()) {
                            throw new ck(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                        arrayList.add(file5);
                        fileInputStream.close();
                    } else {
                        throw new ck("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
