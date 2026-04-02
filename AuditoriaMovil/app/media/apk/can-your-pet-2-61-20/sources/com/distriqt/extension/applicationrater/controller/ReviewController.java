package com.distriqt.extension.applicationrater.controller;

import android.app.Activity;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.applicationrater.events.ReviewEvent;
import com.distriqt.extension.applicationrater.utils.Errors;
import com.distriqt.extension.applicationrater.utils.Logger;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
/* loaded from: classes.dex */
public class ReviewController {
    public static final String TAG = "ReviewController";
    private IExtensionContext _extContext;

    public ReviewController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public boolean requestReview() {
        Logger.d(TAG, "requestReview()", new Object[0]);
        if (ReviewControllerSupport.isSupported(this._extContext.getActivity())) {
            try {
                final Activity activity = this._extContext.getActivity();
                final ReviewManager create = ReviewManagerFactory.create(this._extContext.getActivity().getApplicationContext());
                create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener<ReviewInfo>() { // from class: com.distriqt.extension.applicationrater.controller.ReviewController.1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public void onComplete(Task<ReviewInfo> task) {
                        try {
                            Logger.d(ReviewController.TAG, "requestReview::requestReviewFlow::onComplete(): %b", Boolean.valueOf(task.isSuccessful()));
                            if (!task.isSuccessful()) {
                                ReviewController.this._extContext.dispatchEvent(ReviewEvent.COMPLETE, ReviewEvent.formatForEvent());
                            } else {
                                create.launchReviewFlow(activity, task.getResult()).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.distriqt.extension.applicationrater.controller.ReviewController.1.1
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public void onComplete(Task<Void> task2) {
                                        try {
                                            Logger.d(ReviewController.TAG, "requestReview::launchReviewFlow::onComplete(): %b", Boolean.valueOf(task2.isSuccessful()));
                                            ReviewController.this._extContext.dispatchEvent(ReviewEvent.COMPLETE, ReviewEvent.formatForEvent());
                                        } catch (Exception e) {
                                            Errors.handleException(e);
                                        }
                                    }
                                });
                            }
                        } catch (Exception e) {
                            Errors.handleException(e);
                        }
                    }
                });
                return true;
            } catch (Exception e) {
                Errors.handleException(e);
                return false;
            }
        }
        return false;
    }
}
