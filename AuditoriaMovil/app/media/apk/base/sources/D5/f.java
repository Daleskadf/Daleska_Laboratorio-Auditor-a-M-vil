package D5;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class f implements L5.e {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f877a;

    /* renamed from: b  reason: collision with root package name */
    public final int f878b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f879c = new AtomicBoolean(false);

    public f(FlutterJNI flutterJNI, int i7) {
        this.f877a = flutterJNI;
        this.f878b = i7;
    }

    @Override // L5.e
    public final void a(ByteBuffer byteBuffer) {
        if (!this.f879c.getAndSet(true)) {
            int i7 = this.f878b;
            FlutterJNI flutterJNI = this.f877a;
            if (byteBuffer == null) {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i7);
                return;
            } else {
                flutterJNI.invokePlatformMessageResponseCallback(i7, byteBuffer, byteBuffer.position());
                return;
            }
        }
        throw new IllegalStateException("Reply already submitted");
    }
}
