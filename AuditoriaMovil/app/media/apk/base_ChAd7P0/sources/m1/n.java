package m1;

import H0.InterfaceC0131k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13982a = new byte[RecognitionOptions.AZTEC];

    @Override // m1.G
    public final void a(K0.q qVar, int i7, int i8) {
        qVar.H(i7);
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    @Override // m1.G
    public final /* synthetic */ void d(int i7, K0.q qVar) {
        io.flutter.plugins.pathprovider.b.b(this, qVar, i7);
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        byte[] bArr = this.f13982a;
        int read = interfaceC0131k.read(bArr, 0, Math.min(bArr.length, i7));
        if (read == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // m1.G
    public final void c(H0.r rVar) {
    }

    @Override // m1.G
    public final void e(long j, int i7, int i8, int i9, F f) {
    }
}
