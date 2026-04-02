package M0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: M0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235b extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public InputStream f3142X;

    /* renamed from: Y  reason: collision with root package name */
    public long f3143Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f3144Z;

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f3145e;
    public Uri f;

    public C0235b(Context context) {
        super(false);
        this.f3145e = context.getAssets();
    }

    @Override // M0.h
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.f3142X;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new i(e7, 2000);
            }
        } finally {
            this.f3142X = null;
            if (this.f3144Z) {
                this.f3144Z = false;
                c();
            }
        }
    }

    @Override // M0.h
    public final long e(l lVar) {
        int i7;
        try {
            Uri uri = lVar.f3172a;
            long j = lVar.f3176e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream open = this.f3145e.open(path, 1);
            this.f3142X = open;
            if (open.skip(j) >= j) {
                long j8 = lVar.f;
                if (j8 != -1) {
                    this.f3143Y = j8;
                } else {
                    long available = this.f3142X.available();
                    this.f3143Y = available;
                    if (available == 2147483647L) {
                        this.f3143Y = -1L;
                    }
                }
                this.f3144Z = true;
                k(lVar);
                return this.f3143Y;
            }
            throw new i((Exception) null, 2008);
        } catch (C0234a e7) {
            throw e7;
        } catch (IOException e8) {
            if (e8 instanceof FileNotFoundException) {
                i7 = 2005;
            } else {
                i7 = 2000;
            }
            throw new i(e8, i7);
        }
    }

    @Override // M0.h
    public final Uri p() {
        return this.f;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.f3143Y;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new i(e7, 2000);
            }
        }
        InputStream inputStream = this.f3142X;
        int i9 = K0.x.f2529a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f3143Y;
        if (j8 != -1) {
            this.f3143Y = j8 - read;
        }
        b(read);
        return read;
    }
}
