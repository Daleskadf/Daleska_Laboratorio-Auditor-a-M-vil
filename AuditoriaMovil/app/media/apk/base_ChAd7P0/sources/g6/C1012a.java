package g6;

import a6.K;
import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0865t;
import com.google.protobuf.InterfaceC0872w0;
import com.google.protobuf.J;
import com.google.protobuf.r;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
/* renamed from: g6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012a extends InputStream implements K {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0828a f11132a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0872w0 f11133b;

    /* renamed from: c  reason: collision with root package name */
    public ByteArrayInputStream f11134c;

    public C1012a(AbstractC0828a abstractC0828a, InterfaceC0872w0 interfaceC0872w0) {
        this.f11132a = abstractC0828a;
        this.f11133b = interfaceC0872w0;
    }

    @Override // java.io.InputStream
    public final int available() {
        AbstractC0828a abstractC0828a = this.f11132a;
        if (abstractC0828a != null) {
            return ((J) abstractC0828a).c(null);
        }
        ByteArrayInputStream byteArrayInputStream = this.f11134c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11132a != null) {
            this.f11134c = new ByteArrayInputStream(this.f11132a.d());
            this.f11132a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f11134c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC0828a abstractC0828a = this.f11132a;
        if (abstractC0828a != null) {
            int c8 = ((J) abstractC0828a).c(null);
            if (c8 == 0) {
                this.f11132a = null;
                this.f11134c = null;
                return -1;
            } else if (i8 >= c8) {
                Logger logger = AbstractC0865t.f10136d;
                r rVar = new r(bArr, i7, c8);
                this.f11132a.e(rVar);
                if (rVar.P0() == 0) {
                    this.f11132a = null;
                    this.f11134c = null;
                    return c8;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } else {
                this.f11134c = new ByteArrayInputStream(this.f11132a.d());
                this.f11132a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f11134c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i7, i8);
        }
        return -1;
    }
}
