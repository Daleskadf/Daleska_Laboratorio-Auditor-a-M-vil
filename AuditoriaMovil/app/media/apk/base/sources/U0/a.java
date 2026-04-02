package U0;

import M0.C;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements M0.h {

    /* renamed from: a  reason: collision with root package name */
    public final M0.h f5536a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5537b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5538c;

    /* renamed from: d  reason: collision with root package name */
    public CipherInputStream f5539d;

    public a(M0.h hVar, byte[] bArr, byte[] bArr2) {
        this.f5536a = hVar;
        this.f5537b = bArr;
        this.f5538c = bArr2;
    }

    @Override // M0.h
    public final void close() {
        if (this.f5539d != null) {
            this.f5539d = null;
            this.f5536a.close();
        }
    }

    @Override // M0.h
    public final long e(M0.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f5537b, "AES"), new IvParameterSpec(this.f5538c));
                M0.j jVar = new M0.j(this.f5536a, lVar);
                this.f5539d = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // M0.h
    public final Map j() {
        return this.f5536a.j();
    }

    @Override // M0.h
    public final void n(C c8) {
        c8.getClass();
        this.f5536a.n(c8);
    }

    @Override // M0.h
    public final Uri p() {
        return this.f5536a.p();
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        this.f5539d.getClass();
        int read = this.f5539d.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
