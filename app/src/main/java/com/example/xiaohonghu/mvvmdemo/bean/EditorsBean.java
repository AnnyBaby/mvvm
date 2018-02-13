package com.example.xiaohonghu.mvvmdemo.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;

@Entity
    public class EditorsBean {
        /**
         * url : http://www.zhihu.com/people/wezeit
         * bio : 微在 Wezeit 主编
         * id : 70
         * avatar : http://pic4.zhimg.com/068311926_m.jpg
         * name : 益康糯米
         */

        private String url;
        private String bio;

        private Long editorId;
        @Id
        private Long id;
        private String avatar;
        private String name;
        @Generated(hash = 660828402)
        public EditorsBean(String url, String bio, Long editorId, Long id,
                String avatar, String name) {
            this.url = url;
            this.bio = bio;
            this.editorId = editorId;
            this.id = id;
            this.avatar = avatar;
            this.name = name;
        }
        @Generated(hash = 1472300970)
        public EditorsBean() {
        }
        public String getUrl() {
            return this.url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public String getBio() {
            return this.bio;
        }
        public void setBio(String bio) {
            this.bio = bio;
        }
        public Long getEditorId() {
            return this.editorId;
        }
        public void setEditorId(Long editorId) {
            this.editorId = editorId;
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getAvatar() {
            return this.avatar;
        }
        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }