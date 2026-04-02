package com.harman.services;

import android.app.Application;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.adobe.air.AIRWindowSurfaceView;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.Entrypoints;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Properties;
import java.util.Scanner;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* loaded from: classes4.dex */
public class AIRRuntimeCheck {
    private static final String LOG_TAG = "AIRRuntimeCheck";
    private static Document _appDescriptor = null;
    private static Entrypoints m_entryPoints = null;
    private static boolean m_hasDoneSplash = false;
    private static Boolean _bShowingSplash = false;
    private static int m_requestedJNIFontVersion = 31;
    private static int m_requestedSAFVersion = 30;
    private static boolean m_preventBuildModelAccess = false;
    private static boolean m_disableSensorAccess = false;
    private static boolean m_runInAsyncMode = false;

    private static void showPopup(CharSequence charSequence) {
        Toast makeText = Toast.makeText(AndroidActivityWrapper.GetAndroidActivityWrapper().getDefaultContext(), charSequence, 1);
        makeText.setGravity(16, 0, 0);
        makeText.show();
    }

    public static void showBetaPopup() {
        showPopup("BETA RELEASE: not for distribution");
    }

    public static void showExpiredPopup() {
        showPopup("BETA RELEASE HAS EXPIRED. Please update to a standard release");
    }

    public static String md5Sum(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("UTF-8"));
            return UUID.nameUUIDFromBytes(messageDigest.digest()).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void showSplash() {
        boolean z;
        Log.d(LOG_TAG, "AIR - showing Splash Screen");
        try {
            AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
            AIRWindowSurfaceView aIRWindowSurfaceView = (AIRWindowSurfaceView) GetAndroidActivityWrapper.getView();
            int visibleBoundWidth = aIRWindowSurfaceView.getVisibleBoundWidth();
            int visibleBoundHeight = aIRWindowSurfaceView.getVisibleBoundHeight();
            Application application = GetAndroidActivityWrapper.getApplication();
            Bitmap bitmap = ((BitmapDrawable) application.getResources().getDrawable(application.getResources().getIdentifier(visibleBoundWidth < visibleBoundHeight ? "splash_portrait" : "splash_landscape", "drawable", application.getPackageName()))).getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = (width * 30) / 100;
            int i2 = ((width * 50) / 100) - i;
            int i3 = visibleBoundWidth < visibleBoundHeight ? 25 : 40;
            int rgb = Color.rgb(0, 100, 153);
            int[] iArr = new int[i2];
            bitmap.getPixels(iArr, 0, width, i, (height * i3) / 100, i2, 1);
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (iArr[i4] == rgb) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z) {
                _bShowingSplash = true;
                ImageView viewSplashScreenImageView = GetAndroidActivityWrapper.getViewSplashScreenImageView();
                viewSplashScreenImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                viewSplashScreenImageView.setImageBitmap(bitmap);
                GetAndroidActivityWrapper.getView().setBackgroundColor(-1);
                return;
            }
            Log.i("AIR SDK", "Invalid splash screen image used - please check your SDK");
            showPopup("WARNING: Unlicensed version of AIR SDK");
            GetAndroidActivityWrapper.finish();
            m_hasDoneSplash = false;
        } catch (Exception e) {
            Log.d(LOG_TAG, "showSplash ERROR: " + e.toString());
        }
    }

    public static void removeSplash() {
        if (_bShowingSplash.booleanValue()) {
            Log.d(LOG_TAG, "AIR - removing splash screen");
            _bShowingSplash = false;
            AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().runOnUiThread(new Runnable() { // from class: com.harman.services.AIRRuntimeCheck.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageView viewSplashScreenImageView = AndroidActivityWrapper.GetAndroidActivityWrapper().getViewSplashScreenImageView();
                    if (viewSplashScreenImageView != null && viewSplashScreenImageView.getParent() != null) {
                        ((ViewGroup) viewSplashScreenImageView.getParent()).removeView(viewSplashScreenImageView);
                    }
                    AndroidActivityWrapper.GetAndroidActivityWrapper().getView().setBackgroundColor(0);
                    AndroidActivityWrapper.GetAndroidActivityWrapper().getView().requestFocus();
                }
            });
        }
    }

    public static boolean doSplashScreen(Entrypoints entrypoints, String str, String str2) {
        boolean z = false;
        if (m_hasDoneSplash) {
            return false;
        }
        boolean z2 = true;
        m_hasDoneSplash = true;
        m_entryPoints = entrypoints;
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        try {
            AssetManager assets = GetAndroidActivityWrapper.getDefaultContext().getAssets();
            InputStream open = assets.open("META-INF/AIR/license.txt");
            Properties properties = new Properties();
            properties.load(open);
            open.close();
            InputStream open2 = assets.open("META-INF/AIR/application.xml");
            Scanner scanner = new Scanner(open2);
            String findWithinHorizon = scanner.findWithinHorizon("<id>.*</id>", 0);
            scanner.close();
            open2.close();
            if (findWithinHorizon != null) {
                findWithinHorizon = findWithinHorizon.substring(4, findWithinHorizon.length() - 5);
            }
            String property = properties.getProperty("DevID");
            String property2 = properties.getProperty("License");
            if (property != null && property2 != null) {
                boolean checkSplashScreen = findWithinHorizon != null ? entrypoints.checkSplashScreen(property, findWithinHorizon, property2) : true;
                if (checkSplashScreen) {
                    checkSplashScreen = entrypoints.checkSplashScreen(property, str2, property2);
                }
                z2 = (checkSplashScreen && str2.startsWith("air.")) ? entrypoints.checkSplashScreen(property, str2.substring(4), property2) : checkSplashScreen;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            try {
                showSplash();
            } catch (Exception unused2) {
            }
        }
        z = z2;
        if (!z) {
            ImageView viewSplashScreenImageView = GetAndroidActivityWrapper.getViewSplashScreenImageView();
            if (viewSplashScreenImageView != null && viewSplashScreenImageView.getParent() != null) {
                ((ViewGroup) viewSplashScreenImageView.getParent()).removeView(viewSplashScreenImageView);
            }
            GetAndroidActivityWrapper.getView().requestFocus();
        }
        return z;
    }

    private static boolean loadAppDescriptor() {
        if (_appDescriptor != null) {
            return true;
        }
        try {
            InputStream open = AndroidActivityWrapper.GetAndroidActivityWrapper().getDefaultContext().getAssets().open("META-INF/AIR/application.xml");
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(open);
            parse.getDocumentElement().normalize();
            _appDescriptor = parse;
            open.close();
        } catch (Exception e) {
            Log.i("AIR SDK", "Failure in opening app descriptor file for initial settings - " + e.toString());
        }
        return _appDescriptor != null;
    }

    private static void checkRequestedJNIFontVersion() {
        if (loadAppDescriptor()) {
            try {
                NodeList elementsByTagName = _appDescriptor.getElementsByTagName("newFontRenderingFromAPI");
                if (elementsByTagName.getLength() > 0) {
                    Node item = elementsByTagName.item(0);
                    String textContent = item == null ? null : item.getTextContent();
                    if (textContent != null) {
                        m_requestedJNIFontVersion = Integer.parseInt(textContent);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean shouldUseJNIFonts() {
        return m_requestedJNIFontVersion <= Build.VERSION.SDK_INT;
    }

    private static void checkRequestedSAFVersion() {
        if (loadAppDescriptor()) {
            try {
                NodeList elementsByTagName = _appDescriptor.getElementsByTagName("storageAccessFrameworkFromAPI");
                if (elementsByTagName.getLength() > 0) {
                    Node item = elementsByTagName.item(0);
                    String textContent = item == null ? null : item.getTextContent();
                    if (textContent != null) {
                        m_requestedSAFVersion = Integer.parseInt(textContent);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean shouldUseSAF() {
        return m_requestedSAFVersion <= Build.VERSION.SDK_INT;
    }

    private static void checkBuildModelAccess() {
        if (loadAppDescriptor()) {
            try {
                NodeList elementsByTagName = _appDescriptor.getElementsByTagName("preventDeviceModelAccess");
                if (elementsByTagName.getLength() > 0) {
                    boolean z = false;
                    Node item = elementsByTagName.item(0);
                    String textContent = item == null ? null : item.getTextContent();
                    if (textContent != null) {
                        z = textContent.equalsIgnoreCase("true");
                    }
                    m_preventBuildModelAccess = z;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean shouldPreventBuildModelAccess() {
        return m_preventBuildModelAccess;
    }

    public static String getBuildModel() {
        if (m_preventBuildModelAccess) {
            return null;
        }
        return Build.MODEL;
    }

    private static void checkDisableSensorAccess() {
        if (loadAppDescriptor()) {
            try {
                NodeList elementsByTagName = _appDescriptor.getElementsByTagName("disableSensorAccess");
                if (elementsByTagName.getLength() > 0) {
                    Node item = elementsByTagName.item(0);
                    String textContent = item == null ? null : item.getTextContent();
                    m_disableSensorAccess = textContent == null ? false : textContent.equalsIgnoreCase("true");
                }
                if (m_disableSensorAccess) {
                    Node item2 = _appDescriptor.getElementsByTagName("id").item(0);
                    AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
                    if (new File(GetAndroidActivityWrapper.GetAppDataDirectory() + "/" + item2.getTextContent() + "/Local Store/.allowSensorAccess").exists()) {
                        m_disableSensorAccess = false;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean shouldDisableSensorAccess() {
        return m_disableSensorAccess;
    }

    private static void checkRunInAsyncMode() {
        if (loadAppDescriptor()) {
            try {
                NodeList elementsByTagName = _appDescriptor.getElementsByTagName("runtimeInBackgroundThread");
                if (elementsByTagName.getLength() > 0) {
                    boolean z = false;
                    Node item = elementsByTagName.item(0);
                    String textContent = item == null ? null : item.getTextContent();
                    if (textContent != null) {
                        z = textContent.equalsIgnoreCase("true");
                    }
                    m_runInAsyncMode = z;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean shouldRunInAsyncMode() {
        return m_runInAsyncMode;
    }

    public static void runtimeStartupChecks() {
        checkRequestedJNIFontVersion();
        checkRequestedSAFVersion();
        checkBuildModelAccess();
        checkDisableSensorAccess();
        checkRunInAsyncMode();
    }
}
