package Z4;

import android.graphics.Canvas;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class b extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public int f6740a;

    /* renamed from: b  reason: collision with root package name */
    public int f6741b;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.f6741b / 2, this.f6740a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f6740a = measuredWidth - measuredHeight;
            this.f6741b = 0;
        } else {
            this.f6740a = 0;
            this.f6741b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
