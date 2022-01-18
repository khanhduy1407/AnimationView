package tk.nkduy.animationview.library.attention;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class PulseAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "scaleY", 1, 1.1f, 1),
            ObjectAnimator.ofFloat(target, "scaleX", 1, 1.1f, 1)
        );
    }
}
