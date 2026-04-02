package androidx.appcompat.app;
/* loaded from: classes.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    public static o f1014d;

    /* renamed from: a  reason: collision with root package name */
    public long f1015a;

    /* renamed from: b  reason: collision with root package name */
    public long f1016b;

    /* renamed from: c  reason: collision with root package name */
    public int f1017c;

    public static o b() {
        if (f1014d == null) {
            f1014d = new o();
        }
        return f1014d;
    }

    public void a(long j10, double d10, double d11) {
        float f10;
        float f11 = ((float) (j10 - 946728000000L)) / 8.64E7f;
        double d12 = (0.01720197f * f11) + 6.24006f;
        Double.isNaN(d12);
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double d14 = f11 - 9.0E-4f;
        Double.isNaN(d14);
        double round = ((float) Math.round(d14 - d13)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = round + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d15 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d15) * Math.sin(asin))) / (Math.cos(d15) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.f1017c = 1;
            this.f1015a = -1L;
            this.f1016b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f1017c = 0;
            this.f1015a = -1L;
            this.f1016b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.f1015a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f1016b = round2;
            if (round2 < j10 && this.f1015a > j10) {
                this.f1017c = 0;
            } else {
                this.f1017c = 1;
            }
        }
    }
}
