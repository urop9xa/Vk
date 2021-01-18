package ru.netology.domain;

public class Post {
    private Integer id;
    private String imageUrl;
    private String name;
    private String post;
    private Integer date;
    private String time;
    private boolean like;
    private String share;
    private long  ownerId;
    private Integer fromId;
    private Integer createdBy;
    private Integer replyownerId;
    private Integer replyPostId;
    private Integer friendsOnly;
    private Integer copyright;
    private String postType;
    private Object postSource;
    private String geo;
    private Integer signerId;
    private Integer canPin;
    private Integer canDelete;
    private Integer canEdit;
    private Integer isPinned;
    private Integer markedAsAdsInfo;
    private boolean isFavorite;
    private Integer postponedId;


    public class CommentsInfo{

        private  boolean canPost;
        private  boolean groupsCanPostInfo;
        private  boolean canClose;
        private  boolean canOpen;
        private  Integer count;

    }



    public class LikesInfo {

        private boolean userLikesInfo;
        private boolean canLike;
        private boolean canPublish;
        private Integer count;

    }

    public class RepostsInfo{

        private boolean userReposted;
        private Integer count;

    }

    public class ViewsInfo{

        private Integer count;
    }

    public class Geo{

        private Integer type;
        private Integer coordinatesInfo;
        private Object place;
    }

    public class CanPin {

        private boolean canPin;
    }

    public class CanDelete{

        private boolean canDelete;
    }

    public class CanEdit{

        private boolean canEdit;
    }

    public class MarkedAsAdsInfo{

        private boolean markedAsAdsInfo;
    }

    public class IsFavorite{

        private boolean isFavorite = true;
    }
}