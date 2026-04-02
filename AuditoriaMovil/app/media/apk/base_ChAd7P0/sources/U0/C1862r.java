package u0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import v0.C1879a;
/* renamed from: u0.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862r extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final C1856l f15954b;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f15953a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public float f15955c = 1.0f;

    public C1862r(C1856l c1856l) {
        g0.c.f(c1856l, "metadata cannot be null");
        this.f15954b = c1856l;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
        C1852h.a().getClass();
        C1856l c1856l = this.f15954b;
        E.e eVar = c1856l.f15934b;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) eVar.f923e);
        int i12 = c1856l.f15933a * 2;
        canvas.drawText((char[]) eVar.f921c, i12, 2, f, i10, paint);
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        short s7;
        Paint.FontMetricsInt fontMetricsInt2 = this.f15953a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C1856l c1856l = this.f15954b;
        C1879a c8 = c1856l.c();
        int a7 = c8.a(14);
        short s8 = 0;
        if (a7 != 0) {
            s7 = ((ByteBuffer) c8.f11209d).getShort(a7 + c8.f11206a);
        } else {
            s7 = 0;
        }
        this.f15955c = abs / s7;
        C1879a c9 = c1856l.c();
        int a8 = c9.a(14);
        if (a8 != 0) {
            ((ByteBuffer) c9.f11209d).getShort(a8 + c9.f11206a);
        }
        C1879a c10 = c1856l.c();
        int a9 = c10.a(12);
        if (a9 != 0) {
            s8 = ((ByteBuffer) c10.f11209d).getShort(a9 + c10.f11206a);
        }
        short s9 = (short) (s8 * this.f15955c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }
}
