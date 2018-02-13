package com.example.xiaohonghu.mvvmdemo.bean;

import android.util.Log;

import com.example.xiaohonghu.mvvmdemo.greendao.StringConverter;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

   @Entity
    public  class StoriesBean {
        /**
         * images : ["http://pic4.zhimg.com/b5bb0754c6bab0adec4edd1256efbef7_t.jpg"]
         * type : 2
         * id : 7315220
         * title : 第一天上班 超激动，可惜后来被打了脸…
         */

        private int type;
        private Long storyId;
       @Id
        private Long id;
        private String title;
       @Convert(columnType = String.class, converter = StringConverter.class)
        private List<String> images;

    @Generated(hash = 378591696)
    public StoriesBean(int type, Long storyId, Long id, String title,
            List<String> images) {
        this.type = type;
        this.storyId = storyId;
        this.id = id;
        this.title = title;
        this.images = images;
    }

    @Generated(hash = 929118848)
    public StoriesBean() {
    }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
       public Long getStoryid() {
           return storyId;
       }

       public void setStoryid(Long storyid) {
           this.storyId = storyid;
       }

    public Long getStoryId() {
        return this.storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }
    }