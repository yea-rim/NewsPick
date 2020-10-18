<<<<<<< HEAD:newspickone/newspickone/app/src/main/java/com/example/loginpro/frag2_chungcheongdo.java
package com.example.loginpro;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class frag2_chungcheongdo extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] myDataset = {"1","2"};
    RequestQueue queue ;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.frag2_chungcheongdo, container, false);
        recyclerView = view.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        queue = Volley.newRequestQueue(this);
        getNews(); //1번 과정
        //1. 화면이 로딩 - > 뉴스 정보를 받아온다
        //2. 정보를 받아온다 - > adapter로 넘겨준다
        //3. adapter가 받아온다 - > setting
        return view;
    }
    public void getNews(){ //news information을 받아오는 것
        // volley는 queue에 담아 하나씩 보여준다

        String url ="http://newsapi.org/v2/top-headlines?country=kr&apiKey=af83bbd9bdea41f9896419615ad409fb";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Log.d("News",response);

                        try {


                            JSONObject jsonObj = new JSONObject(response);
                            JSONArray arrayArticles = jsonObj.getJSONArray("articles");

                            List<frag2_NewsData> news = new ArrayList<>();

                            for( int i = 0, j= arrayArticles.length(); i < j; i++){
                                JSONObject obj = arrayArticles.getJSONObject(i);

                                Log.d("NEWS",obj.toString());

                                frag2_NewsData frag2newsData = new frag2_NewsData();
                                frag2newsData.setTitle(obj.getString("title"));
                                frag2newsData.setUrlToImage(obj.getString("urlToImage"));
                                frag2newsData.setContent(obj.getString("description"));
                                news.add(frag2newsData);


                            }

                            //response ->> NewsData Class 분류

                            // specify an adapter (see also next example)
                            mAdapter = new NewsAdapter(news, MainActivity.this);
                            recyclerView.setAdapter(mAdapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);

    }

}
=======
package com.example.loginpro;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class frag2_chungcheongdo extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] myDataset = {"1","2"};
    RequestQueue queue ;
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.frag2_chungcheongdo, container, false);

        /*   recyclerView = view.findViewById(R.id.my_recycler_view);

    // use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
    recyclerView.setHasFixedSize(true);

    // use a linear layout manager
    layoutManager = new LinearLayoutManager(this);

    recyclerView.setLayoutManager(layoutManager);


    queue = Volley.newRequestQueue(this);
    getNews(); //1번 과정
    //1. 화면이 로딩 - > 뉴스 정보를 받아온다
    //2. 정보를 받아온다 - > adapter로 넘겨준다
    //3. adapter가 받아온다 - > setting
    return view;
}
    public void getNews(){ //news information을 받아오는 것
        // volley는 queue에 담아 하나씩 보여준다

        String url ="http://newsapi.org/v2/top-headlines?country=kr&apiKey=af83bbd9bdea41f9896419615ad409fb";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Log.d("News",response);

                        try {


                            JSONObject jsonObj = new JSONObject(response);
                            JSONArray arrayArticles = jsonObj.getJSONArray("articles");

                            List<frag2_NewsData> news = new ArrayList<>();

                            for( int i = 0, j= arrayArticles.length(); i < j; i++){
                                JSONObject obj = arrayArticles.getJSONObject(i);

                                Log.d("NEWS",obj.toString());

                                frag2_NewsData frag2newsData = new frag2_NewsData();
                                frag2newsData.setTitle(obj.getString("title"));
                                frag2newsData.setUrlToImage(obj.getString("urlToImage"));
                                frag2newsData.setContent(obj.getString("description"));
                                news.add(frag2newsData);


                            }

                            //response ->> NewsData Class 분류

                            // specify an adapter (see also next example)
                            mAdapter = new NewsAdapter(news, MainActivity.this);
                            recyclerView.setAdapter(mAdapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
*/
        return view;
    }

}
>>>>>>> 7f721084048169a0f27b5dfb39d632cfa2ef3c64:newspickone/app/src/main/java/com/example/loginpro/frag2_chungcheongdo.java
