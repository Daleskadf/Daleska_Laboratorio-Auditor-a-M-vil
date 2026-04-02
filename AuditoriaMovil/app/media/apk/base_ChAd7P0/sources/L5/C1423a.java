package l5;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.I;
import e0.C0927b;
/* renamed from: l5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423a {

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f13858a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0927b f13859b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13860c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13861d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13862e;
    public final int f;

    public C1423a(Bitmap bitmap, int i7) {
        I.i(bitmap);
        this.f13858a = bitmap;
        this.f13860c = bitmap.getWidth();
        this.f13861d = bitmap.getHeight();
        c(i7);
        this.f13862e = i7;
        this.f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0 A[Catch: FileNotFoundException -> 0x003f, TryCatch #1 {FileNotFoundException -> 0x003f, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x0031, B:37:0x008b, B:38:0x00a0, B:49:0x00d0, B:51:0x00dd, B:40:0x00a5, B:41:0x00a9, B:42:0x00b0, B:43:0x00b4, B:44:0x00bb, B:45:0x00bf, B:47:0x00c6, B:36:0x0085, B:33:0x0075, B:57:0x0101, B:58:0x0108), top: B:62:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l5.C1423a a(B5.AbstractActivityC0032e r17, android.net.Uri r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C1423a.a(B5.e, android.net.Uri):l5.a");
    }

    public static void c(int i7) {
        boolean z7 = true;
        if (i7 != 0 && i7 != 90 && i7 != 180 && i7 != 270) {
            z7 = false;
        }
        I.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z7);
    }

    public final Image.Plane[] b() {
        if (this.f13859b == null) {
            return null;
        }
        return ((Image) this.f13859b.f10587a).getPlanes();
    }

    public C1423a(Image image, int i7, int i8, int i9) {
        this.f13859b = new C0927b(image);
        this.f13860c = i7;
        this.f13861d = i8;
        c(i9);
        this.f13862e = i9;
        this.f = 35;
    }
}
