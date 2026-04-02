package io.flutter.plugin.platform;

import B5.AbstractC0029b;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public TextureRegistry$ImageTextureEntry f11687a;

    /* renamed from: b  reason: collision with root package name */
    public ImageReader f11688b;

    /* renamed from: c  reason: collision with root package name */
    public int f11689c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f11690d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f11691e = new Handler();
    public final C1137b f = new C1137b(this);

    public c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11687a = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @Override // io.flutter.plugin.platform.i
    public final void a(int i7, int i8) {
        ImageReader newInstance;
        ImageReader imageReader = this.f11688b;
        if (imageReader != null && this.f11689c == i7 && this.f11690d == i8) {
            return;
        }
        if (imageReader != null) {
            this.f11687a.pushImage(null);
            this.f11688b.close();
            this.f11688b = null;
        }
        this.f11689c = i7;
        this.f11690d = i8;
        int i9 = Build.VERSION.SDK_INT;
        Handler handler = this.f11691e;
        C1137b c1137b = this.f;
        if (i9 >= 33) {
            AbstractC0029b.q();
            ImageReader.Builder i10 = AbstractC0029b.i(this.f11689c, this.f11690d);
            i10.setMaxImages(4);
            i10.setImageFormat(34);
            i10.setUsage(256L);
            newInstance = i10.build();
            newInstance.setOnImageAvailableListener(c1137b, handler);
        } else if (i9 >= 29) {
            newInstance = ImageReader.newInstance(i7, i8, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c1137b, handler);
        } else {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f11688b = newInstance;
    }

    @Override // io.flutter.plugin.platform.i
    public final long b() {
        return this.f11687a.id();
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f11690d;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        return this.f11688b.getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f11689c;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        if (this.f11688b != null) {
            this.f11687a.pushImage(null);
            this.f11688b.close();
            this.f11688b = null;
        }
        this.f11687a = null;
    }

    @Override // io.flutter.plugin.platform.i
    public final /* synthetic */ void scheduleFrame() {
    }
}
