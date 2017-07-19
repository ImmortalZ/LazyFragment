package mr_immortalz.com.lazefragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by asus on 2016/3/26.
 */
public class SecondFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_second;
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
        Log.d("lazyFragment", "SecondFragment加载");
    }

    @Override
    protected void initFirstData() {
        Log.d("lazyFragment", "SecondFragment的第一次数据"+getActivity());
    }
}
