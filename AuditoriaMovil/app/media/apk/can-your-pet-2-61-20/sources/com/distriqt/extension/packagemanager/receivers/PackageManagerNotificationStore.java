package com.distriqt.extension.packagemanager.receivers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.distriqt.extension.packagemanager.utils.Errors;
import com.distriqt.extension.packagemanager.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class PackageManagerNotificationStore {
    private static final String KEY_NOTIFICATIONDISPATCHLIST = "__dtpm_notificationdispatch_list";
    private static final String TAG = "PackageManagerNotificationStore";
    private ArrayList<NotificationDispatch> _dispatchList = new ArrayList<>();
    private AsyncTask<Void, Void, Void> _saveTask;
    private SharedPreferences _sharedPreferences;

    public PackageManagerNotificationStore(Context context) {
        this._sharedPreferences = null;
        this._sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        load();
    }

    public void addNotificationForDispatch(String str, String str2) {
        Logger.d(TAG, "addNotificationForDispatch( %s, %s )", str, str2);
        NotificationDispatch notificationDispatch = new NotificationDispatch();
        notificationDispatch.code = str;
        notificationDispatch.data = str2;
        this._dispatchList.add(notificationDispatch);
        save();
    }

    public ArrayList<NotificationDispatch> getNotificationForDispatch() {
        return (ArrayList) this._dispatchList.clone();
    }

    public void clearNotificationForDispatch() {
        this._dispatchList.clear();
        save();
    }

    private void load() {
        SharedPreferences sharedPreferences = this._sharedPreferences;
        if (sharedPreferences != null) {
            try {
                JSONArray jSONArray = new JSONArray(sharedPreferences.getString(KEY_NOTIFICATIONDISPATCHLIST, "[]"));
                ArrayList<NotificationDispatch> arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new NotificationDispatch().fromJSON(jSONArray.getJSONObject(i)));
                }
                this._dispatchList.clear();
                this._dispatchList = arrayList;
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.distriqt.extension.packagemanager.receivers.PackageManagerNotificationStore$1] */
    private void save() {
        if (this._sharedPreferences != null) {
            AsyncTask<Void, Void, Void> asyncTask = this._saveTask;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            try {
                final ArrayList arrayList = (ArrayList) this._dispatchList.clone();
                this._saveTask = new AsyncTask<Void, Void, Void>() { // from class: com.distriqt.extension.packagemanager.receivers.PackageManagerNotificationStore.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Void r1) {
                    }

                    @Override // android.os.AsyncTask
                    protected void onPreExecute() {
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public Void doInBackground(Void... voidArr) {
                        SharedPreferences.Editor edit;
                        JSONArray jSONArray;
                        try {
                            edit = PackageManagerNotificationStore.this._sharedPreferences.edit();
                            jSONArray = new JSONArray();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                NotificationDispatch notificationDispatch = (NotificationDispatch) it.next();
                                if (isCancelled()) {
                                    return null;
                                }
                                jSONArray.put(notificationDispatch.toJSONObject());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (isCancelled()) {
                            return null;
                        }
                        edit.putString(PackageManagerNotificationStore.KEY_NOTIFICATIONDISPATCHLIST, jSONArray.toString());
                        if (isCancelled()) {
                            return null;
                        }
                        edit.apply();
                        return null;
                    }
                }.execute(new Void[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
