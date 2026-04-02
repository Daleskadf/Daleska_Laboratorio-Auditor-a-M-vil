package com.distriqt.core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import com.adobe.fre.FREBitmapData;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class FREImageUtils {
    public static final String TAG = "FREImageUtils";
    private static final float[] bgrToRgbColorTransform;
    private static final ColorMatrixColorFilter colorFilter;
    private static final ColorMatrix colorMatrix;

    static {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        bgrToRgbColorTransform = fArr;
        ColorMatrix colorMatrix2 = new ColorMatrix(fArr);
        colorMatrix = colorMatrix2;
        colorFilter = new ColorMatrixColorFilter(colorMatrix2);
    }

    public static File bitmapDataToCacheFile(Context context, FREBitmapData fREBitmapData, String str, String str2) {
        return bitmapDataToCacheFile(context, fREBitmapData, str, str2, "jpg", 0.8f);
    }

    public static File bitmapDataToCacheFile(Context context, FREBitmapData fREBitmapData, String str, String str2, String str3, float f) {
        File file;
        FREUtils.log(TAG, "bitmapDataToCacheFile()", new Object[0]);
        try {
            Bitmap bitmapDataToBitmap = bitmapDataToBitmap(fREBitmapData);
            if (bitmapDataToBitmap != null) {
                new File(context.getExternalCacheDir().getAbsolutePath() + "/" + str).mkdir();
                String str4 = file.getAbsolutePath() + "/" + str2;
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str4));
                if (str3.equals("png")) {
                    bitmapDataToBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                } else {
                    bitmapDataToBitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), bufferedOutputStream);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return new File(str4);
            }
        } catch (Exception e) {
            FREUtils.handleException(null, e);
        }
        return null;
    }

    public static Bitmap bitmapDataToBitmap(FREBitmapData fREBitmapData) {
        FREUtils.log(TAG, "bitmapDataToBitmap()", new Object[0]);
        if (fREBitmapData != null) {
            try {
                fREBitmapData.acquire();
                ByteBuffer bits = fREBitmapData.getBits();
                Bitmap createBitmap = Bitmap.createBitmap(fREBitmapData.getWidth(), fREBitmapData.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                createBitmap.copyPixelsFromBuffer(bits);
                fREBitmapData.release();
                Paint paint = new Paint();
                paint.setColorFilter(colorFilter);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                return createBitmap;
            } catch (Exception e) {
                FREUtils.handleException(null, e);
            }
        }
        return null;
    }

    public static Bitmap getFREObjectAsBitmap(FREBitmapData fREBitmapData) throws Exception {
        fREBitmapData.acquire();
        Bitmap createBitmap = Bitmap.createBitmap(fREBitmapData.getWidth(), fREBitmapData.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(fREBitmapData.getBits());
        fREBitmapData.release();
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void drawBitmapToBitmapData(Bitmap bitmap, FREBitmapData fREBitmapData) {
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(colorMatrixColorFilter);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            fREBitmapData.acquire();
            createBitmap.copyPixelsToBuffer(fREBitmapData.getBits());
            fREBitmapData.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap getThumbnail(Context context, Uri uri, int i) throws FileNotFoundException, IOException {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        if (options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        int i2 = options.outHeight > options.outWidth ? options.outHeight : options.outWidth;
        double d = i2 > i ? i2 / i : 1.0d;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = getPowerOfTwoForSampleRatio(d);
        options2.inDither = true;
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, null, options2);
        openInputStream2.close();
        return decodeStream;
    }

    private static int getPowerOfTwoForSampleRatio(double d) {
        int highestOneBit = Integer.highestOneBit((int) Math.floor(d));
        if (highestOneBit == 0) {
            return 1;
        }
        return highestOneBit;
    }

    public static String drawBitmapToBitmapDataBase64String(Bitmap bitmap) {
        try {
            int width = bitmap.getWidth() * bitmap.getHeight();
            int[] iArr = new int[width];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            ByteBuffer allocate = ByteBuffer.allocate(width * 4);
            allocate.asIntBuffer().put(iArr);
            return Base64.encodeToString(allocate.array(), 2);
        } catch (Exception e) {
            FREUtils.handleException(e);
            return "";
        }
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    FREUtils.log(TAG, "drawableToBitmap(): returning BitmapDrawable", new Object[0]);
                    return bitmapDrawable.getBitmap();
                }
            }
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                FREUtils.log(TAG, "drawableToBitmap(): Bitmap.createBitmap( %d, %d )", Integer.valueOf(drawable.getIntrinsicWidth()), Integer.valueOf(drawable.getIntrinsicHeight()));
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    public static FREBitmapData bitmapToFREBitmapData(Bitmap bitmap) {
        FREBitmapData fREBitmapData = null;
        try {
            fREBitmapData = FREBitmapData.newBitmapData(bitmap.getWidth(), bitmap.getHeight(), bitmap.hasAlpha(), new Byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1});
            drawBitmapToBitmapData(bitmap, fREBitmapData);
            return fREBitmapData;
        } catch (Exception e) {
            e.printStackTrace();
            return fREBitmapData;
        }
    }

    public static FREBitmapData bitmapToFREBitmapDataIgnoreOrder(Bitmap bitmap) {
        FREBitmapData fREBitmapData = null;
        try {
            fREBitmapData = FREBitmapData.newBitmapData(bitmap.getWidth(), bitmap.getHeight(), bitmap.hasAlpha(), new Byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1});
            drawBitmapToBitmapDataIgnoreOrder(bitmap, fREBitmapData);
            return fREBitmapData;
        } catch (Exception e) {
            e.printStackTrace();
            return fREBitmapData;
        }
    }

    public static Bitmap getFREObjectAsBitmapIgnoreOrder(FREBitmapData fREBitmapData) throws Exception {
        fREBitmapData.acquire();
        Bitmap createBitmap = Bitmap.createBitmap(fREBitmapData.getWidth(), fREBitmapData.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(fREBitmapData.getBits());
        fREBitmapData.release();
        return createBitmap;
    }

    public static void drawBitmapToBitmapDataIgnoreOrder(Bitmap bitmap, FREBitmapData fREBitmapData) {
        try {
            fREBitmapData.acquire();
            bitmap.copyPixelsToBuffer(fREBitmapData.getBits());
            fREBitmapData.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
