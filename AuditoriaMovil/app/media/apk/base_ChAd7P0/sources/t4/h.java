package T4;

import C5.i;
import M3.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.example.appecoactivate.R;
import com.google.maps.android.ui.RotationLayout;
import io.flutter.plugins.googlemaps.C1173f;
import io.flutter.plugins.googlemaps.C1177j;
import io.flutter.plugins.googlemaps.C1186t;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p.C1608t;
import s3.C1774b;
import s3.C1786n;
import s3.C1787o;
/* loaded from: classes.dex */
public class h {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f5365r = {10, 20, 50, 100, 200, 500, PipesIterator.DEFAULT_QUEUE_SIZE};

    /* renamed from: s  reason: collision with root package name */
    public static final DecelerateInterpolator f5366s = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public final C1608t f5367a;

    /* renamed from: b  reason: collision with root package name */
    public final E.e f5368b;

    /* renamed from: c  reason: collision with root package name */
    public final R4.c f5369c;

    /* renamed from: g  reason: collision with root package name */
    public final ShapeDrawable f5372g;

    /* renamed from: l  reason: collision with root package name */
    public Set f5376l;

    /* renamed from: n  reason: collision with root package name */
    public float f5378n;

    /* renamed from: p  reason: collision with root package name */
    public C1173f f5380p;

    /* renamed from: q  reason: collision with root package name */
    public C1177j f5381q;
    public final ExecutorService f = Executors.newSingleThreadExecutor();

    /* renamed from: h  reason: collision with root package name */
    public Set f5373h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray f5374i = new SparseArray();
    public final n j = new n(1);

    /* renamed from: k  reason: collision with root package name */
    public final int f5375k = 4;

    /* renamed from: m  reason: collision with root package name */
    public final n f5377m = new n(1);

    /* renamed from: o  reason: collision with root package name */
    public final g f5379o = new g(this);

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5370d = true;

    /* renamed from: e  reason: collision with root package name */
    public final long f5371e = 300;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.widget.TextView, Z4.b, android.view.View] */
    public h(Context context, C1608t c1608t, R4.c cVar) {
        TextView textView;
        this.f5367a = c1608t;
        float f = context.getResources().getDisplayMetrics().density;
        E.e eVar = new E.e(context, 11);
        this.f5368b = eVar;
        ?? textView2 = new TextView(context);
        textView2.f6740a = 0;
        textView2.f6741b = 0;
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView2.setId(R.id.amu_text);
        int i7 = (int) (12.0f * f);
        textView2.setPadding(i7, i7, i7, i7);
        RotationLayout rotationLayout = (RotationLayout) eVar.f922d;
        rotationLayout.removeAllViews();
        rotationLayout.addView(textView2);
        View findViewById = rotationLayout.findViewById(R.id.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        eVar.f923e = textView;
        if (textView != null) {
            textView.setTextAppearance(context, 2131689866);
        }
        this.f5372g = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f5372g});
        int i8 = (int) (f * 3.0f);
        layerDrawable.setLayerInset(1, i8, i8, i8, i8);
        eVar.g0(layerDrawable);
        this.f5369c = cVar;
    }

    public static X4.a a(h hVar, ArrayList arrayList, X4.a aVar) {
        hVar.getClass();
        X4.a aVar2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i7 = hVar.f5369c.f4774d.f5273b.f5269b.f5263b;
            double d7 = i7 * i7;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X4.a aVar3 = (X4.a) it.next();
                double d8 = aVar3.f6398a - aVar.f6398a;
                double d9 = aVar3.f6399b - aVar.f6399b;
                double d10 = (d9 * d9) + (d8 * d8);
                if (d10 < d7) {
                    aVar2 = aVar3;
                    d7 = d10;
                }
            }
        }
        return aVar2;
    }

    public final C1774b b(R4.a aVar) {
        String str;
        int d7 = aVar.d();
        int[] iArr = f5365r;
        if (d7 > iArr[0]) {
            int i7 = 0;
            while (true) {
                if (i7 < 6) {
                    int i8 = i7 + 1;
                    if (d7 < iArr[i8]) {
                        d7 = iArr[i7];
                        break;
                    }
                    i7 = i8;
                } else {
                    d7 = iArr[6];
                    break;
                }
            }
        }
        SparseArray sparseArray = this.f5374i;
        C1774b c1774b = (C1774b) sparseArray.get(d7);
        if (c1774b == null) {
            Paint paint = this.f5372g.getPaint();
            float min = 300.0f - Math.min(d7, 300.0f);
            paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
            E.e eVar = this.f5368b;
            TextView textView = (TextView) eVar.f923e;
            if (textView != null) {
                textView.setTextAppearance((Context) eVar.f920b, 2131689866);
            }
            if (d7 < iArr[0]) {
                str = String.valueOf(d7);
            } else {
                str = d7 + "+";
            }
            TextView textView2 = (TextView) eVar.f923e;
            if (textView2 != null) {
                textView2.setText(str);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ViewGroup viewGroup = (ViewGroup) eVar.f921c;
            viewGroup.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            viewGroup.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            viewGroup.draw(new Canvas(createBitmap));
            C1774b n7 = F.f.n(createBitmap);
            sparseArray.put(d7, n7);
            return n7;
        }
        return c1774b;
    }

    public final void c() {
        R4.c cVar = this.f5369c;
        U4.a aVar = cVar.f4772b;
        aVar.f5771e = new A4.c(this, 23);
        aVar.f5769c = new i(this, 21);
        aVar.f5770d = new a(this);
        a aVar2 = new a(this);
        U4.a aVar3 = cVar.f4773c;
        aVar3.f5771e = aVar2;
        aVar3.f5769c = new a(this);
        aVar3.f5770d = new a(this);
    }

    public void d(C1186t c1186t, C1787o c1787o) {
        String str;
        C1787o c1787o2 = c1186t.f12275a;
        String str2 = c1787o2.f15630b;
        if (str2 != null && (str = c1787o2.f15631c) != null) {
            c1787o.f15630b = str2;
            c1787o.f15631c = str;
        } else if (str2 != null) {
            c1787o.f15630b = str2;
        } else {
            String str3 = c1787o2.f15631c;
            if (str3 != null) {
                c1787o.f15630b = str3;
            }
        }
    }

    public void e(C1186t c1186t, C1786n c1786n) {
    }
}
