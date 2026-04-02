package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class ea {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackMetadataManager");
    private final bh b;
    private final ec c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ea(bh bhVar, ec ecVar) {
        this.b = bhVar;
        this.c = ecVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        if (this.b.G(str)) {
            ec ecVar = this.c;
            bh bhVar = this.b;
            int a2 = ecVar.a();
            File k = bhVar.k(str, a2, bhVar.c(str));
            try {
                if (!k.exists()) {
                    return String.valueOf(a2);
                }
                FileInputStream fileInputStream = new FileInputStream(k);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(a2) : property;
            } catch (IOException unused) {
                a.b("Failed to read pack version tag for pack %s", str);
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File k = this.b.k(str, i, j);
        k.getParentFile().mkdirs();
        k.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(k);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
