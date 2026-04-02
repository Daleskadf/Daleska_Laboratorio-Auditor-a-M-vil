package c6;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class q2 implements InterfaceC0640A, m2, a6.a0, a6.d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final q2 f8962b = new q2(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8963a;

    public /* synthetic */ q2(int i7) {
        this.f8963a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c6.Y, java.lang.Object] */
    public static Y e() {
        ?? obj = new Object();
        obj.f8644a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        obj.f8645b = TimeUnit.MINUTES.toNanos(2L);
        obj.f8646c = 1.6d;
        obj.f8647d = 0.2d;
        obj.f8648e = nanos;
        return obj;
    }

    @Override // a6.d0
    /* renamed from: a */
    public byte[] mo0a(Object obj) {
        switch (this.f8963a) {
            case 10:
                return (byte[]) obj;
            default:
                Integer num = (Integer) obj;
                throw new UnsupportedOperationException();
        }
    }

    @Override // c6.InterfaceC0640A
    public int b(AbstractC0658d abstractC0658d, int i7, Object obj, int i8) {
        switch (this.f8963a) {
            case 2:
                Void r42 = (Void) obj;
                return abstractC0658d.n();
            case 3:
                Void r43 = (Void) obj;
                abstractC0658d.q(i7);
                return 0;
            case 4:
                abstractC0658d.m((byte[]) obj, i8, i7);
                return i8 + i7;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int limit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i7);
                abstractC0658d.j(byteBuffer);
                byteBuffer.limit(limit);
                return 0;
            default:
                abstractC0658d.g((OutputStream) obj, i7);
                return 0;
        }
    }

    public long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // a6.d0
    public Object d(byte[] bArr) {
        switch (this.f8963a) {
            case 10:
                return bArr;
            default:
                if (bArr.length >= 3) {
                    int i7 = (bArr[1] - 48) * 10;
                    return Integer.valueOf((bArr[2] - 48) + i7 + ((bArr[0] - 48) * 100));
                }
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, a6.I.f7083a)));
        }
    }

    @Override // a6.a0
    public Object h(String str) {
        boolean z7;
        boolean z8;
        if (str.length() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.f("empty timeout", z7);
        if (str.length() <= 9) {
            z8 = true;
        } else {
            z8 = false;
        }
        G.i.f("bad timeout format", z8);
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt != 'H') {
            if (charAt != 'M') {
                if (charAt != 'S') {
                    if (charAt != 'u') {
                        if (charAt != 'm') {
                            if (charAt == 'n') {
                                return Long.valueOf(parseLong);
                            }
                            throw new IllegalArgumentException("Invalid timeout unit: " + charAt);
                        }
                        return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
                    }
                    return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
                }
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
    }

    @Override // c6.m2
    public Object l() {
        switch (this.f8963a) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC0671h0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC0671h0.e("grpc-timer-%d"));
                try {
                    newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
                return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    @Override // c6.m2
    public void r(Object obj) {
        switch (this.f8963a) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                return;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                return;
        }
    }

    public String toString() {
        switch (this.f8963a) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // a6.a0
    public String a(Object obj) {
        Long l8 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l8.longValue() >= 0) {
            if (l8.longValue() < 100000000) {
                return l8 + "n";
            } else if (l8.longValue() < 100000000000L) {
                return timeUnit.toMicros(l8.longValue()) + "u";
            } else if (l8.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l8.longValue()) + "m";
            } else if (l8.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l8.longValue()) + "S";
            } else if (l8.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l8.longValue()) + "M";
            } else {
                return timeUnit.toHours(l8.longValue()) + "H";
            }
        }
        throw new IllegalArgumentException("Timeout too small");
    }
}
