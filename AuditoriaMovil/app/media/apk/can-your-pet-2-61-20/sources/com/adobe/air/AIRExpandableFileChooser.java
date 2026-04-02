package com.adobe.air;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adobe.air.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AIRExpandableFileChooser implements ExpandableListView.OnChildClickListener {
    private static final String FILEINFO = "FILEINFO";
    public static final String TAG = AIRExpandableFileChooser.class.toString();
    private static final String TYPE = "TYPE";
    private static final String USER_ACTION_CANCEL = "cancel";
    private static final String USER_ACTION_DONE = "done";
    private ExpandableListAdapter mAdapter;
    private boolean mAllowMultiple;
    private AndroidAlertDialog mFileChooserDialog;
    private FileChooserStub mFileChooserStub;
    private EditText mFileSaveName;
    private LayoutInflater mRuntimeInflater;
    private Resources mRuntimeResources;
    private boolean mSave;
    private String mSelection = new String();
    private View mMultipleFileSelectionView = null;
    private SparseBooleanArray mCheckedFiles = new SparseBooleanArray();
    private ArrayList<String> mFilenames = new ArrayList<>();
    private final String[] mFileProjection = {"_data", "_display_name"};
    private List<Map<String, String>> mGroupData = new ArrayList();
    private List<List<Map<String, FileInfo>>> mChildData = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FileInfo {
        public String mFileName;
        public String mFilePath;
        public FileChooserItem mParent;

        public FileInfo(String str, String str2) {
            this.mFileName = new String();
            new String();
            this.mParent = null;
            this.mFileName = str;
            this.mFilePath = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FileChooserItem extends LinearLayout {
        private CompoundButton mFileCheckBox;
        private TextView mFileNameView;
        private TextView mFilePathView;
        private int mListFlatPosition;
        private CompoundButton.OnCheckedChangeListener mListener;

        FileChooserItem(LayoutInflater layoutInflater, Resources resources, ViewGroup viewGroup, int i, int i2) {
            super(AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity());
            this.mListFlatPosition = -1;
            if (AIRExpandableFileChooser.this.mAllowMultiple) {
                View GetLayoutView = Utils.GetLayoutView("expandable_multiple_chooser_row", resources, layoutInflater);
                Resources resources2 = GetLayoutView.getResources();
                this.mFileNameView = (TextView) Utils.GetWidgetInViewByNameFromPackage("filename", resources2, GetLayoutView);
                this.mFilePathView = (TextView) Utils.GetWidgetInViewByNameFromPackage("filepath", resources2, GetLayoutView);
                this.mFileCheckBox = (CompoundButton) Utils.GetWidgetInViewByNameFromPackage("filecheck", resources2, GetLayoutView);
                TextView textView = this.mFileNameView;
                this.mListFlatPosition = AIRExpandableFileChooser.this.expandableListPositionToFlatPosition(i, i2);
                this.mListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.adobe.air.AIRExpandableFileChooser.FileChooserItem.1
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        if (FileChooserItem.this.mListFlatPosition < 0) {
                            return;
                        }
                        if (z) {
                            AIRExpandableFileChooser.this.mCheckedFiles.put(FileChooserItem.this.mListFlatPosition, z);
                        } else {
                            AIRExpandableFileChooser.this.mCheckedFiles.delete(FileChooserItem.this.mListFlatPosition);
                        }
                    }
                };
                addView(GetLayoutView);
                return;
            }
            View GetLayoutView2 = Utils.GetLayoutView("expandable_chooser_row", resources, layoutInflater);
            Resources resources3 = GetLayoutView2.getResources();
            this.mFileNameView = (TextView) Utils.GetWidgetInViewByNameFromPackage("filename", resources3, GetLayoutView2);
            this.mFilePathView = (TextView) Utils.GetWidgetInViewByNameFromPackage("filepath", resources3, GetLayoutView2);
            addView(GetLayoutView2);
        }

        public void bindToData(FileInfo fileInfo, int i, int i2) {
            this.mFileNameView.setText(fileInfo.mFileName);
            this.mFilePathView.setText(fileInfo.mFilePath);
            if (AIRExpandableFileChooser.this.mAllowMultiple) {
                this.mListFlatPosition = AIRExpandableFileChooser.this.expandableListPositionToFlatPosition(i, i2);
                this.mFileCheckBox.setOnCheckedChangeListener(null);
                this.mFileCheckBox.setChecked(AIRExpandableFileChooser.this.mCheckedFiles.get(this.mListFlatPosition));
                this.mFileCheckBox.setOnCheckedChangeListener(this.mListener);
                fileInfo.mParent = this;
            }
        }

        public void toggle() {
            if (AIRExpandableFileChooser.this.mAllowMultiple) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.mListener;
                CompoundButton compoundButton = this.mFileCheckBox;
                onCheckedChangeListener.onCheckedChanged(compoundButton, !compoundButton.isChecked());
                this.mFileCheckBox.setOnCheckedChangeListener(null);
                this.mFileCheckBox.setChecked(AIRExpandableFileChooser.this.mCheckedFiles.get(this.mListFlatPosition));
                this.mFileCheckBox.setOnCheckedChangeListener(this.mListener);
            }
        }

        public void uncheck() {
            if (AIRExpandableFileChooser.this.mAllowMultiple) {
                this.mListener.onCheckedChanged(this.mFileCheckBox, false);
                this.mFileCheckBox.setOnCheckedChangeListener(null);
                this.mFileCheckBox.setChecked(false);
                this.mFileCheckBox.setOnCheckedChangeListener(this.mListener);
            }
        }
    }

    /* loaded from: classes.dex */
    private class FileChooserExpandableListAdapter extends BaseExpandableListAdapter {
        private LayoutInflater mRuntimeInflater;
        private Resources mRuntimeResources;

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i, int i2) {
            return i2;
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i) {
            return i;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return true;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i, int i2) {
            return true;
        }

        public FileChooserExpandableListAdapter(LayoutInflater layoutInflater, Resources resources) {
            this.mRuntimeInflater = layoutInflater;
            this.mRuntimeResources = resources;
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getChild(int i, int i2) {
            return ((List) AIRExpandableFileChooser.this.mChildData.get(i)).get(i2);
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            FileChooserItem fileChooserItem;
            if (view == null || !(view instanceof FileChooserItem)) {
                fileChooserItem = new FileChooserItem(this.mRuntimeInflater, this.mRuntimeResources, viewGroup, i, i2);
            } else {
                fileChooserItem = (FileChooserItem) view;
            }
            fileChooserItem.bindToData((FileInfo) ((Map) ((List) AIRExpandableFileChooser.this.mChildData.get(i)).get(i2)).get(AIRExpandableFileChooser.FILEINFO), i, i2);
            return fileChooserItem;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i) {
            return ((List) AIRExpandableFileChooser.this.mChildData.get(i)).size();
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getGroup(int i) {
            return AIRExpandableFileChooser.this.mGroupData.get(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return AIRExpandableFileChooser.this.mGroupData.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.mRuntimeInflater.inflate(17367046, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(16908308);
            if (textView != null) {
                textView.setText((CharSequence) ((Map) AIRExpandableFileChooser.this.mGroupData.get(i)).get(AIRExpandableFileChooser.TYPE));
            }
            return view;
        }
    }

    public AIRExpandableFileChooser(ArrayList<String> arrayList, boolean z, boolean z2, String str, FileChooserStub fileChooserStub) {
        this.mAllowMultiple = false;
        this.mSave = false;
        this.mFileChooserDialog = null;
        this.mFileChooserStub = null;
        this.mRuntimeResources = null;
        this.mRuntimeInflater = null;
        this.mFileSaveName = null;
        this.mSave = z;
        this.mAllowMultiple = z2;
        this.mFileChooserStub = fileChooserStub;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add("*");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = arrayList.get(i);
            if (str2.startsWith("*")) {
                str2 = str2.substring(1);
                if (str2.length() == 0) {
                    break;
                }
            }
            if (this.mSelection.length() != 0) {
                this.mSelection += " OR ";
            }
            this.mSelection += "_display_name LIKE '%" + str2 + "'";
        }
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        AndroidAlertDialog androidAlertDialog = new AndroidAlertDialog(GetAndroidActivityWrapper.getActivity());
        this.mFileChooserDialog = androidAlertDialog;
        AlertDialog.Builder GetAlertDialogBuilder = androidAlertDialog.GetAlertDialogBuilder();
        GetAlertDialogBuilder.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.adobe.air.AIRExpandableFileChooser.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4) {
                    AIRExpandableFileChooser.this.mFileChooserStub.SetUserAction(AIRExpandableFileChooser.USER_ACTION_CANCEL);
                    return false;
                }
                return false;
            }
        });
        GetAndroidActivityWrapper.getRuntimeContext();
        this.mRuntimeInflater = GetAndroidActivityWrapper.getActivity().getLayoutInflater();
        Resources resources = GetAndroidActivityWrapper.getActivity().getResources();
        this.mRuntimeResources = resources;
        View GetLayoutView = Utils.GetLayoutView("main", resources, this.mRuntimeInflater);
        GetAlertDialogBuilder.setView(GetLayoutView);
        Resources resources2 = GetLayoutView.getResources();
        ExpandableListView expandableListView = (ExpandableListView) Utils.GetWidgetInView("list", resources2, GetLayoutView);
        expandableListView.setOnChildClickListener(this);
        expandableListView.setEmptyView(GetAndroidActivityWrapper.getActivity().findViewById(16908292));
        RelativeLayout relativeLayout = (RelativeLayout) Utils.GetWidgetInViewByNameFromPackage("file_save_panel", resources2, GetLayoutView);
        if (this.mSave) {
            GetAlertDialogBuilder.setTitle(Utils.GetResourceString("file_download", this.mRuntimeResources));
            relativeLayout.setVisibility(0);
            EditText editText = (EditText) Utils.GetWidgetInViewByNameFromPackage("file_save_name", resources2, GetLayoutView);
            this.mFileSaveName = editText;
            if (str != null) {
                editText.setText(Utils.GetExternalStorageDirectory() + "/" + str);
            }
            this.mFileSaveName.setOnKeyListener(new View.OnKeyListener() { // from class: com.adobe.air.AIRExpandableFileChooser.2
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                    if (keyEvent.getAction() == 0 && i2 == 66) {
                        String obj = AIRExpandableFileChooser.this.mFileSaveName.getText().toString();
                        if (obj.length() != 0) {
                            AIRExpandableFileChooser.this.mFilenames.clear();
                            AIRExpandableFileChooser.this.mFilenames.add(obj);
                            AIRExpandableFileChooser.this.mFileChooserStub.SetUserAction(AIRExpandableFileChooser.USER_ACTION_DONE);
                            AIRExpandableFileChooser aIRExpandableFileChooser = AIRExpandableFileChooser.this;
                            aIRExpandableFileChooser.HideVirtualKeyboard(aIRExpandableFileChooser.mFileSaveName);
                            AIRExpandableFileChooser.this.mFileChooserDialog.dismiss();
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
            });
            ((Button) Utils.GetWidgetInViewByNameFromPackage("file_save_button", resources2, GetLayoutView)).setOnClickListener(new View.OnClickListener() { // from class: com.adobe.air.AIRExpandableFileChooser.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String obj = AIRExpandableFileChooser.this.mFileSaveName.getText().toString();
                    if (obj.length() != 0) {
                        AIRExpandableFileChooser.this.mFilenames.clear();
                        AIRExpandableFileChooser.this.mFilenames.add(obj);
                        AIRExpandableFileChooser.this.mFileChooserStub.SetUserAction(AIRExpandableFileChooser.USER_ACTION_DONE);
                        AIRExpandableFileChooser aIRExpandableFileChooser = AIRExpandableFileChooser.this;
                        aIRExpandableFileChooser.HideVirtualKeyboard(aIRExpandableFileChooser.mFileSaveName);
                        AIRExpandableFileChooser.this.mFileChooserDialog.dismiss();
                    }
                }
            });
        } else {
            GetAlertDialogBuilder.setTitle(Utils.GetResourceString("file_upload", this.mRuntimeResources));
            relativeLayout.setVisibility(8);
        }
        AddMediaSubtree(Utils.GetResourceString("audio_files", this.mRuntimeResources), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        AddMediaSubtree(Utils.GetResourceString("image_files", this.mRuntimeResources), MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        AddMediaSubtree(Utils.GetResourceString("video_files", this.mRuntimeResources), MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        if (!this.mGroupData.isEmpty()) {
            FileChooserExpandableListAdapter fileChooserExpandableListAdapter = new FileChooserExpandableListAdapter(this.mRuntimeInflater, this.mRuntimeResources);
            this.mAdapter = fileChooserExpandableListAdapter;
            expandableListView.setAdapter(fileChooserExpandableListAdapter);
            expandableListView.setItemsCanFocus(true);
            ((TextView) Utils.GetWidgetInViewByNameFromPackage("empty", resources2, GetLayoutView)).setVisibility(8);
        } else {
            expandableListView.setVisibility(8);
        }
        if (this.mAllowMultiple) {
            createInvisibleMultipleFileSelectionView();
        }
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        if (view instanceof FileChooserItem) {
            FileChooserItem fileChooserItem = (FileChooserItem) view;
            if (!this.mAllowMultiple) {
                HashMap hashMap = (HashMap) this.mAdapter.getChild(i, i2);
                if (this.mSave) {
                    this.mFileSaveName.setText(((FileInfo) hashMap.get(FILEINFO)).mFilePath);
                    return true;
                }
                this.mFilenames.clear();
                this.mFilenames.add(((FileInfo) hashMap.get(FILEINFO)).mFilePath);
                this.mFileChooserStub.SetUserAction(USER_ACTION_DONE);
                this.mFileChooserDialog.dismiss();
                return true;
            }
            fileChooserItem.toggle();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int expandableListPositionToFlatPosition(int i, int i2) {
        if (i < 0 || i >= this.mChildData.size() || i2 < 0 || i2 >= this.mChildData.get(i).size()) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += this.mChildData.get(i4).size();
        }
        return i3 + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uncheckAll() {
        if (this.mAllowMultiple) {
            int size = this.mGroupData.size();
            for (int i = 0; i < size; i++) {
                int size2 = this.mChildData.get(i).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    FileChooserItem fileChooserItem = ((FileInfo) ((HashMap) this.mAdapter.getChild(i, i2)).get(FILEINFO)).mParent;
                    if (fileChooserItem != null) {
                        fileChooserItem.uncheck();
                    }
                }
            }
        }
    }

    private void createInvisibleMultipleFileSelectionView() {
        AlertDialog.Builder GetAlertDialogBuilder = this.mFileChooserDialog.GetAlertDialogBuilder();
        GetAlertDialogBuilder.setPositiveButton(Utils.GetResourceString("button_ok", this.mRuntimeResources), new DialogInterface.OnClickListener() { // from class: com.adobe.air.AIRExpandableFileChooser.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AIRExpandableFileChooser.this.mFilenames.clear();
                int size = AIRExpandableFileChooser.this.mGroupData.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int size2 = ((List) AIRExpandableFileChooser.this.mChildData.get(i2)).size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (AIRExpandableFileChooser.this.mCheckedFiles.get(AIRExpandableFileChooser.this.expandableListPositionToFlatPosition(i2, i3))) {
                            AIRExpandableFileChooser.this.mFilenames.add(((FileInfo) ((HashMap) AIRExpandableFileChooser.this.mAdapter.getChild(i2, i3)).get(AIRExpandableFileChooser.FILEINFO)).mFilePath);
                        }
                    }
                }
                AIRExpandableFileChooser.this.mFileChooserStub.SetUserAction(AIRExpandableFileChooser.USER_ACTION_DONE);
            }
        });
        GetAlertDialogBuilder.setNegativeButton(Utils.GetResourceString("button_cancel", this.mRuntimeResources), new DialogInterface.OnClickListener() { // from class: com.adobe.air.AIRExpandableFileChooser.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                AIRExpandableFileChooser.this.uncheckAll();
                AIRExpandableFileChooser.this.mFileChooserStub.SetUserAction(AIRExpandableFileChooser.USER_ACTION_CANCEL);
            }
        });
    }

    private void AddMediaSubtree(String str, Uri uri) {
        Cursor managedQuery = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity().managedQuery(uri, this.mFileProjection, this.mSelection.length() == 0 ? null : this.mSelection, null, null);
        ArrayList arrayList = new ArrayList();
        if (managedQuery == null || !managedQuery.moveToFirst()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TYPE, str);
        this.mGroupData.add(hashMap);
        do {
            FileInfo fileInfo = new FileInfo(managedQuery.getString(managedQuery.getColumnIndex("_display_name")), managedQuery.getString(managedQuery.getColumnIndex("_data")));
            HashMap hashMap2 = new HashMap();
            arrayList.add(hashMap2);
            hashMap2.put(FILEINFO, fileInfo);
        } while (managedQuery.moveToNext());
        this.mChildData.add(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HideVirtualKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public AndroidAlertDialog GetDialog() {
        return this.mFileChooserDialog;
    }

    public ArrayList<String> GetFileNames() {
        return this.mFilenames;
    }
}
