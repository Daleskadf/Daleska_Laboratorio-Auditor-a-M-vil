package H0;

import java.util.Arrays;
/* renamed from: H0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0122b f1785c = new C0122b(new C0121a[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final C0121a f1786d;

    /* renamed from: a  reason: collision with root package name */
    public final int f1787a;

    /* renamed from: b  reason: collision with root package name */
    public final C0121a[] f1788b;

    static {
        C0121a c0121a = new C0121a(-1, -1, new int[0], new C[0], new long[0]);
        int[] iArr = c0121a.f1779e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0121a.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f1786d = new C0121a(0, c0121a.f1776b, copyOf, (C[]) Arrays.copyOf(c0121a.f1778d, 0), copyOf2);
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
        K0.x.H(4);
    }

    public C0122b(C0121a[] c0121aArr) {
        this.f1787a = c0121aArr.length;
        this.f1788b = c0121aArr;
    }

    public final C0121a a(int i7) {
        if (i7 < 0) {
            return f1786d;
        }
        return this.f1788b[i7];
    }

    public final boolean b(int i7) {
        if (i7 == this.f1787a - 1) {
            a(i7).getClass();
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0122b.class != obj.getClass()) {
            return false;
        }
        C0122b c0122b = (C0122b) obj;
        if (K0.x.a(null, null) && this.f1787a == c0122b.f1787a && Arrays.equals(this.f1788b, c0122b.f1788b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1788b) + (((((this.f1787a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i7 = 0;
        while (true) {
            C0121a[] c0121aArr = this.f1788b;
            if (i7 < c0121aArr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c0121aArr[i7].getClass();
                for (int i8 = 0; i8 < c0121aArr[i7].f1779e.length; i8++) {
                    sb.append("ad(state=");
                    int i9 = c0121aArr[i7].f1779e[i8];
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(c0121aArr[i7].f[i8]);
                    sb.append(')');
                    if (i8 < c0121aArr[i7].f1779e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i7 < c0121aArr.length - 1) {
                    sb.append(", ");
                }
                i7++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
