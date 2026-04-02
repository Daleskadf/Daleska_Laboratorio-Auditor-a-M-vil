package S1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e6.C0967b;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public int f4957a;

    /* renamed from: b  reason: collision with root package name */
    public int f4958b;

    /* renamed from: c  reason: collision with root package name */
    public int f4959c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4960d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4961e;

    public H(int i7, int i8) {
        this(Integer.MIN_VALUE, i7, i8);
    }

    public void a() {
        int i7;
        int i8 = this.f4959c;
        if (i8 == Integer.MIN_VALUE) {
            i7 = this.f4957a;
        } else {
            i7 = i8 + this.f4958b;
        }
        this.f4959c = i7;
        this.f4961e = ((String) this.f4960d) + this.f4959c;
    }

    public int b(int i7) {
        int i8 = this.f4958b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f4960d).size() == 0) {
            return i7;
        }
        ArrayList arrayList = (ArrayList) this.f4960d;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f4958b = ((StaggeredGridLayoutManager) this.f4961e).j.d(view);
        ((Y1.H) view.getLayoutParams()).getClass();
        return this.f4958b;
    }

    public void c(C0967b c0967b) {
        int i7;
        int i8 = c0967b.f10927c;
        if (i8 > 4096) {
            Arrays.fill((C0967b[]) this.f4961e, (Object) null);
            this.f4958b = ((C0967b[]) this.f4961e).length - 1;
            this.f4957a = 0;
            this.f4959c = 0;
            return;
        }
        int i9 = (this.f4959c + i8) - RecognitionOptions.AZTEC;
        if (i9 > 0) {
            int length = ((C0967b[]) this.f4961e).length - 1;
            int i10 = 0;
            while (true) {
                i7 = this.f4958b;
                if (length < i7 || i9 <= 0) {
                    break;
                }
                int i11 = ((C0967b[]) this.f4961e)[length].f10927c;
                i9 -= i11;
                this.f4959c -= i11;
                this.f4957a--;
                i10++;
                length--;
            }
            C0967b[] c0967bArr = (C0967b[]) this.f4961e;
            int i12 = i7 + 1;
            System.arraycopy(c0967bArr, i12, c0967bArr, i12 + i10, this.f4957a);
            this.f4958b += i10;
        }
        int i13 = this.f4957a + 1;
        C0967b[] c0967bArr2 = (C0967b[]) this.f4961e;
        if (i13 > c0967bArr2.length) {
            C0967b[] c0967bArr3 = new C0967b[c0967bArr2.length * 2];
            System.arraycopy(c0967bArr2, 0, c0967bArr3, c0967bArr2.length, c0967bArr2.length);
            this.f4958b = ((C0967b[]) this.f4961e).length - 1;
            this.f4961e = c0967bArr3;
        }
        int i14 = this.f4958b;
        this.f4958b = i14 - 1;
        ((C0967b[]) this.f4961e)[i14] = c0967b;
        this.f4957a++;
        this.f4959c += i8;
    }

    public void d() {
        if (this.f4959c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public void e(Q6.g gVar) {
        f(gVar.c(), 127, 0);
        ((Q6.e) this.f4960d).v(gVar);
    }

    public void f(int i7, int i8, int i9) {
        Q6.e eVar = (Q6.e) this.f4960d;
        if (i7 < i8) {
            eVar.x(i7 | i9);
            return;
        }
        eVar.x(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            eVar.x(128 | (i10 & 127));
            i10 >>>= 7;
        }
        eVar.x(i10);
    }

    public H(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = StringUtils.EMPTY;
        }
        this.f4960d = str;
        this.f4957a = i8;
        this.f4958b = i9;
        this.f4959c = Integer.MIN_VALUE;
        this.f4961e = StringUtils.EMPTY;
    }

    public H(Q6.e eVar) {
        this.f4961e = new C0967b[8];
        this.f4958b = 7;
        this.f4960d = eVar;
    }

    public H(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.f4961e = staggeredGridLayoutManager;
        this.f4960d = new ArrayList();
        this.f4957a = Integer.MIN_VALUE;
        this.f4958b = Integer.MIN_VALUE;
        this.f4959c = i7;
    }
}
