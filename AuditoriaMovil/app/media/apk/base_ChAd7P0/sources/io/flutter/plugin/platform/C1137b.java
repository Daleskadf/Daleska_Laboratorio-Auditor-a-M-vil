package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
/* renamed from: io.flutter.plugin.platform.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11686a;

    public C1137b(c cVar) {
        this.f11686a = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e7) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e7.toString());
            image = null;
        }
        if (image == null) {
            return;
        }
        this.f11686a.f11687a.pushImage(image);
    }
}
