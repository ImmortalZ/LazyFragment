package mr_immortalz.com.lazefragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by asus on 2016/3/26.
 */
public class ThirdFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_third;
    }

    @Override
    protected void initView() {
        TextView view = (TextView) findView(R.id.tv);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DetialActivity.class));
            }
        });
    }

    @Override
    protected void initData() {
        Log.d("lazyFragment", "ThirdFragment加载");
    }

    @Override
    protected void initFirstData() {
        Log.d("lazyFragment", "ThirdFragment的第一次数据");
    }
}
