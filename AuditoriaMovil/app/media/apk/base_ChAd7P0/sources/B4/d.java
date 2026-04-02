package B4;

import android.util.Log;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class d {
    public static final Runtime f = Runtime.getRuntime();

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f276a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f277b = new byte[262144];

    /* renamed from: c  reason: collision with root package name */
    public int f278c = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f280e = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f279d = false;

    public d(InputStream inputStream) {
        this.f276a = inputStream;
    }

    public final int a(int i7) {
        int i8 = this.f278c;
        int i9 = 0;
        if (i7 <= i8) {
            int i10 = i8 - i7;
            this.f278c = i10;
            byte[] bArr = this.f277b;
            System.arraycopy(bArr, i7, bArr, 0, i10);
            return i7;
        }
        this.f278c = 0;
        while (i9 < i7) {
            InputStream inputStream = this.f276a;
            int skip = (int) inputStream.skip(i7 - i9);
            if (skip > 0) {
                i9 += skip;
            } else if (skip != 0) {
                continue;
            } else if (inputStream.read() == -1) {
                break;
            } else {
                i9++;
            }
        }
        return i9;
    }

    public final void b(int i7) {
        byte[] bArr = this.f277b;
        if (i7 > bArr.length) {
            int max = Math.max(bArr.length * 2, i7);
            Runtime runtime = f;
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (this.f280e && max < maxMemory) {
                try {
                    byte[] bArr2 = new byte[max];
                    System.arraycopy(this.f277b, 0, bArr2, 0, this.f278c);
                    this.f277b = bArr2;
                } catch (OutOfMemoryError unused) {
                    Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                    this.f280e = false;
                }
            } else {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
            }
            i7 = Math.min(i7, this.f277b.length);
        }
        while (true) {
            int i8 = this.f278c;
            if (i8 < i7) {
                int read = this.f276a.read(this.f277b, i8, i7 - i8);
                if (read == -1) {
                    this.f279d = true;
                    return;
                }
                this.f278c += read;
            } else {
                return;
            }
        }
    }
}
