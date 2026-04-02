package com.adobe.air.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
/* loaded from: classes.dex */
public class AIRLocationListener implements LocationListener {
    private static final int TIMEOUT_INTERVAL = 15000;
    private Geolocation m_geoObj;

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AIRLocationListener(Geolocation geolocation) {
        this.m_geoObj = geolocation;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.location.LocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLocationChanged(android.location.Location r30) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.location.AIRLocationListener.onLocationChanged(android.location.Location):void");
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        boolean z = this.m_geoObj.m_isGPSProviderEnabled;
        boolean z2 = this.m_geoObj.m_isNetworkProviderEnabled;
        if (str.compareTo("gps") == 0) {
            this.m_geoObj.m_isGPSProviderEnabled = false;
        } else if (str.compareTo("network") == 0) {
            this.m_geoObj.m_isNetworkProviderEnabled = false;
        }
        if ((z == this.m_geoObj.m_isGPSProviderEnabled && z2 == this.m_geoObj.m_isNetworkProviderEnabled) || !this.m_geoObj.m_EventSourceExists || this.m_geoObj.m_isGPSProviderEnabled || this.m_geoObj.m_isNetworkProviderEnabled) {
            return;
        }
        Geolocation geolocation = this.m_geoObj;
        geolocation.setGeolocationStatus(false, geolocation.m_objectPointer);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        boolean z = this.m_geoObj.m_isGPSProviderEnabled;
        boolean z2 = this.m_geoObj.m_isNetworkProviderEnabled;
        if (str.compareTo("gps") == 0) {
            this.m_geoObj.m_isGPSProviderEnabled = true;
            if (!this.m_geoObj.m_EventSourceExists || this.m_geoObj.m_isNetworkProviderEnabled || z == this.m_geoObj.m_isGPSProviderEnabled) {
                return;
            }
            Geolocation geolocation = this.m_geoObj;
            geolocation.setGeolocationStatus(true, geolocation.m_objectPointer);
        } else if (str.compareTo("network") == 0) {
            this.m_geoObj.m_isNetworkProviderEnabled = true;
            if (!this.m_geoObj.m_EventSourceExists || this.m_geoObj.m_isGPSProviderEnabled || z2 == this.m_geoObj.m_isNetworkProviderEnabled) {
                return;
            }
            Geolocation geolocation2 = this.m_geoObj;
            geolocation2.setGeolocationStatus(true, geolocation2.m_objectPointer);
        }
    }

    private boolean isRegionFullyContained(double d, double d2, float f, double d3, double d4, float f2) {
        float[] fArr = new float[5];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0] <= Math.abs(f2 - f);
    }
}
