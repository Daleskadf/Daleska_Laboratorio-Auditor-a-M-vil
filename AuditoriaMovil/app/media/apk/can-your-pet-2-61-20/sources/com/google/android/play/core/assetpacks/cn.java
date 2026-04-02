package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class cn extends OutputStream {
    private final ds a = new ds();
    private final File b;
    private final em c;
    private long d;
    private long e;
    private FileOutputStream f;
    private es g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn(File file, em emVar) {
        this.b = file;
        this.c = emVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int min;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int b = this.a.b(bArr, i, i2);
                if (b == -1) {
                    return;
                }
                i += b;
                i2 -= b;
                es c = this.a.c();
                this.g = c;
                if (c.d()) {
                    this.d = 0L;
                    this.c.l(this.g.f(), 0, this.g.f().length);
                    this.e = this.g.f().length;
                } else if (!this.g.h() || this.g.g()) {
                    byte[] f = this.g.f();
                    this.c.l(f, 0, f.length);
                    this.d = this.g.b();
                } else {
                    this.c.j(this.g.f());
                    File file = new File(this.b, this.g.c());
                    file.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new FileOutputStream(file);
                }
            }
            if (!this.g.g()) {
                long j = i2;
                if (this.g.d()) {
                    this.c.e(this.e, bArr, i, i2);
                    this.e += j;
                    min = i2;
                } else if (!this.g.h()) {
                    min = (int) Math.min(j, this.d);
                    this.c.e((this.g.f().length + this.g.b()) - this.d, bArr, i, min);
                    this.d -= min;
                } else {
                    min = (int) Math.min(j, this.d);
                    this.f.write(bArr, i, min);
                    long j2 = this.d - min;
                    this.d = j2;
                    if (j2 == 0) {
                        this.f.close();
                    }
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
