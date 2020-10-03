/*package com.example.loginpro;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {
    private List<frag2_NewsData> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder { //이미지 파일에 들어갈 요소들을 넣는 부분
        // each data item is just a string in this case
        public TextView TextView_title;
        public TextView TextView_content;
        private SimpleDraweeView ImageView_title;

        public MyViewHolder(View v) { //parents view data를 holder를 만들어서 넘김 + 반복
            super(v);
            TextView_title = v.findViewById(R.id.TextView_Title); // 자식들을 매칭
            TextView_content =v.findViewById(R.id.TextView_Content);
            ImageView_title = v.findViewById(R.id.ImageView_title);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public NewsAdapter(List<frag2_NewsData> myDataset, Context context) {

        mDataset = myDataset;
        Fresco.initialize(context);  //context는 activity에서 use하는 것
    }

    // Create new views (invoked by the layout manager)
    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()) //한 row에 image file을 connect하는 부분
                .inflate(R.layout.row_news, parent, false); //list 하나당 들어갈 xml (parents view setting)

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) { // view holder가 반복되면서 onBind~ function에서 값을 setting
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        NewsData news = mDataset.get(position);

        holder.TextView_title.setText(news.getTitle()); //매칭한 자식들의 data를 반복하는 것 string 배열로
        holder.TextView_content.setText(news.getContent());
        Uri uri = Uri.parse(news.getUrlToImage());
        holder.ImageView_title.setImageURI(uri);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset ==  null ? 0 : mDataset.size();
    }
}
*/