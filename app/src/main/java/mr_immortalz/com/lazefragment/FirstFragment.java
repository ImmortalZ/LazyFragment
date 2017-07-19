package mr_immortalz.com.lazefragment;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2016/3/26.
 */
public class FirstFragment extends BaseFragment {
    private GridView gridView;
    private ShowAdapter showAdapter;
    private List<String> mlist;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initView() {
        gridView = findView(R.id.gridview);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getActivity(), DetialActivity.class));
            }
        });
    }

    @Override
    protected void initData() {
        mlist = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mlist.add("show " + i);
        }
        showAdapter = new ShowAdapter(getContext(), mlist);
        gridView.setAdapter(showAdapter);
//        new AlertDialog.Builder(getActivity()).setTitle("1231").create().show();
        Log.d("lazyFragment", "FirstFragment加载");
    }

    @Override
    protected void initFirstData() {
        Log.d("lazyFragment", "FirstFragment的第一次数据"+getActivity());

    }
}
