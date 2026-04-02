package z0;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Writer;
/* loaded from: classes.dex */
public final class W extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f16724b = new StringBuilder((int) RecognitionOptions.ITF);

    /* renamed from: a  reason: collision with root package name */
    public final String f16723a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f16724b;
        if (sb.length() > 0) {
            Log.d(this.f16723a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c8 = cArr[i7 + i9];
            if (c8 == '\n') {
                a();
            } else {
                this.f16724b.append(c8);
            }
        }
    }
}
