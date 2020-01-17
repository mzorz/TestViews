package com.automattic.testviews;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class TestViews {
    private View testView;
    private ViewGroup testViewGroup;

    public void setTestView(View view) {
        this.testView = view;
    }

    public void setTestViewGroup(ViewGroup viewgroup) {
        this.testViewGroup = viewgroup;
    }

    public void tryThings() {
        View oneChild = testViewGroup.getChildAt(0);
        ViewParent parent = oneChild.getParent();
        if (parent != null) {
            testViewGroup.removeView(oneChild);
            // here both the viewgroup's children count should be zero,
            // and the view's parent should be null, unless animateLayoutChanges=true,
            // in which case the view is already removed from the children, but the view's
            // parent property is still not null
        }
    }
}
