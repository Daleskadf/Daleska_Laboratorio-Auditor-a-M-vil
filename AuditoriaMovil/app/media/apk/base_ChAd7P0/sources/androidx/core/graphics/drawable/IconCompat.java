package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import j3.f;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f7705k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f7706a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7707b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f7708c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f7709d;

    /* renamed from: e  reason: collision with root package name */
    public int f7710e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f7711g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f7712h;

    /* renamed from: i  reason: collision with root package name */
    public String f7713i;
    public String j;

    public IconCompat() {
        this.f7706a = -1;
        this.f7708c = null;
        this.f7709d = null;
        this.f7710e = 0;
        this.f = 0;
        this.f7711g = null;
        this.f7712h = f7705k;
        this.f7713i = null;
    }

    public static IconCompat a(Bundle bundle) {
        int i7 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i7);
        iconCompat.f7710e = bundle.getInt("int1");
        iconCompat.f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f7711g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f7712h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i7) {
            case -1:
            case 1:
            case 5:
                iconCompat.f7707b = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i7);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f7707b = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f7707b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static IconCompat b(Icon icon) {
        icon.getClass();
        int w2 = f.w(icon);
        if (w2 != 2) {
            if (w2 != 4) {
                if (w2 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.f7707b = icon;
                    return iconCompat;
                }
                Uri x7 = f.x(icon);
                x7.getClass();
                String uri = x7.toString();
                uri.getClass();
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.f7707b = uri;
                return iconCompat2;
            }
            Uri x8 = f.x(icon);
            x8.getClass();
            String uri2 = x8.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.f7707b = uri2;
            return iconCompat3;
        }
        return e(null, f.v(icon), f.u(icon));
    }

    public static Bitmap c(Bitmap bitmap, boolean z7) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f4 = 0.5f * f;
        float f8 = 0.9166667f * f4;
        if (z7) {
            float f9 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f8, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f7707b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Resources resources, String str, int i7) {
        str.getClass();
        if (i7 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f7710e = i7;
            if (resources != null) {
                try {
                    iconCompat.f7707b = resources.getResourceName(i7);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f7707b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int f() {
        int i7 = this.f7706a;
        if (i7 == -1) {
            return f.u(this.f7707b);
        }
        if (i7 == 2) {
            return this.f7710e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri g() {
        int i7 = this.f7706a;
        if (i7 == -1) {
            return f.x(this.f7707b);
        }
        if (i7 != 4 && i7 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f7707b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon h(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.h(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f7706a == -1) {
            return String.valueOf(this.f7707b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f7706a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f7706a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f7707b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f7707b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f7710e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f7707b);
                break;
        }
        if (this.f7711g != null) {
            sb.append(" tint=");
            sb.append(this.f7711g);
        }
        if (this.f7712h != f7705k) {
            sb.append(" mode=");
            sb.append(this.f7712h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f7708c = null;
        this.f7709d = null;
        this.f7710e = 0;
        this.f = 0;
        this.f7711g = null;
        this.f7712h = f7705k;
        this.f7713i = null;
        this.f7706a = i7;
    }
}
