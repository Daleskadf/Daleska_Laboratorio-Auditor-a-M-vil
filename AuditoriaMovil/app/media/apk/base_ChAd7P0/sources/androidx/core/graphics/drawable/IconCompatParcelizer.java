package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0961a;
import e2.C0962b;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0961a abstractC0961a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7706a = abstractC0961a.f(iconCompat.f7706a, 1);
        byte[] bArr = iconCompat.f7708c;
        if (abstractC0961a.e(2)) {
            Parcel parcel = ((C0962b) abstractC0961a).f10861e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f7708c = bArr;
        iconCompat.f7709d = abstractC0961a.g(iconCompat.f7709d, 3);
        iconCompat.f7710e = abstractC0961a.f(iconCompat.f7710e, 4);
        iconCompat.f = abstractC0961a.f(iconCompat.f, 5);
        iconCompat.f7711g = (ColorStateList) abstractC0961a.g(iconCompat.f7711g, 6);
        String str = iconCompat.f7713i;
        if (abstractC0961a.e(7)) {
            str = ((C0962b) abstractC0961a).f10861e.readString();
        }
        iconCompat.f7713i = str;
        String str2 = iconCompat.j;
        if (abstractC0961a.e(8)) {
            str2 = ((C0962b) abstractC0961a).f10861e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f7712h = PorterDuff.Mode.valueOf(iconCompat.f7713i);
        switch (iconCompat.f7706a) {
            case -1:
                Parcelable parcelable = iconCompat.f7709d;
                if (parcelable != null) {
                    iconCompat.f7707b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f7709d;
                if (parcelable2 != null) {
                    iconCompat.f7707b = parcelable2;
                    break;
                } else {
                    byte[] bArr3 = iconCompat.f7708c;
                    iconCompat.f7707b = bArr3;
                    iconCompat.f7706a = 3;
                    iconCompat.f7710e = 0;
                    iconCompat.f = bArr3.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f7708c, Charset.forName("UTF-16"));
                iconCompat.f7707b = str3;
                if (iconCompat.f7706a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f7707b = iconCompat.f7708c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0961a abstractC0961a) {
        abstractC0961a.getClass();
        iconCompat.f7713i = iconCompat.f7712h.name();
        switch (iconCompat.f7706a) {
            case -1:
                iconCompat.f7709d = (Parcelable) iconCompat.f7707b;
                break;
            case 1:
            case 5:
                iconCompat.f7709d = (Parcelable) iconCompat.f7707b;
                break;
            case 2:
                iconCompat.f7708c = ((String) iconCompat.f7707b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f7708c = (byte[]) iconCompat.f7707b;
                break;
            case 4:
            case 6:
                iconCompat.f7708c = iconCompat.f7707b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f7706a;
        if (-1 != i7) {
            abstractC0961a.j(i7, 1);
        }
        byte[] bArr = iconCompat.f7708c;
        if (bArr != null) {
            abstractC0961a.i(2);
            int length = bArr.length;
            Parcel parcel = ((C0962b) abstractC0961a).f10861e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f7709d;
        if (parcelable != null) {
            abstractC0961a.k(parcelable, 3);
        }
        int i8 = iconCompat.f7710e;
        if (i8 != 0) {
            abstractC0961a.j(i8, 4);
        }
        int i9 = iconCompat.f;
        if (i9 != 0) {
            abstractC0961a.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f7711g;
        if (colorStateList != null) {
            abstractC0961a.k(colorStateList, 6);
        }
        String str = iconCompat.f7713i;
        if (str != null) {
            abstractC0961a.i(7);
            ((C0962b) abstractC0961a).f10861e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC0961a.i(8);
            ((C0962b) abstractC0961a).f10861e.writeString(str2);
        }
    }
}
