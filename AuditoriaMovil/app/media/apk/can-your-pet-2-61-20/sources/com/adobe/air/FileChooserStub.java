package com.adobe.air;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import com.adobe.air.AndroidActivityWrapper;
import com.harman.services.AIRRuntimeCheck;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class FileChooserStub implements AndroidActivityWrapper.ActivityResultCallback {
    public static final String TAG = FileChooserStub.class.toString();
    private AIRExpandableFileChooser fileChooser;
    private Condition m_condition;
    private Lock m_lock;
    private ArrayList<String> m_filenames = null;
    private String m_userAction = null;
    private boolean m_isSave = false;
    private boolean m_isDirectory = false;
    private ArrayList<String> m_filterList = new ArrayList<>();

    public FileChooserStub() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.m_lock = reentrantLock;
        this.m_condition = reentrantLock.newCondition();
    }

    public void show(final String str, final boolean z, final boolean z2) {
        if (AIRRuntimeCheck.shouldUseSAF()) {
            this.m_isSave = z;
            this.m_isDirectory = false;
            showSAF(str, z2);
            return;
        }
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        Activity activity = GetAndroidActivityWrapper.getActivity();
        if (activity == null) {
            activity = GetAndroidActivityWrapper.WaitForNewActivity();
        }
        activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.FileChooserStub.1
            @Override // java.lang.Runnable
            public void run() {
                FileChooserStub.this.fileChooser = new AIRExpandableFileChooser(FileChooserStub.this.m_filterList, z, z2, str, this);
                FileChooserStub.this.fileChooser.GetDialog().show();
            }
        });
        this.m_lock.lock();
        try {
            if (this.m_userAction == null) {
                this.m_condition.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.m_lock.unlock();
            throw th;
        }
        this.m_lock.unlock();
        ArrayList<String> GetFileNames = this.fileChooser.GetFileNames();
        this.m_filenames = GetFileNames;
        if (GetFileNames != null) {
            for (int i = 0; i < this.m_filenames.size(); i++) {
            }
        }
    }

    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        if (7 != i) {
            return;
        }
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        GetAndroidActivityWrapper.removeActivityResultListener(this);
        if (i2 == -1 && intent != null) {
            ContentResolver contentResolver = GetAndroidActivityWrapper.getActivity().getContentResolver();
            this.m_filenames = new ArrayList<>();
            int i3 = 2;
            if (intent.getClipData() == null) {
                Uri data = intent.getData();
                this.m_filenames.add(data.toString());
                if (!this.m_isSave && !this.m_isDirectory) {
                    i3 = 0;
                }
                contentResolver.takePersistableUriPermission(data, 1 | i3);
            } else {
                ClipData clipData = intent.getClipData();
                for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                    Uri uri = clipData.getItemAt(i4).getUri();
                    this.m_filenames.add(uri.toString());
                    contentResolver.takePersistableUriPermission(uri, (this.m_isSave ? 2 : 0) | 1);
                }
            }
            SetUserAction("done");
            return;
        }
        SetUserAction("cancel");
    }

    public void showSAF(String str, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        int size = this.m_filterList.size();
        while (size > 0) {
            size--;
            String str2 = this.m_filterList.get(size);
            if (str2.matches("/^\\S+\\/\\S+$")) {
                arrayList.add(str2);
            }
        }
        this.m_filterList = arrayList;
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        GetAndroidActivityWrapper.addActivityResultListener(this);
        Intent intent = new Intent(this.m_isSave ? "android.intent.action.CREATE_DOCUMENT" : "android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setFlags((this.m_isSave ? 2 : 0) | 65);
        if (this.m_isSave) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.TITLE", "Please enter the filename");
        } else if (this.m_filterList.size() == 1) {
            intent.setType(this.m_filterList.get(0));
        } else {
            intent.setType("*/*");
            if (this.m_filterList.size() > 0) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.m_filterList.toArray(new String[0]));
            }
        }
        if (z) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (!str.equals("/")) {
            intent.putExtra("android.provider.extra.INITIAL_URI", str);
        }
        try {
            GetAndroidActivityWrapper.getActivity().startActivityForResult(intent, 7);
        } catch (ActivityNotFoundException unused) {
            intent.setType("*/*");
            GetAndroidActivityWrapper.getActivity().startActivityForResult(intent, 7);
        }
        this.m_lock.lock();
        try {
            if (this.m_userAction == null) {
                this.m_condition.await();
            }
        } catch (InterruptedException unused2) {
        } catch (Throwable th) {
            this.m_lock.unlock();
            throw th;
        }
        this.m_lock.unlock();
    }

    public void chooseDirectory(String str) {
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        GetAndroidActivityWrapper.addActivityResultListener(this);
        this.m_isSave = false;
        this.m_isDirectory = true;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(65);
        intent.setFlags(66);
        if (!str.equals("/")) {
            intent.putExtra("android.provider.extra.INITIAL_URI", str);
        }
        GetAndroidActivityWrapper.getActivity().startActivityForResult(intent, 7);
        this.m_lock.lock();
        try {
            if (this.m_userAction == null) {
                this.m_condition.await();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.m_lock.unlock();
            throw th;
        }
        this.m_lock.unlock();
    }

    public void addFilter(String str) {
        this.m_filterList.add(str);
    }

    public void SetUserAction(String str) {
        this.m_lock.lock();
        this.m_userAction = str;
        this.m_condition.signal();
        this.m_lock.unlock();
    }

    public int getNumFilenames() {
        return this.m_filenames.size();
    }

    public String getFilename(int i) {
        if (i >= this.m_filenames.size()) {
            return null;
        }
        return this.m_filenames.get(i);
    }

    public boolean userCancelled() {
        String str = this.m_userAction;
        return str == null || str.equals("cancel");
    }
}
