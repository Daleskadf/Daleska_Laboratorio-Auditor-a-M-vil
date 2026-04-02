package J2;

import K0.x;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import m1.G;
import m1.InterfaceC1426A;
import m1.p;
import m1.q;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import t4.AbstractC1823c;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements g, R0.i, p, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2401a;

    /* renamed from: b  reason: collision with root package name */
    public long f2402b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2403c;

    public /* synthetic */ e(long j, Object obj, int i7) {
        this.f2401a = i7;
        this.f2402b = j;
        this.f2403c = obj;
    }

    public boolean A(int i7) {
        if (i7 >= 64) {
            if (((e) this.f2403c) == null) {
                this.f2403c = new e(3);
            }
            return ((e) this.f2403c).A(i7 - 64);
        } else if ((this.f2402b & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void B() {
        this.f2402b = 0L;
        e eVar = (e) this.f2403c;
        if (eVar != null) {
            eVar.B();
        }
    }

    @Override // R0.i
    public long C(long j, long j8) {
        return -9223372036854775807L;
    }

    @Override // R0.i
    public S0.j D(long j) {
        m1.j jVar = (m1.j) this.f2403c;
        int i7 = (int) j;
        return new S0.j(jVar.f13961c[i7], jVar.f13960b[i7], null);
    }

    public void E(Runnable runnable) {
        AbstractC1823c abstractC1823c = (AbstractC1823c) this.f2403c;
        abstractC1823c.f.d();
        if (abstractC1823c.j == this.f2402b) {
            runnable.run();
        } else {
            u4.q.a(abstractC1823c.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
        }
    }

    public void F(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2403c) == null) {
            this.f2403c = exc;
            this.f2402b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f2402b) {
            Exception exc2 = (Exception) this.f2403c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f2403c;
            this.f2403c = null;
            throw exc3;
        }
    }

    @Override // R0.i
    public boolean I() {
        return true;
    }

    @Override // R0.i
    public long R() {
        return 0L;
    }

    @Override // m1.p
    public long a() {
        return ((m1.l) this.f2403c).f13974d - this.f2402b;
    }

    @Override // J2.g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        A2.b bVar = i.f2409e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f2402b));
        D2.b bVar2 = (D2.b) this.f2403c;
        String str = bVar2.f835a;
        A2.d dVar = bVar2.f837c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(M2.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", bVar2.f835a);
            contentValues.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, Integer.valueOf(M2.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // R0.i
    public long b(long j) {
        return ((m1.j) this.f2403c).f13963e[(int) j] - this.f2402b;
    }

    @Override // R0.i
    public long b0(long j) {
        return ((m1.j) this.f2403c).f13959a;
    }

    @Override // R0.i
    public long c(long j, long j8) {
        return x.f(((m1.j) this.f2403c).f13963e, j + this.f2402b, true);
    }

    @Override // R0.i
    public long c0(long j, long j8) {
        return ((m1.j) this.f2403c).f13959a;
    }

    @Override // m1.p
    public boolean f(byte[] bArr, int i7, int i8, boolean z7) {
        return ((m1.l) this.f2403c).f(bArr, 0, i8, z7);
    }

    @Override // m1.q
    public void h() {
        ((q) this.f2403c).h();
    }

    @Override // m1.p
    public long i() {
        return ((m1.l) this.f2403c).f13973c - this.f2402b;
    }

    @Override // R0.i
    public long k(long j, long j8) {
        return ((m1.j) this.f2403c).f13962d[(int) j];
    }

    @Override // m1.p
    public void l() {
        ((m1.l) this.f2403c).f = 0;
    }

    @Override // m1.p
    public void m(int i7) {
        ((m1.l) this.f2403c).m(i7);
    }

    @Override // m1.p
    public boolean q(byte[] bArr, int i7, int i8, boolean z7) {
        return ((m1.l) this.f2403c).q(bArr, i7, i8, z7);
    }

    @Override // R0.i
    public long r(long j, long j8) {
        return 0L;
    }

    @Override // H0.InterfaceC0131k
    public int read(byte[] bArr, int i7, int i8) {
        return ((m1.l) this.f2403c).read(bArr, i7, i8);
    }

    @Override // m1.p
    public void readFully(byte[] bArr, int i7, int i8) {
        ((m1.l) this.f2403c).f(bArr, i7, i8, false);
    }

    @Override // m1.q
    public G s(int i7, int i8) {
        return ((q) this.f2403c).s(i7, i8);
    }

    @Override // m1.p
    public long t() {
        return ((m1.l) this.f2403c).t() - this.f2402b;
    }

    public String toString() {
        switch (this.f2401a) {
            case 3:
                if (((e) this.f2403c) == null) {
                    return Long.toBinaryString(this.f2402b);
                }
                return ((e) this.f2403c).toString() + "xx" + Long.toBinaryString(this.f2402b);
            default:
                return super.toString();
        }
    }

    @Override // m1.p
    public void v(byte[] bArr, int i7, int i8) {
        ((m1.l) this.f2403c).q(bArr, i7, i8, false);
    }

    @Override // m1.p
    public void w(int i7) {
        ((m1.l) this.f2403c).b(i7, false);
    }

    @Override // m1.q
    public void x(InterfaceC1426A interfaceC1426A) {
        ((q) this.f2403c).x(new u1.c(this, interfaceC1426A, interfaceC1426A));
    }

    public int y(int i7) {
        e eVar = (e) this.f2403c;
        if (eVar == null) {
            if (i7 >= 64) {
                return Long.bitCount(this.f2402b);
            }
            return Long.bitCount(this.f2402b & ((1 << i7) - 1));
        } else if (i7 < 64) {
            return Long.bitCount(this.f2402b & ((1 << i7) - 1));
        } else {
            return Long.bitCount(this.f2402b) + eVar.y(i7 - 64);
        }
    }

    public void z(BufferedInputStream bufferedInputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            int i7 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 16384);
                if (read != -1) {
                    i7 += read;
                    if (i7 <= this.f2402b) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                        throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                    }
                } else {
                    byteArrayOutputStream.flush();
                    ((TaskCompletionSource) this.f2403c).setResult(byteArrayOutputStream.toByteArray());
                    bufferedInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public /* synthetic */ e(Object obj, long j, int i7) {
        this.f2401a = i7;
        this.f2403c = obj;
        this.f2402b = j;
    }

    public e(m1.l lVar, long j) {
        this.f2401a = 9;
        this.f2403c = lVar;
        K0.a.e(lVar.f13974d >= j);
        this.f2402b = j;
    }

    public e(int i7) {
        this.f2401a = i7;
        switch (i7) {
            case 3:
                this.f2402b = 0L;
                return;
            default:
                return;
        }
    }
}
