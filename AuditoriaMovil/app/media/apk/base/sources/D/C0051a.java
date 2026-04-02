package D;

import android.graphics.Matrix;
import android.media.Image;
/* renamed from: D.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051a implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Image f679a;

    /* renamed from: b  reason: collision with root package name */
    public final C5.i[] f680b;

    /* renamed from: c  reason: collision with root package name */
    public final C0058h f681c;

    public C0051a(Image image) {
        this.f679a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f680b = new C5.i[planes.length];
            for (int i7 = 0; i7 < planes.length; i7++) {
                this.f680b[i7] = new C5.i(planes[i7], 5);
            }
        } else {
            this.f680b = new C5.i[0];
        }
        this.f681c = new C0058h(androidx.camera.core.impl.u0.f7673b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f679a.close();
    }

    @Override // D.b0
    public final int e() {
        return this.f679a.getFormat();
    }

    @Override // D.b0
    public final C5.i[] f() {
        return this.f680b;
    }

    @Override // D.b0
    public final int getHeight() {
        return this.f679a.getHeight();
    }

    @Override // D.b0
    public final int getWidth() {
        return this.f679a.getWidth();
    }

    @Override // D.b0
    public final Y h() {
        return this.f681c;
    }

    @Override // D.b0
    public final Image k() {
        return this.f679a;
    }
}
