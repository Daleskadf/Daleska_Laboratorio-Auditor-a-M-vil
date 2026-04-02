package com.google.android.recaptcha.internal;

import G.i;
import H4.W;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
/* loaded from: classes.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, L5.w, java.io.ByteArrayOutputStream] */
    public static final byte[] zza(File file) {
        j.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i7 = (int) length;
                byte[] bArr = new byte[i7];
                int i8 = i7;
                int i9 = 0;
                while (i8 > 0) {
                    int read = fileInputStream.read(bArr, i9, i8);
                    if (read < 0) {
                        break;
                    }
                    i8 -= read;
                    i9 += read;
                }
                if (i8 > 0) {
                    bArr = Arrays.copyOf(bArr, i9);
                    j.d(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        i.u(fileInputStream, byteArrayOutputStream, 8192);
                        int size = byteArrayOutputStream.size() + i7;
                        if (size >= 0) {
                            byte[] b5 = byteArrayOutputStream.b();
                            bArr = Arrays.copyOf(bArr, size);
                            j.d(bArr, "copyOf(...)");
                            AbstractC1446g.K(b5, i7, bArr, 0, byteArrayOutputStream.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                W.g(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                W.g(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] array) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        j.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            W.g(fileOutputStream, null);
        } finally {
        }
    }
}
