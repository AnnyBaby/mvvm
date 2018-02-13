package com.example.xiaohonghu.mvvmdemo.bean;

import android.util.Log;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.DaoException;
import com.example.xiaohonghu.mvvmdemo.greendao.DaoSession;
import com.example.xiaohonghu.mvvmdemo.greendao.EditorsBeanDao;
import com.example.xiaohonghu.mvvmdemo.greendao.NewsListBeanDao;
import com.example.xiaohonghu.mvvmdemo.greendao.StoriesBeanDao;

/**
 * Created by xiaohong.hu on 2018/2/11.
 */
@Entity
public class NewsListBean {

    /**
     * stories : [{"images":["http://pic4.zhimg.com/b5bb0754c6bab0adec4edd1256efbef7_t.jpg"],"type":2,"id":7315220,"title":"第一天上班 超激动，可惜后来被打了脸\u2026"},{"images":["http://pic3.zhimg.com/508c01ace291bd839dfdf13a8487ea92_t.jpg"],"type":2,"id":7310300,"title":"群众都是重口味，世上再无主流色情杂志这回事"},{"images":["http://pic4.zhimg.com/63a262791c4e2b156d932c7a03b137df_t.jpg"],"type":2,"id":7307922,"title":"11 个关于漫威的冷知识，原来圣诞老人是变种人！"},{"images":["http://pic1.zhimg.com/58bce639a1fea757e3b9053d061936dc_t.jpg"],"type":2,"id":7305993,"title":"7 个日本高阶旅行地，没有中国游客"},{"images":["http://pic1.zhimg.com/4edd2b5b75775da684dab887be15de00_t.jpg"],"type":2,"id":7303298,"title":"11 张本周最热节操图，担心的事情终于发生了"},{"images":["http://pic4.zhimg.com/1b8e2e93aef140349407d2580b16f887_t.jpg"],"type":2,"id":7300302,"title":"我们真的发现了外星人的太空飞船吗？"},{"images":["http://pic4.zhimg.com/1039533776aafebadd11ad377eebde47_t.jpg"],"type":2,"id":7299037,"title":"问题：单身的人可以是幸福的吗？"},{"images":["http://pic1.zhimg.com/cb2045505a5ea2e8e2b3896db181fe90_t.jpg"],"type":2,"id":7295366,"title":"10 个理由告诉你我为什么要停用朋友圈"},{"images":["http://pic1.zhimg.com/8f4f1762130eefa0a310daf324ff3454_t.jpg"],"type":2,"id":7292710,"title":"17 个叼叼的人类隐藏技能，一定是吃了恶魔果实"},{"images":["http://pic1.zhimg.com/8f652c700593e10f4e5ce8ec15774874.jpg"],"type":2,"id":7288286,"title":"《小王子》早就教你该怎么谈恋爱了，单身怪自己"},{"images":["http://pic1.zhimg.com/1750ca43e2a2534dddcca3a813cd7fb4_t.jpg"],"type":2,"id":7285920,"title":"其实每个人内心都想成为一张小浴巾！！"},{"images":["http://pic1.zhimg.com/e512e59a4311e1d9a489fac8144fd670_t.jpg"],"type":2,"id":7281623,"title":"23 个男生永远理解不了的画面"},{"images":["http://pic3.zhimg.com/01d8ab485233cc00631d813d93b51746_t.jpg"],"type":2,"id":7279286,"title":"8 张图完美阐释你和你妈的非凡关系"},{"images":["http://pic2.zhimg.com/2ae9218b5b2ae0de917ca5327f1a62d9_t.jpg"],"type":2,"id":7274499,"title":"王菲小女儿李嫣上了微博热门，因为她实在太可爱了"},{"images":["http://pic1.zhimg.com/5e7e245530ca61296a175c385414982c_t.jpg"],"type":2,"id":7271705,"title":"14 个直播记者比你今天烦躁多了"},{"images":["http://pic4.zhimg.com/2a8b736ff65ac13dfb54dd8eab7d0353_t.jpg"],"type":2,"id":7268620,"title":"有了它们你再也不用吃安利补 VC 了"},{"images":["http://pic3.zhimg.com/fd7eb52781ea04ba6e6962eef86450ce_t.jpg"],"type":2,"id":7267355,"title":"11 个本周冷知识，婚礼除了公主梦其实也可以很酷"},{"images":["http://pic3.zhimg.com/cfe264c81fae5c1438aa9e27a4e3d5a2_t.jpg"],"type":2,"id":7262019,"title":"11 张本周最热节操图，琅琊榜的导演根本不给演员活路啊"}]
     * description : 为你发现最有趣的新鲜事，建议在 WiFi 下查看
     * background : http://pic1.zhimg.com/a5128188ed788005ad50840a42079c41.jpg
     * color : 8307764
     * name : 不许无聊
     * image : http://pic3.zhimg.com/da1fcaf6a02d1223d130d5b106e828b9.jpg
     * editors : [{"url":"http://www.zhihu.com/people/wezeit","bio":"微在 Wezeit 主编","id":70,"avatar":"http://pic4.zhimg.com/068311926_m.jpg","name":"益康糯米"},{"url":"http://www.zhihu.com/people/kuangzhou","bio":"明月般俊朗","id":71,"avatar":"http://pic4.zhimg.com/43d10de2b46c918a9ffe5d0472947b67_m.jpg","name":"顾惜朝"}]
     * image_source :
     */
    @Id
    private Long id;
    private String description;
    private String background;
    private int color;
    private String name;
    private String image;
    private String image_source;



    @ToMany(referencedJoinProperty = "storyId")
    private List<StoriesBean> stories;
    @ToMany(referencedJoinProperty = "editorId")
    private List<EditorsBean> editors;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 46445144)
    private transient NewsListBeanDao myDao;


    @Generated(hash = 1641257440)
    public NewsListBean(Long id, String description, String background, int color, String name, String image, String image_source) {
        this.id = id;
        this.description = description;
        this.background = background;
        this.color = color;
        this.name = name;
        this.image = image;
        this.image_source = image_source;
    }


    @Generated(hash = 1159480764)
    public NewsListBean() {
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getBackground() {
        return this.background;
    }


    public void setBackground(String background) {
        this.background = background;
    }


    public int getColor() {
        return this.color;
    }


    public void setColor(int color) {
        this.color = color;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getImage() {
        return this.image;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public String getImage_source() {
        return this.image_source;
    }


    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }
    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public void setEditors(List<EditorsBean> editors) {
        this.editors = editors;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 803682849)
    public List<EditorsBean> getEditors() {
        if (editors == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            EditorsBeanDao targetDao = daoSession.getEditorsBeanDao();
            List<EditorsBean> editorsNew = targetDao._queryNewsListBean_Editors(id);
            synchronized (this) {
                if (editors == null) {
                    editors = editorsNew;
                }
            }
        }
        return editors;
    }


    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 69587242)
    public synchronized void resetEditors() {
        editors = null;
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }


    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2143450264)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getNewsListBeanDao() : null;
    }


    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 276536895)
    public List<StoriesBean> getStories() {
        if (stories == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StoriesBeanDao targetDao = daoSession.getStoriesBeanDao();
            List<StoriesBean> storiesNew = targetDao._queryNewsListBean_Stories(id);
            synchronized (this) {
                if (stories == null) {
                    stories = storiesNew;
                }
            }
        }
        return stories;
    }


    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 2006863238)
    public synchronized void resetStories() {
        stories = null;
    }





}
