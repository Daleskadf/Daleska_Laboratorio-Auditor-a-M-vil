package B5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
/* renamed from: B5.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0042o extends View implements io.flutter.embedding.engine.renderer.o {

    /* renamed from: a  reason: collision with root package name */
    public ImageReader f371a;

    /* renamed from: b  reason: collision with root package name */
    public Image f372b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f373c;

    /* renamed from: d  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.m f374d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumC0041n f375e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042o(Context context, int i7, int i8, EnumC0041n enumC0041n) {
        super(context, null);
        ImageReader b5 = b(i7, i8);
        this.f = false;
        this.f371a = b5;
        this.f375e = enumC0041n;
        setAlpha(0.0f);
    }

    public static ImageReader b(int i7, int i8) {
        if (i7 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i7 + ", set width=1");
            i7 = 1;
        }
        if (i8 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i8 + ", set height=1");
            i8 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0038k.d(i7, i8);
        }
        return ImageReader.newInstance(i7, i8, 1, 3);
    }

    public final boolean a() {
        if (!this.f) {
            return false;
        }
        Image acquireLatestImage = this.f371a.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f372b;
            if (image != null) {
                image.close();
                this.f372b = null;
            }
            this.f372b = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage == null) {
            return false;
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void d() {
        if (!this.f) {
            return;
        }
        setAlpha(0.0f);
        a();
        this.f373c = null;
        Image image = this.f372b;
        if (image != null) {
            image.close();
            this.f372b = null;
        }
        invalidate();
        this.f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void f(io.flutter.embedding.engine.renderer.m mVar) {
        if (AbstractC0040m.f370a[this.f375e.ordinal()] == 1) {
            Surface surface = this.f371a.getSurface();
            mVar.f11614c = surface;
            mVar.f11612a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f374d = mVar;
        this.f = true;
    }

    public final void g(int i7, int i8) {
        if (this.f374d == null) {
            return;
        }
        if (i7 == this.f371a.getWidth() && i8 == this.f371a.getHeight()) {
            return;
        }
        Image image = this.f372b;
        if (image != null) {
            image.close();
            this.f372b = null;
        }
        this.f371a.close();
        this.f371a = b(i7, i8);
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public io.flutter.embedding.engine.renderer.m getAttachedRenderer() {
        return this.f374d;
    }

    public ImageReader getImageReader() {
        return this.f371a;
    }

    public Surface getSurface() {
        return this.f371a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        super.onDraw(canvas);
        Image image = this.f372b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                this.f373c = AbstractC0038k.a(hardwareBuffer, colorSpace);
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f372b.getHeight();
                    Bitmap bitmap = this.f373c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f373c.getHeight() != height) {
                        this.f373c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f373c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f373c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        if ((i7 != this.f371a.getWidth() || i8 != this.f371a.getHeight()) && this.f375e == EnumC0041n.background && this.f) {
            g(i7, i8);
            io.flutter.embedding.engine.renderer.m mVar = this.f374d;
            Surface surface = this.f371a.getSurface();
            mVar.f11614c = surface;
            mVar.f11612a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void c() {
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void e() {
    }
}
