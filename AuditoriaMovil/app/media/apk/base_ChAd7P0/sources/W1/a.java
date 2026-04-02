package W1;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f6127a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6128b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6129c;

    /* renamed from: d  reason: collision with root package name */
    public final File f6130d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6131e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public b1.e[] f6132g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f6133h;

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f6127a = executor;
        this.f6128b = dVar;
        this.f6131e = str;
        this.f6130d = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 >= 24 && i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = e.f6141h;
                    break;
                case 26:
                    bArr = e.f6140g;
                    break;
                case 27:
                    bArr = e.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f6139e;
                    break;
                case 31:
                case RecognitionOptions.EAN_13 /* 32 */:
                case 33:
                case 34:
                    bArr = e.f6138d;
                    break;
            }
        }
        this.f6129c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6128b.N();
            }
            return null;
        }
    }

    public final void b(int i7, Serializable serializable) {
        this.f6127a.execute(new K0.g(this, i7, 1, serializable));
    }
}
