package B5;

import android.media.Image;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class S implements X0.x, e1.U {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f334a;

    /* renamed from: b  reason: collision with root package name */
    public int f335b;

    /* renamed from: c  reason: collision with root package name */
    public Object f336c;

    public /* synthetic */ S(int i7, Object obj, int i8) {
        this.f334a = i8;
        this.f335b = i7;
        this.f336c = obj;
    }

    public static ByteBuffer d(int i7, ByteBuffer byteBuffer, int i8) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i7);
        duplicate.limit(i7 + i8);
        ByteBuffer slice = duplicate.slice();
        kotlin.jvm.internal.j.d(slice, "duplicate.slice()");
        return slice;
    }

    @Override // X0.x
    public boolean A() {
        return true;
    }

    @Override // e1.U
    public void a() {
        R0.a aVar = ((a1.r) this.f336c).f6889g0;
        if (aVar == null) {
            return;
        }
        throw aVar;
    }

    @Override // e1.U
    public boolean b() {
        a1.r rVar = (a1.r) this.f336c;
        if (!rVar.f6894l0) {
            a1.q qVar = (a1.q) rVar.f6886e.get(this.f335b);
            if (qVar.f6876c.w(qVar.f6877d)) {
                return true;
            }
        }
        return false;
    }

    public void c(long j) {
        int i7 = this.f335b;
        long[] jArr = (long[]) this.f336c;
        if (i7 == jArr.length) {
            this.f336c = Arrays.copyOf(jArr, i7 * 2);
        }
        int i8 = this.f335b;
        this.f335b = i8 + 1;
        ((long[]) this.f336c)[i8] = j;
    }

    public long e(int i7) {
        if (i7 >= 0 && i7 < this.f335b) {
            return ((long[]) this.f336c)[i7];
        }
        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Invalid index ", i7, ", size is ");
        k2.append(this.f335b);
        throw new IndexOutOfBoundsException(k2.toString());
    }

    @Override // X0.x
    public MediaCodecInfo f(int i7) {
        if (((MediaCodecInfo[]) this.f336c) == null) {
            this.f336c = new MediaCodecList(this.f335b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f336c)[i7];
    }

    @Override // e1.U
    public int g(M0.x xVar, N0.f fVar, int i7) {
        a1.r rVar = (a1.r) this.f336c;
        if (rVar.f6894l0) {
            return -3;
        }
        a1.q qVar = (a1.q) rVar.f6886e.get(this.f335b);
        return qVar.f6876c.B(xVar, fVar, i7, qVar.f6877d);
    }

    @Override // e1.U
    public int h(long j) {
        a1.r rVar = (a1.r) this.f336c;
        if (rVar.f6894l0) {
            return -3;
        }
        a1.q qVar = (a1.q) rVar.f6886e.get(this.f335b);
        e1.T t7 = qVar.f6876c;
        int t8 = t7.t(j, qVar.f6877d);
        t7.H(t8);
        return t8;
    }

    public boolean i(int i7) {
        if (((1 << i7) & this.f335b) != 0) {
            return true;
        }
        return false;
    }

    public long j(m1.l lVar) {
        K0.q qVar = (K0.q) this.f336c;
        int i7 = 0;
        lVar.q(qVar.f2513a, 0, 1, false);
        int i8 = qVar.f2513a[0] & ForkServer.ERROR;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = RecognitionOptions.ITF;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        lVar.q(qVar.f2513a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (qVar.f2513a[i7] & ForkServer.ERROR) + (i11 << 8);
        }
        this.f335b = i10 + 1 + this.f335b;
        return i11;
    }

    public void k(int i7, int i8) {
        int[] iArr = (int[]) this.f336c;
        if (i7 >= iArr.length) {
            return;
        }
        this.f335b = (1 << i7) | this.f335b;
        iArr[i7] = i8;
    }

    @Override // X0.x
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // X0.x
    public int p() {
        if (((MediaCodecInfo[]) this.f336c) == null) {
            this.f336c = new MediaCodecList(this.f335b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f336c).length;
    }

    public String toString() {
        switch (this.f334a) {
            case 11:
                return "ExistenceFilter{count=" + this.f335b + ", unchangedNames=" + ((H4.r) this.f336c) + '}';
            default:
                return super.toString();
        }
    }

    @Override // X0.x
    public boolean y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public /* synthetic */ S(Object obj, int i7, int i8) {
        this.f334a = i8;
        this.f336c = obj;
        this.f335b = i7;
    }

    public S(int i7, byte b5) {
        this.f334a = i7;
        switch (i7) {
            case 2:
                this.f336c = new long[32];
                return;
            case 5:
                this.f336c = new int[10];
                return;
            case 8:
                this.f335b = 0;
                return;
            default:
                this.f336c = new K0.q(8);
                return;
        }
    }

    public S(Image image, ByteBuffer byteBuffer) {
        ByteBuffer allocateDirect;
        int i7;
        this.f334a = 12;
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane plane = image.getPlanes()[0];
        kotlin.jvm.internal.j.d(plane, "image.planes[0]");
        ByteBuffer buffer = plane.getBuffer();
        kotlin.jvm.internal.j.d(buffer, "plane.buffer");
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        int i8 = width / 2;
        int i9 = height / 2;
        Image.Plane plane2 = image.getPlanes()[1];
        kotlin.jvm.internal.j.d(plane2, "image.planes[1]");
        ByteBuffer buffer2 = plane2.getBuffer();
        kotlin.jvm.internal.j.d(buffer2, "plane.buffer");
        int rowStride2 = plane2.getRowStride();
        int pixelStride2 = plane2.getPixelStride();
        Image.Plane plane3 = image.getPlanes()[2];
        kotlin.jvm.internal.j.d(plane3, "image.planes[2]");
        ByteBuffer buffer3 = plane3.getBuffer();
        kotlin.jvm.internal.j.d(buffer3, "plane.buffer");
        int rowStride3 = plane3.getRowStride();
        int pixelStride3 = plane3.getPixelStride();
        if (pixelStride != 1) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Pixel stride for Y plane must be 1 but got ", pixelStride, " instead.").toString());
        }
        if (pixelStride2 != pixelStride3 || rowStride2 != rowStride3) {
            throw new IllegalArgumentException(("U and V planes must have the same pixel and row strides but got pixel=" + pixelStride2 + " row=" + rowStride2 + " for U and pixel=" + pixelStride3 + " and row=" + rowStride3 + " for V").toString());
        } else if (pixelStride2 != 1 && pixelStride2 != 2) {
            throw new IllegalArgumentException("Supported pixel strides for U and V planes are 1 and 2");
        } else {
            int i10 = pixelStride2 == 1 ? 35 : 17;
            this.f335b = i10;
            int height2 = ((image.getHeight() * image.getWidth()) * 3) / 2;
            ByteBuffer byteBuffer2 = buffer3;
            if (byteBuffer == null || byteBuffer.capacity() < height2 || byteBuffer.isReadOnly() || !byteBuffer.isDirect()) {
                allocateDirect = ByteBuffer.allocateDirect(height2);
                kotlin.jvm.internal.j.d(allocateDirect, "{\n            ByteBuffer.allocateDirect(size) }");
            } else {
                allocateDirect = byteBuffer;
            }
            this.f336c = allocateDirect;
            allocateDirect.rewind();
            int i11 = width * height;
            int i12 = i8 * i9;
            if (rowStride > width) {
                i7 = rowStride3;
                if (pixelStride == 1) {
                    allocateDirect.position(0);
                    for (int i13 = 0; i13 < height; i13++) {
                        allocateDirect.put(d(i13 * rowStride, buffer, width));
                    }
                } else {
                    throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1");
                }
            } else {
                i7 = rowStride3;
                allocateDirect.position(0);
                allocateDirect.put(buffer);
            }
            if (i10 != 35) {
                ByteBuffer byteBuffer3 = byteBuffer2;
                int i14 = i8 * 2;
                if (rowStride2 <= i14) {
                    allocateDirect.position(i11);
                    int i15 = (i9 * i7) - 1;
                    allocateDirect.put(byteBuffer3.capacity() > i15 ? d(0, byteBuffer3, i15) : byteBuffer3);
                    allocateDirect.put(allocateDirect.capacity() - 1, buffer2.get(buffer2.capacity() - 1));
                } else if (pixelStride2 == 2) {
                    allocateDirect.position(i11);
                    int i16 = i9 - 1;
                    for (int i17 = 0; i17 < i16; i17++) {
                        allocateDirect.put(d(i17 * rowStride2, byteBuffer3, i14));
                    }
                    allocateDirect.put(d((i16 * rowStride2) - 1, buffer2, i14));
                } else {
                    throw new IllegalArgumentException("use removePaddingNotCompact pixelStride == 2");
                }
            } else if (rowStride2 <= i8) {
                allocateDirect.position(i11);
                allocateDirect.put(buffer2);
                allocateDirect.position(i11 + i12);
                allocateDirect.put(byteBuffer2);
            } else if (pixelStride2 == 1) {
                allocateDirect.position(i11);
                for (int i18 = 0; i18 < i9; i18++) {
                    allocateDirect.put(d(i18 * rowStride2, buffer2, i8));
                }
                int i19 = i11 + i12;
                if (pixelStride3 == 1) {
                    allocateDirect.position(i19);
                    int i20 = 0;
                    while (i20 < i9) {
                        ByteBuffer byteBuffer4 = byteBuffer2;
                        allocateDirect.put(d(i20 * i7, byteBuffer4, i8));
                        i20++;
                        byteBuffer2 = byteBuffer4;
                    }
                } else {
                    throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1");
                }
            } else {
                throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1");
            }
            allocateDirect.rewind();
        }
    }

    public S(int i7) {
        this.f334a = 6;
        if (i7 > 0) {
            this.f336c = new Object[i7];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public S(boolean z7, boolean z8) {
        this.f334a = 3;
        this.f335b = (z7 || z8) ? 1 : 0;
    }
}
