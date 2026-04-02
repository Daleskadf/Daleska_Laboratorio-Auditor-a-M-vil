package X0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface j {
    MediaFormat A();

    ByteBuffer E(int i7);

    void F(Surface surface);

    ByteBuffer K(int i7);

    void T(int i7, long j);

    int V();

    void a(Bundle bundle);

    boolean b0(r rVar);

    void d(int i7, N0.b bVar, long j, int i8);

    void d0(k1.j jVar, Handler handler);

    void e(int i7, int i8, long j, int i9);

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void o(int i7, boolean z7);

    void release();

    void u(int i7);
}
