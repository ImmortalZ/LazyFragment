package mr_immortalz.com.lazefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2016/3/26.
 */
public class ShowAdapter extends BaseAdapter {
    private Context context;
    private List<String> mList;

    public ShowAdapter(Context context, List<String> list) {
        this.context = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_show_item, null);
        TextView tv = (TextView) view.findViewById(R.id.tv_adapter);
        tv.setText(mList.get(position));
        return view;
    }
}
