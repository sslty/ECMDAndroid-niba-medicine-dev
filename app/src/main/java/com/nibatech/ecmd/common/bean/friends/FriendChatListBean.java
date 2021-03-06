package com.nibatech.ecmd.common.bean.friends;


import com.google.gson.annotations.SerializedName;
import com.nibatech.ecmd.common.bean.common.DoctorProfileBean;

import java.util.List;

public class FriendChatListBean {
    private List<Chat> chats;

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public static class Chat {
        /**
         * message_info : {"message":"V5看见了咯","time":"2016-12-06T12:22:11"}
         * self_url : http://139.217.8.207:5000/api/doctor_relation/chats/1
         * chat_id : 1
         * doctor_profile : {"avatar_url":"http://139.217.8.207:5000/static/app_files/avatars/7/7.1477972506.342093.jpg","fullname":"小医生","excellent":false,"specialism":"儿科","gender":"女","age":30,"verified":true,"cd_number":"D161000001","doctor_type":"医院"}
         */

        @SerializedName("message_info")
        private MessageInfo messageInfo;
        @SerializedName("self_url")
        private String selfUrl;
        @SerializedName("chat_id")
        private int chatId;
        @SerializedName("doctor_profile")
        private DoctorProfileBean doctorProfile;

        public MessageInfo getMessageInfo() {
            return messageInfo;
        }

        public void setMessageInfo(MessageInfo messageInfo) {
            this.messageInfo = messageInfo;
        }

        public String getSelfUrl() {
            return selfUrl;
        }

        public void setSelfUrl(String selfUrl) {
            this.selfUrl = selfUrl;
        }

        public int getChatId() {
            return chatId;
        }

        public void setChatId(int chatId) {
            this.chatId = chatId;
        }

        public DoctorProfileBean getDoctorProfile() {
            return doctorProfile;
        }

        public void setDoctorProfile(DoctorProfileBean doctorProfile) {
            this.doctorProfile = doctorProfile;
        }

        public static class MessageInfo {
            /**
             * message : V5看见了咯
             * time : 2016-12-06T12:22:11
             */

            private String message;
            private String time;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
