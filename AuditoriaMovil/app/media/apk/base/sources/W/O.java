package W;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f6016a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f6017b;

    /* renamed from: c  reason: collision with root package name */
    public String f6018c;

    /* renamed from: d  reason: collision with root package name */
    public String f6019d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6020e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1, types: [W.O, java.lang.Object] */
    public static O a(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.a(bundle2);
        } else {
            iconCompat = null;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        boolean z7 = bundle.getBoolean("isBot");
        boolean z8 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.f6016a = charSequence;
        obj.f6017b = iconCompat;
        obj.f6018c = string;
        obj.f6019d = string2;
        obj.f6020e = z7;
        obj.f = z8;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f6016a);
        IconCompat iconCompat = this.f6017b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f7706a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f7707b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f7707b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f7707b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f7707b);
                    break;
            }
            bundle.putInt("type", iconCompat.f7706a);
            bundle.putInt("int1", iconCompat.f7710e);
            bundle.putInt("int2", iconCompat.f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.f7711g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f7712h;
            if (mode != IconCompat.f7705k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f6018c);
        bundle2.putString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, this.f6019d);
        bundle2.putBoolean("isBot", this.f6020e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        String str = this.f6019d;
        String str2 = o7.f6019d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.f6016a), Objects.toString(o7.f6016a)) || !Objects.equals(this.f6018c, o7.f6018c) || !Boolean.valueOf(this.f6020e).equals(Boolean.valueOf(o7.f6020e)) || !Boolean.valueOf(this.f).equals(Boolean.valueOf(o7.f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f6019d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f6016a, this.f6018c, Boolean.valueOf(this.f6020e), Boolean.valueOf(this.f));
    }
}
