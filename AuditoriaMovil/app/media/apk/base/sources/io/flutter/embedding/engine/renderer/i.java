package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f11586a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f11587b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f11588c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f11589d;

    public i(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f11589d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f11586a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z7;
                i iVar = i.this;
                iVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e7) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e7);
                    image = null;
                }
                if (image != null) {
                    FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = iVar.f11589d;
                    z7 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                    if (!z7 && !iVar.f11588c) {
                        flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                    } else {
                        image.close();
                    }
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
