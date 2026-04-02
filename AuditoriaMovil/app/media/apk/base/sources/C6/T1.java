package c6;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8586a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8587b;

    /* renamed from: c  reason: collision with root package name */
    public long f8588c;

    public /* synthetic */ T1() {
    }

    public long a(TimeUnit timeUnit) {
        long j;
        if (this.f8587b) {
            j = System.nanoTime() - this.f8588c;
        } else {
            j = 0;
        }
        return timeUnit.convert(j, TimeUnit.NANOSECONDS);
    }

    public void b() {
        G.i.o("This stopwatch is already running.", !this.f8587b);
        this.f8587b = true;
        this.f8588c = System.nanoTime();
    }

    public String toString() {
        long j;
        String str;
        switch (this.f8586a) {
            case 1:
                if (this.f8587b) {
                    j = System.nanoTime() - this.f8588c;
                } else {
                    j = 0;
                }
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(j, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(j, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(j, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(j, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(j, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(j, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                double convert = j / timeUnit2.convert(1L, timeUnit);
                StringBuilder sb = new StringBuilder();
                sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
                sb.append(StringUtils.SPACE);
                switch (z3.n.f16896a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public T1(long j, boolean z7) {
        this.f8587b = z7;
        this.f8588c = j;
    }
}
