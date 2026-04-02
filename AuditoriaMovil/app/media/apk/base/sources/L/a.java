package L;

import android.util.Size;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f2815a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f2816b;

    /* renamed from: c  reason: collision with root package name */
    public static final Size f2817c;

    /* renamed from: d  reason: collision with root package name */
    public static final Size f2818d;

    /* renamed from: e  reason: collision with root package name */
    public static final Size f2819e;
    public static final Size f;

    static {
        new Size(320, 240);
        f2816b = new Size(640, 480);
        f2817c = new Size(720, 480);
        f2818d = new Size(1280, 720);
        f2819e = new Size(1920, 1080);
        f = new Size(1920, 1440);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
