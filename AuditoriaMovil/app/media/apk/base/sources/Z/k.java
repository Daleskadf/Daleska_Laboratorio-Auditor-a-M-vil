package Z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public final class k extends android.support.v4.media.session.a {
    public static Font J(FontFamily fontFamily, int i7) {
        int i8;
        int i9;
        if ((i7 & 1) != 0) {
            i8 = 700;
        } else {
            i8 = 400;
        }
        if ((i7 & 2) != 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        FontStyle fontStyle = new FontStyle(i8, i9);
        Font font = fontFamily.getFont(0);
        int L6 = L(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int L7 = L(fontStyle, font2.getStyle());
            if (L7 < L6) {
                font = font2;
                L6 = L7;
            }
        }
        return font;
    }

    public static FontFamily K(e0.i[] iVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (e0.i iVar : iVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f10609a, "r", null);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f10611c).setSlant(iVar.f10612d ? 1 : 0).setTtcIndex(iVar.f10610b).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int L(FontStyle fontStyle, FontStyle fontStyle2) {
        int i7;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        return abs + i7;
    }

    @Override // android.support.v4.media.session.a
    public final Typeface c(Context context, Y.e eVar, Resources resources, int i7) {
        Y.f[] fVarArr;
        try {
            FontFamily.Builder builder = null;
            for (Y.f fVar : eVar.f6557a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f).setWeight(fVar.f6559b).setSlant(fVar.f6560c ? 1 : 0).setTtcIndex(fVar.f6562e).setFontVariationSettings(fVar.f6561d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface d(Context context, e0.i[] iVarArr, int i7) {
        try {
            FontFamily K7 = K(iVarArr, context.getContentResolver());
            if (K7 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(K7).setStyle(J(K7, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface e(Context context, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily K7 = K((e0.i[]) list.get(0), contentResolver);
            if (K7 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(K7);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily K8 = K((e0.i[]) list.get(i8), contentResolver);
                if (K8 != null) {
                    customFallbackBuilder.addCustomFallback(K8);
                }
            }
            return customFallbackBuilder.setStyle(J(K7, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // android.support.v4.media.session.a
    public final Typeface g(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // android.support.v4.media.session.a
    public final e0.i l(e0.i[] iVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
