package com.chamodshehanka.springsample.topic;

/**
 * @author chamodshehanka on 3/6/2019
 * @project spring-sample
 **/
public class Topic {

    private String topicID;
    private String topicName;
    private String topicDescription;

    public Topic() {
    }

    public Topic(String topicID, String topicName, String topicDescription) {
        this.topicID = topicID;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
