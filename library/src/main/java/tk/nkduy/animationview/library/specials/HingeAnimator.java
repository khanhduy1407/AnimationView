package tk.nkduy.animationview.library.specials;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;
import tk.nkduy.animationeasing.Glider;
import tk.nkduy.animationeasing.Skill;

public class HingeAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        float x = target.getPaddingLeft();
        float y = target.getPaddingTop();
        getAnimatorAgent().playTogether(
            Glider.glide(Skill.SineEaseInOut, 1300, ObjectAnimator.ofFloat(target, "rotation", 0, 80, 60, 80, 60, 60)),
            ObjectAnimator.ofFloat(target, "translationY", 0, 0, 0, 0, 0, 700),
            ObjectAnimator.ofFloat(target, "alpha", 1, 1, 1, 1, 1, 0),
            ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y, y, y, y, y)
        );

        setDuration(1300);
    }
}

