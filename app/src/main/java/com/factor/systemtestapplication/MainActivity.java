package com.factor.systemtestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    String videoId="",videoId1="",videoId2="",videoId3="",videoId4="",videoId5="",videoId6="",videoId7="",videoId8="",videoId9="",videoId10="",videoId11="",videoId12="",videoId13="",videoId14="";

    String videoUrl="",videoUrl1="",videoUrl2="",videoUrl3="",videoUrl4="",videoUrl5="",videoUrl6="",videoUrl7="",videoUrl8="",videoUrl9="",videoUrl10="",videoUrl11="",videoUrl12="",videoUrl13="",videoUrl14="";
    ImageView video_url_image,video_url_image1,video_url_image2,video_url_image3,video_url_image4,video_url_image5,video_url_image6,video_url_image7,video_url_image8,video_url_image9,video_url_image10,video_url_image11,video_url_image12,video_url_image13,video_url_image14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        video_url_image=findViewById(R.id.video_url_image);
        video_url_image1=findViewById(R.id.video_url_image1);
        video_url_image2=findViewById(R.id.video_url_image2);
        video_url_image3=findViewById(R.id.video_url_image3);
        video_url_image4=findViewById(R.id.video_url_image4);
        video_url_image5=findViewById(R.id.video_url_image5);
        video_url_image6=findViewById(R.id.video_url_image6);
        video_url_image7=findViewById(R.id.video_url_image7);
        video_url_image8=findViewById(R.id.video_url_image8);
        video_url_image9=findViewById(R.id.video_url_image9);
        video_url_image10=findViewById(R.id.video_url_image10);
        video_url_image11=findViewById(R.id.video_url_image11);
        video_url_image12=findViewById(R.id.video_url_image12);
        video_url_image13=findViewById(R.id.video_url_image13);
        video_url_image14=findViewById(R.id.video_url_image14);
        videoUrl="https://www.youtube.com/watch?v=RR7VlDG_prA";
        videoUrl1="https://www.youtube.com/watch?v=OtKa_eN88Qo";
        videoUrl2="https://www.youtube.com/watch?v=YZLKoG_vhDY";
        videoUrl3="https://www.youtube.com/watch?v=qfdShSZZxlg";
        videoUrl4="https://www.youtube.com/watch?v=xWi8nDUjHGA";
        videoUrl5="https://www.youtube.com/watch?v=zpsVpnvFfZQ";
        videoUrl6="https://www.youtube.com/watch?v=vu5-aKf_QqA";
        videoUrl7="https://www.youtube.com/watch?v=f6vY6tYvKGA";
        videoUrl8="https://www.youtube.com/watch?v=8AedZtuoVSg";
        videoUrl9="https://www.youtube.com/watch?v=WqUXVw0WlXc";
        videoUrl10="https://www.youtube.com/watch?v=-ASKgzrmDtc";
        videoUrl11="https://www.youtube.com/watch?v=FjQk-2jHevs";
        videoUrl12="https://www.youtube.com/watch?v=k4yXQkG2s1E";
       videoUrl13="https://www.youtube.com/watch?v=3GLoGHbhKHg";
        videoUrl14="https://www.youtube.com/watch?v=1YBl3Zbt80A";
        videoId = extractYoutubeId(videoUrl);
        String img_url = "http://img.youtube.com/vi/"+videoId +"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url)
                .into(video_url_image);

        videoId1 = extractYoutubeId(videoUrl1);
        String img_url1 = "http://img.youtube.com/vi/"+videoId1+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url1)
                .into(video_url_image1);

        videoId2 = extractYoutubeId(videoUrl2);
        String img_url2 = "http://img.youtube.com/vi/"+videoId2+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url2)
                .into(video_url_image2);

        videoId3 = extractYoutubeId(videoUrl3);
        String img_url3 = "http://img.youtube.com/vi/"+videoId3 +"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url3)
                .into(video_url_image3);

        videoId4 = extractYoutubeId(videoUrl4);
        String img_url4 = "http://img.youtube.com/vi/"+videoId4+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url4)
                .into(video_url_image4);

        videoId5 = extractYoutubeId(videoUrl5);
        String img_url5 = "http://img.youtube.com/vi/"+videoId5+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url5)
                .into(video_url_image5);

        videoId6 = extractYoutubeId(videoUrl6);
        String img_url6 = "http://img.youtube.com/vi/"+videoId6+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url6)
                .into(video_url_image6);

        videoId7 = extractYoutubeId(videoUrl7);
        String img_url7 = "http://img.youtube.com/vi/"+videoId7+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url7)
                .into(video_url_image7);

        videoId8 = extractYoutubeId(videoUrl8);
        String img_url8 = "http://img.youtube.com/vi/"+videoId8+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url8)
                .into(video_url_image8);

        videoId9 = extractYoutubeId(videoUrl9);
        String img_url9 = "http://img.youtube.com/vi/"+videoId9+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url9)
                .into(video_url_image9);

        videoId10 = extractYoutubeId(videoUrl10);
        String img_url10 = "http://img.youtube.com/vi/"+videoId10+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url10)
                .into(video_url_image10);

        videoId11 = extractYoutubeId(videoUrl11);
        String img_url11 = "http://img.youtube.com/vi/"+videoId11+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url11)
                .into(video_url_image11);

        videoId12 = extractYoutubeId(videoUrl12);
        String img_url12 = "http://img.youtube.com/vi/"+videoId12+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url12)
                .into(video_url_image12);

        videoId13= extractYoutubeId(videoUrl13);
        String img_url13 = "http://img.youtube.com/vi/"+videoId13+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url13)
                .into(video_url_image13);

        videoId14 = extractYoutubeId(videoUrl14);
        String img_url14 = "http://img.youtube.com/vi/"+videoId14+"/0.jpg"; // this is link which will give u thumnail image of that video
        // picasso jar file download image for u and set image in imagview
        Glide.with(MainActivity.this)
                .load(img_url14)
                .into(video_url_image14);

    }
    public String extractYoutubeId(String inUrl) {
        inUrl = inUrl.replace("&feature=youtu.be", "");
        if (inUrl.toLowerCase().contains("youtu.be")) {
            return inUrl.substring(inUrl.lastIndexOf("/") + 1);
        }
        String pattern = "(?<=watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(inUrl);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
  public void   play_bt(View view){

              Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
              i.putExtra("url", videoId);
              i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              startActivity(i);

  }
    public void   play_bt1(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId1);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt2(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId2);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt3(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId3);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt4(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId4);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt5(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId5);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt6(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId6);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt7(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId7);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt8(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId8);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt9(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId9);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt10(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId10);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt11(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId11);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt12(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId12);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt13(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId13);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void   play_bt14(View view){
        Intent i = new Intent(MainActivity.this, YouTubePlayerActivity.class);
        i.putExtra("url", videoId14);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

}