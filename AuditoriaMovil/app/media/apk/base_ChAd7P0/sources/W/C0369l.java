package W;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: W.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369l extends C {

    /* renamed from: e  reason: collision with root package name */
    public IconCompat f6045e;
    public IconCompat f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6046g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6047h;

    public static IconCompat h(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable instanceof Icon) {
                return IconCompat.b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.d((Bitmap) parcelable);
            }
            return null;
        }
        return null;
    }

    @Override // W.C
    public final void b(B.a aVar) {
        Bitmap c8;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) aVar.f225c).setBigContentTitle(this.f5992b);
        IconCompat iconCompat = this.f6045e;
        Context context = (Context) aVar.f224b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0368k.a(bigContentTitle, iconCompat.h(context));
            } else {
                int i7 = iconCompat.f7706a;
                if (i7 == -1) {
                    i7 = j3.f.w(iconCompat.f7707b);
                }
                if (i7 == 1) {
                    IconCompat iconCompat2 = this.f6045e;
                    int i8 = iconCompat2.f7706a;
                    if (i8 == -1) {
                        Object obj = iconCompat2.f7707b;
                        if (obj instanceof Bitmap) {
                            c8 = (Bitmap) obj;
                        } else {
                            c8 = null;
                        }
                    } else if (i8 == 1) {
                        c8 = (Bitmap) iconCompat2.f7707b;
                    } else if (i8 == 5) {
                        c8 = IconCompat.c((Bitmap) iconCompat2.f7707b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(c8);
                }
            }
        }
        if (this.f6046g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0367j.a(bigContentTitle, iconCompat3.h(context));
            }
        }
        if (this.f5994d) {
            bigContentTitle.setSummaryText(this.f5993c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0368k.c(bigContentTitle, this.f6047h);
            AbstractC0368k.b(bigContentTitle, null);
        }
    }

    @Override // W.C
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // W.C
    public final void g(Bundle bundle) {
        IconCompat h8;
        super.g(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f = h(bundle.getParcelable("android.largeIcon.big"));
            this.f6046g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable != null) {
            h8 = h(parcelable);
        } else {
            h8 = h(bundle.getParcelable("android.pictureIcon"));
        }
        this.f6045e = h8;
        this.f6047h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
