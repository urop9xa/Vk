package ru.netology.domain;

public class MainPostNetology {
    private String id;
    private String imageUrl;
    private String name;
    private String post;
    private String data;
    private String time;
    private boolean islike;
    private String share;
    private String ownerId;
    private String fromId;
    private String createdBy;
    private String replyownerId;
    private String friendsOnly;
    private String copyright;
    private String postType;
    private String postSource;
    private String geo;
    private String signerId;
    private String canPin;
    private String canDelete;
    private String canEdit;
    private String isPinned;
    private String markedAsAds;
    private boolean isFavorite;
    private String postponedId;

    public class PostsInfoPage{
        private String commentsInfo;

    }


    public class CommentsInfoPage{
        private String commentsInfo;
    }


    public class SharesInfoPage{
        private String sharesInfo;
    }

    public class ViewsInfoPage {
        private boolean viewesInfo;
    }



}